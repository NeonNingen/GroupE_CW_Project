package models;

import controllers.LoginRegisterCont;
import java.io.File;
import java.io.FileNotFoundException;
import models.DatabaseMDL;

/**
 * 
 * @author Rahat Amit and Zain
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Connect connect = new Connect();
        File f = new File(".\\polyLang.db");
        DatabaseMDL database = new DatabaseMDL();
        if (f.length() == 0) {
            System.out.println("Buliding Database...");
            database.createTable();
            database.readUserDatabase();
            database.readDlgDatabase();
            database.readCardDatabase();
        }
        
        UserMDL user = new UserMDL();
        LoginRegisterCont logRegCont = new LoginRegisterCont(user);
        logRegCont.startApp();
    }
}
