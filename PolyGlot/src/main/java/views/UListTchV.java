/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.UserCont;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.UserMDL;

/**
 *
 * @author mones
 */
public class UListTchV extends javax.swing.JFrame {

    /**
     * Creates new form UListTchV
     */
    public UListTchV() 
    {
        initComponents();
        fillTable();
        fillCombo();
        
        this.groupFilterCbox.addActionListener(new UserCont(this));
        this.SortCbox.addActionListener(new UserCont(this));
        this.ULvlFilterCbox.addActionListener(new UserCont(this));
        this.resetBttn.addActionListener(new UserCont(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UListContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblofStd = new javax.swing.JTable();
        orderByLbl = new javax.swing.JLabel();
        ULvlLbl = new javax.swing.JLabel();
        GroupSelectLbl = new javax.swing.JLabel();
        groupFilterCbox = new javax.swing.JComboBox<>();
        ULvlFilterCbox = new javax.swing.JComboBox<>();
        SortCbox = new javax.swing.JComboBox<>();
        resetBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        UListContent.setBackground(new java.awt.Color(255, 255, 255));
        UListContent.setMinimumSize(new java.awt.Dimension(414, 550));
        UListContent.setPreferredSize(new java.awt.Dimension(414, 550));

        TblofStd.setForeground(new java.awt.Color(29, 91, 161));
        TblofStd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Student Names"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblofStd.setPreferredSize(new java.awt.Dimension(225, 1000));
        TblofStd.setRowMargin(1);
        TblofStd.setSelectionBackground(new java.awt.Color(135, 178, 240));
        TblofStd.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TblofStd.setSurrendersFocusOnKeystroke(true);
        TblofStd.getTableHeader().setReorderingAllowed(false);
        TblofStd.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(TblofStd);
        TblofStd.getTableHeader().setForeground(new Color(255, 255, 255));
        TblofStd.getTableHeader().setBackground(new Color(135, 178, 240));

        orderByLbl.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        orderByLbl.setForeground(new java.awt.Color(121, 121, 121));
        orderByLbl.setText("Order by:");

        ULvlLbl.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ULvlLbl.setForeground(new java.awt.Color(121, 121, 121));
        ULvlLbl.setText("Choose user lvl");

        GroupSelectLbl.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        GroupSelectLbl.setForeground(new java.awt.Color(121, 121, 121));
        GroupSelectLbl.setText("Choose group");

        groupFilterCbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        groupFilterCbox.setForeground(new java.awt.Color(121, 121, 121));
        groupFilterCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select group" }));

        ULvlFilterCbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ULvlFilterCbox.setForeground(new java.awt.Color(121, 121, 121));
        ULvlFilterCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select level" }));

        SortCbox.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        SortCbox.setForeground(new java.awt.Color(121, 121, 121));
        SortCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select points", "points (lowest)", "points (highest)" }));

        resetBttn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        resetBttn.setForeground(new java.awt.Color(121, 121, 121));
        resetBttn.setText("Reset");

        javax.swing.GroupLayout UListContentLayout = new javax.swing.GroupLayout(UListContent);
        UListContent.setLayout(UListContentLayout);
        UListContentLayout.setHorizontalGroup(
            UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UListContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UListContentLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(UListContentLayout.createSequentialGroup()
                        .addComponent(orderByLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SortCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GroupSelectLbl)
                            .addComponent(ULvlLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ULvlFilterCbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(groupFilterCbox, 0, 107, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        UListContentLayout.setVerticalGroup(
            UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UListContentLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GroupSelectLbl)
                    .addComponent(orderByLbl)
                    .addComponent(groupFilterCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SortCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ULvlFilterCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ULvlLbl)
                    .addComponent(resetBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox<String> getSortCbox() {
        return SortCbox;
    }

    public JTable getTblofStd() {
        return TblofStd;
    }

    public JComboBox<String> getULvlFilterCbox() {
        return ULvlFilterCbox;
    }

    public JComboBox<String> getGroupFilterCbox() {
        return groupFilterCbox;
    }

    public void setSortCbox(JComboBox<String> SortCbox) {
        this.SortCbox = SortCbox;
    }

    public void setTblofStd(JTable TblofStd) {
        this.TblofStd = TblofStd;
    }

    public void setULvlFilterCbox(JComboBox<String> ULvlFilterCbox) {
        this.ULvlFilterCbox = ULvlFilterCbox;
    }

    public void setGroupFilterCbox(JComboBox<String> groupFilterCbox) {
        this.groupFilterCbox = groupFilterCbox;
    }

    public JPanel getUListContent() {
        return UListContent;
    }

    public JButton getResetBttn() {
        return resetBttn;
    }

    public void setResetBttn(JButton resetBttn) {
        this.resetBttn = resetBttn;
    }
    

    /**
     * by amit
     */
    public void fillTable()
    {
        UserMDL.getConnection();
        ArrayList<String> resultQuery = UserMDL.queryData("SELECT user_lang_lvl, user_id, user_name, user_group_id, user_progresspoints FROM User WHERE user_type = 'Student'");
       
        String[] columnNames = {"Lvl", "Student ID", "Student Name", "Group ID", "Points"};
        int row = resultQuery.size()/columnNames.length;
        String[][] data = new String[row][columnNames.length];
        
        int count = 0;
        for (int i = 0; i < data.length; i++) 
        {
            for (int j = 0; j < columnNames.length; j++) 
            {
                data[i][j] = resultQuery.get(count);
                count++;
            }
            
        }
        
        DefaultTableModel td = new DefaultTableModel(data, columnNames)
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                    
        };
        getTblofStd().setModel(td);
    }
    
    /**
     * by amit
     */
    public void fillCombo()
    {
        String query;
        
        //user group id
        query = "SELECT DISTINCT user_group_id FROM User WHERE user_type = 'Student'";
        UserMDL.getConnection();
        ArrayList<String> result = UserMDL.queryData(query);
        
        
        for (int i = 0; i < result.size(); i++) 
        {
            getGroupFilterCbox().addItem(result.get(i));
        }
        
        
        //user lang level
        query = "SELECT DISTINCT user_lang_lvl FROM User";
        result = UserMDL.queryData(query);
        
        for (int i = 0; i < result.size(); i++) 
        {
            getULvlFilterCbox().addItem(result.get(i));;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GroupSelectLbl;
    private javax.swing.JComboBox<String> SortCbox;
    private javax.swing.JTable TblofStd;
    private javax.swing.JPanel UListContent;
    private javax.swing.JComboBox<String> ULvlFilterCbox;
    private javax.swing.JLabel ULvlLbl;
    private javax.swing.JComboBox<String> groupFilterCbox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orderByLbl;
    private javax.swing.JButton resetBttn;
    // End of variables declaration//GEN-END:variables

   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UListStdV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UListStdV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UListStdV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UListStdV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UListTchV().setVisible(true);
            }
        });
    }
}
