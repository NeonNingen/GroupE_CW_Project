/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    //test test test test test test e
    //test commit
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
            progV progPage = new progV();
            progPage.show();
        }
        
        if(e.getSource() == loginPage.getRegisterBttn())
        {
            loginPage.dispose();
            RegisterView regPage = new RegisterView();
            regPage.show();
        }
        
        if(e.getSource() == loginPage.getSupportBttn())
        {
           loginPage.dispose();
           SupportV supportPage = new SupportV();
           supportPage.show(); 
        }
    }

    
    
}
