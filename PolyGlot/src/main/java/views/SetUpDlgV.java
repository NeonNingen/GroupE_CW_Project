/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DialogueCont;
import controllers.PerfmDlgCont;
import javax.swing.*;
import models.DialogueMDL;
import models.UserMDL;


/**
 *
 * @author: Zain & Aisana
 */
public class SetUpDlgV extends javax.swing.JFrame {

    private String dial_id;
    
    /**
     * SetUpDlgV constructor 
     * Used to construct an instance of the class to be invoked
     * Designated to PermDlgCont and DialogueCont
     * Instanced by both as a page
     * @param dialogue_id: int - The dialogue_id from the dialogue table
     * @param dlgCont - Instance of dialougeCont
     * @param user - Instance of UserMDL
     */
    public SetUpDlgV(DialogueMDL dialogue, DialogueCont dlgCont, UserMDL user) {
        this.dial_id = dialogue.getDlg_id();
        initComponents();
        setSize(414,667);
        StartDlgBttn.addActionListener(new PerfmDlgCont(this, dlgCont, user, dialogue));
        CloseBttn.addActionListener(dlgCont);
        CloseBttn.addActionListener(dlgCont);
        setDesign();
        colorBlueBttn(StartDlgBttn, "Begin");
    }

    /** by Aisana (w1775375)
     * Methods will initiate main panel colour (colour for app background page), set font to test and  icons for menubar buttons
     */
    public void setDesign(){
        SetUpDlgTitle.setFont(new java.awt.Font("Avenir Next", 1, 20));
        
        SetUpPagePanel.setBackground(new java.awt.Color(0, 0, 0,0));
        
        DlgGramLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        DlgLevelLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        DlgNameLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        DlgTopicLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        DlgIdLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        PartnerLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        
        //dlgGrmmarC.setBackground(new java.awt.Color(135, 170, 240));
        dlgGrmmarC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgLevelC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgNameC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgPartnerC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgTopicC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        dlgIdC.setFont(new java.awt.Font("Avenir Next", 1, 12));
        
        
        RoleLbl.setFont(new java.awt.Font("Avenir Next", 1, 16));
        RoleARadBttn.setFont(new java.awt.Font("Avenir Next", 1, 12));
        RoleBRadBttn.setFont(new java.awt.Font("Avenir Next", 1, 12));
        
       
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
        DlgIdLbl = new javax.swing.JLabel();
        dlgIdC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 700));
        setResizable(false);

        SetUpPagePanel.setOpaque(false);
        SetUpPagePanel.setPreferredSize(new java.awt.Dimension(450, 700));

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
        StartDlgBttn.setBorderPainted(false);
        StartDlgBttn.setContentAreaFilled(false);

        DlgLevelLbl.setText("Level:");

        DlgTopicLbl.setText("Topic:");

        DlgGramLbl.setText("Grammar:");

        dlgGrmmarC.setText("Grammar");

        dlgTopicC.setText("Topic");

        dlgLevelC.setText("Level");

        dlgNameC.setText("Dialogue Name");

        CloseBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        CloseBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeIconBlack.png"))); // NOI18N
        CloseBttn.setBorder(null);
        CloseBttn.setBorderPainted(false);
        CloseBttn.setContentAreaFilled(false);
        CloseBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        DlgIdLbl.setText("Your ID:");

        dlgIdC.setText("Your ID");

        javax.swing.GroupLayout SetUpPagePanelLayout = new javax.swing.GroupLayout(SetUpPagePanel);
        SetUpPagePanel.setLayout(SetUpPagePanelLayout);
        SetUpPagePanelLayout.setHorizontalGroup(
            SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetUpPagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DlgLevelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DlgNameLbl))
                            .addComponent(DlgGramLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DlgIdLbl))
                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addComponent(dlgNameC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dlgLevelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                        .addComponent(dlgIdC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dlgGrmmarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                        .addComponent(DlgTopicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(dlgTopicC, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PartnerLbl)
                            .addComponent(RoleLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dlgPartnerC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                                .addComponent(RoleARadBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RoleBRadBttn)))
                        .addContainerGap())))
            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(SetUpDlgTitle))
                    .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SetUpPagePanelLayout.setVerticalGroup(
            SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetUpPagePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetUpDlgTitle)
                .addGap(47, 47, 47)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgIdLbl)
                    .addComponent(dlgIdC))
                .addGap(44, 44, 44)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartnerLbl)
                    .addComponent(dlgPartnerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(SetUpPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleLbl)
                    .addComponent(RoleARadBttn)
                    .addComponent(RoleBRadBttn))
                .addGap(108, 108, 108)
                .addComponent(StartDlgBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
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
            .addComponent(SetUpPagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Setter and Getters for each JSwing Object and Integer object
     */
    
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
    
    public String getID() {
        return this.dial_id;
    }
    
    public void setID(String dial_id) {
        this.dial_id = dial_id;
    }
    
    public JLabel getDlgIdC() {
        return dlgIdC;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBttn;
    private javax.swing.JLabel DlgGramLbl;
    private javax.swing.JLabel DlgIdLbl;
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
    private javax.swing.JLabel dlgIdC;
    private javax.swing.JLabel dlgLevelC;
    private javax.swing.JLabel dlgNameC;
    private javax.swing.JTextField dlgPartnerC;
    private javax.swing.ButtonGroup dlgRoleC;
    private javax.swing.JLabel dlgTopicC;
    // End of variables declaration//GEN-END:variables

}

