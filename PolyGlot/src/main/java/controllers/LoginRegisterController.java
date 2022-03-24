/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import viewpagesV4.loginView;
import viewpagesV4.progV;

/**
 *
 * @author Amit
 */
public class LoginRegisterController implements ActionListener
{
    private loginView loginPage;
    private JButton bttn;

    public LoginRegisterController(loginView loginPage) 
    {
        this.loginPage = loginPage;
        this.bttn = loginPage.getLoginBttn();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == bttn)
        {
            loginPage.dispose();
            progV progPage = new progV();
            progPage.show();
        }
        
        if(e.getSource() == loginPage.getRegisterBttn())
        {
            JOptionPane.showMessageDialog(loginPage, "hey");
        }
    }

    
    
}
