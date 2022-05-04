/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DialogueCont;
import controllers.PerfmDlgCont;
import javax.swing.*;
import models.UserMDL;


/**
 *
 * @author: Zain & Aisana
 */
public class SetUpDlgV extends javax.swing.JFrame {

    private String dialogueID;
    
    /**
     * SetUpDlgV constructor 
     * Used to construct an instance of the class to be invoked
     * Designated to PermDlgCont and DialogueCont
     * Instanced by both as a page
     * @param dialogue_id: int - The dialogue_id from the dialogue table
     * @param dlgCont - Instance of dialougeCont
     * @param user - Instance of UserMDL
     */
    public SetUpDlgV(String dialogue_id, DialogueCont dlgCont, UserMDL user) {
        this.dialogueID = dialogue_id;
        initComponents();
        setSize(414,667);
        startDlgBttn.addActionListener(new PerfmDlgCont(this, dlgCont, user));
        closeBttn.addActionListener(dlgCont);
        closeBttn.addActionListener(dlgCont);
        setDesign();
        colorBlueBttn(startDlgBttn, "Begin");
    }
    
    public SetUpDlgV() {
        
    }

    /** by Aisana (w1775375)
     * Methods will initiate main panel colour (colour for app background page), set font to test and  icons for menubar buttons
     */
    public void setDesign(){
        setUpDlgTitle.setFont(new java.awt.Font("Avenir Next", 1, 20));
        
        setUpPagePanel.setBackground(new java.awt.Color(0, 0, 0,0));
        
        dlgGrmmarLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        dlgLevelLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        dlgNameLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        dlgTopicLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        dlgIdLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        partnerLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        
        //dlgGrmmarC.setBackground(new java.awt.Color(135, 170, 240));
        dlgGrmmarC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgLevelC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgNameC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgPartnerC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgTopicC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgIdC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        
        
        roleLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        roleARadBttn.setFont(new java.awt.Font("Avenir Next", 1, 12));
        roleBRadBttn.setFont(new java.awt.Font("Avenir Next", 1, 12));
        
       
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
        setUpPagePanel = new javax.swing.JPanel();
        setUpDlgTitle = new javax.swing.JLabel();
        partnerLbl = new javax.swing.JLabel();
        dlgNameLbl = new javax.swing.JLabel();
        dlgPartnerC = new javax.swing.JTextField();
        roleLbl = new javax.swing.JLabel();
        roleARadBttn = new javax.swing.JRadioButton();
        roleBRadBttn = new javax.swing.JRadioButton();
        startDlgBttn = new javax.swing.JButton();
        dlgLevelLbl = new javax.swing.JLabel();
        dlgTopicLbl = new javax.swing.JLabel();
        dlgGrmmarLbl = new javax.swing.JLabel();
        dlgGrmmarC = new javax.swing.JLabel();
        dlgTopicC = new javax.swing.JLabel();
        dlgLevelC = new javax.swing.JLabel();
        dlgNameC = new javax.swing.JLabel();
        closeBttn = new javax.swing.JButton();
        dlgIdLbl = new javax.swing.JLabel();
        dlgIdC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 700));
        setResizable(false);

        setUpPagePanel.setOpaque(false);
        setUpPagePanel.setPreferredSize(new java.awt.Dimension(450, 700));

        setUpDlgTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        setUpDlgTitle.setText("Set Up Dialogue");

        partnerLbl.setText("Choose Partner:");

        dlgNameLbl.setText("Dialogue Name:");

        roleLbl.setText("Choose Role:");

        dlgRoleC.add(roleARadBttn);
        roleARadBttn.setText("Role A");

        dlgRoleC.add(roleBRadBttn);
        roleBRadBttn.setText("Role B");

        startDlgBttn.setText("Start");
        startDlgBttn.setBorderPainted(false);
        startDlgBttn.setContentAreaFilled(false);

        dlgLevelLbl.setText("Level:");

        dlgTopicLbl.setText("Topic:");

        dlgGrmmarLbl.setText("Grammar:");

        dlgGrmmarC.setText("Grammar");

        dlgTopicC.setText("Topic");

        dlgLevelC.setText("Level");

        dlgNameC.setText("Dialogue Name");

        closeBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        closeBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeIconBlack.png"))); // NOI18N
        closeBttn.setBorder(null);
        closeBttn.setBorderPainted(false);
        closeBttn.setContentAreaFilled(false);
        closeBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        dlgIdLbl.setText("Your ID:");

        dlgIdC.setText("Your ID");

        javax.swing.GroupLayout setUpPagePanelLayout = new javax.swing.GroupLayout(setUpPagePanel);
        setUpPagePanel.setLayout(setUpPagePanelLayout);
        setUpPagePanelLayout.setHorizontalGroup(
            setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setUpPagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(setUpPagePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setUpPagePanelLayout.createSequentialGroup()
                        .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dlgLevelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dlgNameLbl))
                            .addComponent(dlgGrmmarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dlgIdLbl))
                        .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setUpPagePanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setUpPagePanelLayout.createSequentialGroup()
                                        .addComponent(dlgNameC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dlgLevelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(setUpPagePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setUpPagePanelLayout.createSequentialGroup()
                                        .addComponent(dlgIdC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dlgGrmmarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(setUpPagePanelLayout.createSequentialGroup()
                        .addComponent(dlgTopicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(dlgTopicC, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(setUpPagePanelLayout.createSequentialGroup()
                        .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partnerLbl)
                            .addComponent(roleLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dlgPartnerC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(setUpPagePanelLayout.createSequentialGroup()
                                .addComponent(roleARadBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roleBRadBttn)))
                        .addContainerGap())))
            .addGroup(setUpPagePanelLayout.createSequentialGroup()
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setUpPagePanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(setUpDlgTitle))
                    .addGroup(setUpPagePanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(startDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setUpPagePanelLayout.setVerticalGroup(
            setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setUpPagePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(closeBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setUpDlgTitle)
                .addGap(47, 47, 47)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgNameLbl)
                    .addComponent(dlgNameC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgLevelLbl)
                    .addComponent(dlgLevelC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgTopicLbl)
                    .addComponent(dlgTopicC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgGrmmarLbl)
                    .addComponent(dlgGrmmarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgIdLbl)
                    .addComponent(dlgIdC))
                .addGap(44, 44, 44)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partnerLbl)
                    .addComponent(dlgPartnerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(setUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLbl)
                    .addComponent(roleARadBttn)
                    .addComponent(roleBRadBttn))
                .addGap(108, 108, 108)
                .addComponent(startDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        dlgPartnerC.getAccessibleContext().setAccessibleParent(partnerLbl);
        roleARadBttn.getAccessibleContext().setAccessibleParent(roleLbl);
        roleBRadBttn.getAccessibleContext().setAccessibleParent(roleLbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setUpPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setUpPagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Setter and Getters for each JSwing Object and Integer object
     */
    
    public JButton getStartDlgBttn() {
        return startDlgBttn;
    }

    public void setStartDlgBttn(JButton StartDlgBttn) {
        this.startDlgBttn = StartDlgBttn;
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
        return closeBttn;
    }

    public void setCloseBttn(JButton CloseBttn) {
        this.closeBttn = CloseBttn;
    }
    
    public JRadioButton getRoleARadBttn() {
        return roleARadBttn;
    }
    
    public void setRoleARadBttn(JRadioButton RoleARadBttn) {
        this.roleARadBttn = RoleARadBttn;
    }
    
    public JRadioButton getRoleBRadBttn() {
        return roleBRadBttn;
    }
    
    public void setRoleBRadBttn(JRadioButton RoleBRadBttn) {
        this.roleBRadBttn = RoleBRadBttn;
    }
    
    public String getID() {
        return this.dialogueID;
    }
    
    public void setID(String id) {
        this.dialogueID = id;
    }
    
    public JLabel getDlgIdC() {
        return dlgIdC;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBttn;
    private javax.swing.JLabel dlgGrmmarC;
    private javax.swing.JLabel dlgGrmmarLbl;
    private javax.swing.JLabel dlgIdC;
    private javax.swing.JLabel dlgIdLbl;
    private javax.swing.JLabel dlgLevelC;
    private javax.swing.JLabel dlgLevelLbl;
    private javax.swing.JLabel dlgNameC;
    private javax.swing.JLabel dlgNameLbl;
    private javax.swing.JTextField dlgPartnerC;
    private javax.swing.ButtonGroup dlgRoleC;
    private javax.swing.JLabel dlgTopicC;
    private javax.swing.JLabel dlgTopicLbl;
    private javax.swing.JLabel partnerLbl;
    private javax.swing.JRadioButton roleARadBttn;
    private javax.swing.JRadioButton roleBRadBttn;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JLabel setUpDlgTitle;
    private javax.swing.JPanel setUpPagePanel;
    private javax.swing.JButton startDlgBttn;
    // End of variables declaration//GEN-END:variables

}

