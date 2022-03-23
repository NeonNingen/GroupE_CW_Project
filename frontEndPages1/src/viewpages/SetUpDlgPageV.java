/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewpages;

/**
 *
 * @author aisana: w1775375
 */
public class SetUpDlgPageV extends javax.swing.JFrame {

    /**
     * Creates new form MenuBar
     */
    public SetUpDlgPageV() {
        initComponents();
        setSize(414,667);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetUpPagePanel = new javax.swing.JPanel();
        CloseSUPDlgPageLblBttn = new javax.swing.JLabel();
        SetUpDlgPageTitle = new javax.swing.JLabel();
        choosePrtLbl = new javax.swing.JLabel();
        DlgNameLbl = new javax.swing.JLabel();
        PartnerTxtFld = new javax.swing.JTextField();
        chooseRoleLbl = new javax.swing.JLabel();
        RoleARadBtn = new javax.swing.JRadioButton();
        RoleBRadBtn = new javax.swing.JRadioButton();
        StartDlgBttn = new javax.swing.JButton();
        DlgLvlLbl = new javax.swing.JLabel();
        DlgTopicLbl = new javax.swing.JLabel();
        DlgGramLbl = new javax.swing.JLabel();
        DlgGramLbl1 = new javax.swing.JLabel();
        DlgTopicLbl1 = new javax.swing.JLabel();
        DlgLvlLbl1 = new javax.swing.JLabel();
        DlgNameLbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        SetUpPagePanel.setBackground(new java.awt.Color(204, 204, 204));
        SetUpPagePanel.setPreferredSize(new java.awt.Dimension(414, 667));

        CloseSUPDlgPageLblBttn.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        CloseSUPDlgPageLblBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseSUPDlgPageLblBttn.setText("X");
        CloseSUPDlgPageLblBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CloseSUPDlgPageLblBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        SetUpDlgPageTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        SetUpDlgPageTitle.setText("Set Up Dialogue");

        choosePrtLbl.setText("Choose Partner:");

        DlgNameLbl.setText("Dialogue Name:");

        PartnerTxtFld.setText("jTextField1");

        chooseRoleLbl.setText("Choose Role:");

        RoleARadBtn.setText("Role A");
        RoleARadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleARadBtnActionPerformed(evt);
            }
        });

        RoleBRadBtn.setText("Role B");

        StartDlgBttn.setText("Start");

        DlgLvlLbl.setText("Level:");

        DlgTopicLbl.setText("Topic:");

        DlgGramLbl.setText("Grammar:");

        DlgGramLbl1.setText("Grammar");

        DlgTopicLbl1.setText("Topic");

        DlgLvlLbl1.setText("Level");

        DlgNameLbl1.setText("Dialogue Name");

        javax.swing.GroupLayout SetUpPagePanelLayout = new javax.swing.GroupLayout(SetUpPagePanel);
        SetUpPagePanel.setLayout(SetUpPagePanelLayout);
        SetUpPagePanelLayout.setHorizontalGroup(
            SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetUpPagePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseSUPDlgPageLblBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(SetUpDlgPageTitle))
                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetUpPagePanelLayout.createSequentialGroup()
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                                .addComponent(chooseRoleLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RoleARadBtn)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RoleBRadBtn))
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addComponent(choosePrtLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(PartnerTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(DlgLvlLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SetUpPagePanelLayout.setVerticalGroup(
            SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseSUPDlgPageLblBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(SetUpDlgPageTitle)
                .addGap(60, 60, 60)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgNameLbl)
                    .addComponent(DlgNameLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgLvlLbl)
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
                    .addComponent(choosePrtLbl)
                    .addComponent(PartnerTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseRoleLbl)
                    .addComponent(RoleARadBtn)
                    .addComponent(RoleBRadBtn))
                .addGap(80, 80, 80)
                .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        PartnerTxtFld.getAccessibleContext().setAccessibleParent(choosePrtLbl);
        RoleARadBtn.getAccessibleContext().setAccessibleParent(chooseRoleLbl);
        RoleBRadBtn.getAccessibleContext().setAccessibleParent(chooseRoleLbl);

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

    private void RoleARadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleARadBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleARadBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SetUpDlgPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetUpDlgPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetUpDlgPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetUpDlgPageV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetUpDlgPageV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseSUPDlgPageLblBttn;
    private javax.swing.JLabel DlgGramLbl;
    private javax.swing.JLabel DlgGramLbl1;
    private javax.swing.JLabel DlgLvlLbl;
    private javax.swing.JLabel DlgLvlLbl1;
    private javax.swing.JLabel DlgNameLbl;
    private javax.swing.JLabel DlgNameLbl1;
    private javax.swing.JLabel DlgTopicLbl;
    private javax.swing.JLabel DlgTopicLbl1;
    private javax.swing.JTextField PartnerTxtFld;
    private javax.swing.JRadioButton RoleARadBtn;
    private javax.swing.JRadioButton RoleBRadBtn;
    private javax.swing.JLabel SetUpDlgPageTitle;
    private javax.swing.JPanel SetUpPagePanel;
    private javax.swing.JButton StartDlgBttn;
    private javax.swing.JLabel choosePrtLbl;
    private javax.swing.JLabel chooseRoleLbl;
    // End of variables declaration//GEN-END:variables
}

