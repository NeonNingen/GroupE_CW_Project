/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewpagesV4.DlgHistV;
import viewpagesV4.MenuBarView;
import viewpagesV4.UListStdV;
import viewpagesV4.UListTchV;
import viewpagesV4.progV;

/**
 *
 * @author New User
 */
public class UserController implements ActionListener
{
    private UListStdV UserListSudentPage;
    private UListTchV UserListTeacherPage;
    private progV ProfilePage;
    private MenuBarView menuBar;
    
    public UserController(progV page){//), MenuBarView menu){
        this.ProfilePage=page;
        //this.menuBar=menu;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == ProfilePage.getDlgHistBtn()){
            ProfilePage.dispose();
            MenuBarView menu= new MenuBarView();
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