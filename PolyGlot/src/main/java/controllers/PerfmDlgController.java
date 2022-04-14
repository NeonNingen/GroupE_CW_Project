/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewpagesV4.CardScrollV;
import viewpagesV4.DlgHistV;
import viewpagesV4.DlgListV;
import viewpagesV4.SetUpDlgV;

/**
 *
 * @author New User
 */
public class PerfmDlgController implements ActionListener
 {
    private SetUpDlgV SetUpDlgPage;

    public PerfmDlgController(SetUpDlgV SetUpDlgPage) 
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