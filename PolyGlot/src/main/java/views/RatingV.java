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
import models.UserMDL;


/**
 *
 * @author: Zain
 */
public class RatingV extends javax.swing.JFrame {
    
    private String id;
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
    public RatingV(String id, float time, UserMDL user, String partnerID) {
        this.id = id;
        initComponents();
        setSize(414,667);
        this.okBttn.addActionListener(new PerfmDlgCont(this, time, user, partnerID));
        setDesign();
    }
    

    /** by Aisana (w1775375)
     * Methods will initiate main panel colour (colour for app background page), set font to test and  icons for menubar buttons
     */
    public void setDesign(){
        
        okBttn.setFont(new java.awt.Font("Avenir Next", 1, 20));
        colorBlueBttn(okBttn, "OK");
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
        ratingTitle = new javax.swing.JLabel();
        ratingSubtitle = new javax.swing.JLabel();
        ratingResultsText = new javax.swing.JLabel();
        ratingDlgName = new javax.swing.JLabel();
        ratingLevel = new javax.swing.JLabel();
        ratingYourRating = new javax.swing.JLabel();
        ratingTimeTaken = new javax.swing.JLabel();
        ratingPartnerRating = new javax.swing.JLabel();
        okBttn = new javax.swing.JButton();
        dlgC = new javax.swing.JLabel();
        lvlC = new javax.swing.JLabel();
        timeTakenC = new javax.swing.JLabel();
        yourRatingBoxC = new javax.swing.JComboBox<>();
        partnerRatingBoxC = new javax.swing.JComboBox<>();

        StartDlgBttn.setText("Start");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        ratingTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ratingTitle.setText("Congratulation on Finishing! ");

        ratingSubtitle.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        ratingSubtitle.setText("See results below:");

        ratingResultsText.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        ratingResultsText.setText("Results:");

        ratingDlgName.setText("Dialogue Name:");

        ratingLevel.setText("Level:");

        ratingYourRating.setText("Your Rating:");

        ratingTimeTaken.setText("Time Taken:");

        ratingPartnerRating.setText("Partner Rating:");

        okBttn.setText("OK");
        okBttn.setBorderPainted(false);
        okBttn.setContentAreaFilled(false);
        okBttn.setFocusPainted(false);
        okBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBttnActionPerformed(evt);
            }
        });

        dlgC.setText("Dialogue");

        lvlC.setText("Level");

        timeTakenC.setText("Time Taken");

        yourRatingBoxC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        yourRatingBoxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourRatingBoxCActionPerformed(evt);
            }
        });

        partnerRatingBoxC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        partnerRatingBoxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partnerRatingBoxCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(ratingSubtitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ratingTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(ratingResultsText))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ratingLevel)
                            .addComponent(ratingDlgName)
                            .addComponent(ratingYourRating)
                            .addComponent(ratingTimeTaken)
                            .addComponent(ratingPartnerRating))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dlgC)
                            .addComponent(lvlC)
                            .addComponent(timeTakenC)
                            .addComponent(yourRatingBoxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partnerRatingBoxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(okBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ratingTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingSubtitle)
                .addGap(59, 59, 59)
                .addComponent(ratingResultsText)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingDlgName)
                    .addComponent(dlgC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingLevel)
                    .addComponent(lvlC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingTimeTaken)
                    .addComponent(timeTakenC))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratingYourRating)
                    .addComponent(yourRatingBoxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ratingPartnerRating)
                        .addGap(74, 74, 74)
                        .addComponent(okBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(partnerRatingBoxC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okBttnActionPerformed

    private void yourRatingBoxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourRatingBoxCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yourRatingBoxCActionPerformed

    private void partnerRatingBoxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partnerRatingBoxCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partnerRatingBoxCActionPerformed

    /**
     * Setter and Getters for each JSwing Object and Integer object
     */
    
    public void setDlgC(JLabel DlgC) {
        this.dlgC = DlgC;
    }
    
    public void setLvlC(JLabel LvlC) {
        this.lvlC = LvlC;
    }
    
    public void setTimeTakenC(JLabel TimeTakenC) {
        this.timeTakenC = TimeTakenC;
    }
    
    public void setID(String id) {
        this.id = id;
    }
    
    public JLabel getDlgC() {
        return dlgC;
    }
    
    public JLabel getLvlC() {
        return lvlC;
    }
    
    public JLabel getTimeTakenC() {
        return timeTakenC;
    }
    
    public String getID() {
        return this.id;
    }
    
    public JButton getOkButton() {
        return okBttn;
    }
    
    public void setOkButton(JButton setOkButton) {
        okBttn = setOkButton;
    }
    
    public JComboBox<String> getYourRatingBoxC() {
        return yourRatingBoxC;
    }
    
    public void setYourRatingBoxC(JComboBox<String> rating) {
        yourRatingBoxC = rating;
    }
    
    public JComboBox<String> getpartnerRatingBoxC() {
        return partnerRatingBoxC;
    }
    
    public void setpartnerRatingBoxC(JComboBox<String> rating) {
        partnerRatingBoxC = rating;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartDlgBttn;
    private javax.swing.JLabel dlgC;
    private javax.swing.ButtonGroup dlgRoleC;
    private javax.swing.JLabel lvlC;
    private javax.swing.JButton okBttn;
    private javax.swing.JComboBox<String> partnerRatingBoxC;
    private javax.swing.JLabel ratingDlgName;
    private javax.swing.JLabel ratingLevel;
    private javax.swing.JLabel ratingPartnerRating;
    private javax.swing.JLabel ratingResultsText;
    private javax.swing.JLabel ratingSubtitle;
    private javax.swing.JLabel ratingTimeTaken;
    private javax.swing.JLabel ratingTitle;
    private javax.swing.JLabel ratingYourRating;
    private javax.swing.JLabel timeTakenC;
    private javax.swing.JComboBox<String> yourRatingBoxC;
    // End of variables declaration//GEN-END:variables
}

