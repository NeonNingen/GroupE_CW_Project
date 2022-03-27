/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
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

    private JFrame currentPage;
    private MenuBarView menu;

    public MenuBarController(progV progPage, MenuBarView menu) 
    {
        this.currentPage = progPage;
        this.menu = menu;
    }
    
    public MenuBarController(SettingV SettPage, MenuBarView menu) 
    {
        this.currentPage = SettPage;
        this.menu = menu;
    }
    
    public MenuBarController(DlgListV dlgPage, MenuBarView menu) 
    {
        this.currentPage = dlgPage;
        this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == menu.getProVBttn())
        {
            if(!(currentPage instanceof progV))
            {
                currentPage.dispose();
                new progV().show();
            }
        }
        
        //This if statement needs to be sorted out because of the different versions of User List page in the project
        /*
        if (e.getSource() == menu.getUListBttn()) 
        {
            int num = (int) (Math.random() * 10);
            if (num % 2 == 0) {
                new UListStdV().show();
            } else {
                new UListTchV().show();
            }
        }
        */
        
        if(e.getSource() == menu.getDlgListBttn())
        {
            if(!(currentPage instanceof DlgListV))
            {
                currentPage.dispose();
                new DlgListV().show();
            }
            
        }
        
        if(e.getSource() == menu.getSettBttn())
        {
            if(!(currentPage instanceof SettingV))
            {
                currentPage.dispose();
                new SettingV().show();
            }
        }
        
        if(e.getSource() == menu.getSupportBttn())
        {
           if(!(currentPage instanceof SupportV))
           {
               currentPage.dispose();
               new SupportV().show();
           }
        }
        
    }
    
    
}
