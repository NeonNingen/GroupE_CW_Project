
package views;

import controllers.LoginRegisterCont;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginV extends javax.swing.JFrame {

    public LoginV() {
        initComponents();
        loginBttn.addActionListener(new LoginRegisterCont(this));
        registerBttn.addActionListener(new LoginRegisterCont(this));
        SupportBttn.addActionListener(new LoginRegisterCont(this));
        //loginBttnRedirect();
        setDesign();
    }
    public void setDesign(){
        //set background panel to blue
        loginPanel.setBackground(new java.awt.Color(135, 170, 240));
        appTitle.setFont(new java.awt.Font("Avenir Next", 1, 41));
        loginLbl.setFont(new java.awt.Font("Avenir Next", 1, 18));
        //loginBttn.setBackground(new java.awt.Color(135, 170, 240));
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        SupportBttn = new javax.swing.JButton();
        appTitle = new javax.swing.JLabel();
        loginLbl = new javax.swing.JLabel();
        uNameLogin = new javax.swing.JTextField();
        pwdLogin = new javax.swing.JPasswordField();
        loginBttn = new javax.swing.JButton();
        registerBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(135, 178, 240));
        loginPanel.setForeground(new java.awt.Color(255, 255, 255));
        loginPanel.setPreferredSize(new java.awt.Dimension(414, 667));

        SupportBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SupIcon.png"))); // NOI18N
        SupportBttn.setBorder(null);
        SupportBttn.setBackground(new java.awt.Color(135, 178, 240));
        SupportBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupportBttnActionPerformed(evt);
            }
        });

        appTitle.setFont(new java.awt.Font("Segoe UI", 1, 41)); // NOI18N
        appTitle.setForeground(new java.awt.Color(255, 255, 255));
        appTitle.setText("LangWise");

        loginLbl.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl.setText("Login");

        uNameLogin.setBackground(new java.awt.Color(135, 178, 240));
        uNameLogin.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        uNameLogin.setForeground(new java.awt.Color(255, 255, 255));
        uNameLogin.setText("Username");
        uNameLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        uNameLogin.setMinimumSize(new java.awt.Dimension(64, 26));
        uNameLogin.setPreferredSize(new java.awt.Dimension(64, 26));
        uNameLogin.setSelectionEnd(4);
        uNameLogin.setSelectionStart(4);

        pwdLogin.setBackground(new java.awt.Color(135, 178, 240));
        pwdLogin.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        pwdLogin.setForeground(new java.awt.Color(255, 255, 255));
        pwdLogin.setText("password");
        pwdLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        pwdLogin.setMinimumSize(new java.awt.Dimension(64, 26));
        pwdLogin.setPreferredSize(new java.awt.Dimension(64, 26));
        pwdLogin.setSelectionEnd(4);
        pwdLogin.setSelectionStart(4);

        loginBttn.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        loginBttn.setForeground(new java.awt.Color(93, 150, 234));
        loginBttn.setText("Sign In");
        loginBttn.setPreferredSize(new java.awt.Dimension(163, 51));

        registerBttn.setBackground(new java.awt.Color(135, 178, 240));
        registerBttn.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        registerBttn.setForeground(new java.awt.Color(255, 255, 255));
        registerBttn.setText("Register");
        registerBttn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        registerBttn.setOpaque(true);
        registerBttn.setPreferredSize(new java.awt.Dimension(71, 20));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SupportBttn))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(appTitle))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uNameLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(pwdLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(loginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(registerBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SupportBttn)
                .addGap(16, 16, 16)
                .addComponent(appTitle)
                .addGap(18, 18, 18)
                .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(uNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(loginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SupportBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupportBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupportBttnActionPerformed

    public JButton getRegisterBttn() {
        return registerBttn;
    }

    public void setRegisterBttn(JButton registerBttn) {
        this.registerBttn = registerBttn;
    }
    
    public JButton getLoginBttn() {
        return loginBttn;
    }

    public void setLoginBttn(JButton loginBttn) {
        this.loginBttn = loginBttn;
    }

    public JButton getSupportBttn() {
        return SupportBttn;
    }

    public void setSupportBttn(JButton SupportBttn) {
        this.SupportBttn = SupportBttn;
    }

    public JPasswordField getPwdLogin() {
        return pwdLogin;
    }

    public void setPwdLogin(JPasswordField pwdLogin) {
        this.pwdLogin = pwdLogin;
    }

    public JTextField getuNameLogin() {
        return uNameLogin;
    }

    public void setuNameLogin(JTextField uNameLogin) {
        this.uNameLogin = uNameLogin;
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
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SupportBttn;
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton loginBttn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField pwdLogin;
    private javax.swing.JButton registerBttn;
    private javax.swing.JTextField uNameLogin;
    // End of variables declaration//GEN-END:variables
}
