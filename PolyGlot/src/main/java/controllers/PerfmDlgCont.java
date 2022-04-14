/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.CardScrollV;
import views.DlgHistV;
import views.DlgListV;
import views.SetUpDlgV;

/**
 *
 * @author New User
 */
public class PerfmDlgCont implements ActionListener
 {
    private SetUpDlgV SetUpDlgPage;

    public PerfmDlgCont(SetUpDlgV SetUpDlgPage) 
    {
        this.SetUpDlgPage = SetUpDlgPage;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       
       if(e.getSource() == SetUpDlgPage.getStartDlgBttn())
       {
           SetUpDlgPage.dispose();
           new CardScrollV().show();
       }
       
       if(e.getSource() == SetUpDlgPage.getCloseBttn())
       {
          SetUpDlgPage.dispose();
          new DlgListV().show();
       }
    }

}