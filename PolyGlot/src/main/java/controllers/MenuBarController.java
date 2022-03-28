/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import viewpagesV4.DlgListV;
import viewpagesV4.MenuBarView;
import viewpagesV4.SettingV;
import viewpagesV4.SupportV;
import viewpagesV4.UListStdV;
import viewpagesV4.UListTchV;
import viewpagesV4.progV;

/**
 *
 * @author Amit
 */
public class MenuBarController implements ActionListener
{

    private MenuBarView menuBar;
    
    public MenuBarController(MenuBarView menuBar) 
    {
        this.menuBar = menuBar;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //JPanel current= menuBar.getPageTopicContent().;
        if(e.getSource() == menuBar.getProVBttn()){
            System.out.println("pressed progress page button");
            menuBar.setPageTitle("Profile");
            menuBar.setPageTopicContent(new progV().getProgViewContent());
            
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
//            new progV().show();
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
