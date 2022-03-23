/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewpages;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author aisana: w1775375
 */
public class CardScroll extends javax.swing.JFrame {

    /**
     * Creates new form MenuBar
     */
    public CardScroll() {
        initComponents();
        setSize(414,667);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CardScrollPagePanel = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        CompConformationWindow = new javax.swing.JPanel();
        Results = new javax.swing.JLabel();
        DlgNameLbl = new javax.swing.JLabel();
        DlgNameLbl1 = new javax.swing.JLabel();
        DlgLvlLbl = new javax.swing.JLabel();
        DlgLvlLbl1 = new javax.swing.JLabel();
        DlgTimeLbl = new javax.swing.JLabel();
        DlgTimeLbl1 = new javax.swing.JLabel();
        DlgPartRateLbl = new javax.swing.JLabel();
        DlgYRateLbl = new javax.swing.JLabel();
        DlgYRateLbl1 = new javax.swing.JLabel();
        DlgPartRateLbl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CloseWindLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CloseSUPDlgPageLblBttn = new javax.swing.JLabel();
        DlgNameAsTitle = new javax.swing.JLabel();
        roleNameLbl = new javax.swing.JLabel();
        PrevCardBttn = new javax.swing.JButton();
        NextCardBttn = new javax.swing.JButton();
        CardScrollPaneExtra = new javax.swing.JScrollPane();
        CardTxtDisplayTxtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        CardScrollPagePanel.setBackground(new java.awt.Color(204, 204, 204));
        CardScrollPagePanel.setPreferredSize(new java.awt.Dimension(414, 667));

        jInternalFrame1.setBorder(null);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setSize(400,600);

        jInternalFrame1.dispose();

        CompConformationWindow.setBackground(new java.awt.Color(232, 231, 231));
        CompConformationWindow.setPreferredSize(new java.awt.Dimension(400, 600));

        Results.setText("Results");

        DlgNameLbl.setText("Dialogue Name:");

        DlgNameLbl1.setText("Order on Monday");

        DlgLvlLbl.setText("Level:");

        DlgLvlLbl1.setText("A1");

        DlgTimeLbl.setText("Time Taken");

        DlgTimeLbl1.setText("5 min");

        DlgPartRateLbl.setText("Partner Rating");

        DlgYRateLbl.setText("Your rating");

        DlgYRateLbl1.setText("10 points");

        DlgPartRateLbl1.setText("10 points");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CloseWindLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        CloseWindLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseWindLbl.setText("X");

        jLabel1.setText("Congratulation in finishing!");

        javax.swing.GroupLayout CompConformationWindowLayout = new javax.swing.GroupLayout(CompConformationWindow);
        CompConformationWindow.setLayout(CompConformationWindowLayout);
        CompConformationWindowLayout.setHorizontalGroup(
            CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompConformationWindowLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompConformationWindowLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompConformationWindowLayout.createSequentialGroup()
                        .addComponent(Results)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompConformationWindowLayout.createSequentialGroup()
                        .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(CompConformationWindowLayout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(DlgYRateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CompConformationWindowLayout.createSequentialGroup()
                                    .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DlgPartRateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DlgYRateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addComponent(DlgPartRateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CompConformationWindowLayout.createSequentialGroup()
                                    .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DlgLvlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DlgNameLbl))
                                    .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(CompConformationWindowLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(DlgNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompConformationWindowLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DlgLvlLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(DlgTimeLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(DlgTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompConformationWindowLayout.createSequentialGroup()
                        .addComponent(CloseWindLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompConformationWindowLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112))))
        );
        CompConformationWindowLayout.setVerticalGroup(
            CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompConformationWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseWindLbl)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(Results)
                .addGap(18, 18, 18)
                .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgNameLbl)
                    .addComponent(DlgNameLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgLvlLbl)
                    .addComponent(DlgLvlLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgTimeLbl)
                    .addComponent(DlgTimeLbl1))
                .addGap(67, 67, 67)
                .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgYRateLbl)
                    .addComponent(DlgYRateLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CompConformationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgPartRateLbl)
                    .addComponent(DlgPartRateLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CompConformationWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CompConformationWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        CloseSUPDlgPageLblBttn.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        CloseSUPDlgPageLblBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseSUPDlgPageLblBttn.setText("X");
        CloseSUPDlgPageLblBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CloseSUPDlgPageLblBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        DlgNameAsTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        DlgNameAsTitle.setText("Dialogue Name");

        roleNameLbl.setText("Role name");

        PrevCardBttn.setText("previous");
        PrevCardBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevCardBttnActionPerformed(evt);
            }
        });

        NextCardBttn.setText("next");
        NextCardBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextCardBttnActionPerformed(evt);
            }
        });

        CardScrollPaneExtra.setBackground(CardScrollPagePanel.getBackground());
        CardScrollPaneExtra.setBorder(null);
        CardScrollPaneExtra.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CardScrollPaneExtra.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        CardTxtDisplayTxtArea.setBackground(CardScrollPagePanel.getBackground());
        CardTxtDisplayTxtArea.setColumns(20);
        CardTxtDisplayTxtArea.setLineWrap(true);
        CardTxtDisplayTxtArea.setRows(5);
        String cardText= "Even though internal processes are typically full of jargon, tables seem to be abbreviation-free zones. Everything is spelled out and explained at length. In data tables and application programming interfaces (APIs), this can cause code bloat. In far too many tables, every cell is a string value rather than an integer, or actual numeric value. For example, in a product table that shows size, storing and displaying length as 22.5 inches is simply wrong. You cannot easily convert values that are spelled out to other units of measurement, which makes it hard to manipulate such data to make diagrams or charts. Plus, such values take lots of room we don’t have on mobile.";
        CardTxtDisplayTxtArea.setText(cardText);
        CardTxtDisplayTxtArea.setWrapStyleWord(true);
        CardTxtDisplayTxtArea.setAutoscrolls(false);
        CardTxtDisplayTxtArea.setBorder(null);
        CardTxtDisplayTxtArea.setFocusable(false);
        CardTxtDisplayTxtArea.setRequestFocusEnabled(false);
        CardTxtDisplayTxtArea.setVerifyInputWhenFocusTarget(false);
        CardScrollPaneExtra.setViewportView(CardTxtDisplayTxtArea);

        javax.swing.GroupLayout CardScrollPagePanelLayout = new javax.swing.GroupLayout(CardScrollPagePanel);
        CardScrollPagePanel.setLayout(CardScrollPagePanelLayout);
        CardScrollPagePanelLayout.setHorizontalGroup(
            CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(DlgNameAsTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                .addGroup(CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PrevCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(roleNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(NextCardBttn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CloseSUPDlgPageLblBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createSequentialGroup()
                    .addContainerGap(87, Short.MAX_VALUE)
                    .addComponent(CardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        CardScrollPagePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NextCardBttn, PrevCardBttn});

        CardScrollPagePanelLayout.setVerticalGroup(
            CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseSUPDlgPageLblBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(DlgNameAsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
                .addGroup(CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrevCardBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NextCardBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roleNameLbl)))
                .addGap(17, 17, 17))
            .addGroup(CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createSequentialGroup()
                    .addContainerGap(158, Short.MAX_VALUE)
                    .addComponent(CardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );

        CardScrollPagePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NextCardBttn, PrevCardBttn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CardScrollPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CardScrollPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrevCardBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevCardBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrevCardBttnActionPerformed
    int count=0;
    private void NextCardBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextCardBttnActionPerformed
        // TODO add your handling code here:
        boolean done= false;
        
        /*JLabel dlgName= new JLabel("Dialogue name");
        JLabel dlgLvl= new JLabel("Dialogue level");
        JLabel dlgTime= new JLabel("Time taken\n\n");
        JLabel yourRate= new JLabel("Your rating");
        JLabel partRate= new JLabel("Partner rating");
        
        JTextArea txt= new JTextArea();
        txt.add(dlgName);
        txt.add(dlgLvl);
        txt.add(dlgTime);
        txt.add(yourRate);
        txt.add(partRate);
        */
        
        CardScrollPagePanel.add(jInternalFrame1);
        jInternalFrame1.setVisible(true);
        
        count++;
        
        if(count==3){
            done=true;
        }
        
        if(done){
            //JOptionPane.showMessageDialog(this, txt,"Congratulations", JOptionPane.OK_OPTION);
            CardScrollPagePanel.add(jInternalFrame1);
            
            jInternalFrame1.setVisible(true);
            count=0;
        }
        
        
    }//GEN-LAST:event_NextCardBttnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CardScroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardScroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardScroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardScroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardScroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardScrollPagePanel;
    private javax.swing.JScrollPane CardScrollPaneExtra;
    private javax.swing.JTextArea CardTxtDisplayTxtArea;
    private javax.swing.JLabel CloseSUPDlgPageLblBttn;
    private javax.swing.JLabel CloseWindLbl;
    private javax.swing.JPanel CompConformationWindow;
    private javax.swing.JLabel DlgLvlLbl;
    private javax.swing.JLabel DlgLvlLbl1;
    private javax.swing.JLabel DlgNameAsTitle;
    private javax.swing.JLabel DlgNameLbl;
    private javax.swing.JLabel DlgNameLbl1;
    private javax.swing.JLabel DlgPartRateLbl;
    private javax.swing.JLabel DlgPartRateLbl1;
    private javax.swing.JLabel DlgTimeLbl;
    private javax.swing.JLabel DlgTimeLbl1;
    private javax.swing.JLabel DlgYRateLbl;
    private javax.swing.JLabel DlgYRateLbl1;
    private javax.swing.JButton NextCardBttn;
    private javax.swing.JButton PrevCardBttn;
    private javax.swing.JLabel Results;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel roleNameLbl;
    // End of variables declaration//GEN-END:variables
}

