/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import models.Main;
import views.MenuBarV;
import views.RegisterV;
import views.SupportV;
import views.LoginV;
import views.ProgV;

/**
 *
 * @author Amit
 */
public class LoginRegisterCont implements ActionListener
{
    private LoginV loginPage;
    private JFrame mainFrame;
    private MenuBarCont menuCont;
    public LoginRegisterCont(LoginV loginPage) 
    {
        this.loginPage = loginPage;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {   /*
        if(e.getSource() == loginPage.getLoginBttn())
        {
            //loginPage.dispose();
            
            MenuBarV menu= new MenuBarV();
            
            menu.setPageTitle("Profile");
            menu.setPageTopicContent(new ProgV().getProgViewContent());
            
            //menu.show();
            
            //new ProgV().show();
        }
        
        if(e.getSource() == loginPage.getRegisterBttn())
        {
            loginPage.dispose();
            new RegisterV().show();
        }
        
        if(e.getSource() == loginPage.getSupportBttn())
        {
           loginPage.dispose();
           new SupportV().show(); 
        }*/
    }

    
    
}
