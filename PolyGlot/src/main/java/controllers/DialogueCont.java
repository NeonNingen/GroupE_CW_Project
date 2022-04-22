/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    
    public DialogueCont() 
    {
        
    }

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
    public void setDlgList(DlgListV dlgView, DialogueMDL dlgModel) {
        
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
                    count++;
                    
                }
                dlgList.add(new DialogueMDL(orderList[i][0].toString(),orderList[i][1].toString(),orderList[i][2].toString(),
                                            orderList[i][3].toString(),orderList[i][4].toString(),orderList[i][5].toString(),
                                            orderList[i][6].toString(),orderList[i][7].toString(),orderList[i][8].toString()));
                
                
            }
        
        printDlgList();
        //use dlg list to fill in JTable in dialgue view    
        dlgListPage.generateJTable(rowCount, dlgList);
        dlgListPage.revalidate();
        dlgListPage.repaint();
    
        
    }
    
    /**
     * Suggested by Aisana (as addition to menubar)
     * Use this method to set up dialogue history list and display it into table
     * note that menuBar controller will refer to this method to initialise dialogue hist list view
     * Aisana created (as author of menubar), for any issues address her
     * @param histList
     * @param Model 
     */
    public void setDlgHist(DlgHistV histList, DialogueMDL Model){
        
    }
    
    public void printDlgList(){
        System.out.println("Check dialogue list:");
        for(int count=0; count<rowCount;count++){
            System.out.print(dlgList.get(count).getDlg_name()+" | "+dlgList.get(count).getDlg_points());
                System.out.println();
        }
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