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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import models.DialogueMDL;
import views.CardScrollV;
import views.DlgHistV;
import views.DlgListV;
import views.MenuBarV;
import views.ProgV;
import views.SetUpDlgV;

public class DialogueCont implements ActionListener
{
    private ProgV progPage;
    private MenuBarV menuV;
    private DlgListV dlgListPage;
    private DlgHistV dlgHistPage;
    private SetUpDlgV dlgSetUpPage;
    private DialogueMDL dlgMdlClass;
    private DialogueMDL currentDlg;
    private SetUpDlgV setUp;
    private String currentLang;
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
    
    public DialogueCont(MenuBarV menu) 
    {
        menuV= menu;
    }
    
    public DialogueCont(MenuBarV menu, DlgListV dlgView, DialogueMDL dlgModel, String lang) 
    {
        menuV= menu;
        dlgListPage= dlgView;
        dlgMdlClass= dlgModel;
        this.currentLang= lang;
    }

    public DialogueCont(DlgListV dlgListPage) 
    {
        this.dlgListPage = dlgListPage;
        
    }

    public DialogueCont() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void choosingDlg(){
        if( dlgListPage.getjTableDlgList().getRowCount()>0){
            this.dlgListPage.getjTableDlgList().addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    // 1.collect info for the table row
                    int row= dlgListPage.getjTableDlgList().getSelectedRow(); //get row
                    currentDlg = dlgList.get(row);
                    //2. display it 


                    jTableDlgListMouseClicked(evt);
                }
            });
        }
    }
    
    

    public DialogueCont(DlgHistV dlgHistPage) 
    {
        this.dlgHistPage = dlgHistPage;
    }

    public DialogueCont(SetUpDlgV dlgSetUpPage) 
    {
        this.dlgSetUpPage = dlgSetUpPage;
    }
    
    public void setCurrentLang(String lang){
        this.currentLang= lang;
    }

    /**
     * When initialising the controller its constructor will create instance of dialogue Model and diallogue list view classes
     *  in order to generate arrayList of Dialogues and generate JTable in the dialogue view JFrame
     * @param dlgView - reference to the dialogue view class
     * @param dlgModel - reference to the dialogue model class
     * @param query
     * @param lang
     */
    public void setDlgList( String query){//) {
        
        //this.currentLang=lang;
        // store data into dlh list of Dialogue objects
        
        
        queryCmbBoxes(); // could trigger comboboxes?
        //String query= "SELECT * FROM Dialogue WHERE dialogue_language ='" + currentLang+ "'"; //OK
        System.out.println("Pring query orignin: "+query);
        //rowCount= DialogueMDL.getRowCount("Dialogue");
        clmnCount= DialogueMDL.getColumnCount("Dialogue");
        draftList = DialogueMDL.queryData(query);
        
        rowCount= draftList.size()/clmnCount;
        System.out.println("Check query for original list: "+ draftList.toString());
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
        dlgListPage.setActList(this);
        dlgListPage.revalidate();
        dlgListPage.repaint();
        
        choosingDlg();
    
        
        
    }
    
    
    public void setDlgHist(DlgHistV dlgHist, DialogueMDL dlgModel) {
       dlgHistPage = dlgHist;
       dlgMdlClass = dlgModel;
       queryDlghPage();

    }
    
    public void filterDlgList(DlgListV dlgView, DialogueMDL dlgModel, String query) {
        
        System.out.println("filtering table: lang: "+ currentLang); 
        // store data into dlh list of Dialogue objects
        filteredList.clear();
        //dlgListPage= dlgView;
        //dlgMdlClass= dlgModel;
        //DialogueMDL.getConnection();
       
        draftList = DialogueMDL.queryData(query);
        
        
        //rowCount= DialogueMDL.getRowCount("Dialogue");
        int clmnC= 9;//DialogueMDL.getColumnCount("Dialogue");
        int rowC= draftList.size()/clmnC;
        
        System.out.println("Check query for filter: "+ draftList.toString());
        System.out.println("Rows: "+ rowC);
        System.out.println("Columns: "+ clmnC);
        String[][] orderList= new String[rowC][clmnC];
            int count=0;
            for(int i=0; i<rowC;i++){
                
                for(int j=0; j<clmnC;j++){
                    
                    orderList[i][j]= draftList.get(count);
                    count++;
                    
                }
                filteredList.add(new DialogueMDL(orderList[i][0].toString(),orderList[i][1].toString(),orderList[i][2].toString(),
                                            orderList[i][3].toString(),orderList[i][4].toString(),orderList[i][5].toString(),
                                            orderList[i][6].toString(),orderList[i][7].toString(),orderList[i][8].toString()));
                
                
            }
        
        
        printDlgList();
        //use dlg list to fill in JTable in dialgue view    
        dlgListPage.generateJTable(rowC, filteredList);
        dlgListPage.revalidate();
        dlgListPage.repaint();
        
        choosingDlg();
    
        
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
        lvlList= DialogueMDL.queryData("SELECT DISTINCT dialogue_lvl FROM Dialogue");
        topicList=DialogueMDL.queryData("SELECT DISTINCT dialogue_topic FROM Dialogue");
        
        
        dlgListPage.fillCmbx(grammarList, lvlList,topicList);
        setToOrigin();
        
        dlgListPage.getChooseGramCbox().setSelectedIndex(0);
        dlgListPage.getChooseLvlCbox().setSelectedIndex(0);
        dlgListPage.getChooseTopicCbox().setSelectedIndex(0);
        
    }
    
    public void setToOrigin(){
        dlgListPage.getChooseGramCbox().setSelectedIndex(0);
        dlgListPage.getChooseLvlCbox().setSelectedIndex(0);
        dlgListPage.getChooseTopicCbox().setSelectedIndex(0);
    }
     public void queryDlghPage(){
        
        dlgMdlClass.getConnection();
         ArrayList<String> list = new ArrayList();
        String query = "SELECT date_completed , dialogue_id FROM Dialogue_Record";
        list = dlgMdlClass.queryData(query);
        
        String[] columnNames = {"Date", "Past Dialogues"};
        int row = list.size()/columnNames.length;
        String[][] data = new String[row][columnNames.length];
        
        int count = 0;
        for (int i = 0; i < data.length; i++) 
        {
            for (int j = 0; j < columnNames.length; j++) 
            {
                data[i][j] = list.get(count);
                count++;
            }
            
        }
         DefaultTableModel tableMod = new DefaultTableModel(data, columnNames)
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                    
        };
       
     dlgHistPage.getDlgHistTable().setModel(tableMod);
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == dlgSetUpPage.getCloseBttn()){
            dlgSetUpPage.dispose();
            menuV.show();
            //MenuBarCont menuCont= new MenuBarCont();
            //menuCont.setDlgListPage();
        
        }
        if(e.getSource()== dlgListPage.getChooseGramCbox()){
            System.out.println("action for box 1: lang: "+ this.currentLang); 
            //dlgListPage.getChooseGramCbox().getSelectedItem();
            filterTable("none");
        } 
        if(e.getSource()== dlgListPage.getChooseLvlCbox()){
            System.out.println("action for box 2, lang: "+ currentLang); 
            filterTable("none");
        }
        if( e.getSource()== dlgListPage.getChooseTopicCbox()){
            System.out.println("action for box 3, lang: "+ currentLang); 
            filterTable("none");
        }
        
        if( e.getSource()== dlgListPage.getresetBttn()){
            filterTable("reset");
        }
        

    }
    
    private void jTableDlgListMouseClicked(java.awt.event.MouseEvent evt) {  
        String output= "Topic: "+ currentDlg.getDlg_topic()
                + "\nLevel: " + currentDlg.getDlg_level()
                +"\nName: "+ currentDlg.getDlg_name()
                +"\nGrammar: "+currentDlg.getDlg_grammar()
                +"\nLanguage: "+ currentDlg.getDlg_lang()
                +"\nPoints: "+ currentDlg.getDlg_points();
        
        int pressedSelesDlg = JOptionPane.showConfirmDialog(dlgListPage, output+"\nWould you like to practice this dialogue?", " ",JOptionPane.YES_NO_OPTION);
        if(pressedSelesDlg== JOptionPane.YES_OPTION){
            //System.out.println("Yes"); 
            menuV.hide();
            int id = Integer.parseInt(currentDlg.getDlg_id());
            dlgSetUpPage= new SetUpDlgV(id, currentLang, this);
            dlgSetUpPage.show();
        }else if(pressedSelesDlg== JOptionPane.NO_OPTION){
            //System.out.println("No");
        }
        
    }  
    
    
    /**
     * return true if default option is set
     * when it is set to default option it means nothing has been selected, so it will return false
     * @param box
     * @return 
     */
    public boolean isSelected(String box){
        if(box.equals("Choose Level") || box.equals("Choose Grammar") || box.equals("Choose Topic")){
            return false;
        }else{ //if user chose smth from the content list apart from default options
            return true;
        }
    }
    
   
    
    public void filterTable(String str){
        System.out.println("Print lang:"+ currentLang);
        
        //this.currentLang= this.dlgList.get(0).getDlg_lang();
        
        String checkG= (String) dlgListPage.getChooseGramCbox().getSelectedItem();
        String checkL= (String) dlgListPage.getChooseLvlCbox().getSelectedItem();
        String checkT= (String) dlgListPage.getChooseTopicCbox().getSelectedItem();
        
        String query;
        
        if(str.equals("reset")){
            setToOrigin();
            filterDlgList(this.dlgListPage,this.dlgMdlClass,"SELECT * FROM Dialogue WHERE dialogue_language ='" + currentLang+ "'");
            
        }else{
            
            query= setQuery(checkL, checkG, checkT);
            System.out.println("Query: "+ query);
            filterDlgList(this.dlgListPage,this.dlgMdlClass,query);
        }
        
          
            
    }
    
    public String setQuery(String l, String g, String t){
        
        boolean blvl= isSelected(l); 
        boolean bgram= isSelected(g);
        boolean btop= isSelected(t);
        
        //this.currentLang= dlgList.get(0).getDlg_lang();
        
        //if(l.equals("Select Level") && g.equals("Select Grammar") && t.equals("Select Topic")){
        if(blvl==false && bgram==false && btop==false){
            return "SELECT * FROM Dialogue WHERE dialogue_language ='" + currentLang+ "'";
        }
        
        else if(blvl){ // l selected 
            if (bgram){//!"none".equals(g)){ // g selected
                if(btop){//!"none".equals(t)){ // t selected -> all three selected
                        return "SELECT * FROM Dialogue " +"WHERE dialogue_language ='" + currentLang+ "'"
                        +" AND dialogue_lvl= '" + l+ "'"
                        +" AND dialogue_grammar= '" + g+ "'" 
                        +"  AND dialogue_topic= '"+ t +"'"; // return all three
                }else{ // l and g selected
                        return "SELECT * FROM Dialogue " +"WHERE dialogue_language ='" + currentLang+ "'"
                        + " AND dialogue_lvl= '" + l+ "'"
                        + "  AND dialogue_grammar= '"+ g +"'"; // return l and g
                }
            }else{ // g is not selected
                    if(btop){//!"none".equals(t)){ // l and t selected 
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                        " AND dialogue_lvl= '" + l+ "'"+
                        "  AND dialogue_topic= '"+ t +"'"; // return l and t
                    }else{ //only l
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                        " AND dialogue_lvl= '" + l+ "'"; // return just l
                    }
                } 
                
            } else { // l is not sellected //CHECK
                if (bgram){//!"none".equals(g)){ // g selected
                    if(btop){//!"none".equals(t)){ // g and t selected 
                        return "SELECT * FROM Dialogue "+ "WHERE dialogue_language ='" + currentLang+ "'"+
                                " AND dialogue_grammar= '" + g+ "'" + 
                                "  AND dialogue_topic= '"+ t +"'"; //return t and g
                    }else{ // t is not selected
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                                " AND dialogue_grammar= '" + g+ "'"; //return just g
                    }
                }
                
                if (btop){//!"none".equals(t)){ // t selected
                    if(bgram==false){//g.equals("none")){ // only t selected
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                                " AND dialogue_topic= '"+ t +"'"; // return just t
                    }
                }
                    
            } 
        return null;
    }   

    
    
    
}