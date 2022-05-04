/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.MenuBarCont;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Aisana (w1775375) 
 */

public class MenuBarV extends javax.swing.JFrame {
    String currentPage;
    private MenuBarCont menuC;
    ArrayList <Icon> icons= new ArrayList<Icon>(); 
     //0-profile, 1-userlist, 2-dlgList, 3- settings, 4- support
    ArrayList <Icon> selIc= new ArrayList<Icon>();
     //0-profile, 1-userlist, 2-dlgList, 3- settings
    
   
    
    public MenuBarV() 
    {
        initComponents();
        setSize(430,700);
        setDesign();
        userListBttn.addActionListener(menuC);
        proVBttn.addActionListener(menuC);
        supportBttn.addActionListener(menuC);
        dlgListBttn.addActionListener(menuC);
        settBttn.addActionListener(menuC);
        DlgHistBttn2.addActionListener(menuC);   
    }

    public MenuBarV(MenuBarCont menuC) 
    {
        initComponents();
        setSize(430,700);
        
        menuC.setPage(this);
        
        setDesign();
        userListBttn.addActionListener(menuC);
        proVBttn.addActionListener(menuC);
        supportBttn.addActionListener(menuC);
        dlgListBttn.addActionListener(menuC);
        settBttn.addActionListener(menuC);
        DlgHistBttn2.addActionListener(menuC);
    }

    
    /** by Aisana (w1775375)
     * Methods will initiate main panel colour (colour for app background page), set font to test and  icons for menubar buttons
     */
    public void setDesign(){
        menuBarPanel.setBackground(new java.awt.Color(135, 170, 240));
        pageTitle.setFont(new java.awt.Font("Avenir Next", 1, 18));
        icons=getIconsList();
        selIc= getIconsListB();
        setIcons(proVBttn);
        setIcons(userListBttn);
        setIcons(dlgListBttn);
        setIcons(settBttn);
        setIcons(supportBttn);
    }
    
