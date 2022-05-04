package models;

import controllers.LoginRegisterCont;

public class Main {

    public static void main(String[] args) {
        
//        DatabaseMDL.readDlgDatabase();
//        DatabaseMDL.readCardDatabase();
        UserMDL user = new UserMDL();
        LoginRegisterCont logRegCont = new LoginRegisterCont(user);
        logRegCont.startApp();
    }
}
