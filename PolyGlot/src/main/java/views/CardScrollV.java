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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


/**
 *
 * @author Zain
 * 
 */

public class CardScrollV extends javax.swing.JFrame {
    
    private String id;

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
    public CardScrollV(String id, SetUpDlgV setUpDlgCont, DialogueCont dlgCont) {
        this.id = id;
        initComponents();
        setSize(414,667);
        PerfmDlgCont cont = new PerfmDlgCont(this, setUpDlgCont);
        NextCardBttn.addActionListener(cont);
        PrevCardBttn.addActionListener(cont);
        CloseBttn.addActionListener(dlgCont);
        setDesign();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfirmWindow = new javax.swing.JDialog();
        ConfirmWindowPanel = new javax.swing.JPanel();
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
        confBttn = new javax.swing.JButton();
        closedBttn = new javax.swing.JButton();
        Congrats = new javax.swing.JLabel();
        RateWindow = new javax.swing.JDialog();
        RateWindowPanel = new javax.swing.JPanel();
        rateLbl = new javax.swing.JLabel();
        RateSlider = new javax.swing.JSlider();
        rateBttn = new javax.swing.JButton();
        cardScrollPagePanel = new javax.swing.JPanel();
        CloseBttn = new javax.swing.JButton();
        DlgNameAsTitle = new javax.swing.JLabel();
        roleNameLbl = new javax.swing.JLabel();
        PrevCardBttn = new javax.swing.JButton();
        NextCardBttn = new javax.swing.JButton();
        cardScrollPaneExtra = new javax.swing.JScrollPane();
        cardTxtDisplayTxtArea = new javax.swing.JTextArea();
        roleNameLbl1 = new javax.swing.JLabel();

        ConfirmWindow.setResizable(false);
        ConfirmWindow.setSize(new java.awt.Dimension(400, 600));

        ConfirmWindowPanel.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmWindowPanel.setPreferredSize(new java.awt.Dimension(400, 600));

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

        confBttn.setText("OK");

        closedBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CloseIconBlack.png"))); // NOI18N
        closedBttn.setBorderPainted(false);
        closedBttn.setContentAreaFilled(false);
        closedBttn.setFocusPainted(false);
        closedBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        Congrats.setText("Congratulation in finishing!");

        javax.swing.GroupLayout ConfirmWindowPanelLayout = new javax.swing.GroupLayout(ConfirmWindowPanel);
        ConfirmWindowPanel.setLayout(ConfirmWindowPanelLayout);
        ConfirmWindowPanelLayout.setHorizontalGroup(
            ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(confBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmWindowPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmWindowPanelLayout.createSequentialGroup()
                        .addComponent(Results)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmWindowPanelLayout.createSequentialGroup()
                        .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(DlgYRateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                                    .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DlgPartRateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DlgYRateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addComponent(DlgPartRateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                                    .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DlgLvlLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DlgNameLbl))
                                    .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(DlgNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmWindowPanelLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DlgLvlLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(DlgTimeLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(DlgTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmWindowPanelLayout.createSequentialGroup()
                        .addComponent(Congrats)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmWindowPanelLayout.createSequentialGroup()
                        .addComponent(closedBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        ConfirmWindowPanelLayout.setVerticalGroup(
            ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closedBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Congrats)
                .addGap(29, 29, 29)
                .addComponent(Results)
                .addGap(18, 18, 18)
                .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgNameLbl)
                    .addComponent(DlgNameLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgLvlLbl)
                    .addComponent(DlgLvlLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgTimeLbl)
                    .addComponent(DlgTimeLbl1))
                .addGap(67, 67, 67)
                .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgYRateLbl)
                    .addComponent(DlgYRateLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DlgPartRateLbl)
                    .addComponent(DlgPartRateLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(confBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout ConfirmWindowLayout = new javax.swing.GroupLayout(ConfirmWindow.getContentPane());
        ConfirmWindow.getContentPane().setLayout(ConfirmWindowLayout);
        ConfirmWindowLayout.setHorizontalGroup(
            ConfirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ConfirmWindowLayout.setVerticalGroup(
            ConfirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RateWindow.setResizable(false);
        RateWindow.setSize(new java.awt.Dimension(400, 500));

        RateWindowPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        rateLbl.setText("Rate your partner");

        RateSlider.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        RateSlider.setMaximum(10);
        RateSlider.setValue(5);

        rateBttn.setText("Complete");

        javax.swing.GroupLayout RateWindowPanelLayout = new javax.swing.GroupLayout(RateWindowPanel);
        RateWindowPanel.setLayout(RateWindowPanelLayout);
        RateWindowPanelLayout.setHorizontalGroup(
            RateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RateWindowPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(rateLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RateWindowPanelLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(RateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RateWindowPanelLayout.createSequentialGroup()
                        .addComponent(RateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RateWindowPanelLayout.createSequentialGroup()
                        .addComponent(rateBttn)
                        .addGap(111, 111, 111))))
        );
        RateWindowPanelLayout.setVerticalGroup(
            RateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RateWindowPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(rateLbl)
                .addGap(52, 52, 52)
                .addComponent(RateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(rateBttn)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout RateWindowLayout = new javax.swing.GroupLayout(RateWindow.getContentPane());
        RateWindow.getContentPane().setLayout(RateWindowLayout);
        RateWindowLayout.setHorizontalGroup(
            RateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(RateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RateWindowLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RateWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        RateWindowLayout.setVerticalGroup(
            RateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(RateWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RateWindowLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RateWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        cardScrollPagePanel.setBackground(new java.awt.Color(204, 204, 204));
        cardScrollPagePanel.setMinimumSize(new java.awt.Dimension(414, 550));
        cardScrollPagePanel.setPreferredSize(new java.awt.Dimension(414, 550));

        CloseBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        CloseBttn.setBorderPainted(false);
        CloseBttn.setContentAreaFilled(false);
        CloseBttn.setFocusPainted(false);
        CloseBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        CloseBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBttnActionPerformed(evt);
            }
        });

        DlgNameAsTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        DlgNameAsTitle.setText("Dialogue Name");

        roleNameLbl.setText("Role name");
        roleNameLbl.setPreferredSize(new java.awt.Dimension(20, 16));

        PrevCardBttn.setText("previous");
        PrevCardBttn.setBorder(null);
        PrevCardBttn.setBorderPainted(false);
        PrevCardBttn.setContentAreaFilled(false);
        PrevCardBttn.setPreferredSize(new java.awt.Dimension(110, 90));

        NextCardBttn.setText("next");
        NextCardBttn.setBorderPainted(false);
        NextCardBttn.setContentAreaFilled(false);
        NextCardBttn.setPreferredSize(new java.awt.Dimension(110, 90));

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

        javax.swing.GroupLayout cardScrollPagePanelLayout = new javax.swing.GroupLayout(cardScrollPagePanel);
        cardScrollPagePanel.setLayout(cardScrollPagePanelLayout);
        cardScrollPagePanelLayout.setHorizontalGroup(
            cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardScrollPagePanelLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardScrollPagePanelLayout.createSequentialGroup()
                        .addComponent(cardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardScrollPagePanelLayout.createSequentialGroup()
                        .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(DlgNameAsTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(PrevCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roleNameLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roleNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(NextCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        cardScrollPagePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NextCardBttn, PrevCardBttn});

        cardScrollPagePanelLayout.setVerticalGroup(
            cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardScrollPagePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DlgNameAsTitle)
                        .addGap(68, 68, 68)
                        .addComponent(cardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(249, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardScrollPagePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrevCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NextCardBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleNameLbl1))
                        .addGap(16, 16, 16))))
        );

        cardScrollPagePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NextCardBttn, PrevCardBttn});

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

    private void CloseBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseBttnActionPerformed
    
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
        DlgNameAsTitle.setFont(title);
        DlgNameAsTitle.setForeground(Color.white);
        cardTxtDisplayTxtArea.setFont(small);
        roleNameLbl.setFont(small);
        roleNameLbl.setForeground(Color.white);
        Icon icon= createImageIcon("/ArrowIconL.png","arrow left icon");
        PrevCardBttn.removeAll();
        PrevCardBttn.setText("");
        PrevCardBttn.setIcon(icon);
        icon= createImageIcon("/ArrowIconR.png","arrow right icon");
        NextCardBttn.removeAll();
        NextCardBttn.setText("");
        NextCardBttn.setIcon(icon);
        
        
        
        
        
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
        this.CloseBttn = CloseBttn;
    }

    public void setConfirmWindow(JDialog ConfirmWindow) {
        this.ConfirmWindow = ConfirmWindow;
    }

    public void setDlgLvlLbl1(JLabel DlgLvlLbl1) {
        this.DlgLvlLbl1 = DlgLvlLbl1;
    }

    public void setDlgNameAsTitle(JLabel DlgNameAsTitle) {
        this.DlgNameAsTitle = DlgNameAsTitle;
    }

    public void setDlgNameLbl1(JLabel DlgNameLbl1) {
        this.DlgNameLbl1 = DlgNameLbl1;
    }

    public void setDlgPartRateLbl1(JLabel DlgPartRateLbl1) {
        this.DlgPartRateLbl1 = DlgPartRateLbl1;
    }

    public void setDlgTimeLbl1(JLabel DlgTimeLbl1) {
        this.DlgTimeLbl1 = DlgTimeLbl1;
    }

    public void setDlgYRateLbl1(JLabel DlgYRateLbl1) {
        this.DlgYRateLbl1 = DlgYRateLbl1;
    }

    public void setNextCardBttn(JButton NextCardBttn) {
        this.NextCardBttn = NextCardBttn;
    }

    public void setConfBttn(JButton confBttn) {
        this.confBttn = confBttn;
    }

    public void setPrevCardBttn(JButton PrevCardBttn) {
        this.PrevCardBttn = PrevCardBttn;
    }

    public void setRateWindow(JDialog RateWindow) {
        this.RateWindow = RateWindow;
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
        return CloseBttn;
    }

    public JDialog getConfirmWindow() {
        return ConfirmWindow;
    }

    public JLabel getDlgLvlLbl1() {
        return DlgLvlLbl1;
    }

    public JLabel getDlgNameAsTitle() {
        return DlgNameAsTitle;
    }

    public JLabel getDlgNameLbl1() {
        return DlgNameLbl1;
    }

    public JLabel getDlgPartRateLbl1() {
        return DlgPartRateLbl1;
    }

    public JLabel getDlgYRateLbl1() {
        return DlgYRateLbl1;
    }

    public JButton getNextCardBttn() {
        return NextCardBttn;
    }

    public JButton getConfBttn() {
        return confBttn;
    }

    public JButton getPrevCardBttn() {
        return PrevCardBttn;
    }

    public JDialog getRateWindow() {
        return RateWindow;
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
    
    public String getID() {
        return this.id;
    }

    public void setID() {
        this.id = id;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBttn;
    private javax.swing.JDialog ConfirmWindow;
    private javax.swing.JPanel ConfirmWindowPanel;
    private javax.swing.JLabel Congrats;
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
    private javax.swing.JSlider RateSlider;
    private javax.swing.JDialog RateWindow;
    private javax.swing.JPanel RateWindowPanel;
    private javax.swing.JLabel Results;
    private javax.swing.JPanel cardScrollPagePanel;
    private javax.swing.JScrollPane cardScrollPaneExtra;
    private javax.swing.JTextArea cardTxtDisplayTxtArea;
    private javax.swing.JButton closedBttn;
    private javax.swing.JButton confBttn;
    private javax.swing.JButton rateBttn;
    private javax.swing.JLabel rateLbl;
    private javax.swing.JLabel roleNameLbl;
    private javax.swing.JLabel roleNameLbl1;
    // End of variables declaration//GEN-END:variables

}

