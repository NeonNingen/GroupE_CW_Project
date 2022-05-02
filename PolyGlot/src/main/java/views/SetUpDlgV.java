/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DialogueCont;
import controllers.MenuBarCont;
import controllers.PerfmDlgCont;
import javax.swing.*;


/**
 *
 * @author: Zain
 */
public class SetUpDlgV extends javax.swing.JFrame {

    private int id;
    
    /**
     * Creates new form MenuBar
     * @param id: int - Dialogue ID
     */
    
    public SetUpDlgV(int id, String lang) {
        this.id = id;
        initComponents();
        setSize(414,667);
        StartDlgBttn.addActionListener(new PerfmDlgCont(this));
        //CloseBttn.addActionListener(new PerfmDlgCont(this, lang));
        //CloseBttn.addActionListener(DlgCont); Not working
    }
    
    public SetUpDlgV() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgRoleC = new javax.swing.ButtonGroup();
        SetUpPagePanel = new javax.swing.JPanel();
        SetUpDlgTitle = new javax.swing.JLabel();
        PartnerLbl = new javax.swing.JLabel();
        DlgNameLbl = new javax.swing.JLabel();
        dlgPartnerC = new javax.swing.JTextField();
        RoleLbl = new javax.swing.JLabel();
        RoleARadBttn = new javax.swing.JRadioButton();
        RoleBRadBttn = new javax.swing.JRadioButton();
        StartDlgBttn = new javax.swing.JButton();
        DlgLevelLbl = new javax.swing.JLabel();
        DlgTopicLbl = new javax.swing.JLabel();
        DlgGramLbl = new javax.swing.JLabel();
        dlgGrmmarC = new javax.swing.JLabel();
        dlgTopicC = new javax.swing.JLabel();
        dlgLevelC = new javax.swing.JLabel();
        dlgNameC = new javax.swing.JLabel();
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

        RoleLbl.setText("Choose Role:");

        dlgRoleC.add(RoleARadBttn);
        RoleARadBttn.setText("Role A");

        dlgRoleC.add(RoleBRadBttn);
        RoleBRadBttn.setText("Role B");

        StartDlgBttn.setText("Start");

        DlgLevelLbl.setText("Level:");

        DlgTopicLbl.setText("Topic:");

        DlgGramLbl.setText("Grammar:");

        dlgGrmmarC.setText("Grammar");

        dlgTopicC.setText("Topic");

        dlgLevelC.setText("Level");

        dlgNameC.setText("Dialogue Name");

        CloseBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        CloseBttn.setText("X");
        CloseBttn.setPreferredSize(new java.awt.Dimension(25, 25));

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
                                        .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(DlgLevelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                .addComponent(DlgNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(DlgGramLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dlgGrmmarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dlgLevelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dlgNameC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dlgTopicC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DlgTopicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(PartnerLbl)
                                                    .addComponent(RoleLbl))
                                                .addGap(18, 18, 18)
                                                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(dlgPartnerC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                                        .addComponent(RoleARadBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(RoleBRadBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGap(12, 12, 12)))))
                        .addGap(0, 54, Short.MAX_VALUE))
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
                    .addComponent(dlgNameC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgLevelLbl)
                    .addComponent(dlgLevelC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgTopicLbl)
                    .addComponent(dlgTopicC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgGramLbl)
                    .addComponent(dlgGrmmarC))
                .addGap(66, 66, 66)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartnerLbl)
                    .addComponent(dlgPartnerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleLbl)
                    .addComponent(RoleARadBttn)
                    .addComponent(RoleBRadBttn))
                .addGap(80, 80, 80)
                .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        dlgPartnerC.getAccessibleContext().setAccessibleParent(PartnerLbl);
        RoleARadBttn.getAccessibleContext().setAccessibleParent(RoleLbl);
        RoleBRadBttn.getAccessibleContext().setAccessibleParent(RoleLbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SetUpPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetUpPagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getStartDlgBttn() {
        return StartDlgBttn;
    }

    public void setStartDlgBttn(JButton StartDlgBttn) {
        this.StartDlgBttn = StartDlgBttn;
    }

    public JLabel getDlgGrmmarC() {
        return dlgGrmmarC;
    }

    public void setDlgGrmmarC(JLabel dlgGrmmarC) {
        this.dlgGrmmarC = dlgGrmmarC;
    }

    public JLabel getDlgLevelC() {
        return dlgLevelC;
    }

    public void setDlgLevelC(JLabel dlgLevelC) {
        this.dlgLevelC = dlgLevelC;
    }

    public JLabel getDlgNameC() {
        return dlgNameC;
    }

    public void setDlgNameC(JLabel dlgNameC) {
        this.dlgNameC = dlgNameC;
    }

    public JTextField getDlgPartnerC() {
        return dlgPartnerC;
    }

    public void setDlgPartnerC(JTextField dlgPartnerC) {
        this.dlgPartnerC = dlgPartnerC;
    }

    public ButtonGroup getDlgRoleC() {
        return dlgRoleC;
    }

    public void setDlgRoleC(ButtonGroup dlgRoleC) {
        this.dlgRoleC = dlgRoleC;
    }

    public JLabel getDlgTopicC() {
        return dlgTopicC;
    }

    public void setDlgTopicC(JLabel dlgTopicC) {
        this.dlgTopicC = dlgTopicC;
    }

    public JButton getCloseBttn() {
        return CloseBttn;
    }

    public void setCloseBttn(JButton CloseBttn) {
        this.CloseBttn = CloseBttn;
    }
    
    public JRadioButton getRoleARadBttn() {
        return RoleARadBttn;
    }
    
    public void setRoleARadBttn(JRadioButton RoleARadBttn) {
        this.RoleARadBttn = RoleARadBttn;
    }
    
    public JRadioButton getRoleBRadBttn() {
        return RoleBRadBttn;
    }
    
    public void setRoleBRadBttn(JRadioButton RoleBRadBttn) {
        this.RoleBRadBttn = RoleBRadBttn;
    }
    
    public int getID() {
        return this.id;
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
                //DialogueCont dlgCont= new DialogueCont(); This causes an error
                new SetUpDlgV(123, "Spanish").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBttn;
    private javax.swing.JLabel DlgGramLbl;
    private javax.swing.JLabel DlgLevelLbl;
    private javax.swing.JLabel DlgNameLbl;
    private javax.swing.JLabel DlgTopicLbl;
    private javax.swing.JLabel PartnerLbl;
    private javax.swing.JRadioButton RoleARadBttn;
    private javax.swing.JRadioButton RoleBRadBttn;
    private javax.swing.JLabel RoleLbl;
    private javax.swing.JLabel SetUpDlgTitle;
    private javax.swing.JPanel SetUpPagePanel;
    private javax.swing.JButton StartDlgBttn;
    private javax.swing.JLabel dlgGrmmarC;
    private javax.swing.JLabel dlgLevelC;
    private javax.swing.JLabel dlgNameC;
    private javax.swing.JTextField dlgPartnerC;
    private javax.swing.ButtonGroup dlgRoleC;
    private javax.swing.JLabel dlgTopicC;
    // End of variables declaration//GEN-END:variables
}

