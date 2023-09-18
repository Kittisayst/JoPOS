package DAOModel;

import DAOInterface.DAO;
import Database.JoConnect;
import Database.JoSQL;
import Model.UserModel;
import Tools.JoAlert;
import Util.JoLoger;
import Util.MyFormat;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class UserDAO implements DAO<UserModel> {

    private String TableName = "tb_user";

    @Override
    public int create(UserModel data) {
        int state = 0;
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            PreparedStatement pre = sql.setPrepared(sql.getCreate(), data.getUserID(), data.getName(), data.getUser(), data.getPassword(), data.getLog());
            state = pre.executeUpdate();
        } catch (SQLException e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
        } finally {
            connect.close();
        }
        return state;
    }

    @Override
    public UserModel read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(UserModel data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<UserModel> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserModel getResult(ResultSet rs) throws Exception {
        return new UserModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
    }

    public UserModel getAuthentication(String User, String Password) {
        JoConnect connect = new JoConnect();
        UserModel model = new UserModel();
        String sql = "SELECT * FROM tb_user WHERE User=? AND Password =?";
        try {
            PreparedStatement pre = connect.getConnectionDefault().prepareStatement(sql);
            pre.setString(1, User);
            pre.setString(2, Password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                model = getResult(rs);
            }
        } catch (Exception e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
            return model;
        } finally {
            connect.close();
        }
        return model;
    }

    public void saveLog(int id) {
        JoConnect connect = new JoConnect();
        MyFormat format = new MyFormat();
        String date = format.getDateCustom(new Date(), "dd/MM/yyyy HH:mm:ss");
        String sql = "UPDATE tb_user SET Log=? WHERE userID=?";
        try {
            PreparedStatement pre = connect.getConnectionDefault().prepareStatement(sql);
            pre.setString(1, date);
            pre.setInt(2, id);
            pre.executeUpdate();
        } catch (SQLException e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
        } finally {
            connect.close();
        }
    }

}
