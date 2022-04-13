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

public class DialogueCont implements ActionListener
{
    private DlgListV dlgListPage;
    private DlgHistV dlgHistPage;
    private SetUpDlgV dlgSetUpPage;

    public DialogueCont(DlgListV dlgListPage) 
    {
        this.dlgListPage = dlgListPage;
    }

    public DialogueCont(DlgHistV dlgHistPage) 
    {
        this.dlgHistPage = dlgHistPage;
    }

    public DialogueCont(SetUpDlgV dlgSetUpPage) 
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