/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import views.DlgHistV;
import views.DlgListV;
import views.LoginV;
import views.MenuBarV;
import views.SettingV;
import views.SupportV;
import views.UListStdV;
import views.UListTchV;
import views.ProgV;
import views.RegisterV;

/**
 *
 * @author Amit
 */
public class MenuBarCont implements ActionListener
{

    private MenuBarV menuBar;
    private ProgV ProfilePage;
    private LoginV loginPage;
    
    public MenuBarCont(MenuBarV menuBar) 
    {
        this.menuBar = menuBar;
    }
    
    /*
    public MenuBarCont(ProgV progP) 
    {
        this.ProfilePage = progP;
    }
    
    public MenuBarCont(LoginV loginP) 
    {
        this.loginPage = loginP;
    }*/

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        /*
        if(e.getSource() == loginPage.getLoginBttn())
        {
            loginPage.dispose();
            MenuBarV menu= new MenuBarV();
            menu.setPageTitle("Profile");
            menu.setPageTopicContent(new ProgV().getProgViewContent());
            
            menu.show();
            
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
        }
        
        
        
        
        //JPanel current= menuBar.getPageTopicContent().;
        if(e.getSource() == menuBar.getProVBttn()){ //error
            System.out.println("pressed progress page button");
            MenuBarV menu= new MenuBarV();
            menu.setPageTitle("Profile");
            menu.setPageTopicContent(new ProgV().getProgViewContent());
            
            if(e.getSource() == ProfilePage.getDlgHistBtn()){
                ProfilePage.dispose();
                //MenuBarV menu= new MenuBarV();
                menu.setPageTitle("Dialogeu History");
                menu.setPageTopicContent(new DlgHistV().getDlgHistConent());
                menu.show();
                //menu.setPageTitle("Dialogue History");
            
            }
            
        }*/
        
        
        if(e.getSource() == menuBar.getProVBttn()){ //error
            System.out.println("pressed progress page button");
            //MenuBarV menu= new MenuBarV();
            menuBar.setPageTitle("Profile");
            menuBar.setPageTopicContent(new ProgV().getProgViewContent());
        }
        if(e.getSource() == menuBar.getUListBttn()){
            menuBar.setPageTitle("User List");
            menuBar.setPageTopicContent(new UListTchV().getUListContent());
           
        }
        
        if(e.getSource() == menuBar.getSupportBttn()){
            menuBar.setPageTitle("Support");
            menuBar.setPageTopicContent(new SupportV().getSupportContent());
            
        }
        
        if(e.getSource() == menuBar.getSettBttn()){
            menuBar.setPageTitle("Settings"); //change title
            menuBar.setPageTopicContent(new SettingV().getSettingContent()); //clear page content and add content of view class Jpanel 
            
        }
        
        if(e.getSource() == menuBar.getDlgListBttn()){
            menuBar.setPageTitle("Dialogue List");
            menuBar.setPageTopicContent(new DlgListV().getDlgListContent());
            
        }
//        if(e.getSource() == menuBar.getProVBttn())
//        {
//            new ProgV().show();
//        }
//        
        //This if statement needs to be sorted out because of the different versions of User List page in the project
//        if(e.getSource() == menuBar.getUListBttn())
//        {
//        int num = (int) (Math.random() * 10);
//        if (num % 2 == 0) 
//        {
//           new UListStdV().show();
//        }
//        else
//        {
//           new UListTchV().show();
//        }

//        }
//        
//        if(e.getSource() == menuBar.dlgListBttn())
//        {
//            new DlgListV().show();
//        }
//        
//        if(e.getSource() == menuBar.getSettBttn())
//        {
//            new SettingV().show();
//        }
        
//        if(e.getSource() == menuBar.getSupportBttn())
//        {
//           new SupportV().show(); 
//        }
        
    }
    
    
}
