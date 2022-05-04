package models;

import controllers.LoginRegisterCont;

public class Main {

    public static void main(String[] args) {
        UserMDL user = new UserMDL();
        LoginRegisterCont logRegCont = new LoginRegisterCont(user);
        logRegCont.startApp();
    }
}
