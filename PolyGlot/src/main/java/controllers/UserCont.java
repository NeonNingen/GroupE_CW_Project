/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.DlgHistV;
import views.MenuBarV;
import views.UListStdV;
import views.UListTchV;
import views.ProgV;

/**
 *
 * @author New User
 */
public class UserCont implements ActionListener
{
    private UListStdV UserListSudentPage;
    private UListTchV UserListTeacherPage;
    private ProgV ProfilePage;
    private MenuBarV menuBar;
    
    public UserCont(ProgV page){//), MenuBarV menu){
        this.ProfilePage=page;
        //this.menuBar=menu;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == ProfilePage.getDlgHistBtn()){
            ProfilePage.dispose();
            MenuBarV menu= new MenuBarV();
            menu.setPageTitle("Dialogeu History");
            menu.setPageTopicContent(new DlgHistV().getDlgHistConent());
            menu.show();
            menu.setPageTitle("Dialogue History");
            
        }
      /*
        after checking both UserList Pages, I noticed that the code written below won't be needed 
        as the 'linking' part is done by the MenuBarController
        
        [Amit]
      */
        
        
        /*if(e.getSource() == UserListSudentPage.getUserListBttn())
       
        {
            UserListSudentPage.dispose();
            new UListStdV().show();
        }
        
        if(e.getSource() == UserListTeacherPage.getUserListBttn())
        {
            UserListTeacherPage.dispose();
            new UListTchV().show();
        }*/
        
        
    }

    
}