/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author aisana
 */
public class DlgHistV extends javax.swing.JFrame {

    /**
     * Creates new form DlgHistV
     */
    public DlgHistV() {
        initComponents();
        
        MenuBarV menu= new MenuBarV();
        this.setContentPane(menu.getContentPane()); // set menu bar pane inside this class pane
        
        
        menu.setPageTitle("Dialogue List");
        menu.setPageTopicContent(dlgHistConent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgHistConent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dlgHistTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        dlgHistConent.setBackground(new java.awt.Color(255, 255, 255));
        dlgHistConent.setPreferredSize(new java.awt.Dimension(414, 480));

        dlgHistTable.setForeground(new java.awt.Color(51, 51, 51));
        dlgHistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Past Dialogues"
            }
        ));
        dlgHistTable.setRowMargin(3);
        dlgHistTable.setSelectionBackground(new java.awt.Color(162, 198, 253));
        dlgHistTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        dlgHistTable.getTableHeader().setResizingAllowed(false);
        dlgHistTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dlgHistTable);
        dlgHistTable.getTableHeader().setForeground(new Color(255, 255, 255));
        dlgHistTable.getTableHeader().setBackground(new Color(135, 178, 240));

        javax.swing.GroupLayout dlgHistConentLayout = new javax.swing.GroupLayout(dlgHistConent);
        dlgHistConent.setLayout(dlgHistConentLayout);
        dlgHistConentLayout.setHorizontalGroup(
            dlgHistConentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgHistConentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dlgHistConentLayout.setVerticalGroup(
            dlgHistConentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgHistConentLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(dlgHistConent, 391, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(dlgHistConent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getDlgHistConent() {
        return dlgHistConent;
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dlgHistConent;
    private javax.swing.JTable dlgHistTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JTable getDlgHistTable() {
        return dlgHistTable;
    }

    public void setDlgHistTable(JTable dlgHistTable) {
        this.dlgHistTable = dlgHistTable;
    }

    public void setDlgHistConent(JPanel dlgHistConent) {
        this.dlgHistConent = dlgHistConent;
    }

  
}
