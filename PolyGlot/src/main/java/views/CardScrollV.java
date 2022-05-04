/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import controllers.DialogueCont;
import controllers.PerfmDlgCont;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import models.DialogueMDL;
import models.UserMDL;


/**
 *
 * @author Zain
 * 
 */

public class CardScrollV extends javax.swing.JFrame {
    
    private String dialogueID;

    /**
     * CardScrollV constructor 
     * Used to construct an instance of the class to be invoked
     * Designated to PermDlgCont to be instanced as a page in the application
     * Called by SetUpDlg Action listener in PermDlgCont,
     * once the start button has been pressed.
     * @param id: int - The dialogue_id from the dialogue table
     * @param setUpDlgCont - Instance of SetUpDlgV
     * @param dlgCont - Instance of dialougeCont
     */
    public CardScrollV(SetUpDlgV setUpDlgCont, 
                       DialogueCont dlgCont, UserMDL user, String partnerID,
                       DialogueMDL dialogue) {
        this.dialogueID = dialogue.getDlg_id();
        initComponents();
        setSize(414,667);
        PerfmDlgCont cont = new PerfmDlgCont(this, setUpDlgCont, user, partnerID,
                                            dialogue);
        nextCardBttn.addActionListener(cont);
        prevCardBttn.addActionListener(cont);
        closeBttn.addActionListener(dlgCont);
        setDesign();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmWindow = new javax.swing.JDialog();
        confirmWindowPanel = new javax.swing.JPanel();
        results = new javax.swing.JLabel();
        dlgNameLbl = new javax.swing.JLabel();
        dlgNameLbl1 = new javax.swing.JLabel();
        dlgLvlLbl = new javax.swing.JLabel();
        dlgLvlLbl1 = new javax.swing.JLabel();
        dlgTimeLbl = new javax.swing.JLabel();
        dlgTimeLbl1 = new javax.swing.JLabel();
        dlgPartRateLbl = new javax.swing.JLabel();
        dlgYRateLbl = new javax.swing.JLabel();
        dlgYRateLbl1 = new javax.swing.JLabel();
        dlgPartRateLbl1 = new javax.swing.JLabel();
        confBttn = new javax.swing.JButton();
        closedBttn = new javax.swing.JButton();
        congratsLbl = new javax.swing.JLabel();
        rateWindow = new javax.swing.JDialog();
        rateWindowPanel = new javax.swing.JPanel();
        rateLbl = new javax.swing.JLabel();
        rateSlider = new javax.swing.JSlider();
        rateBttn = new javax.swing.JButton();
        cardScrollPagePanel = new javax.swing.JPanel();
        closeBttn = new javax.swing.JButton();
        dlgNameAsTitle = new javax.swing.JLabel();
        roleNameLbl = new javax.swing.JLabel();
        prevCardBttn = new javax.swing.JButton();
        nextCardBttn = new javax.swing.JButton();
        cardScrollPaneExtra = new javax.swing.JScrollPane();
        cardTxtDisplayTxtArea = new javax.swing.JTextArea();
        roleNameLbl1 = new javax.swing.JLabel();
        roleNameLbl2 = new javax.swing.JLabel();
        vocabC = new javax.swing.JLabel();

        confirmWindow.setResizable(false);
        confirmWindow.setSize(new java.awt.Dimension(400, 600));

        confirmWindowPanel.setBackground(new java.awt.Color(255, 255, 255));
        confirmWindowPanel.setPreferredSize(new java.awt.Dimension(400, 600));

        results.setText("Results");

        dlgNameLbl.setText("Dialogue Name:");

        dlgNameLbl1.setText("Order on Monday");

        dlgLvlLbl.setText("Level:");

        dlgLvlLbl1.setText("A1");

        dlgTimeLbl.setText("Time Taken");

        dlgTimeLbl1.setText("5 min");

        dlgPartRateLbl.setText("Partner Rating");

        dlgYRateLbl.setText("Your rating");

        dlgYRateLbl1.setText("10 points");

        dlgPartRateLbl1.setText("10 points");

        confBttn.setText("OK");

        closedBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CloseIconBlack.png"))); // NOI18N
        closedBttn.setBorderPainted(false);
        closedBttn.setContentAreaFilled(false);
        closedBttn.setFocusPainted(false);
        closedBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        congratsLbl.setText("Congratulation in finishing!");

        javax.swing.GroupLayout confirmWindowPanelLayout = new javax.swing.GroupLayout(confirmWindowPanel);
        confirmWindowPanel.setLayout(confirmWindowPanelLayout);
        confirmWindowPanelLayout.setHorizontalGroup(
            confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmWindowPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(confBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmWindowPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmWindowPanelLayout.createSequentialGroup()
                        .addComponent(results)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmWindowPanelLayout.createSequentialGroup()
                        .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(confirmWindowPanelLayout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(dlgYRateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(confirmWindowPanelLayout.createSequentialGroup()
                                    .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dlgPartRateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dlgYRateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addComponent(dlgPartRateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(confirmWindowPanelLayout.createSequentialGroup()
                                    .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dlgLvlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dlgNameLbl))
                                    .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(confirmWindowPanelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dlgNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmWindowPanelLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dlgLvlLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dlgTimeLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(dlgTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmWindowPanelLayout.createSequentialGroup()
                        .addComponent(congratsLbl)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmWindowPanelLayout.createSequentialGroup()
                        .addComponent(closedBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        confirmWindowPanelLayout.setVerticalGroup(
            confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmWindowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closedBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(congratsLbl)
                .addGap(29, 29, 29)
                .addComponent(results)
                .addGap(18, 18, 18)
                .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgNameLbl)
                    .addComponent(dlgNameLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgLvlLbl)
                    .addComponent(dlgLvlLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgTimeLbl)
                    .addComponent(dlgTimeLbl1))
                .addGap(67, 67, 67)
                .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgYRateLbl)
                    .addComponent(dlgYRateLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgPartRateLbl)
                    .addComponent(dlgPartRateLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(confBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout confirmWindowLayout = new javax.swing.GroupLayout(confirmWindow.getContentPane());
        confirmWindow.getContentPane().setLayout(confirmWindowLayout);
        confirmWindowLayout.setHorizontalGroup(
            confirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        confirmWindowLayout.setVerticalGroup(
            confirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rateWindow.setResizable(false);
        rateWindow.setSize(new java.awt.Dimension(400, 500));

        rateWindowPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        rateLbl.setText("Rate your partner");

        rateSlider.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        rateSlider.setMaximum(10);
        rateSlider.setValue(5);

        rateBttn.setText("Complete");

        javax.swing.GroupLayout rateWindowPanelLayout = new javax.swing.GroupLayout(rateWindowPanel);
        rateWindowPanel.setLayout(rateWindowPanelLayout);
        rateWindowPanelLayout.setHorizontalGroup(
            rateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rateWindowPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(rateLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rateWindowPanelLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(rateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rateWindowPanelLayout.createSequentialGroup()
                        .addComponent(rateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rateWindowPanelLayout.createSequentialGroup()
                        .addComponent(rateBttn)
                        .addGap(111, 111, 111))))
        );
        rateWindowPanelLayout.setVerticalGroup(
            rateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rateWindowPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(rateLbl)
                .addGap(52, 52, 52)
                .addComponent(rateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(rateBttn)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout rateWindowLayout = new javax.swing.GroupLayout(rateWindow.getContentPane());
        rateWindow.getContentPane().setLayout(rateWindowLayout);
        rateWindowLayout.setHorizontalGroup(
            rateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(rateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rateWindowLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rateWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        rateWindowLayout.setVerticalGroup(
            rateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(rateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rateWindowLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rateWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        cardScrollPagePanel.setBackground(new java.awt.Color(204, 204, 204));
        cardScrollPagePanel.setMinimumSize(new java.awt.Dimension(414, 550));
        cardScrollPagePanel.setPreferredSize(new java.awt.Dimension(414, 550));

        closeBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        closeBttn.setBorderPainted(false);
        closeBttn.setContentAreaFilled(false);
        closeBttn.setFocusPainted(false);
        closeBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        closeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBttnActionPerformed(evt);
            }
        });

        dlgNameAsTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        dlgNameAsTitle.setText("Dialogue Name");

        roleNameLbl.setText("Role name");
        roleNameLbl.setPreferredSize(new java.awt.Dimension(20, 16));

        prevCardBttn.setText("previous");
        prevCardBttn.setBorder(null);
        prevCardBttn.setBorderPainted(false);
        prevCardBttn.setContentAreaFilled(false);
        prevCardBttn.setPreferredSize(new java.awt.Dimension(110, 90));

        nextCardBttn.setText("next");
        nextCardBttn.setBorderPainted(false);
        nextCardBttn.setContentAreaFilled(false);
        nextCardBttn.setPreferredSize(new java.awt.Dimension(110, 90));

        cardScrollPaneExtra.setBackground(cardScrollPagePanel.getBackground());
        cardScrollPaneExtra.setBorder(null);
        cardScrollPaneExtra.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        cardScrollPaneExtra.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        cardTxtDisplayTxtArea.setEditable(false);
        cardTxtDisplayTxtArea.setColumns(20);
        cardTxtDisplayTxtArea.setLineWrap(true);
        cardTxtDisplayTxtArea.setRows(5);
        String cardText= "Even though internal processes are typically full of jargon, tables seem to be abbreviation-free zones. Everything is spelled out and explained at length. In data tables and application programming interfaces (APIs), this can cause code bloat. In far too many tables, every cell is a string value rather than an integer, or actual numeric value. For example, in a product table that shows size, storing and displaying length as 22.5 inches is simply wrong. You cannot easily convert values that are spelled out to other units of measurement, which makes it hard to manipulate such data to make diagrams or charts. Plus, such values take lots of room we don’t have on mobile.";
        cardTxtDisplayTxtArea.setText(cardText);
        cardTxtDisplayTxtArea.setWrapStyleWord(true);
        cardTxtDisplayTxtArea.setAutoscrolls(false);
        cardTxtDisplayTxtArea.setBorder(null);
        cardTxtDisplayTxtArea.setFocusable(false);
        cardTxtDisplayTxtArea.setRequestFocusEnabled(false);
        cardTxtDisplayTxtArea.setVerifyInputWhenFocusTarget(false);
        cardScrollPaneExtra.setViewportView(cardTxtDisplayTxtArea);

        roleNameLbl1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        roleNameLbl1.setForeground(new java.awt.Color(255, 255, 255));
        roleNameLbl1.setText("Role:");

        roleNameLbl2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        roleNameLbl2.setForeground(new java.awt.Color(255, 255, 255));
        roleNameLbl2.setText("Vocab:");

        vocabC.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        vocabC.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cardScrollPagePanelLayout = new javax.swing.GroupLayout(cardScrollPagePanel);
        cardScrollPagePanel.setLayout(cardScrollPagePanelLayout);
        cardScrollPagePanelLayout.setHorizontalGroup(
            cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(dlgNameAsTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roleNameLbl2)
                            .addComponent(prevCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                                .addGap(0, 31, Short.MAX_VALUE)
                                .addComponent(roleNameLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roleNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(nextCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                                .addComponent(vocabC)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardScrollPagePanelLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardScrollPagePanelLayout.createSequentialGroup()
                        .addComponent(cardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardScrollPagePanelLayout.createSequentialGroup()
                        .addComponent(closeBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        cardScrollPagePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nextCardBttn, prevCardBttn});

        cardScrollPagePanelLayout.setVerticalGroup(
            cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dlgNameAsTitle)
                .addGap(68, 68, 68)
                .addComponent(cardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleNameLbl2)
                    .addComponent(vocabC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextCardBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleNameLbl1)))
        );

        cardScrollPagePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nextCardBttn, prevCardBttn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardScrollPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardScrollPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeBttnActionPerformed
    
    public void setCardTxtDisplayTxtArea(JTextArea CardTxtDisplayTxtArea) {
        this.cardTxtDisplayTxtArea = CardTxtDisplayTxtArea;
    }
    
     /** by Aisana (w1775375)
     * Methods will initiate main panel colour (colour for app background page), set font to test and  icons for menubar buttons
     */
    public void setDesign(){
        Font small= new java.awt.Font("Avenir Next", 1, 14);
        Font title= new java.awt.Font("Avenir Next", 1, 20);
        cardScrollPagePanel.setBackground(new java.awt.Color(135, 170, 240));
        //cardTxtDisplayTxtArea.setBackground(new java.awt.Color(135, 170, 240));
        cardTxtDisplayTxtArea.setBackground(Color.white);
        cardTxtDisplayTxtArea.setFont(small);
        dlgNameAsTitle.setFont(title);
        dlgNameAsTitle.setForeground(Color.white);
        cardTxtDisplayTxtArea.setFont(small);
        roleNameLbl.setFont(small);
        roleNameLbl.setForeground(Color.white);
        Icon icon= createImageIcon("/ArrowIconL.png","arrow left icon");
        prevCardBttn.removeAll();
        prevCardBttn.setText("");
        prevCardBttn.setIcon(icon);
        icon= createImageIcon("/ArrowIconR.png","arrow right icon");
        nextCardBttn.removeAll();
        nextCardBttn.setText("");
        nextCardBttn.setIcon(icon);  
        
    }
    
    /**by Aisana (w1775375)
     * Method used to find and return image from resource file
     * @param path - string to pass image name
     * @param description - string used to describe the icon in case needed to be used, will be attached to the image
     * @return returns imageIcon you can use to setIcon for a button or label
     */
    public ImageIcon createImageIcon(String path,
                                           String description) {
        java.net.URL imgURL = MenuBarV.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    

    /**
     * Setter and Getters for each JSwing Object and Integer object
     */
    
    public void setCloseBttn(JButton CloseBttn) {
        this.closeBttn = CloseBttn;
    }

    public void setConfirmWindow(JDialog ConfirmWindow) {
        this.confirmWindow = ConfirmWindow;
    }

    public void setDlgLvlLbl1(JLabel DlgLvlLbl1) {
        this.dlgLvlLbl1 = DlgLvlLbl1;
    }

    public void setDlgNameAsTitle(JLabel DlgNameAsTitle) {
        this.dlgNameAsTitle = DlgNameAsTitle;
    }

    public void setDlgNameLbl1(JLabel DlgNameLbl1) {
        this.dlgNameLbl1 = DlgNameLbl1;
    }

    public void setDlgPartRateLbl1(JLabel DlgPartRateLbl1) {
        this.dlgPartRateLbl1 = DlgPartRateLbl1;
    }

    public void setDlgTimeLbl1(JLabel DlgTimeLbl1) {
        this.dlgTimeLbl1 = DlgTimeLbl1;
    }

    public void setDlgYRateLbl1(JLabel DlgYRateLbl1) {
        this.dlgYRateLbl1 = DlgYRateLbl1;
    }

    public void setNextCardBttn(JButton NextCardBttn) {
        this.nextCardBttn = NextCardBttn;
    }

    public void setConfBttn(JButton confBttn) {
        this.confBttn = confBttn;
    }

    public void setPrevCardBttn(JButton PrevCardBttn) {
        this.prevCardBttn = PrevCardBttn;
    }

    public void setRateWindow(JDialog RateWindow) {
        this.rateWindow = RateWindow;
    }

    public void setClosedBttn(JButton closedBttn) {
        this.closedBttn = closedBttn;
    }

    public void setRateBttn(JButton rateBttn) {
        this.rateBttn = rateBttn;
    }

    public void setRoleNameLbl(JLabel roleNameLbl) {
        this.roleNameLbl = roleNameLbl;
    }

    public JTextArea getCardTxtDisplayTxtArea() {
        return cardTxtDisplayTxtArea;
    }

    /**
     *
     * @return
     */
    public JButton getCloseBttn() {
        return closeBttn;
    }

    public JDialog getConfirmWindow() {
        return confirmWindow;
    }

    public JLabel getDlgLvlLbl1() {
        return dlgLvlLbl1;
    }

    public JLabel getDlgNameAsTitle() {
        return dlgNameAsTitle;
    }

    public JLabel getDlgNameLbl1() {
        return dlgNameLbl1;
    }

    public JLabel getDlgPartRateLbl1() {
        return dlgPartRateLbl1;
    }

    public JLabel getDlgYRateLbl1() {
        return dlgYRateLbl1;
    }

    public JButton getNextCardBttn() {
        return nextCardBttn;
    }

    public JButton getConfBttn() {
        return confBttn;
    }

    public JButton getPrevCardBttn() {
        return prevCardBttn;
    }

    public JDialog getRateWindow() {
        return rateWindow;
    }

    public JButton getClosedBttn() {
        return closedBttn;
    }

    public JButton getRateBttn() {
        return rateBttn;
    }

    public JLabel getRoleNameLbl() {
        return roleNameLbl;
    }
    
    public JLabel getVocabC() {
        return vocabC;
    }
    
    public String getID() {
        return this.dialogueID;
    }

    public void setID(String id) {
        this.dialogueID = id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardScrollPagePanel;
    private javax.swing.JScrollPane cardScrollPaneExtra;
    private javax.swing.JTextArea cardTxtDisplayTxtArea;
    private javax.swing.JButton closeBttn;
    private javax.swing.JButton closedBttn;
    private javax.swing.JButton confBttn;
    private javax.swing.JDialog confirmWindow;
    private javax.swing.JPanel confirmWindowPanel;
    private javax.swing.JLabel congratsLbl;
    private javax.swing.JLabel dlgLvlLbl;
    private javax.swing.JLabel dlgLvlLbl1;
    private javax.swing.JLabel dlgNameAsTitle;
    private javax.swing.JLabel dlgNameLbl;
    private javax.swing.JLabel dlgNameLbl1;
    private javax.swing.JLabel dlgPartRateLbl;
    private javax.swing.JLabel dlgPartRateLbl1;
    private javax.swing.JLabel dlgTimeLbl;
    private javax.swing.JLabel dlgTimeLbl1;
    private javax.swing.JLabel dlgYRateLbl;
    private javax.swing.JLabel dlgYRateLbl1;
    private javax.swing.JButton nextCardBttn;
    private javax.swing.JButton prevCardBttn;
    private javax.swing.JButton rateBttn;
    private javax.swing.JLabel rateLbl;
    private javax.swing.JSlider rateSlider;
    private javax.swing.JDialog rateWindow;
    private javax.swing.JPanel rateWindowPanel;
    private javax.swing.JLabel results;
    private javax.swing.JLabel roleNameLbl;
    private javax.swing.JLabel roleNameLbl1;
    private javax.swing.JLabel roleNameLbl2;
    private javax.swing.JLabel vocabC;
    // End of variables declaration//GEN-END:variables

}

