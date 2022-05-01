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
        setSize(414,667);
        setDesign();
        UListBttn.addActionListener(menuC);
        ProVBttn.addActionListener(menuC);
        SupportBttn.addActionListener(menuC);
        DlgListBttn.addActionListener(menuC);
        SettBttn.addActionListener(menuC);
        DlgHistBttn2.addActionListener(menuC);   
    }

    public MenuBarV(MenuBarCont menuC) 
    {
        initComponents();
        setSize(414,667);
        
        menuC.setPage(this);
        
        setDesign();
        UListBttn.addActionListener(menuC);
        ProVBttn.addActionListener(menuC);
        SupportBttn.addActionListener(menuC);
        DlgListBttn.addActionListener(menuC);
        SettBttn.addActionListener(menuC);
        DlgHistBttn2.addActionListener(menuC);
    }

    
    /** by Aisana (w1775375)
     * Methods will initiate main panel colour (colour for app background page), set font to test and  icons for menubar buttons
     */
    public void setDesign(){
        MenuBarPanel.setBackground(new java.awt.Color(135, 170, 240));
        PageTitle.setFont(new java.awt.Font("Avenir Next", 1, 18));
        icons=getIconsList();
        selIc= getIconsListB();
        setIcons(ProVBttn);
        setIcons(UListBttn);
        setIcons(DlgListBttn);
        setIcons(SettBttn);
        setIcons(SupportBttn);
    }
    
    /** by Aisana (w1775375)
     * Method will be used for selected menu bar button to increase its size and set bigger size icon
     * also includes case for support and dlgHist button click to reset all 4 mennnu bar buttons to enabled
     * @param bttn 
     */
    public void updateIcon(JButton bttn){ // 0- profile, 1- Ulist, 2-DlgLIst, 3-Settings
        Dimension newPrefSize= new Dimension (100,100);
        if(bttn.equals(ProVBttn)){
            ProVBttn.removeAll();
            
            ProVBttn.setPreferredSize(newPrefSize);
            ProVBttn.setLocation(18,555);
            ProVBttn.setBackground(new java.awt.Color(135, 170, 240));
            ProVBttn.setIcon(selIc.get(0));
            
            
            setIcons(UListBttn);
            setIcons(DlgListBttn);
            setIcons(SettBttn);
        }
        if(bttn.equals(UListBttn)){
            UListBttn.removeAll();
            UListBttn.setPreferredSize(newPrefSize);
            UListBttn.setLocation(118,555);
            UListBttn.setBackground(new java.awt.Color(135, 170, 240));
            
            
            UListBttn.setIcon(selIc.get(1));
            
            setIcons(ProVBttn);
            setIcons(DlgListBttn);
            setIcons(SettBttn);
            
        }
        if(bttn.equals(DlgListBttn)){
            DlgListBttn.removeAll(); 
            DlgListBttn.setPreferredSize(newPrefSize);
            DlgListBttn.setLocation(218,555);
            DlgListBttn.setBackground(new java.awt.Color(135, 170, 240));
            
           
            DlgListBttn.setIcon(selIc.get(2));
            setIcons(ProVBttn);
            setIcons(UListBttn);
            setIcons(SettBttn);
        }
        if(bttn.equals(SettBttn)){
            SettBttn.removeAll();
            SettBttn.setBackground(new java.awt.Color(135, 170, 240));
            SettBttn.setPreferredSize(newPrefSize);
            SettBttn.setLocation(318,555);
            
            SettBttn.setIcon(selIc.get(3));
            setIcons(ProVBttn);
            setIcons(UListBttn);
            setIcons(DlgListBttn);
        }
        
        if(bttn.equals(SupportBttn) || bttn.equals(DlgHistBttn2)){
            setIcons(ProVBttn);
            setIcons(UListBttn);
            setIcons(DlgListBttn);
            setIcons(SettBttn);
        }
    }
    
    
    /** by Aisana (w1775375)
     * Method will set Icon to a button, depending which button it is, it will choose the right icon (of original size 60x60)
     * @param bttn - JButton that you want to set Icon for. Note, there are only options for 5 buttons that are needed for this application
     */
    public void setIcons(JButton bttn){
        Dimension preferredSize = new Dimension(70,70);
        if(bttn.equals(ProVBttn)){
            ProVBttn.removeAll();
            ProVBttn.setText("");
            ProVBttn.setPreferredSize(preferredSize);
            ProVBttn.setLocation(18,555);
            ProVBttn.setBackground(new java.awt.Color(135, 170, 240));
            
            ProVBttn.setIcon(icons.get(0));
            
        }
        if(bttn.equals(UListBttn)){
            UListBttn.removeAll(); 
            UListBttn.setText("");
            
            UListBttn.setPreferredSize(preferredSize);
            UListBttn.setLocation(118,555);  
            UListBttn.setBackground(new java.awt.Color(135, 170, 240));
            UListBttn.setIcon(icons.get(1));
          
            
        }
        if(bttn.equals(DlgListBttn)){
            DlgListBttn.removeAll();
            DlgListBttn.setText("");
            
            DlgListBttn.setPreferredSize(preferredSize);
            DlgListBttn.setLocation(218,555);
            DlgListBttn.setBackground(new java.awt.Color(135, 170, 240));
            DlgListBttn.setIcon(icons.get(2));
            
        }
        if(bttn.equals(SettBttn)){
            SettBttn.removeAll(); 
            SettBttn.setText("");
            SettBttn.setPreferredSize(preferredSize);
            SettBttn.setLocation(318,555);
            SettBttn.setBackground(new java.awt.Color(135, 170, 240));
            
            SettBttn.setIcon(icons.get(3));
            
        }
        
        if(bttn.equals(SupportBttn)){
            Dimension supSize= new Dimension (20,20);
            SupportBttn.removeAll();
            SupportBttn.setText("");
            SupportBttn.setPreferredSize(supSize);
            SupportBttn.setBackground(new java.awt.Color(135, 170, 240));
            SupportBttn.setIcon(icons.get(4));
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
        MenuBarPanel = new javax.swing.JPanel();
        PageTitle = new javax.swing.JLabel();
        PageTopicContent = new javax.swing.JPanel();
        UListBttn = new javax.swing.JButton();
        SettBttn = new javax.swing.JButton();
        ProVBttn = new javax.swing.JButton();
        DlgListBttn = new javax.swing.JButton();
        SupportBttn = new javax.swing.JButton();

        DlgHistBttn2.setText("View Dialogue History");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(414, 667));
        setResizable(false);

        MenuBarPanel.setBackground(new java.awt.Color(153, 153, 153));
        MenuBarPanel.setPreferredSize(new java.awt.Dimension(414, 667));

        PageTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PageTitle.setForeground(new java.awt.Color(255, 255, 255));
        PageTitle.setText("Page Title");

        PageTopicContent.setBackground(new java.awt.Color(255, 255, 255));
        PageTopicContent.setMinimumSize(new java.awt.Dimension(414, 515));
        PageTopicContent.setPreferredSize(new java.awt.Dimension(414, 515));

        javax.swing.GroupLayout PageTopicContentLayout = new javax.swing.GroupLayout(PageTopicContent);
        PageTopicContent.setLayout(PageTopicContentLayout);
        PageTopicContentLayout.setHorizontalGroup(
            PageTopicContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        PageTopicContentLayout.setVerticalGroup(
            PageTopicContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        UListBttn.setBackground(new java.awt.Color(51, 204, 255));
        UListBttn.setText("User List");
        UListBttn.setBorder(null);
        UListBttn.setBorderPainted(false);
        UListBttn.setFocusPainted(false);
        UListBttn.setPreferredSize(new java.awt.Dimension(60, 60));
        UListBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SettBttn.setBackground(new java.awt.Color(51, 204, 255));
        SettBttn.setText("Settings");
        SettBttn.setBorder(null);
        SettBttn.setBorderPainted(false);
        SettBttn.setFocusPainted(false);
        SettBttn.setPreferredSize(new java.awt.Dimension(60, 60));
        SettBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SettBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettBttnActionPerformed(evt);
            }
        });

        ProVBttn.setBackground(new java.awt.Color(51, 204, 255));
        ProVBttn.setText("Profile");
        ProVBttn.setBorderPainted(false);
        ProVBttn.setFocusPainted(false);
        ProVBttn.setPreferredSize(new java.awt.Dimension(60, 60));
        ProVBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ProVBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProVBttnActionPerformed(evt);
            }
        });

        DlgListBttn.setBackground(new java.awt.Color(51, 204, 255));
        DlgListBttn.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        DlgListBttn.setText("Dialogue List");
        DlgListBttn.setBorderPainted(false);
        DlgListBttn.setFocusPainted(false);
        DlgListBttn.setPreferredSize(new java.awt.Dimension(60, 60));
        DlgListBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DlgListBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DlgListBttnActionPerformed(evt);
            }
        });

        SupportBttn.setFont(new java.awt.Font("Lucida Grande", 0, 6)); // NOI18N
        SupportBttn.setText("Help");
        SupportBttn.setBorderPainted(false);
        SupportBttn.setFocusPainted(false);
        SupportBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        SupportBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SupportBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupportBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuBarPanelLayout = new javax.swing.GroupLayout(MenuBarPanel);
        MenuBarPanel.setLayout(MenuBarPanelLayout);
        MenuBarPanelLayout.setHorizontalGroup(
            MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addComponent(PageTopicContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PageTitle)
                .addGap(110, 110, 110)
                .addComponent(SupportBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ProVBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(UListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(DlgListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SettBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        MenuBarPanelLayout.setVerticalGroup(
            MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PageTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupportBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PageTopicContent, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DlgListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProVBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DlgListBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DlgListBttnActionPerformed

    }//GEN-LAST:event_DlgListBttnActionPerformed

    private void SupportBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupportBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupportBttnActionPerformed

    private void SettBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SettBttnActionPerformed

    private void ProVBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProVBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProVBttnActionPerformed

    
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBarV().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DlgHistBttn2;
    private javax.swing.JButton DlgListBttn;
    private javax.swing.JPanel MenuBarPanel;
    private javax.swing.JLabel PageTitle;
    private javax.swing.JPanel PageTopicContent;
    private javax.swing.JButton ProVBttn;
    private javax.swing.JButton SettBttn;
    private javax.swing.JButton SupportBttn;
    private javax.swing.JButton UListBttn;
    // End of variables declaration//GEN-END:variables

    public void setPageTitle(String text) {
        this.PageTitle.setText(text);
    }

  
    /** by Aisana (w1775375)
     * Method used to set up content from other Jframe class(from its Jpanel) to this (menubar content page) thus
     * menubar window will display components of another page by switching content in jpanel 
     * @param PageTopicContent - panel from another page from which you want to display the content
     */
    public void setPageTopicContent(JPanel PageTopicContent) {
        this.PageTopicContent.removeAll();
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
        this.PageTopicContent.add(PageTopicContent);
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
    }
    
    /** by Aisana (w1775375)
     * Method specifically to set up Profile page (to add dlgHistButton to menubarV and make it available to menubar controller)
     * used to set up content from other Jframe class(from its Jpanel) to this (menubar content page) thus
     * menubar window will display components of another page by switching content in jpanel 
     * @param PageTopicContent - panel from another page from which you want to display the content
     */
    public void setProgPageTopicContent(JPanel PageTopicContent) {
        this.PageTopicContent.removeAll(); 
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
        this.PageTopicContent.add(PageTopicContent);
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
        DlgHistBttn2.setBounds(137, 400, 150, 40);
        PageTopicContent.add(DlgHistBttn2);
        PageTopicContent.revalidate();
        PageTopicContent.repaint();
    }

    
    public void setDlgListBttn(JButton DlgListBttn) {
        this.DlgListBttn = DlgListBttn;
    }


    public void setProVBttn(JButton ProVBttn) {
        this.ProVBttn = ProVBttn;
    }

    public void setSettBttn(JButton SettBttn) {
        this.SettBttn = SettBttn;
    }

    public void setSupportBttn(JButton SupportBttn) {
        this.SupportBttn = SupportBttn;
    }

    public void setUListBttn(JButton UListBttn) {
        this.UListBttn = UListBttn;
    }
    
    public JButton getDlgListBttn() { 
        return DlgListBttn; 
          
    }

    public JLabel getPageTitle() {
        return PageTitle;
    }

    public JPanel getPageTopicContent() {
        return PageTopicContent;
    }

    public JButton getProVBttn() {
        return ProVBttn;
    }

    public JButton getSettBttn() {
        return SettBttn;
    }

    public JButton getSupportBttn() {
        return SupportBttn;
    }

    public JButton getUListBttn() { 
        return UListBttn; 
          
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public JButton getDlgHistBttn2() {
        return DlgHistBttn2;
    }

    public JPanel getMenuBarPanel() {
        return MenuBarPanel;
    }
    
   

}

/* Note about menu bar buttons: instead of buttons we use labels(from swing). The icons will be added to them via code in menuBar controller

Note: may be issue about frame size that need our attention in the future.

[from Aisana]

*/


