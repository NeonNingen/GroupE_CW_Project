/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import controllers.DialogueCont;
import controllers.PerfmDlgCont;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;


/**
 *
 * @author Zain
 * 
 */

public class CardScrollV extends javax.swing.JFrame {
    
    private int id;

    //test test test
    /**
     * Creates new form MenuBar
     */
    public CardScrollV(int id, SetUpDlgV setUpDlgCont, DialogueCont dlgCont) {
        this.id = id;
        initComponents();
        setSize(414,667);
        PerfmDlgCont cont = new PerfmDlgCont(this, setUpDlgCont);
        NextCardBttn.addActionListener(cont);
        //PerfmDlgCont cont = new PerfmDlgCont(this);
        //cont.getClick()
        PrevCardBttn.addActionListener(cont);
        CloseBttn.addActionListener(dlgCont);
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
        OCnfirmOKbttn = new javax.swing.JButton();
        closedBttn = new javax.swing.JButton();
        Congrats = new javax.swing.JLabel();
        RateWindow = new javax.swing.JDialog();
        RateWindowPanel = new javax.swing.JPanel();
        rateLbl = new javax.swing.JLabel();
        RateSlider = new javax.swing.JSlider();
        rateBttn = new javax.swing.JButton();
        CardScrollPagePanel = new javax.swing.JPanel();
        CloseBttn = new javax.swing.JButton();
        DlgNameAsTitle = new javax.swing.JLabel();
        roleNameLbl = new javax.swing.JLabel();
        PrevCardBttn = new javax.swing.JButton();
        NextCardBttn = new javax.swing.JButton();
        CardScrollPaneExtra = new javax.swing.JScrollPane();
        CardTxtDisplayTxtArea = new javax.swing.JTextArea();

        ConfirmWindow.setResizable(false);
        ConfirmWindow.setSize(new java.awt.Dimension(400, 600));

        ConfirmWindowPanel.setBackground(new java.awt.Color(232, 231, 231));
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

        OCnfirmOKbttn.setText("OK");

        closedBttn.setText("X");

        Congrats.setText("Congratulation in finishing!");

        javax.swing.GroupLayout ConfirmWindowPanelLayout = new javax.swing.GroupLayout(ConfirmWindowPanel);
        ConfirmWindowPanel.setLayout(ConfirmWindowPanelLayout);
        ConfirmWindowPanelLayout.setHorizontalGroup(
            ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(OCnfirmOKbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(closedBttn)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(OCnfirmOKbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        CardScrollPagePanel.setBackground(new java.awt.Color(204, 204, 204));
        CardScrollPagePanel.setMinimumSize(new java.awt.Dimension(414, 550));
        CardScrollPagePanel.setPreferredSize(new java.awt.Dimension(414, 550));

        CloseBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        CloseBttn.setText("X");
        CloseBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        CloseBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBttnActionPerformed(evt);
            }
        });

        DlgNameAsTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        DlgNameAsTitle.setText("Dialogue Name");

        roleNameLbl.setText("Role name");

        PrevCardBttn.setText("previous");

        NextCardBttn.setText("next");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                .addGroup(CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PrevCardBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(roleNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(NextCardBttn)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createSequentialGroup()
                        .addComponent(CardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createSequentialGroup()
                        .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        CardScrollPagePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NextCardBttn, PrevCardBttn});

        CardScrollPagePanelLayout.setVerticalGroup(
            CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardScrollPagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DlgNameAsTitle)
                .addGap(110, 110, 110)
                .addComponent(CardScrollPaneExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrevCardBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardScrollPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NextCardBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roleNameLbl)))
                .addGap(17, 17, 17))
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
            .addComponent(CardScrollPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseBttnActionPerformed
    
    public void setCardTxtDisplayTxtArea(JTextArea CardTxtDisplayTxtArea) {
        this.CardTxtDisplayTxtArea = CardTxtDisplayTxtArea;
    }

    /**
     *
     * @param CloseBttn
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

    public void setOCnfirmOKbttn(JButton OCnfirmOKbttn) {
        this.OCnfirmOKbttn = OCnfirmOKbttn;
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
        return CardTxtDisplayTxtArea;
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

    public JButton getOCnfirmOKbttn() {
        return OCnfirmOKbttn;
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
    
    public int getID() {
        return this.id;
    }

    public void setID() {
        this.id = id;
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
            java.util.logging.Logger.getLogger(CardScrollV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardScrollV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardScrollV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardScrollV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                DialogueCont dlgCont= new DialogueCont();
                new CardScrollV(123, new SetUpDlgV(), dlgCont).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardScrollPagePanel;
    private javax.swing.JScrollPane CardScrollPaneExtra;
    private javax.swing.JTextArea CardTxtDisplayTxtArea;
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
    private javax.swing.JButton OCnfirmOKbttn;
    private javax.swing.JButton PrevCardBttn;
    private javax.swing.JSlider RateSlider;
    private javax.swing.JDialog RateWindow;
    private javax.swing.JPanel RateWindowPanel;
    private javax.swing.JLabel Results;
    private javax.swing.JButton closedBttn;
    private javax.swing.JButton rateBttn;
    private javax.swing.JLabel rateLbl;
    private javax.swing.JLabel roleNameLbl;
    // End of variables declaration//GEN-END:variables

}

