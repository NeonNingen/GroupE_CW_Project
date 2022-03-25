/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewpagesV4.DlgListV;
import viewpagesV4.MenuBarView;
import viewpagesV4.SettingV;
import viewpagesV4.UListStdV;
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
