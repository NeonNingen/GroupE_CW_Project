/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.MenuBarCont;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuBarV extends javax.swing.JFrame {
    String currentPage;
    private MenuBarCont menuC;
    ArrayList <Icon> icons= new ArrayList<Icon>(); 
     //0-profile, 1-userlist, 2-dlgList, 3- settings, 4- support
    ArrayList <Icon> selIc= new ArrayList<Icon>();
     //0-profile, 1-userlist, 2-dlgList, 3- settings
    
    
    /**
     * Creates new form MenuBar
     */
    public MenuBarV() 
    {
        initComponents();
        setSize(414,667);
        setDesign();
        //setIcons();
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
        
        //added and modified by Amit
        menuC.setPage(this);
        
        setDesign();
        //setIcons();
        UListBttn.addActionListener(menuC);
        ProVBttn.addActionListener(menuC);
        SupportBttn.addActionListener(menuC);
        DlgListBttn.addActionListener(menuC);
        SettBttn.addActionListener(menuC);
        DlgHistBttn2.addActionListener(menuC);
    }

    
    public void setDesign(){
        MenuBarPanel.setBackground(new java.awt.Color(135, 170, 240));
        PageTitle.setFont(new java.awt.Font("Avenir Next", 1, 18));
        icons=getIconsList();
        selIc= getIconsListB();
        setIcons(ProVBttn.getText());
        setIcons(UListBttn.getText());
        setIcons(DlgListBttn.getText());
        setIcons(SettBttn.getText());
        setIcons(SupportBttn.getText());
    }
    
    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
    
    public void updateIcon(JButton bttn){
        
    }
    
    public void setIcons(String bttnName){
        String path;
        
        if(bttnName.contains("Profile")){
            ProVBttn.setBackground(new java.awt.Color(135, 170, 240));
            ProVBttn.setText(" ");
            ProVBttn.setIcon(icons.get(0));
        }
        if(bttnName.contains("User")){
            //path= "/UListIcon.png";
            
            //if(UListBttn.isEnabled()==false){ //disables has to be bigger in size and change colour
            //    path= "/UListIconB.png";
                
            //}
            //Icon icon2 = createImageIcon(path,bttnName +"Icon");
            UListBttn.setBackground(new java.awt.Color(135, 170, 240));
            UListBttn.setText(" ");
            UListBttn.setIcon(icons.get(1));
            
        }
        if(bttnName.contains("Dialogue")){
            
            //path= "/DlgIcon.png";
            //if(UListBttn.isEnabled()==false){ //disables has to be bigger in size and change colour
             //   path= "/DlgIconB.png";
              //  System.out.println("Button dlg is disabled");
                
            //}
            //Icon icon1 = createImageIcon(path,bttnName +" Icon");
            DlgListBttn.setBackground(new java.awt.Color(135, 170, 240));
            DlgListBttn.setText(" ");
            DlgListBttn.setIcon(icons.get(2));
        }
        if(bttnName.contains("Setting")){
            //path= "/SttngIcon.png";
            //if(UListBttn.isEnabled()==false){ //disables has to be bigger in size and change colour
            //    path= "/SttngIconB.png";
                
            //}
            //Icon icon2 = createImageIcon(path,bttnName+" Icon");
            SettBttn.setBackground(new java.awt.Color(135, 170, 240));
            SettBttn.setText(" ");
            SettBttn.setIcon(icons.get(3));
        }
        
        if(bttnName.contains("Help")){
            path= "/SupIcon.png";
            SupportBttn.setBackground(new java.awt.Color(135, 170, 240));
            Icon icon2 = createImageIcon(path, bttnName + " Icon");
            SupportBttn.setText("");
            SupportBttn.setIcon(icons.get(4));
        }
        
    }
    
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
        UListBttn.setPreferredSize(new java.awt.Dimension(90, 90));
        UListBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SettBttn.setBackground(new java.awt.Color(51, 204, 255));
        SettBttn.setText("Settings");
        SettBttn.setBorder(null);
        SettBttn.setBorderPainted(false);
        SettBttn.setFocusPainted(false);
        SettBttn.setPreferredSize(new java.awt.Dimension(90, 90));
        SettBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SettBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettBttnActionPerformed(evt);
            }
        });

        ProVBttn.setBackground(new java.awt.Color(51, 204, 255));
        ProVBttn.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        ProVBttn.setText("Profile");
        ProVBttn.setBorderPainted(false);
        ProVBttn.setFocusPainted(false);
        ProVBttn.setPreferredSize(new java.awt.Dimension(90, 90));
        ProVBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        DlgListBttn.setBackground(new java.awt.Color(51, 204, 255));
        DlgListBttn.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        DlgListBttn.setText("Dialogue List");
        DlgListBttn.setBorder(null);
        DlgListBttn.setBorderPainted(false);
        DlgListBttn.setFocusPainted(false);
        DlgListBttn.setPreferredSize(new java.awt.Dimension(90, 90));
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
            .addComponent(PageTopicContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuBarPanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(ProVBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(UListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DlgListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(SettBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
                .addGroup(MenuBarPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PageTitle)
                    .addGap(110, 110, 110)
                    .addComponent(SupportBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ProVBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DlgListBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SettBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBarV().setVisible(true);
            }
        });
    }

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
                //= PageTitle;
    }

  
    public void setPageTopicContent(JPanel PageTopicContent) {
        this.PageTopicContent.removeAll(); //removes
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
        this.PageTopicContent.add(PageTopicContent);
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
                //= PageTopicContent; 
    }
    
    public void setProgPageTopicContent(JPanel PageTopicContent) {
        this.PageTopicContent.removeAll(); //removes
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
        this.PageTopicContent.add(PageTopicContent);
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
        DlgHistBttn2.setBounds(137, 400, 150, 40);
        //DlgHistBttn2.setLocation(100, 400);
        PageTopicContent.add(DlgHistBttn2);
        PageTopicContent.revalidate();
        PageTopicContent.repaint();
                //= PageTopicContent; 
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
    
    public ArrayList<Icon> getIconsList(){
            
        ArrayList<Icon> list= new ArrayList<Icon> ();
        String path= "/ProVIcon.png";
        Icon icon1 = createImageIcon(path,"Icon");
        list.add(icon1);

        path= "/UListIcon.png";
        icon1 = createImageIcon(path,"Icon");
        list.add(icon1);

        path= "/DlgIcon.png";
        icon1 = createImageIcon(path," Icon");
        list.add(icon1);


        path= "/SttngIcon.png";
        icon1 = createImageIcon(path," Icon");
        list.add(icon1);


        path= "/SupIcon.png";
        icon1 = createImageIcon(path, " Icon");
        list.add(icon1);

        return list;
    }
    
    public ArrayList<Icon> getIconsListB(){
            
        ArrayList<Icon> list= new ArrayList<Icon> ();
        String path= "/ProVIconB.png";
        Icon icon1 = createImageIcon(path,"Icon");
        list.add(icon1);

        path= "/UListIconB.png";
        icon1 = createImageIcon(path,"Icon");
        list.add(icon1);

        path= "/DlgIconB.png";
        icon1 = createImageIcon(path," Icon");
        list.add(icon1);


        path= "/SttngIconB.png";
        icon1 = createImageIcon(path," Icon");
        list.add(icon1);

        return list;
    }

}

/* Note about menu bar buttons: instead of buttons weuse labels(from swing). The icons can be added there in one quick step.
for now we leave labels without icons but with text fro distinguishment(plus all labeles' nnames were adjusted for clarity)
Icons would need some design fix before implementing them, which we will do at the end.

Note: may be issue about frame size that need our attention in the future.

[from Aisana]

*/


