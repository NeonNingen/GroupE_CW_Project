/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Joshua
 */
public class SupportV extends javax.swing.JFrame {

    
     //Creates new form SupportView   
    public SupportV() {
        initComponents();
        MenuBarV menu= new MenuBarV();
        this.setContentPane(menu.getContentPane());
        
        menu.setPageTitle("Support Page");
        menu.setPageTopicContent(supportContent);

        mainTextField();
        mainTitle();
    }
    
    //Titles for the JLabel
        public void mainTitle() {
        String title1 = "Tips to learning Effectively";
        jLabel1.setText(title1);
        
        String title2 = "How to choose a language level";
        jLabel2.setText(title2);
        
        String title3 = "Tips on building a habit";
        jLabel3.setText(title3);
        
        String title4 = "Contact PolyGlot Devs";
        jLabel4.setText(title4);
    }
    
    //Text for populating the field
    public void mainTextField() {
        String text1 = "1. Find what motivates you to learn the language of your choice\n\n"
                + "Take Japanese for example, some people choose it for anime, others "
                + "because they plan to visit, others just like cultured people.\n\n"
                + "Why do you want to study? Once you know that, you are on the right track. \n\n"
                + "2. Make learning a habit \n\n"
                + "Check below for more information \n\n"
                + "3. Check your notes, make notes if you dont already and review \n\n"
                + "Imagine learning multiple languages at once, you won't be able "
                + "to remember most of them if you arent taking notes. Note taking "
                + "learn it. \n\n"
                + "4. Immerse yourself in the language \n\n"
                + "This is my personal recommendation. What better way to learn Japanese "
                + "for example than to binge watch anime or japanese dramas with no subtitles?\n\n "
                + "I guarantee you, if you want to progress fast, watching or listening in the "
                + "language you are studying is the way to go";
        jTextArea1.setText(text1);
        jTextArea1.setEditable(false);
        //setEditable to stop users from writing into the field
        
        
        String text2 = "On your device, click the cog icon and select the language "
                + "of your choice. \n\nCurrently we only have two languages but if our "
                + "app gets popular enough, we will add more language. Japanese "
                + "being a priority.";
        jTextArea2.setText(text2);
        jTextArea2.setEditable(false);        

        
        String text3 = "1. Choose a time specifically for studying \n\n"
                + "The most important thing for making anything a habit is to fit it into your routine. "
                + "Good thing is our application is piss easy that even a baby could find time to use it "
                + "so there should be no excuse on not using our app at least 24 hours a day \n\n"
                + "2. Make your learning fun \n\n"
                + "It's very important to stay motivated in language learning by doing something you love "
                + "while using our application. For example, if you like news, try watching news in "
                + "the language you are learning, studies shown that it works! \n\n"
                + "3. Watch your progress \n\n"
                + "It's another way to stay motivated! Our progress page on the application allows you to "
                + "check your progress so check it out, get movitated and start practicing! \n\n"
                + "4. Find people to practice with \n\n"
                + "Language learning is a social activity, you don't study language for yourself, do you? "
                + "Of course not, you study it to speak with people from other languages and connect. \n\n"
                + "If you don't have any friends that speak other languages, my condolences. "
                + "The best advice we can give you is go out there and make some friends!";
        jTextArea3.setText(text3);
        jTextArea3.setEditable(false);
        jTextArea3.setLineWrap(true);
        jTextArea3.setWrapStyleWord(true);

        
        String text4 = "Zain Cheema (w12345678@my.westminster.ac.uk)\n\n" +
        "Monesha Dhali (w12345679@my.westminster.ac.uk)\n\n" +
        "Rafael Sally (w12345670@my.westminster.ac.uk)\n\n" +
        "Rahat Amit Haider (w12345681@my.westminster.ac.uk)\n\n" +
        "Joshua Nwachukwu (w12345682@my.westminster.ac.uk)\n\n" +
        "Aisana Zharmagambetova (w12345683@my.westminster.ac.uk)";
        jTextArea4.setText(text4);
        jTextArea4.setEditable(false);
        jTextArea4.setLineWrap(true);
        jTextArea4.setWrapStyleWord(true);

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supportContent = new javax.swing.JPanel();
        supContTxtScrollP = new javax.swing.JScrollPane();
        scrollPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        supportContent.setMinimumSize(new java.awt.Dimension(414, 550));
        supportContent.setPreferredSize(new java.awt.Dimension(414, 550));

        supContTxtScrollP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        supContTxtScrollP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        supContTxtScrollP.setAutoscrolls(true);
        supContTxtScrollP.setPreferredSize(new java.awt.Dimension(414, 470));

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setAutoscrolls(true);
        scrollPanel.setPreferredSize(new java.awt.Dimension(414, 1000));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(121, 121, 121));
        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(121, 121, 121));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(121, 121, 121));
        jLabel2.setText("jLabel2");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(121, 121, 121));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(121, 121, 121));
        jLabel3.setText("jLabel3");

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(121, 121, 121));
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(121, 121, 121));
        jLabel4.setText("jLabel4");

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(121, 121, 121));
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout scrollPanelLayout = new javax.swing.GroupLayout(scrollPanel);
        scrollPanel.setLayout(scrollPanelLayout);
        scrollPanelLayout.setHorizontalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        scrollPanelLayout.setVerticalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        supContTxtScrollP.setViewportView(scrollPanel);

        javax.swing.GroupLayout supportContentLayout = new javax.swing.GroupLayout(supportContent);
        supportContent.setLayout(supportContentLayout);
        supportContentLayout.setHorizontalGroup(
            supportContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supportContentLayout.createSequentialGroup()
                .addComponent(supContTxtScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        supportContentLayout.setVerticalGroup(
            supportContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supportContentLayout.createSequentialGroup()
                .addComponent(supContTxtScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supportContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(supportContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 235, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //getters
    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public JTextArea getjTextArea2() {
        return jTextArea2;
    }

    public JTextArea getjTextArea3() {
        return jTextArea3;
    }

    public JTextArea getjTextArea4() {
        return jTextArea4;
    }

    //setters
    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public void setjTextArea2(JTextArea jTextArea2) {
        this.jTextArea2 = jTextArea2;
    }

    public void setjTextArea3(JTextArea jTextArea3) {
        this.jTextArea3 = jTextArea3;
    }

    public void setjTextArea4(JTextArea jTextArea4) {
        this.jTextArea4 = jTextArea4;
    }

    public JPanel getSupportContent() {
        return supportContent;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JPanel scrollPanel;
    private javax.swing.JScrollPane supContTxtScrollP;
    private javax.swing.JPanel supportContent;
    // End of variables declaration//GEN-END:variables
}