    /** by Aisana (w1775375)
     * Method will be used for selected menu bar button to increase its size and set bigger size icon
     * also includes case for support and dlgHist button click to reset all 4 mennnu bar buttons to enabled
     * @param bttn - choose button to which you will want to add an icon(note that with conditions it would only add icon to if button is the same as at menuBarV)
     */
    public void updateIcon(JButton bttn){ // 0- profile, 1- Ulist, 2-DlgLIst, 3-Settings
        Dimension newPrefSize= new Dimension (100,100);
        if(bttn.equals(proVBttn)){
            proVBttn.removeAll();
            
            proVBttn.setPreferredSize(newPrefSize);
            proVBttn.setLocation(18,555);
            proVBttn.setBackground(new java.awt.Color(135, 170, 240));
            proVBttn.setIcon(selIc.get(0));
            
            
            setIcons(userListBttn);
            setIcons(dlgListBttn);
            setIcons(settBttn);
        }
        if(bttn.equals(userListBttn)){
            userListBttn.removeAll();
            userListBttn.setPreferredSize(newPrefSize);
            userListBttn.setLocation(118,555);
            userListBttn.setBackground(new java.awt.Color(135, 170, 240));
            
            
            userListBttn.setIcon(selIc.get(1));
            
            setIcons(proVBttn);
            setIcons(dlgListBttn);
            setIcons(settBttn);
            
        }
        if(bttn.equals(dlgListBttn)){
            dlgListBttn.removeAll(); 
            dlgListBttn.setPreferredSize(newPrefSize);
            dlgListBttn.setLocation(218,555);
            dlgListBttn.setBackground(new java.awt.Color(135, 170, 240));
            
           
            dlgListBttn.setIcon(selIc.get(2));
            setIcons(proVBttn);
            setIcons(userListBttn);
            setIcons(settBttn);
        }
        if(bttn.equals(settBttn)){
            settBttn.removeAll();
            settBttn.setBackground(new java.awt.Color(135, 170, 240));
            settBttn.setPreferredSize(newPrefSize);
            settBttn.setLocation(318,555);
            
            settBttn.setIcon(selIc.get(3));
            setIcons(proVBttn);
            setIcons(userListBttn);
            setIcons(dlgListBttn);
        }
        
        if(bttn.equals(supportBttn) || bttn.equals(DlgHistBttn2)){
            setIcons(proVBttn);
            setIcons(userListBttn);
            setIcons(dlgListBttn);
            setIcons(settBttn);
        }
    }
    
    
    /** by Aisana (w1775375)
     * Method will set Icon to a button, depending which button it is, it will choose the right icon with original size 60x60 for unselected button
     * @param bttn - JButton that you want to set Icon for. Note, there are only options for 5 buttons that are needed for this application
     */
    public void setIcons(JButton bttn){
        Dimension preferredSize = new Dimension(100,100);
        if(bttn.equals(proVBttn)){
            proVBttn.removeAll();
            proVBttn.setText("");
            proVBttn.setPreferredSize(preferredSize);
            proVBttn.setLocation(18,555);
            proVBttn.setBackground(new java.awt.Color(135, 170, 240));
            
            proVBttn.setIcon(icons.get(0));
            
        }
        if(bttn.equals(userListBttn)){
            userListBttn.removeAll(); 
            userListBttn.setText("");
            
            userListBttn.setPreferredSize(preferredSize);
            userListBttn.setLocation(118,555);  
            userListBttn.setBackground(new java.awt.Color(135, 170, 240));
            userListBttn.setIcon(icons.get(1));
          
            
        }
        if(bttn.equals(dlgListBttn)){
            dlgListBttn.removeAll();
            dlgListBttn.setText("");
            
            dlgListBttn.setPreferredSize(preferredSize);
            dlgListBttn.setLocation(218,555);
            dlgListBttn.setBackground(new java.awt.Color(135, 170, 240));
            dlgListBttn.setIcon(icons.get(2));
            
        }
        if(bttn.equals(settBttn)){
            settBttn.removeAll(); 
            settBttn.setText("");
            settBttn.setPreferredSize(preferredSize);
            settBttn.setLocation(318,555);
            settBttn.setBackground(new java.awt.Color(135, 170, 240));
            
            settBttn.setIcon(icons.get(3));
            
        }
        
        if(bttn.equals(supportBttn)){
            Dimension supSize= new Dimension (20,20);
            supportBttn.removeAll();
            supportBttn.setText("");
            supportBttn.setPreferredSize(supSize);
            supportBttn.setBackground(new java.awt.Color(135, 170, 240));
            supportBttn.setIcon(icons.get(4));
        }
        
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
    
     
    /** by Aisana (w1775375)
     * Method used to store default icon images, size(60x60) into arrayList 
     * so that the arrayList can be used later to set Icons to buttons
     * @return an array list of Icons
     */
    public ArrayList<Icon> getIconsList(){ // 0- profile 1- Ulist, 2-DlgLIst, 3-Settings, 4 -support
            
        ArrayList<Icon> list= new ArrayList<Icon> ();
        String path= "/ProVIcon.png";
        Icon icon1 = createImageIcon(path,"Profile Button Icon");
        list.add(icon1);

        path= "/UListIcon.png";
        icon1 = createImageIcon(path,"User list Button Icon");
        list.add(icon1);

        path= "/DlgIcon.png";
        icon1 = createImageIcon(path,"Dialogue List Button Icon");
        list.add(icon1);


        path= "/SttngIcon.png";
        icon1 = createImageIcon(path,"Settings Button Icon");
        list.add(icon1);


        path= "/SupIcon.png";
        icon1 = createImageIcon(path, "Support Button Icon");
        list.add(icon1);

        return list;
    }
    
    
    /** by Aisana (w1775375)
     * Method used to store enlarged icon images, size(90x90) into arrayList 
     * so that the arrayList can be used later to set Icons to buttons when needed
     * @return an array list of Icons
     */
    public ArrayList<Icon> getIconsListB(){ // 0- profile, 1- Ulist, 2-DlgLIst, 3-Settings
             
        ArrayList<Icon> list= new ArrayList<Icon> ();
        String path= "/ProVIconB.png";
        Icon icon1 = createImageIcon(path,"Large Profile Button Icon ");
        list.add(icon1);

        path= "/UListIconB.png";
        icon1 = createImageIcon(path,"Large User List Button Icon");
        list.add(icon1);

        path= "/DlgIconB.png";
        icon1 = createImageIcon(path,"Large Dialogue List Button Icon");
        list.add(icon1);


        path= "/SttngIconB.png";
        icon1 = createImageIcon(path,"Large Setting Button Icon");
        
        list.add(icon1);

        return list;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    /* Note on menu bar elements:
    
    MainPage_sampleName[line44] is a panel where one will put the actual page. The panel name should be edited as well
    eg. when making user list page:     1.rename it to : MainPage_UListViewPanel 
                                        2. add the that panel all the buttons that are needed
    [from Aisana]
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DlgHistBttn2 = new javax.swing.JButton();
        menuBarPanel = new javax.swing.JPanel();
        pageTitle = new javax.swing.JLabel();
        pageContent = new javax.swing.JPanel();
        userListBttn = new javax.swing.JButton();
        settBttn = new javax.swing.JButton();
        proVBttn = new javax.swing.JButton();
        dlgListBttn = new javax.swing.JButton();
        supportBttn = new javax.swing.JButton();

        DlgHistBttn2.setText("View Dialogue History");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);

        menuBarPanel.setBackground(new java.awt.Color(153, 153, 153));
        menuBarPanel.setPreferredSize(new java.awt.Dimension(450, 680));

        pageTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pageTitle.setForeground(new java.awt.Color(255, 255, 255));
        pageTitle.setText("Page Title");

        pageContent.setBackground(new java.awt.Color(255, 255, 255));
        pageContent.setMinimumSize(new java.awt.Dimension(450, 515));
        pageContent.setPreferredSize(new java.awt.Dimension(450, 515));

        javax.swing.GroupLayout pageContentLayout = new javax.swing.GroupLayout(pageContent);
        pageContent.setLayout(pageContentLayout);
        pageContentLayout.setHorizontalGroup(
            pageContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pageContentLayout.setVerticalGroup(
            pageContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        userListBttn.setBackground(new java.awt.Color(51, 204, 255));
        userListBttn.setText("User List");
        userListBttn.setBorder(null);
        userListBttn.setBorderPainted(false);
        userListBttn.setFocusPainted(false);
        userListBttn.setPreferredSize(new java.awt.Dimension(100, 100));
        userListBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        userListBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListBttnActionPerformed(evt);
            }
        });

        settBttn.setBackground(new java.awt.Color(51, 204, 255));
        settBttn.setText("Settings");
        settBttn.setBorder(null);
        settBttn.setBorderPainted(false);
        settBttn.setFocusPainted(false);
        settBttn.setPreferredSize(new java.awt.Dimension(100, 100));
        settBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        settBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settBttnActionPerformed(evt);
            }
        });

        proVBttn.setBackground(new java.awt.Color(51, 204, 255));
        proVBttn.setText("Profile");
        proVBttn.setBorderPainted(false);
        proVBttn.setFocusPainted(false);
        proVBttn.setPreferredSize(new java.awt.Dimension(100, 100));
        proVBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        dlgListBttn.setBackground(new java.awt.Color(51, 204, 255));
        dlgListBttn.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        dlgListBttn.setText("Dialogue List");
        dlgListBttn.setBorderPainted(false);
        dlgListBttn.setFocusPainted(false);
        dlgListBttn.setPreferredSize(new java.awt.Dimension(100, 100));
        dlgListBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dlgListBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgListBttnActionPerformed(evt);
            }
        });

        supportBttn.setFont(new java.awt.Font("Lucida Grande", 0, 6)); // NOI18N
        supportBttn.setText("Help");
        supportBttn.setBorderPainted(false);
        supportBttn.setFocusPainted(false);
        supportBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        supportBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout menuBarPanelLayout = new javax.swing.GroupLayout(menuBarPanel);
        menuBarPanel.setLayout(menuBarPanelLayout);
        menuBarPanelLayout.setHorizontalGroup(
            menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pageContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pageTitle)
                .addGap(110, 110, 110)
                .addComponent(supportBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(menuBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proVBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dlgListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        menuBarPanelLayout.setVerticalGroup(
            menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pageTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supportBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dlgListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proVBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dlgListBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgListBttnActionPerformed

    }//GEN-LAST:event_dlgListBttnActionPerformed

    private void settBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settBttnActionPerformed

    private void userListBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userListBttnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DlgHistBttn2;
    private javax.swing.JButton dlgListBttn;
    private javax.swing.JPanel menuBarPanel;
    private javax.swing.JPanel pageContent;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JButton proVBttn;
    private javax.swing.JButton settBttn;
    private javax.swing.JButton supportBttn;
    private javax.swing.JButton userListBttn;
    // End of variables declaration//GEN-END:variables

    public void setPageTitle(String text) {
        this.pageTitle.setText(text);
    }

  
    /** by Aisana (w1775375)
     * Method used to set up content from other Jframe class(from its Jpanel) to this (menubar content page) thus
     * menubar window will display components of another page by switching content in jpanel 
     * @param PageTopicContent - panel from another page from which you want to display the content
     */
    public void setPageTopicContent(JPanel PageTopicContent) {
        this.pageContent.removeAll();
        this.pageContent.revalidate();
        this.pageContent.repaint();
        this.pageContent.add(PageTopicContent);
        this.pageContent.revalidate();
        this.pageContent.repaint();
    }
    
    /** by Aisana (w1775375)
     * Method specifically to set up Profile page (to add dlgHistButton to menubarV and make it available to menubar controller)
     * used to set up content from other Jframe class(from its Jpanel) to this (menubar content page) thus
     * menubar window will display components of another page by switching content in jpanel 
     * @param PageTopicContent - panel from another page from which you want to display the content
     */
    public void setProgPageTopicContent(JPanel PageTopicContent) {
        this.pageContent.removeAll(); 
        this.pageContent.revalidate();
        this.pageContent.repaint();
        this.pageContent.add(PageTopicContent);
        this.pageContent.revalidate();
        this.pageContent.repaint();
        DlgHistBttn2.setBounds(100, 400, 250, 40);
        colorWhiteBttn(DlgHistBttn2, "View Dialogue History");
        PageTopicContent.add(DlgHistBttn2);
        PageTopicContent.revalidate();
        PageTopicContent.repaint();
    }
    
    /** by Aisana(w1775375)
     * will change button look to be white with blue font
     * @param bttn - select button the design of which you want to change
     * @param bttnName - add text to be in that button
     */
    public void colorWhiteBttn(JButton bttn, String bttnName){
        bttn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bttn.setBackground(new java.awt.Color(238,238,238));
        bttn.setForeground(new java.awt.Color(93, 150, 234));

        bttn.setText(bttnName);

        bttn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 152, 224), 1, true));

