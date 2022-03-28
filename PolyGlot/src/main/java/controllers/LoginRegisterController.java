/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewpagesV4.MenuBarView;
import viewpagesV4.RegisterView;
import viewpagesV4.SupportV;
import viewpagesV4.loginView;
import viewpagesV4.progV;

/**
 *
 * @author Amit
 */
public class LoginRegisterController implements ActionListener
{
    private loginView loginPage;
    
    public LoginRegisterController(loginView loginPage) 
    {
        this.loginPage = loginPage;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == loginPage.getLoginBttn())
        {
            loginPage.dispose();
            MenuBarView menu= new MenuBarView();
            menu.setPageTitle("Profile");
            menu.setPageTopicContent(new progV().getProgViewContent());
            
            menu.show();
            
            //new progV().show();
        }
        
        if(e.getSource() == loginPage.getRegisterBttn())
        {
            loginPage.dispose();
            new RegisterView().show();
        }
        
        if(e.getSource() == loginPage.getSupportBttn())
        {
           loginPage.dispose();
           new SupportV().show(); 
        }
    }

    
    
}
