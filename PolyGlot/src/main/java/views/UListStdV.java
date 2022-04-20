/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author mones
 */
public class UListStdV extends javax.swing.JFrame {

    /**
     * Creates new form UListStdV
     */
    public UListStdV() {
        initComponents();
        setSize(414,667);
        MenuBarV menu = new MenuBarV();
        this.setContentPane(menu.getContentPane());
        menu.setPageTitle("User List");
        menu.setPageTopicContent(UListContent);
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
        GroupIdLbl = new javax.swing.JLabel();
        GroupTeach = new javax.swing.JLabel();
        GroupTeach1 = new javax.swing.JLabel();
        GroupIdLbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UListContent.setBackground(new java.awt.Color(255, 255, 255));
        UListContent.setPreferredSize(new java.awt.Dimension(414, 667));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

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
        jScrollPane1.setViewportView(TblofStd);

        GroupIdLbl.setText("GroupID:");

        GroupTeach.setText("Teacher:");

        GroupTeach1.setText("Mr Pumpkin");

        GroupIdLbl1.setText("group102");

        javax.swing.GroupLayout UListContentLayout = new javax.swing.GroupLayout(UListContent);
        UListContent.setLayout(UListContentLayout);
        UListContentLayout.setHorizontalGroup(
            UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UListContentLayout.createSequentialGroup()
                .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UListContentLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GroupTeach)
                            .addComponent(GroupIdLbl))
                        .addGap(31, 31, 31)
                        .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GroupTeach1)
                            .addComponent(GroupIdLbl1)))
                    .addGroup(UListContentLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        UListContentLayout.setVerticalGroup(
            UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UListContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(UListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UListContentLayout.createSequentialGroup()
                        .addComponent(GroupIdLbl)
                        .addGap(18, 18, 18)
                        .addComponent(GroupTeach))
                    .addGroup(UListContentLayout.createSequentialGroup()
                        .addComponent(GroupIdLbl1)
                        .addGap(18, 18, 18)
                        .addComponent(GroupTeach1)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UListContent, 409, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    public JLabel getGroupIdLbl1() {
        return GroupIdLbl1;
    }

    public JLabel getGroupTeach1() {
        return GroupTeach1;
    }

    public JTable getTblofStd() {
        return TblofStd;
    }

    public void setGroupIdLbl1(JLabel GroupIdLbl1) {
        this.GroupIdLbl1 = GroupIdLbl1;
    }

    public void setGroupTeach1(JLabel GroupTeach1) {
        this.GroupTeach1 = GroupTeach1;
    }

    public void setTblofStd(JTable TblofStd) {
        this.TblofStd = TblofStd;
    }
    
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
                new UListStdV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GroupIdLbl;
    private javax.swing.JLabel GroupIdLbl1;
    private javax.swing.JLabel GroupTeach;
    private javax.swing.JLabel GroupTeach1;
    private javax.swing.JTable TblofStd;
    private javax.swing.JPanel UListContent;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
    
}