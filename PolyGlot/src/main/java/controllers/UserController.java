/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewpagesV4.UListStdV;
import viewpagesV4.UListTchV;

/**
 *
 * @author New User
 */
public class UserController implements ActionListener
{
    private UListStdV UserListSudentPage;
    private UListTchV UserListTeacherPage;
   
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
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