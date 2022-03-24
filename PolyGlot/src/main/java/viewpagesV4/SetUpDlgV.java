/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewpagesV4;


/**
 *
 * @author aisana: w1775375
 */
public class SetUpDlgV extends javax.swing.JFrame {

    /**
     * Creates new form MenuBar
     */
    public SetUpDlgV() {
        initComponents();
        setSize(414,667);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetUpPagePanel = new javax.swing.JPanel();
        SetUpDlgTitle = new javax.swing.JLabel();
        PartnerLbl = new javax.swing.JLabel();
        DlgNameLbl = new javax.swing.JLabel();
        PartnerTxtFld = new javax.swing.JTextField();
        RoleLbl = new javax.swing.JLabel();
        RoleARadBttn = new javax.swing.JRadioButton();
        RoleBRadBttn = new javax.swing.JRadioButton();
        StartDlgBttn = new javax.swing.JButton();
        DlgLevelLbl = new javax.swing.JLabel();
        DlgTopicLbl = new javax.swing.JLabel();
        DlgGramLbl = new javax.swing.JLabel();
        DlgGramLbl1 = new javax.swing.JLabel();
        DlgTopicLbl1 = new javax.swing.JLabel();
        DlgLvlLbl1 = new javax.swing.JLabel();
        DlgNameLbl1 = new javax.swing.JLabel();
        CloseBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        SetUpPagePanel.setBackground(new java.awt.Color(204, 204, 204));
        SetUpPagePanel.setPreferredSize(new java.awt.Dimension(414, 667));

        SetUpDlgTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        SetUpDlgTitle.setText("Set Up Dialogue");

        PartnerLbl.setText("Choose Partner:");

        DlgNameLbl.setText("Dialogue Name:");

        PartnerTxtFld.setText("jTextField1");

        RoleLbl.setText("Choose Role:");

        RoleARadBttn.setText("Role A");
        RoleARadBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleARadBttnActionPerformed(evt);
            }
        });

        RoleBRadBttn.setText("Role B");

        StartDlgBttn.setText("Start");

        DlgLevelLbl.setText("Level:");

        DlgTopicLbl.setText("Topic:");

        DlgGramLbl.setText("Grammar:");

        DlgGramLbl1.setText("Grammar");

        DlgTopicLbl1.setText("Topic");

        DlgLvlLbl1.setText("Level");

        DlgNameLbl1.setText("Dialogue Name");

        CloseBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        CloseBttn.setText("X");
        CloseBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        CloseBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SetUpPagePanelLayout = new javax.swing.GroupLayout(SetUpPagePanel);
        SetUpPagePanel.setLayout(SetUpPagePanelLayout);
        SetUpPagePanelLayout.setHorizontalGroup(
            SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(SetUpDlgTitle))
                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetUpPagePanelLayout.createSequentialGroup()
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                                .addComponent(RoleLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RoleARadBttn)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RoleBRadBttn))
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addComponent(PartnerLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(PartnerTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(DlgLevelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DlgNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(DlgNameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetUpPagePanelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DlgLvlLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(DlgTopicLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(DlgGramLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(DlgTopicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addComponent(DlgGramLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetUpPagePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        SetUpPagePanelLayout.setVerticalGroup(
            SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetUpDlgTitle)
                .addGap(60, 60, 60)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgNameLbl)
                    .addComponent(DlgNameLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgLevelLbl)
                    .addComponent(DlgLvlLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgTopicLbl)
                    .addComponent(DlgTopicLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgGramLbl)
                    .addComponent(DlgGramLbl1))
                .addGap(66, 66, 66)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartnerLbl)
                    .addComponent(PartnerTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleLbl)
                    .addComponent(RoleARadBttn)
                    .addComponent(RoleBRadBttn))
                .addGap(80, 80, 80)
                .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        PartnerTxtFld.getAccessibleContext().setAccessibleParent(PartnerLbl);
        RoleARadBttn.getAccessibleContext().setAccessibleParent(RoleLbl);
        RoleBRadBttn.getAccessibleContext().setAccessibleParent(RoleLbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetUpPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetUpPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoleARadBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleARadBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleARadBttnActionPerformed

    private void CloseBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseBttnActionPerformed

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
            java.util.logging.Logger.getLogger(SetUpDlgV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetUpDlgV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetUpDlgV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetUpDlgV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetUpDlgV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBttn;
    private javax.swing.JLabel DlgGramLbl;
    private javax.swing.JLabel DlgGramLbl1;
    private javax.swing.JLabel DlgLevelLbl;
    private javax.swing.JLabel DlgLvlLbl1;
    private javax.swing.JLabel DlgNameLbl;
    private javax.swing.JLabel DlgNameLbl1;
    private javax.swing.JLabel DlgTopicLbl;
    private javax.swing.JLabel DlgTopicLbl1;
    private javax.swing.JLabel PartnerLbl;
    private javax.swing.JTextField PartnerTxtFld;
    private javax.swing.JRadioButton RoleARadBttn;
    private javax.swing.JRadioButton RoleBRadBttn;
    private javax.swing.JLabel RoleLbl;
    private javax.swing.JLabel SetUpDlgTitle;
    private javax.swing.JPanel SetUpPagePanel;
    private javax.swing.JButton StartDlgBttn;
    // End of variables declaration//GEN-END:variables
}

