/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import viewpagesV4.CardScrollV;
import viewpagesV4.loginView;


/**
 *
 * @author Amit
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //to test that everything works, UserModel was used to test the methods
   // UserModel user = new UserModel();
        loginView loginPage = new loginView();
        loginPage.show();
//       
//       //calling the methodss
//       //user.insert();
 //      user.retrieveUserList();
//       //user.delete();
//       //user.update();
        
    }
    
}
