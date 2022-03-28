/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewpagesV4;

import controllers.MenuBarController;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuBarView extends javax.swing.JFrame {
    String currentPage;
    /**
     * Creates new form MenuBar
     */
    public MenuBarView() {
        initComponents();
        setSize(414,667);
        UListBttn.addActionListener(new MenuBarController(this));
        ProVBttn.addActionListener(new MenuBarController(this));
        SupportBttn.addActionListener(new MenuBarController(this));
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

        emptyContentPage = new javax.swing.JPanel();
        MenuBarPanel = new javax.swing.JPanel();
        PageTitle = new javax.swing.JLabel();
        PageTopicContent = new javax.swing.JPanel();
        UListBttn = new javax.swing.JButton();
        SettBttn = new javax.swing.JButton();
        ProVBttn = new javax.swing.JButton();
        DlgListBttn = new javax.swing.JButton();
        SupportBttn = new javax.swing.JButton();

        emptyContentPage.setPreferredSize(new java.awt.Dimension(414, 515));

        javax.swing.GroupLayout emptyContentPageLayout = new javax.swing.GroupLayout(emptyContentPage);
        emptyContentPage.setLayout(emptyContentPageLayout);
        emptyContentPageLayout.setHorizontalGroup(
            emptyContentPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        emptyContentPageLayout.setVerticalGroup(
            emptyContentPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        MenuBarPanel.setBackground(new java.awt.Color(153, 153, 153));
        MenuBarPanel.setPreferredSize(new java.awt.Dimension(414, 667));

        PageTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        PageTitle.setText("Page Title");

        PageTopicContent.setBackground(new java.awt.Color(255, 255, 255));
        PageTopicContent.setPreferredSize(new java.awt.Dimension(414, 515));

        javax.swing.GroupLayout PageTopicContentLayout = new javax.swing.GroupLayout(PageTopicContent);
        PageTopicContent.setLayout(PageTopicContentLayout);
        PageTopicContentLayout.setHorizontalGroup(
            PageTopicContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        PageTopicContentLayout.setVerticalGroup(
            PageTopicContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        UListBttn.setBackground(new java.awt.Color(204, 204, 204));
        UListBttn.setText("User List");
        UListBttn.setBorder(null);
        UListBttn.setPreferredSize(new java.awt.Dimension(90, 90));

        SettBttn.setBackground(new java.awt.Color(204, 204, 204));
        SettBttn.setText("Settings");
        SettBttn.setBorder(null);
        SettBttn.setPreferredSize(new java.awt.Dimension(90, 90));

        ProVBttn.setBackground(new java.awt.Color(204, 204, 204));
        ProVBttn.setText("Profile View");
        ProVBttn.setBorder(null);
        ProVBttn.setPreferredSize(new java.awt.Dimension(90, 90));

        DlgListBttn.setBackground(new java.awt.Color(204, 204, 204));
        DlgListBttn.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        DlgListBttn.setText("Dialogue List");
        DlgListBttn.setBorder(null);
        DlgListBttn.setPreferredSize(new java.awt.Dimension(90, 90));

        SupportBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        SupportBttn.setText("Help");
        SupportBttn.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout MenuBarPanelLayout = new javax.swing.GroupLayout(MenuBarPanel);
        MenuBarPanel.setLayout(MenuBarPanelLayout);
        MenuBarPanelLayout.setHorizontalGroup(
            MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PageTopicContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuBarPanelLayout.createSequentialGroup()
                        .addComponent(ProVBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(DlgListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SettBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PageTitle)
                        .addGap(126, 126, 126)
                        .addComponent(SupportBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MenuBarPanelLayout.setVerticalGroup(
            MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PageTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SupportBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PageTopicContent, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DlgListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UListBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SettBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProVBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuBarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DlgListBttn;
    private javax.swing.JPanel MenuBarPanel;
    private javax.swing.JLabel PageTitle;
    private javax.swing.JPanel PageTopicContent;
    private javax.swing.JButton ProVBttn;
    private javax.swing.JButton SettBttn;
    private javax.swing.JButton SupportBttn;
    private javax.swing.JButton UListBttn;
    private javax.swing.JPanel emptyContentPage;
    // End of variables declaration//GEN-END:variables

    public void setPageTitle(String text) {
        this.PageTitle.setText(text);
                //= PageTitle;
    }

  
    public void setPageTopicContent(JPanel PageTopicContent) {
        this.PageTopicContent.removeAll();
        this.PageTopicContent.revalidate();
        this.PageTopicContent.repaint();
        this.PageTopicContent.add(PageTopicContent);
        
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
    
    
    

    


}

/* Note about menu bar buttons: instead of buttons weuse labels(from swing). The icons can be added there in one quick step.
for now we leave labels without icons but with text fro distinguishment(plus all labeles' nnames were adjusted for clarity)
Icons would need some design fix before implementing them, which we will do at the end.

Note: may be issue about frame size that need our attention in the future.

[from Aisana]

*/
