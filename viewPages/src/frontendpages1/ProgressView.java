/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendpages1;

/**
 *
 * @author mones
 */
public class ProgressView extends javax.swing.JFrame {

    /**
     * Creates new form ProgressView
     */
    public ProgressView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progPanel = new javax.swing.JPanel();
        nameP = new javax.swing.JLabel();
        userIdP = new javax.swing.JLabel();
        groupIdP = new javax.swing.JLabel();
        emailP = new javax.swing.JLabel();
        userTypeP = new javax.swing.JLabel();
        currentLvlP = new javax.swing.JLabel();
        nextLvlP = new javax.swing.JLabel();
        dlgHistBtn = new javax.swing.JButton();
        DataGraph = new javax.swing.JPanel();
        progNavPanel = new javax.swing.JPanel();
        helpIcon = new javax.swing.JButton();
        progTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(414, 667));

        nameP.setText("name");

        userIdP.setText("userId");

        groupIdP.setText("groupId");

        emailP.setText("email");

        userTypeP.setText("user Type");

        currentLvlP.setText("Current Level: B1");

        nextLvlP.setText("Next Level: B2");

        dlgHistBtn.setText("View Dialogue History");
        dlgHistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgHistBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout progPanelLayout = new javax.swing.GroupLayout(progPanel);
        progPanel.setLayout(progPanelLayout);
        progPanelLayout.setHorizontalGroup(
            progPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(DataGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(progPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(progPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(progPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dlgHistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(progPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(currentLvlP, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(nextLvlP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        progPanelLayout.setVerticalGroup(
            progPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(progPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(progPanelLayout.createSequentialGroup()
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
                .addGap(68, 68, 68)
                .addComponent(dlgHistBtn)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        helpIcon.setText("Help");

        progTitle.setText("Progress Page");

        javax.swing.GroupLayout progNavPanelLayout = new javax.swing.GroupLayout(progNavPanel);
        progNavPanel.setLayout(progNavPanelLayout);
        progNavPanelLayout.setHorizontalGroup(
            progNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progNavPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(progTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helpIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        progNavPanelLayout.setVerticalGroup(
            progNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progNavPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(progNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(progNavPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(progTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addComponent(helpIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(progNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(progNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dlgHistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgHistBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlgHistBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProgressView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgressView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgressView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgressView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataGraph;
    private javax.swing.JLabel currentLvlP;
    private javax.swing.JButton dlgHistBtn;
    private javax.swing.JLabel emailP;
    private javax.swing.JLabel groupIdP;
    private javax.swing.JButton helpIcon;
    private javax.swing.JLabel nameP;
    private javax.swing.JLabel nextLvlP;
    private javax.swing.JPanel progNavPanel;
    private javax.swing.JPanel progPanel;
    private javax.swing.JLabel progTitle;
    private javax.swing.JLabel userIdP;
    private javax.swing.JLabel userTypeP;
    // End of variables declaration//GEN-END:variables
}
