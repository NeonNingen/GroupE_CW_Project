/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewpagesV4;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mones
 */
public class progV extends javax.swing.JFrame {

    /**
     * Creates new form progV
     */
    public progV() {
        initComponents();
        setSize(414,667);
        MenuBarView menu = new MenuBarView();
        this.setContentPane(menu.getContentPane());
        menu.setPageTitle("Progress View");
        menu.setPageTopicContent(ProgViewContent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgViewContent = new javax.swing.JPanel();
        nameP = new javax.swing.JLabel();
        userIdP = new javax.swing.JLabel();
        groupIdP = new javax.swing.JLabel();
        emailP = new javax.swing.JLabel();
        userTypeP = new javax.swing.JLabel();
        currentLvlP = new javax.swing.JLabel();
        nextLvlP = new javax.swing.JLabel();
        dlgHistBtn = new javax.swing.JButton();
        DataGraph = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(414, 667));

        ProgViewContent.setBackground(new java.awt.Color(255, 255, 255));
        ProgViewContent.setPreferredSize(new java.awt.Dimension(414, 515));

        nameP.setText("name");

        userIdP.setText("userId");

        groupIdP.setText("groupId");

        emailP.setText("email");

        userTypeP.setText("user Type");

        currentLvlP.setText("Current Level: B1");

        nextLvlP.setText("Next Level: B2");

        dlgHistBtn.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        dlgHistBtn.setText("View Dialogue History");

        DataGraph.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout DataGraphLayout = new javax.swing.GroupLayout(DataGraph);
        DataGraph.setLayout(DataGraphLayout);
        DataGraphLayout.setHorizontalGroup(
            DataGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        DataGraphLayout.setVerticalGroup(
            DataGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ProgViewContentLayout = new javax.swing.GroupLayout(ProgViewContent);
        ProgViewContent.setLayout(ProgViewContentLayout);
        ProgViewContentLayout.setHorizontalGroup(
            ProgViewContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProgViewContentLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(DataGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(ProgViewContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(ProgViewContentLayout.createSequentialGroup()
                .addGroup(ProgViewContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProgViewContentLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(ProgViewContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextLvlP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentLvlP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ProgViewContentLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(dlgHistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProgViewContentLayout.setVerticalGroup(
            ProgViewContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgViewContentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ProgViewContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProgViewContentLayout.createSequentialGroup()
                        .addComponent(nameP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userIdP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(groupIdP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userTypeP))
                    .addComponent(DataGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(currentLvlP)
                .addGap(18, 18, 18)
                .addComponent(nextLvlP)
                .addGap(61, 61, 61)
                .addComponent(dlgHistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProgViewContent, 394, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgViewContent, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getDlgHistBtn() {
        return dlgHistBtn;
    }

    public JPanel getDataGraph() {
        return DataGraph;
    }

    public JLabel getCurrentLvlP() {
        return currentLvlP;
    }

    public JLabel getEmailP() {
        return emailP;
    }

    public JLabel getGroupIdP() {
        return groupIdP;
    }

    public JLabel getNameP() {
        return nameP;
    }

    public JLabel getNextLvlP() {
        return nextLvlP;
    }

    public JLabel getUserIdP() {
        return userIdP;
    }

    public JLabel getUserTypeP() {
        return userTypeP;
    }
    

    public void setDlgHistBtn(JButton dlgHistBtn) {
        this.dlgHistBtn = dlgHistBtn;
    }

    public void setDataGraph(JPanel DataGraph) {
        this.DataGraph = DataGraph;
    }

    public void setCurrentLvlP(JLabel currentLvlP) {
        this.currentLvlP = currentLvlP;
    }

    public void setEmailP(JLabel emailP) {
        this.emailP = emailP;
    }

    public void setGroupIdP(JLabel groupIdP) {
        this.groupIdP = groupIdP;
    }

    public void setNameP(JLabel nameP) {
        this.nameP = nameP;
    }

    public void setNextLvlP(JLabel nextLvlP) {
        this.nextLvlP = nextLvlP;
    }

    public void setUserIdP(JLabel userIdP) {
        this.userIdP = userIdP;
    }

    public void setUserTypeP(JLabel userTypeP) {
        this.userTypeP = userTypeP;
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
            java.util.logging.Logger.getLogger(progV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(progV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(progV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(progV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new progV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataGraph;
    private javax.swing.JPanel ProgViewContent;
    private javax.swing.JLabel currentLvlP;
    private javax.swing.JButton dlgHistBtn;
    private javax.swing.JLabel emailP;
    private javax.swing.JLabel groupIdP;
    private javax.swing.JLabel nameP;
    private javax.swing.JLabel nextLvlP;
    private javax.swing.JLabel userIdP;
    private javax.swing.JLabel userTypeP;
    // End of variables declaration//GEN-END:variables
}
