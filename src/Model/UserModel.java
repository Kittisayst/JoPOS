package Model;

public class UserModel {

    private int UserID;
    private String Name;
    private String User;
    private String Password;
    private String Log;

    public UserModel() {
    }

    public UserModel(int UserID, String Name, String User, String Password, String Log) {
        this.UserID = UserID;
        this.Name = Name;
        this.User = User;
        this.Password = Password;
        this.Log = Log;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getLog() {
        return Log;
    }

    public void setLog(String Log) {
        this.Log = Log;
    }

    @Override
    public String toString() {
        return "UserModel{" + "UserID=" + UserID + ", Name=" + Name + ", User=" + User + ", Password=" + Password + ", Log=" + Log + '}';
    }

}
