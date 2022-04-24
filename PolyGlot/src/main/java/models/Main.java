
package models;

import controllers.LoginRegisterCont;

public class Main 
{
    public static void main(String[] args) 
    {
        //currentUser= new UserMDL();
        //to test that everything works, UserModel was used to test the methods
        UserMDL user = new UserMDL();
        
        LoginRegisterCont logRegCont= new LoginRegisterCont(user);
        
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
//    
//    
//    /**
//     * Suggested by Aisana
//     * Used to set up current user info
//     * @param user 
//     */
//    public void recordUser(UserMDL user){
//        this.currentUser= user;
//    }
}
