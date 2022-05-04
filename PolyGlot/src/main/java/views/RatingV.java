/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DialogueCont;
import controllers.MenuBarCont;
import controllers.PerfmDlgCont;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


/**
 *
 * @author: Zain
 */
public class RatingV extends javax.swing.JFrame {
    
    private int id;
    private float time;
    
    /**
     * RatingV constructor 
     * Used to construct an instance of the class to be invoked
     * Designated to PermDlgCont to be instanced as a page in the application
     * Called by CardScrollV Action listener in PermDlgCont,
     * Once the next button has been pressed and no more cards are left
     * @param id: int - The dialogue_id from the dialogue table
     * @param time: float - Time in float values.
     */
    public RatingV(int id, float time) {
        this.id = id;
        initComponents();
        setSize(414,667);
        this.OkBttn.addActionListener(new PerfmDlgCont(this, time));
        setDesign();
    }
    

    /** by Aisana (w1775375)
     * Methods will initiate main panel colour (colour for app background page), set font to test and  icons for menubar buttons
     */
    public void setDesign(){
        
        OkBttn.setFont(new java.awt.Font("Avenir Next", 1, 20));
        colorBlueBttn(OkBttn, "OK");
    }
    
    
    /**Suggested by Aisana(w1775375)
     * will change button look to be blue with white font (important/close or cancel buttons) 
     * @param bttn - select button the design of which you want to change
     * @param bttnName - add text to be in that button
     */
    public void colorBlueBttn(JButton bttn, String bttnName){
        
        bttn.setBackground(new java.awt.Color(135, 170, 240));
        bttn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn.setForeground(new java.awt.Color(255, 255, 255));
        bttn.setText(bttnName);
        bttn.setContentAreaFilled(true);
        bttn.setBorderPainted(false);
        //bttn.setFocusPainted(false);
        //bttn.setIgnoreRepaint(true);
        //bttn.repaint();
        //bttn.revalidate();
        //bttn.setMinimumSize(new java.awt.Dimension(168, 46));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgRoleC = new javax.swing.ButtonGroup();
        StartDlgBttn = new javax.swing.JButton();
        RatingTitle = new javax.swing.JLabel();
        RatingSubtitle = new javax.swing.JLabel();
        RatingResultsText = new javax.swing.JLabel();
        RatingDlgName = new javax.swing.JLabel();
        RatingLevel = new javax.swing.JLabel();
        RatingYourRating = new javax.swing.JLabel();
        RatingTimeTaken = new javax.swing.JLabel();
        RatingPartnerRating = new javax.swing.JLabel();
        YourRatingC = new javax.swing.JTextField();
        PartnerRatingC = new javax.swing.JTextField();
        OkBttn = new javax.swing.JButton();
        CloseBttn = new javax.swing.JButton();
        DlgC = new javax.swing.JLabel();
        LvlC = new javax.swing.JLabel();
        TimeTakenC = new javax.swing.JLabel();
        OutOfTen1 = new javax.swing.JLabel();
        OutOfTen2 = new javax.swing.JLabel();

        StartDlgBttn.setText("Start");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        RatingTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RatingTitle.setText("Congratulation on Finishing! ");

        RatingSubtitle.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        RatingSubtitle.setText("See results below:");

        RatingResultsText.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        RatingResultsText.setText("Results:");

        RatingDlgName.setText("Dialogue Name:");

        RatingLevel.setText("Level:");

        RatingYourRating.setText("Your Rating:");

        RatingTimeTaken.setText("Time Taken:");

        RatingPartnerRating.setText("Partner Rating:");

        OkBttn.setText("OK");
        OkBttn.setBorderPainted(false);
        OkBttn.setContentAreaFilled(false);
        OkBttn.setFocusPainted(false);
        OkBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBttnActionPerformed(evt);
            }
        });

        CloseBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        CloseBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CloseIconBlack.png"))); // NOI18N
        CloseBttn.setBorderPainted(false);
        CloseBttn.setContentAreaFilled(false);
        CloseBttn.setFocusPainted(false);
        CloseBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        DlgC.setText("Dialogue");

        LvlC.setText("Level");

        TimeTakenC.setText("Time Taken");

        OutOfTen1.setText("/10");

        OutOfTen2.setText("/10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(RatingSubtitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RatingTitle)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(RatingResultsText))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RatingLevel)
                                    .addComponent(RatingDlgName)
                                    .addComponent(RatingYourRating)
                                    .addComponent(RatingTimeTaken)
                                    .addComponent(RatingPartnerRating))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DlgC)
                                    .addComponent(LvlC)
                                    .addComponent(TimeTakenC)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(PartnerRatingC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(YourRatingC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OutOfTen1)
                                            .addComponent(OutOfTen2)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(OkBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(RatingTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RatingSubtitle)
                .addGap(59, 59, 59)
                .addComponent(RatingResultsText)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingDlgName)
                    .addComponent(DlgC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingLevel)
                    .addComponent(LvlC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingTimeTaken)
                    .addComponent(TimeTakenC))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingYourRating)
                    .addComponent(YourRatingC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutOfTen1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingPartnerRating)
                    .addComponent(PartnerRatingC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutOfTen2))
                .addGap(71, 71, 71)
                .addComponent(OkBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OkBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkBttnActionPerformed

    /**
     * Setter and Getters for each JSwing Object and Integer object
     */
    
    public void setDlgC(JLabel DlgC) {
        this.DlgC = DlgC;
    }
    
    public void setLvlC(JLabel LvlC) {
        this.LvlC = LvlC;
    }
    
    public void setTimeTakenC(JLabel TimeTakenC) {
        this.TimeTakenC = TimeTakenC;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public JLabel getDlgC() {
        return DlgC;
    }
    
    public JLabel getLvlC() {
        return LvlC;
    }
    
    public JLabel getTimeTakenC() {
        return TimeTakenC;
    }
    
    public int getID() {
        return this.id;
    }
    
    public JButton getOkButton() {
        return OkBttn;
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
            java.util.logging.Logger.getLogger(RatingV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatingV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatingV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatingV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new RatingV(123, 30).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBttn;
    private javax.swing.JLabel DlgC;
    private javax.swing.JLabel LvlC;
    private javax.swing.JButton OkBttn;
    private javax.swing.JLabel OutOfTen1;
    private javax.swing.JLabel OutOfTen2;
    private javax.swing.JTextField PartnerRatingC;
    private javax.swing.JLabel RatingDlgName;
    private javax.swing.JLabel RatingLevel;
    private javax.swing.JLabel RatingPartnerRating;
    private javax.swing.JLabel RatingResultsText;
    private javax.swing.JLabel RatingSubtitle;
    private javax.swing.JLabel RatingTimeTaken;
    private javax.swing.JLabel RatingTitle;
    private javax.swing.JLabel RatingYourRating;
    private javax.swing.JButton StartDlgBttn;
    private javax.swing.JLabel TimeTakenC;
    private javax.swing.JTextField YourRatingC;
    private javax.swing.ButtonGroup dlgRoleC;
    // End of variables declaration//GEN-END:variables
}

