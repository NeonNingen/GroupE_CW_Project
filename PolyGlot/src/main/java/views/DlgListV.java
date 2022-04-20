/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author aisana
 */
public class DlgListV extends javax.swing.JFrame {

    /**
     * Creates new form DlgListViewtrial
     */
    public DlgListV() {
        initComponents();
        
        MenuBarV menu= new MenuBarV();
        this.setContentPane(menu.getContentPane()); // set menu bar pane inside this class pane
        
        
        menu.setPageTitle("Dialogue List");
        menu.setPageTopicContent(DlgListContent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DlgListContent = new javax.swing.JPanel();
        ChooseLvlCbox = new javax.swing.JComboBox<>();
        ChooseTopicCbox = new javax.swing.JComboBox<>();
        ChooseGramCbox = new javax.swing.JComboBox<>();
        jScrollDlgListTbl = new javax.swing.JScrollPane();
        jTableDlgList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        DlgListContent.setBackground(new java.awt.Color(255, 255, 255));
        DlgListContent.setPreferredSize(new java.awt.Dimension(414, 480));

        ChooseLvlCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ChooseLvlCbox.setMinimumSize(new java.awt.Dimension(96, 20));
        ChooseLvlCbox.setPreferredSize(new java.awt.Dimension(120, 20));
        ChooseLvlCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseLvlCboxActionPerformed(evt);
            }
        });

        ChooseTopicCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ChooseTopicCbox.setMinimumSize(new java.awt.Dimension(96, 20));
        ChooseTopicCbox.setPreferredSize(new java.awt.Dimension(120, 20));
        ChooseTopicCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseTopicCboxActionPerformed(evt);
            }
        });

        ChooseGramCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ChooseGramCbox.setPreferredSize(new java.awt.Dimension(120, 20));
        ChooseGramCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseGramCboxActionPerformed(evt);
            }
        });

        jScrollDlgListTbl.setPreferredSize(new java.awt.Dimension(414, 470));

        jTableDlgList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A1", "Order Monday", "Topic"},
                {"A1", "France visit", "Travel"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Lvl", "Dlg Name", "Details"
            }
        ));
        jTableDlgList.setAlignmentX(0.0F);
        jTableDlgList.setAlignmentY(0.0F);
        jTableDlgList.setPreferredSize(new java.awt.Dimension(225, 1000));
        jTableDlgList.getTableHeader().setReorderingAllowed(false);
        jTableDlgList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDlgListMouseClicked(evt);
            }
        });
        jScrollDlgListTbl.setViewportView(jTableDlgList);

        javax.swing.GroupLayout DlgListContentLayout = new javax.swing.GroupLayout(DlgListContent);
        DlgListContent.setLayout(DlgListContentLayout);
        DlgListContentLayout.setHorizontalGroup(
            DlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgListContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DlgListContentLayout.createSequentialGroup()
                        .addComponent(ChooseLvlCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChooseTopicCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ChooseGramCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollDlgListTbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        DlgListContentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ChooseGramCbox, ChooseLvlCbox, ChooseTopicCbox});

        DlgListContentLayout.setVerticalGroup(
            DlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgListContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DlgListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseLvlCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseTopicCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseGramCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollDlgListTbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DlgListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DlgListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseLvlCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseLvlCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseLvlCboxActionPerformed

    private void ChooseTopicCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseTopicCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseTopicCboxActionPerformed

    private void ChooseGramCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseGramCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseGramCboxActionPerformed

    private void jTableDlgListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDlgListMouseClicked
        // TODO add your handling code here:

        int pressedSelesDlg = JOptionPane.showConfirmDialog(this, "Would you like to practice this dialogue?", "Choose",JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(this, "Would you like to practice this dialogue?");
    }//GEN-LAST:event_jTableDlgListMouseClicked

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
            java.util.logging.Logger.getLogger(DlgListV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgListV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgListV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgListV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgListV().setVisible(true);
            }
        });
    }

    public void setChooseGramCbox(JComboBox<String> ChooseGramCbox) {
        this.ChooseGramCbox = ChooseGramCbox;
    }

    public void setChooseLvlCbox(JComboBox<String> ChooseLvlCbox) {
        this.ChooseLvlCbox = ChooseLvlCbox;
    }

    public void setChooseTopicCbox(JComboBox<String> ChooseTopicCbox) {
        this.ChooseTopicCbox = ChooseTopicCbox;
    }

    public void setDlgListContent(JPanel DlgListContent) {
        this.DlgListContent = DlgListContent;
    }

    public void setjScrollDlgListTbl(JScrollPane jScrollDlgListTbl) {
        this.jScrollDlgListTbl = jScrollDlgListTbl;
    }

    public void setjTableDlgList(JTable jTableDlgList) {
        this.jTableDlgList = jTableDlgList;
    }

    public JComboBox<String> getChooseGramCbox() {
        return ChooseGramCbox;
    }

    public JComboBox<String> getChooseLvlCbox() {
        return ChooseLvlCbox;
    }

    public JComboBox<String> getChooseTopicCbox() {
        return ChooseTopicCbox;
    }

    public JPanel getDlgListContent() {
        return DlgListContent;
    }

    public JScrollPane getjScrollDlgListTbl() {
        return jScrollDlgListTbl;
    }

    public JTable getjTableDlgList() {
        return jTableDlgList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChooseGramCbox;
    private javax.swing.JComboBox<String> ChooseLvlCbox;
    private javax.swing.JComboBox<String> ChooseTopicCbox;
    private javax.swing.JPanel DlgListContent;
    private javax.swing.JScrollPane jScrollDlgListTbl;
    private javax.swing.JTable jTableDlgList;
    // End of variables declaration//GEN-END:variables
}
