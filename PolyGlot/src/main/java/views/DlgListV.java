/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DialogueCont;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.DialogueMDL;
import java.awt.Color;


/**
 *
 * @author Aisana (w1775375)
 */
public class DlgListV extends javax.swing.JFrame {

    private TableRowSorter<DefaultTableModel> sorter;
    private DialogueMDL currentDlg;
    DefaultTableModel model = new DefaultTableModel(0,3) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
    
    public DlgListV() {
        initComponents();
        
        MenuBarV menu= new MenuBarV();
        this.setContentPane(menu.getContentPane()); // set menu bar pane inside this class pane
        
        
        menu.setPageTitle("Dialogue List");
        menu.setPageTopicContent(dlgListContent);
    }
    
    
    /**
     * Method will set up action listeners for menuBar button and comboboxes to be dialogue controller
     * used to catch actions from the frame components
     * @param dlgCont - reference to specific dialogue controller that was originally created in main part of the program
     */
    public void setActList(DialogueCont dlgCont){
        
        chooseGramCbox.addActionListener(dlgCont);
        chooseLvlCbox.addActionListener( dlgCont );
        chooseTopicCbox.addActionListener(dlgCont);
        resetBttn.addActionListener(dlgCont);
    }
    
    public DialogueMDL  getCurrentDlg(){
        return currentDlg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgListContent = new javax.swing.JPanel();
        chooseLvlCbox = new javax.swing.JComboBox<>();
        chooseTopicCbox = new javax.swing.JComboBox<>();
        chooseGramCbox = new javax.swing.JComboBox<>();
        jScrollDlgListTbl = new javax.swing.JScrollPane();
        jTableDlgList = new javax.swing.JTable();
        resetBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        dlgListContent.setBackground(new java.awt.Color(255, 255, 255));
        dlgListContent.setPreferredSize(new java.awt.Dimension(414, 480));

        chooseLvlCbox.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        chooseLvlCbox.setMinimumSize(new java.awt.Dimension(96, 20));
        chooseLvlCbox.setPreferredSize(new java.awt.Dimension(120, 20));

        chooseTopicCbox.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        chooseTopicCbox.setMinimumSize(new java.awt.Dimension(96, 20));
        chooseTopicCbox.setPreferredSize(new java.awt.Dimension(120, 20));

        chooseGramCbox.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        chooseGramCbox.setPreferredSize(new java.awt.Dimension(120, 20));

        jScrollDlgListTbl.setPreferredSize(new java.awt.Dimension(414, 470));

        jTableDlgList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableDlgList.setAlignmentX(0.0F);
        jTableDlgList.setAlignmentY(0.0F);
        jTableDlgList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableDlgList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableDlgList.setPreferredSize(new java.awt.Dimension(225, 1000));
        jTableDlgList.setSurrendersFocusOnKeystroke(true);
        jTableDlgList.getTableHeader().setReorderingAllowed(false);
        jTableDlgList.setUpdateSelectionOnSort(false);
        jScrollDlgListTbl.setViewportView(jTableDlgList);
        jTableDlgList.setForeground(new java.awt.Color(29, 91, 161));

        jTableDlgList.getTableHeader().setForeground(new Color(255, 255, 255));
        jTableDlgList.getTableHeader().setBackground(new Color(135, 178, 240));

        resetBttn.setText("Reset Table");
        resetBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgListContentLayout = new javax.swing.GroupLayout(dlgListContent);
        dlgListContent.setLayout(dlgListContentLayout);
        dlgListContentLayout.setHorizontalGroup(
            dlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgListContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dlgListContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(resetBttn))
                    .addGroup(dlgListContentLayout.createSequentialGroup()
                        .addComponent(chooseLvlCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseTopicCbox, 0, 138, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseGramCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(dlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgListContentLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollDlgListTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        dlgListContentLayout.setVerticalGroup(
            dlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgListContentLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(dlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseLvlCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseTopicCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseGramCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                .addComponent(resetBttn)
                .addContainerGap())
            .addGroup(dlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgListContentLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(jScrollDlgListTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dlgListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dlgListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetBttnActionPerformed

    
    public void setChooseGramCbox(JComboBox ChooseGramCbox) {
        this.chooseGramCbox=ChooseGramCbox;
    }
    

    public void setChooseLvlCbox(JComboBox ChooseLvlCbox) {
        this.chooseLvlCbox=ChooseLvlCbox;
    }

    public void setChooseTopicCbox(JComboBox ChooseTopicCbox) {
        this.chooseTopicCbox=ChooseTopicCbox;
    }

    public void setDlgListContent(JPanel DlgListContent) {
        this.dlgListContent = DlgListContent;
    }

    public void setjScrollDlgListTbl(JScrollPane jScrollDlgListTbl) {
        this.jScrollDlgListTbl = jScrollDlgListTbl;
    }

    public void setjTableDlgList(JTable jTableDlgList) {
        
        this.jTableDlgList= jTableDlgList;
    }

    public JComboBox<String> getChooseGramCbox() {
        
        return chooseGramCbox;
        
    }

    public JButton getresetBttn() {
        return resetBttn;
    }

    
    
    public JComboBox<String> getChooseLvlCbox() {
        return chooseLvlCbox;
    }

    public JComboBox<String> getChooseTopicCbox() {
        return chooseTopicCbox;
    }

    public JPanel getDlgListContent() {
        return dlgListContent;
    }

    public JScrollPane getjScrollDlgListTbl() {
        return jScrollDlgListTbl;
    }

    public JTable getjTableDlgList() {
        return jTableDlgList;
    }

    public TableRowSorter<DefaultTableModel> getSorter() {
        return sorter;
    }

    
    /**
     * method used to generate jtable for dialogue list page
     * @param rowCount - number of dialogues to be displayed as rows in the table 
     * @param dlgList - arrayList of dialogues used to arrange information based on columns headers
     */
    public void generateJTable(Integer rowCount, ArrayList<DialogueMDL> dlgList){
        String[] headers= {"Lvl","Dialogue Name","Topic"};
        String[][] empty= new String[rowCount][3];
        model.setColumnIdentifiers(headers);
        model.setRowCount(rowCount);
        jTableDlgList.setModel(model);
                
        
        int count=0;
        for(int i=0; i< rowCount;i++){
            jTableDlgList.getModel().setValueAt(dlgList.get(i).getDlg_level(), i, 0); //obj, row, column
            jTableDlgList.getModel().setValueAt(dlgList.get(i).getDlg_topic(), i, 1);
            jTableDlgList.getModel().setValueAt(dlgList.get(i).getDlg_name(), i, 2);
            count++;
            System.out.println("Created row " +i+": "+ dlgList.get(i).getDlg_level()+" | "+
                    dlgList.get(i).getDlg_topic()+" | "+
                    dlgList.get(i).getDlg_name());
            
        }
    }
    
    /**
     * Method used to set up values of the three comboboxes at the dialogue list page
     * @param grammar - array list with strings - options for grammar types (queried from database)
     * @param lvl - array list with strings - options for language level (queried from database)
     * @param topic - array list with strings - options for topic names (queried from database)
     */
    public void fillCmbx(ArrayList <String> grammar,ArrayList <String> lvl,ArrayList <String> topic){
        
        this.chooseGramCbox.removeAllItems();
        this.chooseGramCbox.addItem("Choose Grammar");
        
        for(int i=0; i<grammar.size();i++){
            this.chooseGramCbox.addItem(grammar.get(i));
        }
        
        
        
        this.chooseLvlCbox.removeAllItems();
        this.chooseLvlCbox.addItem("Choose Level");
        for(int i=0; i<lvl.size();i++){
            this.chooseLvlCbox.addItem(lvl.get(i));
        }
        
        
        
        this.chooseTopicCbox.removeAllItems();
        this.chooseTopicCbox.addItem("Choose Topic");
        
        for(int i=0; i<topic.size();i++){
            this.chooseTopicCbox.addItem(topic.get(i));
        }
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseGramCbox;
    private javax.swing.JComboBox<String> chooseLvlCbox;
    private javax.swing.JComboBox<String> chooseTopicCbox;
    private javax.swing.JPanel dlgListContent;
    private javax.swing.JScrollPane jScrollDlgListTbl;
    private javax.swing.JTable jTableDlgList;
    private javax.swing.JButton resetBttn;
    // End of variables declaration//GEN-END:variables
}