        bttn.setBorderPainted(true);
        bttn.setContentAreaFilled(true);
    }

    
    public void setDlgListBttn(JButton DlgListBttn) {
        this.dlgListBttn = DlgListBttn;
    }


    public void setProVBttn(JButton ProVBttn) {
        this.proVBttn = ProVBttn;
    }

    public void setSettBttn(JButton SettBttn) {
        this.settBttn = SettBttn;
    }

    public void setSupportBttn(JButton SupportBttn) {
        this.supportBttn = SupportBttn;
    }

    public void setUListBttn(JButton UListBttn) {
        this.userListBttn = UListBttn;
    }
    
    public JButton getDlgListBttn() { 
        return dlgListBttn; 
          
    }

    public JLabel getPageTitle() {
        return pageTitle;
    }

    public JPanel getPageTopicContent() {
        return pageContent;
    }

    public JButton getProVBttn() {
        return proVBttn;
    }

    public JButton getSettBttn() {
        return settBttn;
    }

    public JButton getSupportBttn() {
        return supportBttn;
    }

    public JButton getUListBttn() { 
        return userListBttn; 
          
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public JButton getDlgHistBttn2() {
        return DlgHistBttn2;
    }

    public JPanel getMenuBarPanel() {
        return menuBarPanel;
    }
    
   

}

/* Note about menu bar buttons: One icons will have two sizes: 60x60 and 90x90 to set for clicked and unclicked
[from Aisana]
*/


