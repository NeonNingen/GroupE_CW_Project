
package models;

import controllers.LoginRegisterCont;
import controllers.MenuBarCont;
import views.LoginV;

public class Main 
{
    
    private static UserMDL currentUser;
    
    public static void main(String[] args) 
    {
        //currentUser= new UserMDL();
        //to test that everything works, UserModel was used to test the methods
        // UserModel user = new UserModel();
        
        LoginRegisterCont logRegCont= new LoginRegisterCont();
        
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
    
    
    /**
     * Suggested by Aisana
     * Used to set up current user info
     * @param user 
     */
    public void recordUser(UserMDL user){
        this.currentUser= user;
    }
}
