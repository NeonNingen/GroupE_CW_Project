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
 * @author Amit
 */
public class DialogueController implements ActionListener
{
    private DlgListV dlgListPage;
    private DlgHistV dlgHistPage;
    private SetUpDlgV dlgSetUpPage;

    public DialogueController(DlgListV dlgListPage) 
    {
        this.dlgListPage = dlgListPage;
    }

    public DialogueController(DlgHistV dlgHistPage) 
    {
        this.dlgHistPage = dlgHistPage;
    }

    public DialogueController(SetUpDlgV dlgSetUpPage) 
    {
        this.dlgSetUpPage = dlgSetUpPage;
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
//        if(e.getSource() == dlgSetUpPage.getStartDlgBttn())
//        {
//            dlgSetUpPage.dispose();
//            new CardScrollV().show();
//        }
    }
}