package models;

import controllers.LoginRegisterCont;

public class Main {

    public static void main(String[] args) {
        UserMDL user = new UserMDL();
        LoginRegisterCont logRegCont = new LoginRegisterCont(user);
        logRegCont.startApp();
        //currentUser= logRegCont.getUserInfo();

        //LoginV loginPage = new LoginV();
        //loginPage.show();
        //calling the methodss
        //user.insert();
        //user.retrieveUserList();
        //user.delete();
        //user.update();
    }
}
