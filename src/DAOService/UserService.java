package DAOService;

import DAOModel.UserDAO;
import Model.UserModel;
import java.sql.ResultSet;
import java.util.List;

public class UserService {

    private UserDAO dAO = new UserDAO();

    public int create(UserModel data) {
        return dAO.create(data);
    }

    public UserModel read(int id) {
        return dAO.read(id);
    }

    public int update(UserModel data) {
        return dAO.update(data);
    }

    public int delete(int id) {
        return dAO.delete(id);
    }

    public List<UserModel> getAll() {
        return dAO.getAll();
    }

    public UserModel getResult(ResultSet rs) throws Exception {
        return dAO.getResult(rs);
    }

    public UserModel getAuthentication(String User, String Password) {
        return dAO.getAuthentication(User, Password);
    }

    public void saveLog(int id) {
        dAO.saveLog(id);
    }
    
    

}
