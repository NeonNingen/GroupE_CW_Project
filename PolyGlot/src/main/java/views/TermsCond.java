
package views;

import controllers.LoginRegisterCont;
import javax.swing.JButton;

public class TermsCond extends javax.swing.JFrame {

    public TermsCond() {
        initComponents();
        this.rmvTCBttn.addActionListener(new LoginRegisterCont(this));
        colorRedBttn(this.rmvTCBttn,"X");
    }

    public JButton getRmvTCBttn() {
        return rmvTCBttn;
    }
    
    
    /**
     * Suggested by Aisana(w1775375) will change button look to be red with
     * white font (important/close or cancel buttons)
     *
     * @param bttn - select button the design of which you want to change
     * @param bttnName - add text to be in that button
     */
    public void colorRedBttn(JButton bttn, String bttnName) {
        bttn.setBackground(new java.awt.Color(238, 105, 94));
        bttn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bttn.setForeground(new java.awt.Color(255, 255, 255));
        bttn.setText(bttnName);
        bttn.setContentAreaFilled(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tcPanel = new javax.swing.JPanel();
        tcLabel = new javax.swing.JLabel();
        termCond = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rmvTCBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(450, 700));

        tcPanel.setBackground(new java.awt.Color(135, 178, 240));

        tcLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tcLabel.setForeground(new java.awt.Color(255, 255, 255));
        tcLabel.setText("Terms and Conditions ");

        termCond.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to https://www.langwise.com!\n\nThese terms and conditions outline the rules and regulations for the use of LangWise's Website, located at https://www.langwise.com.\n\nBy accessing this website we assume you accept these terms and conditions. Do not continue to use https://www.langwise.com if you do not agree to take all of the terms and conditions stated on this page.\n\nThe following terminology applies to these Terms and Conditions, Privacy Statement and Disclaimer Notice and all Agreements: \"Client\", \"You\" and \"Your\" refers to you, the person log on this website and compliant to the Company’s terms and conditions. \"The Company\", \"Ourselves\", \"We\", \"Our\" and \"Us\", refers to our Company. \"Party\", \"Parties\", or \"Us\", refers to both the Client and ourselves. All terms refer to the offer, acceptance and consideration of payment necessary to undertake the process of our assistance to the Client in the most appropriate manner for the express purpose of meeting the Client’s needs in respect of provision of the Company’s stated services, in accordance with and subject to, prevailing law of Netherlands. Any use of the above terminology or other words in the singular, plural, capitalization and/or he/she or they, are taken as interchangeable and therefore as referring to same.\n\nCookies\nWe employ the use of cookies. By accessing https://www.langwise.com, you agreed to use cookies in agreement with the LangWise's Privacy Policy\n\nMost interactive websites use cookies to let us retrieve the user’s details for each visit. Cookies are used by our website to enable the functionality of certain areas to make it easier for people visiting our website. Some of our affiliate/advertising partners may also use cookies.\n\n\nLicense\nUnless otherwise stated, LangWise and/or its licensors own the intellectual property rights for all material on https://www.langwise.com. All intellectual property rights are reserved. You may access this from https://www.langwise.com for your own personal use subjected to restrictions set in these terms and conditions.\n\nYou must not:\nRepublish material from https://www.langwise.com\nSell, rent or sub-license material from https://www.langwise.com\nReproduce, duplicate or copy material from https://www.langwise.com\nRedistribute content from https://www.langwise.com\nThis Agreement shall begin on the date hereof. Our Terms and Conditions were created with the help of the Terms And Conditions Template.\n\nParts of this website offer an opportunity for users to post and exchange opinions and information in certain areas of the website. LangWise does not filter, edit, publish or review Comments prior to their presence on the website. Comments do not reflect the views and opinions of LangWise,its agents and/or affiliates. Comments reflect the views and opinions of the person who post their views and opinions. To the extent permitted by applicable laws, LangWise shall not be liable for the Comments or for any liability, damages or expenses caused and/or suffered as a result of any use of and/or posting of and/or appearance of the Comments on this website.\n\nLangWise reserves the right to monitor all Comments and to remove any Comments which can be considered inappropriate, offensive or causes breach of these Terms and Conditions.\n\nContent Liability\nWe shall not be hold responsible for any content that appears on your Website. You agree to protect and defend us against all claims that is rising on your Website. No link(s) should appear on any Website that may be interpreted as libelous, obscene or criminal, or which infringes, otherwise violates, or advocates the infringement or other violation of, any third party rights.\n\nYour Privacy\nPlease read Privacy Policy\n\nReservation of Rights\nWe reserve the right to request that you remove all links or any particular link to our Website. You approve to immediately remove all links to our Website upon request. We also reserve the right to amen these terms and conditions and it’s linking policy at any time. By continuously linking to our Website, you agree to be bound to and follow these linking terms and conditions.\n\nRemoval of links from our website\nIf you find any link on our Website that is offensive for any reason, you are free to contact and inform us any moment. We will consider requests to remove links but we are not obligated to or so or to respond to you directly.\n\nWe do not ensure that the information on this website is correct, we do not warrant its completeness or accuracy; nor do we promise to ensure that the website remains available or that the material on the website is kept up to date.\n\nDisclaimer\nTo the maximum extent permitted by applicable law, we exclude all representations, warranties and conditions relating to our website and the use of this website. Nothing in this disclaimer will:\n\nlimit or exclude our or your liability for death or personal injury;\nlimit or exclude our or your liability for fraud or fraudulent misrepresentation;\nlimit any of our or your liabilities in any way that is not permitted under applicable law; or\nexclude any of our or your liabilities that may not be excluded under applicable law.\nThe limitations and prohibitions of liability set in this Section and elsewhere in this disclaimer: (a) are subject to the preceding paragraph; and (b) govern all liabilities arising under the disclaimer, including liabilities arising in contract, in tort and for breach of statutory duty.\n\nAs long as the website and the information and services on the website are provided free of charge, we will not be liable for any loss or damage of any nature.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setFocusable(false);
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        termCond.setViewportView(jTextArea1);

        rmvTCBttn.setBackground(new java.awt.Color(135, 178, 240));
        rmvTCBttn.setForeground(new java.awt.Color(255, 255, 255));
        rmvTCBttn.setText("X");
        rmvTCBttn.setBorderPainted(false);
        rmvTCBttn.setContentAreaFilled(false);
        rmvTCBttn.setFocusPainted(false);
        rmvTCBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tcPanelLayout = new javax.swing.GroupLayout(tcPanel);
        tcPanel.setLayout(tcPanelLayout);
        tcPanelLayout.setHorizontalGroup(
            tcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tcPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tcPanelLayout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addComponent(tcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rmvTCBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(termCond))
                .addContainerGap())
        );
        tcPanelLayout.setVerticalGroup(
            tcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tcPanelLayout.createSequentialGroup()
                .addGroup(tcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tcPanelLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(tcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tcPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rmvTCBttn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(termCond, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton rmvTCBttn;
    private javax.swing.JLabel tcLabel;
    private javax.swing.JPanel tcPanel;
    private javax.swing.JScrollPane termCond;
    // End of variables declaration//GEN-END:variables
}
