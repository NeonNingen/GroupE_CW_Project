
package models;

import views.LoginV;

public class Main 
{
    public static void main(String[] args) 
    {
        //to test that everything works, UserModel was used to test the methods
        // UserModel user = new UserModel();
        LoginV loginPage = new LoginV();
        loginPage.show();

       //calling the methodss
       //user.insert();
       //user.retrieveUserList();
       //user.delete();
       //user.update();
        
    }  
}
