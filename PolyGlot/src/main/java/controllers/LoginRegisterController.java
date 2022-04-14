/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD:PolyGlot/src/main/java/controllers/LoginRegisterCont.java
import javax.swing.JFrame;
import javax.swing.JPanel;
import models.Main;
import views.MenuBarV;
import views.RegisterV;
import views.SupportV;
import views.LoginV;
import views.ProgV;
=======
import viewpagesV4.MenuBarView;
import viewpagesV4.RegisterView;
import viewpagesV4.SupportV;
import viewpagesV4.loginView;
import viewpagesV4.progV;
>>>>>>> parent of 99c1307 (Renamed package and classes):PolyGlot/src/main/java/controllers/LoginRegisterController.java

/**
 *
 * @author Amit
 */
public class LoginRegisterController implements ActionListener
{
<<<<<<< HEAD:PolyGlot/src/main/java/controllers/LoginRegisterCont.java
    private LoginV loginPage;
    private JFrame mainFrame;
    private MenuBarCont menuCont;
    public LoginRegisterCont(LoginV loginPage) 
=======
    private loginView loginPage;
    
    public LoginRegisterController(loginView loginPage) 
>>>>>>> parent of 99c1307 (Renamed package and classes):PolyGlot/src/main/java/controllers/LoginRegisterController.java
    {
        this.loginPage = loginPage;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {   /*
        if(e.getSource() == loginPage.getLoginBttn())
        {
<<<<<<< HEAD:PolyGlot/src/main/java/controllers/LoginRegisterCont.java
            //loginPage.dispose();
            
            MenuBarV menu= new MenuBarV();
            
=======
            loginPage.dispose();
            MenuBarView menu= new MenuBarView();
>>>>>>> parent of 99c1307 (Renamed package and classes):PolyGlot/src/main/java/controllers/LoginRegisterController.java
            menu.setPageTitle("Profile");
            menu.setPageTopicContent(new progV().getProgViewContent());
            
            //menu.show();
            
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
        }*/
    }

    
    
}
