/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import models.DialogueMDL;
import views.CardScrollV;
import views.DlgHistV;
import views.DlgListV;
import views.SetUpDlgV;

public class DialogueCont implements ActionListener
{
    private DlgListV dlgListPage;
    private DlgHistV dlgHistPage;
    private SetUpDlgV dlgSetUpPage;
    private DialogueMDL dlgMdlClass;
    String tableName= "Dialogue";
    int rowCount=0;
    int clmnCount=0;
    
    ArrayList<DialogueMDL> dlgList = new ArrayList <DialogueMDL>();
    ArrayList <String> draftList= new ArrayList<String>();
    

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

    /**
     * When initialising the controller its constructor will create instance of dialogue Model and diallogue list view classes
     *  in order to generate arrayList of Dialogues and generate JTable in the dialogue view JFrame
     * @param dlgView - reference to the dialogue view class
     * @param dlgModel - reference to the dialogue model class
     */
    DialogueCont(DlgListV dlgView, DialogueMDL dlgModel) {
        
        // store data into dlh list of Dialogue objects
        dlgListPage= dlgView;
        dlgMdlClass= dlgModel;
        rowCount= DialogueMDL.getRowCount("Dialogue");
        clmnCount= DialogueMDL.getColumnCount("Dialogue");
        draftList = DialogueMDL.queryData("SELECT * FROM Dialogue");
        //System.out.println(draftList.toString());
        System.out.println("Rows: "+ rowCount);
        System.out.println("Columns: "+ clmnCount);
        String[][] orderList= new String[rowCount][clmnCount];
            int count=0;
            for(int i=0; i<rowCount;i++){
                
                for(int j=0; j<clmnCount;j++){
                    
                    orderList[i][j]= draftList.get(count);
                    dlgList.add(new DialogueMDL(draftList.get(0),draftList.get(1),draftList.get(2),
                                                draftList.get(3),draftList.get(4),draftList.get(5),
                                                draftList.get(6),draftList.get(7),draftList.get(8)));
                    System.out.print(draftList.get(count)+" | ");
                    count++;
                }
                System.out.println();
            }
        
        //use dlg list to fill in JTable in dialgue view    
            
    
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