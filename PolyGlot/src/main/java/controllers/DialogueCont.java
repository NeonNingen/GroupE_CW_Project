/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.DialogueMDL;
import views.CardScrollV;
import views.DlgHistV;
import views.DlgListV;
import views.MenuBarV;
import views.ProgV;
import views.SetUpDlgV;

/**
 * 
 * @author Aisana (w1775375)
 * code for DlgHist list is made by Rafael ()
 */
public class DialogueCont implements ActionListener
{
    private ProgV progPage;
    private MenuBarV menuV;
    private DlgListV dlgListPage;
    private DlgHistV dlgHistPage;
    private SetUpDlgV dlgSetUpPage;
    private CardScrollV CardScrollPage;
    private DialogueMDL dlgMdlClass;
    private DialogueMDL currentDlg;
    private SetUpDlgV setUp;
    private String currentLang;
    String tableName= "Dialogue";
    int rowCount=0;
    int clmnCount=0;
    
    // array lists used for dlg list page
    ArrayList<DialogueMDL> dlgList = new ArrayList <DialogueMDL>();
    ArrayList<DialogueMDL> filteredList = new ArrayList <DialogueMDL>();
    ArrayList <String> draftList= new ArrayList<String>();
    
    //for diaalogue list page comboboxes:
    ArrayList <String> grammarList= new ArrayList<String>();
    ArrayList <String> lvlList= new ArrayList<String>();
    ArrayList <String> topicList= new ArrayList<String>();
    
