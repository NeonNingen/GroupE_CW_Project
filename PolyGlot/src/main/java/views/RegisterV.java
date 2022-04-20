/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mones
 */
public class RegisterV extends javax.swing.JFrame {

    /**
     * Creates new form RegisterView
     */
    public RegisterV() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        regTitle = new javax.swing.JLabel();
        supportBttn = new javax.swing.JButton();
        nameReg = new javax.swing.JTextField();
        SurnameReg = new javax.swing.JTextField();
        emailReg = new javax.swing.JTextField();
        groupIdSelect = new javax.swing.JComboBox<>();
        groupIdLblReg = new javax.swing.JLabel();
        pwdReg1 = new javax.swing.JPasswordField();
        pwdReg2 = new javax.swing.JPasswordField();
        pwdReg1Lbl = new javax.swing.JLabel();
        pwdReg2Lbl = new javax.swing.JLabel();
        termsCond = new javax.swing.JCheckBox();
        regBttn = new javax.swing.JButton();
        cancelBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        regTitle.setText("Create new user account");

        supportBttn.setText("Help");

        nameReg.setText("Name");

        SurnameReg.setText("Surname");

        emailReg.setText("Email");

        groupIdSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        groupIdLblReg.setText("Group ID :");

        pwdReg1.setText("jPasswordField1");

        pwdReg2.setText("jPasswordField2");

        pwdReg1Lbl.setText("Password: ");

        pwdReg2Lbl.setText("Reapeat Password:");

        termsCond.setText("I agree with the terms and conditions *");

        regBttn.setText("Register");

        cancelBttn.setText("Cancel");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(supportBttn))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(regTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailReg)
                            .addComponent(SurnameReg)
                            .addComponent(nameReg)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(groupIdLblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwdReg1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pwdReg2Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(groupIdSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pwdReg1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(pwdReg2)))
                            .addComponent(termsCond, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(supportBttn)
                .addGap(29, 29, 29)
                .addComponent(regTitle)
                .addGap(54, 54, 54)
                .addComponent(nameReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SurnameReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(groupIdSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(groupIdLblReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(39, 39, 39)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwdReg1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwdReg1))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwdReg2Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwdReg2))
                .addGap(32, 32, 32)
                .addComponent(termsCond)
                .addGap(45, 45, 45)
                .addComponent(regBttn)
                .addGap(18, 18, 18)
                .addComponent(cancelBttn)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getSurnameReg() {
        return SurnameReg;
    }

    public void setSurnameReg(JTextField SurnameReg) {
        this.SurnameReg = SurnameReg;
    }

    public JButton getCancelBttn() {
        return cancelBttn;
    }

    public void setCancelBttn(JButton cancelBttn) {
        this.cancelBttn = cancelBttn;
    }

    public JTextField getEmailReg() {
        return emailReg;
    }

    public void setEmailReg(JTextField emailReg) {
        this.emailReg = emailReg;
    }

    public JComboBox<String> getGroupIdSelect() {
        return groupIdSelect;
    }

    public void setGroupIdSelect(JComboBox<String> groupIdSelect) {
        this.groupIdSelect = groupIdSelect;
    }

    public JTextField getNameReg() {
        return nameReg;
    }

    public void setNameReg(JTextField nameReg) {
        this.nameReg = nameReg;
    }

    public JPasswordField getPwdReg1() {
        return pwdReg1;
    }

    public void setPwdReg1(JPasswordField pwdReg1) {
        this.pwdReg1 = pwdReg1;
    }

    public JPasswordField getPwdReg2() {
        return pwdReg2;
    }

    public void setPwdReg2(JPasswordField pwdReg2) {
        this.pwdReg2 = pwdReg2;
    }

    public JButton getRegBttn() {
        return regBttn;
    }

    public void setRegBttn(JButton regBttn) {
        this.regBttn = regBttn;
    }

    public JButton getSupportBttn() {
        return supportBttn;
    }

    public void setSupportBttn(JButton supportBttn) {
        this.supportBttn = supportBttn;
    }

    public JCheckBox getTermsCond() {
        return termsCond;
    }

    public void setTermsCond(JCheckBox termsCond) {
        this.termsCond = termsCond;
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
            java.util.logging.Logger.getLogger(RegisterV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SurnameReg;
    private javax.swing.JButton cancelBttn;
    private javax.swing.JTextField emailReg;
    private javax.swing.JLabel groupIdLblReg;
    private javax.swing.JComboBox<String> groupIdSelect;
    private javax.swing.JTextField nameReg;
    private javax.swing.JPasswordField pwdReg1;
    private javax.swing.JLabel pwdReg1Lbl;
    private javax.swing.JPasswordField pwdReg2;
    private javax.swing.JLabel pwdReg2Lbl;
    private javax.swing.JButton regBttn;
    private javax.swing.JLabel regTitle;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton supportBttn;
    private javax.swing.JCheckBox termsCond;
    // End of variables declaration//GEN-END:variables
}
