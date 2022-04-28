
package views;

import controllers.LoginRegisterCont;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterV extends javax.swing.JFrame {

    ArrayList<String> groupList = new ArrayList<String>();
   
    public RegisterV() {
        initComponents();
        addGroups();
        this.cancelBttn.addActionListener(new LoginRegisterCont(this));
        this.regBttn.addActionListener(new LoginRegisterCont(this));
        this.supportBttn.addActionListener(new LoginRegisterCont(this));
        //this.hiddenErr1.setVisible(false);
        setNotVisible(hiddenErr1);
        this.hiddenErr2.setVisible(false);
        this.hiddenErr3.setVisible(false);
        this.hiddenErr4.setVisible(false);
        this.hiddenErr5.setVisible(false);
        this.hiddenErr6.setVisible(false);
    }
    
    public void setNotVisible(JLabel lbl){
        lbl.setVisible(false);
    }
   
    //Adding the group ids manually (usually provided by Uni)
    public void addGroups(){
        this.groupList = new ArrayList<String>();
        groupList.add("5COSSpanish1");
        groupList.add("5COSSpanish2");
        groupList.add("5COSSpanish3");
        groupList.add("5COSFrench1");
        groupList.add("5COSFrench2");
        groupList.add("5COSFrench3");
        for (int i = 0; i < groupList.size(); i++) {
            groupIdSelect.addItem(groupList.get(i));
        }
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
        useridReg = new javax.swing.JTextField();
        hiddenErr1 = new javax.swing.JLabel();
        hiddenErr2 = new javax.swing.JLabel();
        hiddenErr3 = new javax.swing.JLabel();
        hiddenErr4 = new javax.swing.JLabel();
        hiddenErr5 = new javax.swing.JLabel();
        hiddenErr6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(414, 667));

        registerPanel.setBackground(new java.awt.Color(135, 178, 240));

        regTitle.setFont(new java.awt.Font("Dialog", 1, 29)); // NOI18N
        regTitle.setForeground(new java.awt.Color(255, 255, 255));
        regTitle.setText("Create User Account");

        supportBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SupIcon.png"))); // NOI18N
        supportBttn.setBorder(null);
        supportBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supportBttnActionPerformed(evt);
            }
        });
        supportBttn.setBackground(new java.awt.Color(135, 178, 240));

        nameReg.setBackground(new java.awt.Color(135, 178, 240));
        nameReg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameReg.setForeground(new java.awt.Color(255, 255, 255));
        nameReg.setText("Name");
        nameReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nameReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRegActionPerformed(evt);
            }
        });

        SurnameReg.setBackground(new java.awt.Color(135, 178, 240));
        SurnameReg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SurnameReg.setForeground(new java.awt.Color(255, 255, 255));
        SurnameReg.setText("Surname");
        SurnameReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        emailReg.setBackground(new java.awt.Color(135, 178, 240));
        emailReg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        emailReg.setForeground(new java.awt.Color(255, 255, 255));
        emailReg.setText("Email");
        emailReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        groupIdSelect.setForeground(new java.awt.Color(135, 178, 240));
        groupIdSelect.setMinimumSize(new java.awt.Dimension(64, 26));
        groupIdSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupIdSelectActionPerformed(evt);
            }
        });

        groupIdLblReg.setBackground(new java.awt.Color(135, 178, 240));
        groupIdLblReg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        groupIdLblReg.setForeground(new java.awt.Color(255, 255, 255));
        groupIdLblReg.setText("Group ID :");
        groupIdLblReg.setMinimumSize(new java.awt.Dimension(64, 26));

        pwdReg1.setBackground(new java.awt.Color(135, 178, 240));
        pwdReg1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pwdReg1.setForeground(new java.awt.Color(255, 255, 255));
        pwdReg1.setText("jPasswordField1");
        pwdReg1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        pwdReg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdReg1ActionPerformed(evt);
            }
        });

        pwdReg2.setBackground(new java.awt.Color(135, 178, 240));
        pwdReg2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pwdReg2.setForeground(new java.awt.Color(255, 255, 255));
        pwdReg2.setText("jPasswordField2");
        pwdReg2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        pwdReg1Lbl.setBackground(new java.awt.Color(135, 178, 240));
        pwdReg1Lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwdReg1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        pwdReg1Lbl.setText("Password");
        pwdReg1Lbl.setMinimumSize(new java.awt.Dimension(64, 26));

        pwdReg2Lbl.setBackground(new java.awt.Color(135, 178, 240));
        pwdReg2Lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pwdReg2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        pwdReg2Lbl.setText("Reapeat Password");
        pwdReg2Lbl.setMinimumSize(new java.awt.Dimension(64, 26));
        pwdReg2Lbl.setPreferredSize(new java.awt.Dimension(64, 26));

        termsCond.setBackground(new java.awt.Color(135, 178, 240));
        termsCond.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        termsCond.setForeground(new java.awt.Color(255, 255, 255));
        termsCond.setText("I agree with the terms and conditions *");

        regBttn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regBttn.setText("Register");
        regBttn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 152, 224), 1, true));
        regBttn.setMinimumSize(new java.awt.Dimension(168, 46));

        cancelBttn.setBackground(new java.awt.Color(238, 105, 94));
        cancelBttn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cancelBttn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBttn.setText("Cancel");
        cancelBttn.setMinimumSize(new java.awt.Dimension(168, 46));

        useridReg.setBackground(new java.awt.Color(135, 178, 240));
        useridReg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        useridReg.setForeground(new java.awt.Color(255, 255, 255));
        useridReg.setText("User ID");
        useridReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        useridReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridRegActionPerformed(evt);
            }
        });

        hiddenErr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ErrorIcon.png"))); // NOI18N

        hiddenErr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ErrorIcon.png"))); // NOI18N

        hiddenErr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ErrorIcon.png"))); // NOI18N

        hiddenErr4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ErrorIcon.png"))); // NOI18N

        hiddenErr5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ErrorIcon.png"))); // NOI18N

        hiddenErr6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ErrorIcon.png"))); // NOI18N

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addComponent(supportBttn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(termsCond, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(regTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwdReg2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwdReg1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(groupIdLblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(groupIdSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pwdReg1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pwdReg2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hiddenErr5)
                                            .addComponent(hiddenErr6)))))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(nameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hiddenErr1))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(SurnameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hiddenErr2))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(useridReg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(emailReg, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hiddenErr3)
                                    .addComponent(hiddenErr4))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supportBttn)
                .addGap(3, 3, 3)
                .addComponent(regTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hiddenErr1))
                                        .addGap(25, 25, 25)
                                        .addComponent(SurnameReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hiddenErr2))
                                .addGap(18, 18, 18)
                                .addComponent(emailReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hiddenErr3))
                        .addGap(18, 18, 18)
                        .addComponent(useridReg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hiddenErr4))
                .addGap(26, 26, 26)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupIdSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupIdLblReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pwdReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pwdReg1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hiddenErr5))
                        .addGap(18, 18, 18)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdReg2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(hiddenErr6))
                .addGap(18, 18, 18)
                .addComponent(termsCond)
                .addGap(18, 18, 18)
                .addComponent(regBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        hiddenErr1.setBackground(new java.awt.Color(135, 178, 240));
        hiddenErr1.setBackground(new java.awt.Color(135, 178, 240));
        hiddenErr1.setBackground(new java.awt.Color(135, 178, 240));
        hiddenErr1.setBackground(new java.awt.Color(135, 178, 240));
        hiddenErr1.setBackground(new java.awt.Color(135, 178, 240));
        hiddenErr1.setBackground(new java.awt.Color(135, 178, 240));

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

    private void useridRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridRegActionPerformed

    private void supportBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supportBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supportBttnActionPerformed

    private void nameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameRegActionPerformed

    private void pwdReg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdReg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdReg1ActionPerformed

    private void groupIdSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupIdSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupIdSelectActionPerformed

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

    public JTextField getUseridReg() {
        return useridReg;
    }

    public void setUseridReg(JTextField useridReg) {
        this.useridReg = useridReg;
    }

    public JLabel getHiddenErr1() {
        return hiddenErr1;
    }

    public JLabel getHiddenErr2() {
        return hiddenErr2;
    }

    public JLabel getHiddenErr3() {
        return hiddenErr3;
    }

    public JLabel getHiddenErr4() {
        return hiddenErr4;
    }

    public JLabel getHiddenErr5() {
        return hiddenErr5;
    }

    public JLabel getHiddenErr6() {
        return hiddenErr6;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SurnameReg;
    private javax.swing.JButton cancelBttn;
    private javax.swing.JTextField emailReg;
    private javax.swing.JLabel groupIdLblReg;
    private javax.swing.JComboBox<String> groupIdSelect;
    private javax.swing.JLabel hiddenErr1;
    private javax.swing.JLabel hiddenErr2;
    private javax.swing.JLabel hiddenErr3;
    private javax.swing.JLabel hiddenErr4;
    private javax.swing.JLabel hiddenErr5;
    private javax.swing.JLabel hiddenErr6;
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
    private javax.swing.JTextField useridReg;
    // End of variables declaration//GEN-END:variables
}
