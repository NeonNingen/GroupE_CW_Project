/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import views.DlgListV;
import views.LoginV;
import views.MenuBarV;
import views.SettingV;
import views.SupportV2;
import views.UListStdV;
import views.UListTchV;
import views.ProgV;
import views.RegisterV;

public class MenuBarCont implements ActionListener
{

    private MenuBarV menuBar = new MenuBarV();
    private LoginV loginPage;
    //private ProgV progPage;
    static JFrame mainFrame= new JFrame("Application Prototype version1.0");

    
    public MenuBarCont(MenuBarV menuBar) 
    {
        this.menuBar = menuBar;
        
    }
    
    public MenuBarCont(LoginV loginPage) 
    {
        this.loginPage = loginPage;
    }

    public static void main(String [] args){
        openFrame();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // Login Page switcjing:
        if(e.getSource() == loginPage.getLoginBttn())
        {
            //loginPage.dispose();
            ProgV progPage= new ProgV();
            changePanel(progPage.getProgViewContent());
            
            menuBar.setPageTitle("Profile");
            menuBar.setPageTopicContent(new ProgV().getProgViewContent());
            menuBar.show();
            //sqlite sqlite-jdbc 3.30.1 jar
            //new ProgV().show();
        }
        
        if(e.getSource() == loginPage.getRegisterBttn())
        {
            //loginPage.dispose();
            //new RegisterV().show();
            
            RegisterV regPage= new RegisterV();
            changePanel(regPage.getRegisterPanel());
            
        }
        
        if(e.getSource() == loginPage.getSupportBttn())
        {
           loginPage.dispose();
           new SupportV2().show();
            //SupportV2 supPage= new SupportV2();
            //changePanel(supPage.getSupportContent());
            
            
        }
        
        
        
        //JPanel current= menuBar.getPageTopicContent().;
/*        if(e.getSource() == menuBar.getProVBttn()){
            System.out.println("pressed progress page button");
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
            
        }*/
        
        
        
        
        
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
    
    public static void openFrame(){
        LoginV loginPage = new LoginV();
        mainFrame.add(loginPage.getLoginPanel());
        mainFrame.pack();
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    public void changePanel(JPanel newPnl){
        mainFrame.removeAll();
        mainFrame.revalidate();
        mainFrame.repaint();
        mainFrame.add(newPnl);
    }
    
    
}
