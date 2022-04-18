/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.UserMDL;
import views.MenuBarV;
import views.RegisterV;
import views.SupportV;
import views.LoginV;
import views.ProgV;
import views.SupportV2;

/**
 *
 * @author Amit
 */
public class LoginRegisterCont implements ActionListener
{
    private LoginV loginPage;
    private UserMDL user;
    
    public LoginRegisterCont(LoginV loginPage) 
    {
        this.loginPage = loginPage;
        this.user = new UserMDL();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == loginPage.getLoginBttn())
        {
            if(checkUser() == true)
            {
                //JOptionPane.showMessageDialog(loginPage, "", "Login", 1);
                this.user = new UserMDL("", "", "", "", 0, "", 0, 0);
                
                loginPage.dispose();
                MenuBarV menu = new MenuBarV();
                menu.setPageTitle("Profile");
                menu.setProgPageTopicContent(new ProgV().getProgViewContent());
                //menu.addHistBttn();
                menu.show();

                //new ProgV().show();
            }
            else
                JOptionPane.showMessageDialog(loginPage, "User and/or password incorrect!", "INVALID DETAILS", 0);
            
        }
        
        if(e.getSource() == loginPage.getRegisterBttn())
        {
            loginPage.dispose();
            new RegisterV().show();
        }
        
        if(e.getSource() == loginPage.getSupportBttn())
        {
           loginPage.dispose();
           new SupportV2().show(); 
        }
    }

    private Boolean checkUser()
    {
        String username = loginPage.getuNameLogin().getText();
        String pswd = loginPage.getPwdLogin().getText();
       
        //retrieve sql query
        String query = 
                "SELECT user_email FROM User WHERE user_email= '" + username + "'" + 
                " AND user_pass = '" + pswd + "'";
        
        user.getConnection();
        //String result = user.queryData(query, "user_email");
        
        
//        if(result.isBlank())
//            return false;
//        else 
//            return true;
        return true;
    }
    
    
}