    MouseAdapter mouseLis = new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        System.out.println("Number of table rows: "+  dlgListPage.getjTableDlgList().getRowCount());
                Integer row= dlgListPage.getjTableDlgList().getSelectedRow(); //get row
                System.out.println("Selected rows: "+ row);
                if(row==null || row==-1){
                    System.out.println("You've tried to press empty space at the table, please, try again.");

                }else{
                    currentDlg = dlgList.get(row);
                    jTableDlgListMouseClicked(e);}

                    }
               };

    public DialogueCont() {

    }
    
    public DialogueCont(MenuBarV menu) 
    {
        menuV= menu;
    }
    
    public DialogueCont(DlgListV dlgListPage) 
    {
        this.dlgListPage = dlgListPage;
        
    }
    
    public DialogueCont(MenuBarV menu, DlgListV dlgView, DialogueMDL dlgModel, String lang) 
    {
        menuV= menu;
        dlgListPage= dlgView;
        dlgMdlClass= dlgModel;
        this.currentLang= lang;
    }
    
    public DialogueCont(DlgHistV dlgHistPage) 
    {
        this.dlgHistPage = dlgHistPage;
    }

    public DialogueCont(SetUpDlgV dlgSetUpPage) 
    {
        this.dlgSetUpPage = dlgSetUpPage;
    }
    
    public DialogueCont(CardScrollV CardScrollPage) 
    {
        this.CardScrollPage = CardScrollPage;
    }
    
    public void setCurrentLang(String lang){
        this.currentLang= lang;
    }
    
    /** by Aisana (w1775375)
     * Method triggered when dlg list row is clicked = dlg is chosen
     * Method will display option pane with information on the dialogue and option to choose yes/no
     * clicking yes will proceed to the setup page, no will return to dlg list
     * @param evt - when mouse clicks on the table row
     */
    private void jTableDlgListMouseClicked(java.awt.event.MouseEvent evt) {
        this.dlgListPage.getjTableDlgList().removeMouseListener(mouseLis);
        String output= "Topic: "+ currentDlg.getDlg_topic()
                + "\nLevel: " + currentDlg.getDlg_level()
                +"\nName: "+ currentDlg.getDlg_name()
                +"\nGrammar: "+currentDlg.getDlg_grammar()
                +"\nLanguage: "+ currentDlg.getDlg_lang()
                +"\nPoints: "+ currentDlg.getDlg_points();
        
        int pressedSelesDlg = JOptionPane.showConfirmDialog(dlgListPage, output+"\nWould you like to practice this dialogue?", " ",JOptionPane.YES_NO_OPTION);
        if(pressedSelesDlg== JOptionPane.YES_OPTION){
            activateClick(false);
            menuV.hide();
            int id = Integer.parseInt(currentDlg.getDlg_id());
            dlgSetUpPage= new SetUpDlgV(id, this);
            dlgSetUpPage.show();
        }else if(pressedSelesDlg== JOptionPane.NO_OPTION){
            activateClick(true);
            //System.out.println("No");
        }
        
    }
    
    
    
    /** by Aisana (w1775375)
     * Method is used to add or remove mouse listener when needed using booleans
     * true - means to add mouse listener, false - means to remove it
     */
    public void activateClick(boolean bl){
        if( dlgListPage.getjTableDlgList().getRowCount()>0){
            if(bl= true)
                this.dlgListPage.getjTableDlgList().addMouseListener(mouseLis);//new java.awt.event.MouseAdapter() {
            else{
                this.dlgListPage.getjTableDlgList().removeAll();
            }
        }
    }

    /** by Aisana (w1775375)
     * When initialising the controller its constructor will create instance of dialogue Model and dialogue list view classes
     *  in order to generate arrayList of Dialogues and generate JTable in the dialogue view JFrame
     * @param query - string that will contain a query needed to access the needed table from database 
     */
    public void setDlgList( String query){
        activateClick(false);
        queryCmbBoxes();
        System.out.println("Pring query orignin: "+query);
        
        clmnCount= DialogueMDL.getColumnCount("Dialogue");
        draftList = DialogueMDL.queryData(query);
        rowCount= draftList.size()/clmnCount;
        //System.out.println("Check query for original list: "+ draftList.toString()); checking query output
        System.out.println("Rows: "+ rowCount);
        System.out.println("Columns: "+ clmnCount);
        
        // split long query output into array of strings
        String[][] orderList= new String[rowCount][clmnCount];
            int count=0;
            for(int i=0; i<rowCount;i++){
                
                for(int j=0; j<clmnCount;j++){
                    
                    orderList[i][j]= draftList.get(count);
                    count++;
                    
                }
                // set array of a string into a dialogue model object
                dlgList.add(new DialogueMDL(orderList[i][0].toString(),orderList[i][1].toString(),orderList[i][2].toString(),
                                            orderList[i][3].toString(),orderList[i][4].toString(),orderList[i][5].toString(),
                                            orderList[i][6].toString(),orderList[i][7].toString(),orderList[i][8].toString()));
                
                
            }
        printDlgList(); //check the output in the system
        
        //set up list of dialogues on the page
        dlgListPage.generateJTable(rowCount, dlgList);
        dlgListPage.repaint();
        dlgListPage.revalidate();
        dlgListPage.setActList(this); // set action listeners once
        
        activateClick(true);//turn on mouse listener for making table clickable
    
        
    }
    
    /** by Aisana (w1775375)
     * Method to write down list of dialogues used for checking at the back end 
     */
    public void printDlgList(){
        System.out.println("Check dialogue list:");
        for(int count=0; count<rowCount;count++){
            System.out.print(dlgList.get(count).getDlg_name()+" | "+dlgList.get(count).getDlg_points());
                System.out.println();
        }
    }
    
     /** by Aisana (w1775375)
     * Method will connect to database and retrieve existing values and store them into comboboxes 
     * that will be used to trigger table filtering
     */
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
    
    
    /** by Rafael
     * 
     * @param dlgHist
     * @param dlgModel 
     */
    public void setDlgHist(DlgHistV dlgHist, DialogueMDL dlgModel) {
       dlgHistPage = dlgHist;
       dlgMdlClass = dlgModel;
       queryDlghPage();

    }
    
    
    
    /** by Aisana (w1775375) 
     * tracks actions with comboboxes and reset button 
     * @param e - when comboboxes value is set or reset button is pressed
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource().equals(dlgListPage.getChooseGramCbox())){
            filterTable("none");
        }else if(e.getSource().equals(dlgListPage.getChooseLvlCbox())){
            filterTable("none");
        }else if( e.getSource().equals(dlgListPage.getChooseTopicCbox())){
            filterTable("none");
        }else if( e.getSource().equals(dlgListPage.getresetBttn())){
            filterTable("reset");
            
        }else if((!(dlgSetUpPage==null)) && e.getSource().equals(dlgSetUpPage.getCloseBttn())){
            dlgSetUpPage.dispose();
            menuV.show();
            
        }else if((!(CardScrollPage==null)) && e.getSource().equals(CardScrollPage.getCloseBttn())){
            CardScrollPage.dispose();
            menuV.show();
        
        }
    }
    
    /** by Aisana (w1775375)
     * Method will check comboboxes selected options for setQuery() method 
     * and trigger filterDlgList() to filter data and display filtered table
     * @param str - used to check if user wants to filter or reset comboboxes, write string to be "reset" to reset comboboxes
     */
    public void filterTable(String str){
        System.out.println("Print lang:"+ currentLang);
        String checkG= (String) dlgListPage.getChooseGramCbox().getSelectedItem();
        String checkL= (String) dlgListPage.getChooseLvlCbox().getSelectedItem();
        String checkT= (String) dlgListPage.getChooseTopicCbox().getSelectedItem();
        if(str.equals("reset")){
            System.out.println("SETTING TO ORIGIN:");
            setToOrigin();
            filterDlgList(this.dlgListPage,this.dlgMdlClass,"SELECT * FROM Dialogue WHERE dialogue_language ='" + currentLang+ "'");
            
        }else{
            System.out.println("PROCEED TO FILTER");
            String query= setQuery(checkL, checkG, checkT);
            System.out.println("Query: "+ query);
            filterDlgList(this.dlgListPage,this.dlgMdlClass,query);
        }
            
    }
    
    /** by Aisana (w1775375)
     * Method will reset all comboboxes to default row at the page(useful for resting all combboboxes at once)
     */
    public void setToOrigin(){
        this.dlgListPage.getChooseGramCbox().setSelectedIndex(0);
        this.dlgListPage.getChooseLvlCbox().setSelectedIndex(0);
        this.dlgListPage.getChooseTopicCbox().setSelectedIndex(0);
    }
    
    
    /** by Aisana (w1775375)
     * return false if default option is set (means no meaningful option was chosen)
     * it will return true if anything apart from default option in row 0 has been selected 
     * @param box - use string inside of a combobox to check if combobox is set at default or not
     * @return 
     */
    public boolean isSelected(String box){
        if(box.equals("Choose Level") || box.equals("Choose Grammar") || box.equals("Choose Topic")){
            return false;
        }else{ //if user chose smth from the content list apart from default options
            return true;
        }
    }
    
    
    /** by Aisana (w1775375)
     * Method used to set up query for a filter based on 3 comboboxes selected values
     * @param l - string value from combobox to set language level to the query
     * @param g - string value from combobox to set grammar type to the query
     * @param t - string value from combobox to set topic name to the query
     * @return string that will contain full query based on 3 comboboxes values
     */
    public String setQuery(String l, String g, String t){
        
        boolean blvl= isSelected(l); 
        boolean bgram= isSelected(g);
        boolean btop= isSelected(t);
        
        if(blvl==false && bgram==false && btop==false){
            return "SELECT * FROM Dialogue WHERE dialogue_language ='" + currentLang+ "'";
        }
        
        if(blvl){ // l selected 
            if (bgram){// g selected
                if(btop){// t selected -> all three selected
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
                    if(btop){// l and t selected 
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                        " AND dialogue_lvl= '" + l+ "'"+
                        "  AND dialogue_topic= '"+ t +"'"; // return l and t
                    }else{ //only l
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                        " AND dialogue_lvl= '" + l+ "'"; // return just l
                    }
                } 
                
            } else { // l is not sellected //CHECK
                if (bgram){// g selected
                    if(btop){// g and t selected 
                        return "SELECT * FROM Dialogue "+ "WHERE dialogue_language ='" + currentLang+ "'"+
                                " AND dialogue_grammar= '" + g+ "'" + 
                                "  AND dialogue_topic= '"+ t +"'"; //return t and g
                    }else{ // t is not selected
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                                " AND dialogue_grammar= '" + g+ "'"; //return just g
                    }
                }
                
                if (btop){// t selected
                    if(bgram==false){// only t selected
                        return "SELECT * FROM Dialogue " + "WHERE dialogue_language ='" + currentLang+ "'"+
                                " AND dialogue_topic= '"+ t +"'"; // return just t
                    }
                }
                    
            } 
        return null;
    }  
     
    
    
    
    
    /** by Aisana (w1775375)
     * Method will store a draft list of dialogues based on query given and display table with filtered dialogue list
     * @param dlgView - user to reference the same page view that was previously created
     * @param dlgModel - user to reference the same dialogue model class that was originally created
     * @param query - a string with specified query, needed to sort database table and return requiered dialogues
     */
    public void filterDlgList(DlgListV dlgView, DialogueMDL dlgModel, String query) {
        filteredList.clear();
        draftList.clear();
        draftList = DialogueMDL.queryData(query);
        
        int clmnC= 9;
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
        
        printDlgList(); // check filtering is correct
        dlgListPage.generateJTable(rowC, filteredList);
        dlgListPage.repaint();
        dlgListPage.revalidate();
    
        
    }
    
    
    
    /** 
     * Suggested by Aisana for Rafael(as addition to menubar)
     * Use this method to set up dialogue history list and display it into table
     * note that menuBar controller will refer to this method to initialise dialogue hist list view
     * Aisana created (as author of menubar), for any issues address her
     * @param histList
     * @param Model 
     */
    /*public void setDlgHist(DlgHistV histList, DialogueMDL Model){
        
    }*/
    
   
    /** by Rafael
     * 
     */
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
    
   
 
}