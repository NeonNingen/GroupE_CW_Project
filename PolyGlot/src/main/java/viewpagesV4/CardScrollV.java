/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewpagesV4;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author aisana: w1775375
 * 
 * note: still need to do rating bit
 */
public class CardScrollV extends javax.swing.JFrame {

    /**
     * Creates new form MenuBar
     */
    public CardScrollV() {
        initComponents();
        setSize(414,667);
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
        jButton1 = new javax.swing.JButton();
        CloseWindLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RateWindow = new javax.swing.JDialog();
        RateWindowPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
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

        javax.swing.GroupLayout ConfirmWindowPanelLayout = new javax.swing.GroupLayout(ConfirmWindowPanel);
        ConfirmWindowPanel.setLayout(ConfirmWindowPanelLayout);
        ConfirmWindowPanelLayout.setHorizontalGroup(
            ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(CloseWindLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmWindowPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112))))
        );
        ConfirmWindowPanelLayout.setVerticalGroup(
            ConfirmWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmWindowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseWindLbl)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout ConfirmWindowLayout = new javax.swing.GroupLayout(ConfirmWindow.getContentPane());
        ConfirmWindow.getContentPane().setLayout(ConfirmWindowLayout);
        ConfirmWindowLayout.setHorizontalGroup(
            ConfirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(ConfirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ConfirmWindowLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ConfirmWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ConfirmWindowLayout.setVerticalGroup(
            ConfirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(ConfirmWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ConfirmWindowLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ConfirmWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        RateWindow.setResizable(false);
        RateWindow.setSize(new java.awt.Dimension(400, 500));

        RateWindowPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setText("Rate your partner");

        jSlider1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jSlider1.setMaximum(10);
        jSlider1.setValue(5);

        rateBttn.setText("Complete");
        rateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RateWindowPanelLayout = new javax.swing.GroupLayout(RateWindowPanel);
        RateWindowPanel.setLayout(RateWindowPanelLayout);
        RateWindowPanelLayout.setHorizontalGroup(
            RateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RateWindowPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RateWindowPanelLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(RateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RateWindowPanelLayout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RateWindowPanelLayout.createSequentialGroup()
                        .addComponent(rateBttn)
                        .addGap(111, 111, 111))))
        );
        RateWindowPanelLayout.setVerticalGroup(
            RateWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RateWindowPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
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
        CardScrollPagePanel.setPreferredSize(new java.awt.Dimension(414, 667));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
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
        
        //CardScrollPagePanel.add(jInternalFrame1);
        //jInternalFrame1.setVisible(true);
        
        count++;
        
        if(count==3){
            done=true;
        }
        
        
        
        if(done){
            
            
            //JOptionPane.showMessageDialog(this, RateWindow,"Please, Rate your partner", JOptionPane.PLAIN_MESSAGE);
            
            RateWindow.show(true);
            //jInternalFrame1.setVisible(true);
            //CardScrollPagePanel.add(CompConformationWindow);//jInternalFrame1);
            //CompConformationWindow.setVisible(true);
            
            count=0;
        }
        
        
    }//GEN-LAST:event_NextCardBttnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("I recieved confirmation message with results info");
        ConfirmWindow.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CloseBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseBttnActionPerformed

    private void rateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateBttnActionPerformed
        // TODO add your handling code here:
        RateWindow.dispose();
        ConfirmWindow.show(true);
        
    }//GEN-LAST:event_rateBttnActionPerformed

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
                new CardScrollV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardScrollPagePanel;
    private javax.swing.JScrollPane CardScrollPaneExtra;
    private javax.swing.JTextArea CardTxtDisplayTxtArea;
    private javax.swing.JButton CloseBttn;
    private javax.swing.JLabel CloseWindLbl;
    private javax.swing.JDialog ConfirmWindow;
    private javax.swing.JPanel ConfirmWindowPanel;
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
    private javax.swing.JDialog RateWindow;
    private javax.swing.JPanel RateWindowPanel;
    private javax.swing.JLabel Results;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton rateBttn;
    private javax.swing.JLabel roleNameLbl;
    // End of variables declaration//GEN-END:variables
}
