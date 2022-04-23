/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.RowFilter;
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
    ArrayList<DialogueMDL> filteredList = new ArrayList <DialogueMDL>();
    ArrayList <String> draftList= new ArrayList<String>();
    
    //for comboboxes:
    ArrayList <String> grammarList= new ArrayList<String>();
    ArrayList <String> lvlList= new ArrayList<String>();
    ArrayList <String> topicList= new ArrayList<String>();
    
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
     * @param query
     */
    public void setDlgList(DlgListV dlgView, DialogueMDL dlgModel, String query) {
        
        // store data into dlh list of Dialogue objects
        dlgListPage= dlgView;
        dlgMdlClass= dlgModel;
        rowCount= DialogueMDL.getRowCount("Dialogue");
        clmnCount= DialogueMDL.getColumnCount("Dialogue");
        draftList = DialogueMDL.queryData(query);
        System.out.println("Check query for filter: "+ draftList.toString());
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
    
        queryCmbBoxes();
        
    }
    
    
    public void setDlgHist(DlgHistV dlgHist, DialogueMDL dlgModel) {
        
    }
    
    public void filterDlgList(DlgListV dlgView, DialogueMDL dlgModel, String query) {
        
        // store data into dlh list of Dialogue objects
        dlgListPage= dlgView;
        dlgMdlClass= dlgModel;
        
        draftList = DialogueMDL.queryData(query);
        
        //rowCount= DialogueMDL.getRowCount("Dialogue");
        clmnCount= 9;//DialogueMDL.getColumnCount("Dialogue");
        rowCount= draftList.size()/clmnCount;
        
        System.out.println("Check query for filter: "+ draftList.toString());
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

    public void printDlgList(){
        System.out.println("Check dialogue list:");
        for(int count=0; count<rowCount;count++){
            System.out.print(dlgList.get(count).getDlg_name()+" | "+dlgList.get(count).getDlg_points());
                System.out.println();
        }
    }
     
    public void queryCmbBoxes(){
        grammarList=DialogueMDL.queryData("SELECT DISTINCT dialogue_grammar FROM Dialogue");
        
        /*String check;
        for(int i=0; i<list.size();i++){
            check = list.get(i);
            System.out.println("Trying :"+check);
            grammarList.add(check);
            for(int j=0; j<grammarList.size();j++){ //check it exists in grammarlist or not
                if(grammarList.get(j).equals(check)){
                    System.out.println("already there");
                    check=null;
                }else{
                    grammarList.add(check);
                    System.out.println("Added new element");
                }
            }
        }*/
        
        lvlList= DialogueMDL.queryData("SELECT DISTINCT dialogue_lvl FROM Dialogue");
        topicList=DialogueMDL.queryData("SELECT DISTINCT dialogue_topic FROM Dialogue");
        
        System.out.println(grammarList);
        System.out.println(lvlList);
        System.out.println(topicList);
        
        dlgListPage.fillCmbx(grammarList, lvlList,topicList);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String checkG="";
        String checkL="";
        String checkT="";
        if(e.getSource()== dlgListPage.getChooseGramCbox()
                || e.getSource()== dlgListPage.getChooseLvlCbox()
                || e.getSource()== dlgListPage.getChooseTopicCbox()){
            System.out.println(" caught action from Combobox");
            
            checkG= isSelected(dlgListPage.getChooseGramCbox());
            checkL=isSelected(dlgListPage.getChooseLvlCbox());
            checkT=isSelected(dlgListPage.getChooseTopicCbox());
            
            String query="SELECT * FROM Dialogue " +"WHERE " +
                                " dialogue_grammar='" + checkG +"'";
                filterDlgList(dlgListPage, dlgMdlClass, query);
            
            
            /*
            "SELECT user_lang_lvl, user_id, user_name, user_group_id, user_progresspoints FROM User"
                        + " WHERE user_type = 'Student' "
                        + " AND user_lang_lvl = '" + selectedItemLvl + "'";
            */
            
            if(!"none".equals(checkG)){
                 query="SELECT * FROM Dialogue " +"WHERE " +
                                " dialogue_grammar='" + checkG +"'";
                filterDlgList(dlgListPage, dlgMdlClass, query);
            }
            
            /*
            if(!"none".equals(checkG) && !"none".equals(checkL) && !"none".equals(checkT)){
                String query="SELECT * FROM Dialogue\n" +"WHERE\n" +
                                "dialogue_lvl='" + checkL+ "'"+
                                " AND dialogue_grammar='" + checkG+ "'"+
                                " AND dialogue_topic='"+checkT +"'";
                filterDlgList(dlgListPage, dlgMdlClass, query);
            } */
        }
        
        /*
        "SELECT * FROM Dialogue\n" +"WHERE\n" +
                                "dialogue_lvl==\"A2\"\n" +
                                "AND dialogue_grammar==\"Simple Past\"\n" 
                                "AND dialogue_topic= \"Buying clothes\";";
        */

    }
    
    public String isSelected(JComboBox box){
        if(box.equals("Choose Grammar")){
            System.out.println(box.getSelectedItem().toString());
            return box.getSelectedItem().toString();
        }else{
            return "none";
        }
    }
    
}