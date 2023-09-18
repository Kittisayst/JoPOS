package DAOModel;

import DAOInterface.DAO;
import Database.JoConnect;
import Database.JoSQL;
import Database.JoSQL.ORDER;
import Model.CategoryModel;
import Tools.JoAlert;
import Util.JoLoger;
import java.sql.ResultSet;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class CategoryDAO implements DAO<CategoryModel> {

    private final String TableName = "tb_category";

    @Override
    public int create(CategoryModel data) {
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            PreparedStatement pre = sql.setPrepared(sql.getCreate(), data.getCategoryID(), data.getCategoryName());
            return pre.executeUpdate();
        } catch (SQLException e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
            e.printStackTrace();
            return 0;
        } finally {
            connect.close();
        }
    }

    @Override
    public CategoryModel read(int id) {
        CategoryModel model = new CategoryModel();
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            ResultSet rs = sql.getSelectById(id);
            while (rs.next()) {                
                model = getResult(rs);
            }
        } catch (Exception e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
        } finally {
            connect.close();
        }
        return model;
    }

    @Override
    public int update(CategoryModel data) {
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            PreparedStatement pre = sql.setPrepared(sql.getUpdate(), data.getCategoryName(),data.getCategoryID());
            return pre.executeUpdate();
        } catch (SQLException e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
            return 0;
        } finally {
            connect.close();
        }
    }

    @Override
    public int delete(int id) {
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            PreparedStatement pre = sql.getDelete();
            pre.setInt(1, id);
            return pre.executeUpdate();
        } catch (SQLException e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
            return 0;
        } finally {
            connect.close();
        }
    }

    @Override
    public List<CategoryModel> getAll() {
        List<CategoryModel> models = new ArrayList<>();
        models.clear();
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            ResultSet rs = sql.getSelectAll(ORDER.DESC);
            while (rs.next()) {                
                models.add(getResult(rs));
            }
        } catch (Exception e) {
            JoAlert.Error(e, this);
            JoLoger.saveLog(e, this);
        } finally {
            connect.close();
        }
        return models;
    }

    @Override
    public CategoryModel getResult(ResultSet rs) throws Exception {
        return new CategoryModel(rs.getInt(1), rs.getString(2));
    }

}
