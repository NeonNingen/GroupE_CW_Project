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
import views.MenuBarV;
import views.SettingV;
import views.SupportV;
import views.UListStdV;
import views.UListTchV;
import views.ProgV;

/**
 *
 * @author Amit
 */
public class MenuBarCont implements ActionListener
{

    private MenuBarV menuBar;
    //private ProgV progPage;
    
    public MenuBarCont(MenuBarV menuBar) 
    {
        this.menuBar = menuBar;
    }
    
    /*public MenuBarCont(ProgV progPage) 
    {
        this.progPage = progPage;
    }*/

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //JPanel current= menuBar.getPageTopicContent().;
        
        
        if(e.getSource() == menuBar.getProVBttn()){
            //System.out.println("pressed progress page button");
            menuBar.setPageTitle("Profile");
            menuBar.setProgPageTopicContent(new ProgV().getProgViewContent());
            //menuBar.addHistBttn();
            //menuBar.getDlgHistBttn2().isVisible();
            
        }
        if(e.getSource() == menuBar.getDlgHistBttn2()){
                //menuBar.dispose();
               // MenuBarV menu= new MenuBarV();
                menuBar.setPageTitle("Dialogue History");
                menuBar.setPageTopicContent(new DlgHistV().getDlgHistConent());
                //menuBar.show();
                //menu.setPageTitle("Dialogue History");
            
        }
        
        if(e.getSource() == menuBar.getUListBttn()){
            menuBar.remove(menuBar.getDlgHistBttn2());
            menuBar.setPageTitle("User List");
            menuBar.setPageTopicContent(new UListTchV().getUListContent());
           
        }
        
        if(e.getSource() == menuBar.getSupportBttn()){
            menuBar.setPageTitle("Support");
            menuBar.setPageTopicContent(new SupportV().getSupportContent());
            
        }
        
        if(e.getSource() == menuBar.getSettBttn()){
            if(e.getSource() == menuBar.getSettBttn()){
            SettingV setting = new SettingV(menuBar);
            menuBar.setPageTitle("Settings"); //change title
            menuBar.setPageTopicContent(setting.getSettingContent()); //clear page content and add content of view class Jpanel 
            //setting.getLogoutBttn().addActionListener(new LoginRegisterCont(setting,menuBar)); //By Monesha
            
        }
            
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
