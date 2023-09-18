package DAOModel;

import DAOInterface.DAO;
import Database.JoConnect;
import Database.JoSQL;
import Model.UnitModel;
import Tools.JoAlert;
import Util.JoLoger;
import java.sql.ResultSet;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class UnitDAO implements DAO<UnitModel> {

    private final String TableName = "tb_unit";

    @Override
    public int create(UnitModel data) {
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            PreparedStatement pre = sql.setPrepared(sql.getCreate(), data.getUnitID(), data.getUnitName());
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
    public UnitModel read(int id) {
        UnitModel model = new UnitModel();
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            ResultSet rs = sql.getSelectById(id);
            if (rs.next()) {
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
    public int update(UnitModel data) {
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            PreparedStatement pre = sql.setPrepared(sql.getUpdate(), data.getUnitName(), data.getUnitID());
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
    public List<UnitModel> getAll() {
        List<UnitModel> models = new ArrayList<>();
        models.clear();
        JoConnect connect = new JoConnect();
        JoSQL sql = new JoSQL(connect.getConnectionDefault(), TableName);
        try {
            ResultSet rs = sql.getSelectAll(JoSQL.ORDER.DESC);
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
    public UnitModel getResult(ResultSet rs) throws Exception {
       return new UnitModel(rs.getInt(1), rs.getString(2));
    }

}
