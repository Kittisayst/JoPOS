package Util;

import Tools.JoFileSystem;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

public class JoLoger {
    
    public static void saveLog(Exception e, Object Class) {
        JoFileSystem fileSystem = new JoFileSystem();
        String filePath = fileSystem.getCurrentPath() + "/Log/log.txt";
        if (fileSystem.isFile(fileSystem.getCurrentPath()+"/Log")) {
            fileSystem.CreateFolder(fileSystem.getCurrentPath(), "Log");
            if (fileSystem.isFile(filePath)) {
                System.out.println("c");
                fileSystem.CreateFile("Log.txt");
            }
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String date = new MyFormat().getDate(new Date());
            String data = date + ": " + Class + " Error" + e;
            writer.write(data);
            writer.newLine();
        } catch (IOException er) {
            er.printStackTrace();
        }
    }
    
    public static void saveLog(SQLException e, Object Class) {
        JoFileSystem fileSystem = new JoFileSystem();
        String filePath = fileSystem.getCurrentPath() + "/Log/log.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String date = new MyFormat().getDate(new Date());
            String data = date + ": " + Class + " Error" + e;
            writer.write(data);
            writer.newLine();
        } catch (IOException er) {
            er.printStackTrace();
        }
    }
    
}
