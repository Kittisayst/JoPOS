package Database;

import Tools.JoAlert;
import java.sql.Connection;
import java.sql.SQLException;

public class MyConnect {

    private Connection con = null;

    public MyConnect() {
        try {
            con = new JoConnect().getConnectionDefault();
        } catch (Exception e) {
            e.printStackTrace();
            JoAlert alert = new JoAlert();
            alert.messages("ຜິດພາດການເຊື່ອມຕໍ່", "ເຊື່ອມຕໍ່ຖານຂໍ້ມູນບໍ່ສຳເລັດ", JoAlert.Icons.error);
        }
    }

    public Connection getConnect() {
        return con;
    }

    public void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JoAlert alert = new JoAlert();
            alert.messages("ຜິດພາດການເຊື່ອມຕໍ່", "ເຊື່ອມຕໍ່ຖານຂໍ້ມູນບໍ່ສຳເລັດ", JoAlert.Icons.error);
        }
    }
}
