/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewpages;

/**
 *
 * @author aisana: w1775375
 */
public class UserListStd extends javax.swing.JFrame {

    /**
     * Creates new form MenuBar
     */
    public UserListStd() {
        initComponents();
        setSize(414,667);
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

        MenuBarPanel = new javax.swing.JPanel();
        ProfVPnlBttn = new javax.swing.JLabel();
        UListVPnlBttn = new javax.swing.JLabel();
        SettVPnlBttn = new javax.swing.JLabel();
        DlgListVPnlBttn = new javax.swing.JLabel();
        SupportIconPnlBttn = new javax.swing.JLabel();
        PageTitle = new javax.swing.JLabel();
        MainPage_UListStd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblofStd = new javax.swing.JTable();
        GroupIdLbl = new javax.swing.JLabel();
        GroupTeach = new javax.swing.JLabel();
        GroupTeach1 = new javax.swing.JLabel();
        GroupIdLbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        MenuBarPanel.setBackground(new java.awt.Color(153, 153, 153));
        MenuBarPanel.setPreferredSize(new java.awt.Dimension(414, 667));

        ProfVPnlBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        ProfVPnlBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProfVPnlBttn.setLabelFor(MainPage_UListStd);
        ProfVPnlBttn.setText("Profile View");
        ProfVPnlBttn.setToolTipText("");
        ProfVPnlBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProfVPnlBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProfVPnlBttn.setMaximumSize(new java.awt.Dimension(90, 90));
        ProfVPnlBttn.setMinimumSize(new java.awt.Dimension(90, 90));
        ProfVPnlBttn.setPreferredSize(new java.awt.Dimension(90, 90));

        UListVPnlBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        UListVPnlBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UListVPnlBttn.setLabelFor(MainPage_UListStd);
        UListVPnlBttn.setText("User List");
        UListVPnlBttn.setToolTipText("");
        UListVPnlBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UListVPnlBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UListVPnlBttn.setIconTextGap(0);
        UListVPnlBttn.setMaximumSize(new java.awt.Dimension(90, 90));

        SettVPnlBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        SettVPnlBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SettVPnlBttn.setLabelFor(MainPage_UListStd);
        SettVPnlBttn.setText("Settings");
        SettVPnlBttn.setToolTipText("");
        SettVPnlBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SettVPnlBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SettVPnlBttn.setMaximumSize(new java.awt.Dimension(90, 90));

        DlgListVPnlBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        DlgListVPnlBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DlgListVPnlBttn.setLabelFor(MainPage_UListStd);
        DlgListVPnlBttn.setText("Dialogue List");
        DlgListVPnlBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DlgListVPnlBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DlgListVPnlBttn.setMaximumSize(new java.awt.Dimension(90, 90));

        SupportIconPnlBttn.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        SupportIconPnlBttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupportIconPnlBttn.setLabelFor(MainPage_UListStd);
        SupportIconPnlBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SupportIconPnlBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SupportIconPnlBttn.setRequestFocusEnabled(false);

        PageTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        PageTitle.setText("UserList");

        MainPage_UListStd.setBackground(new java.awt.Color(255, 255, 255));
        MainPage_UListStd.setPreferredSize(new java.awt.Dimension(414, 515));

        TblofStd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Student Names"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblofStd);
        if (TblofStd.getColumnModel().getColumnCount() > 0) {
            TblofStd.getColumnModel().getColumn(0).setResizable(false);
        }

        GroupIdLbl.setText("GroupID:");

        GroupTeach.setText("Teacher:");

        GroupTeach1.setText("Mr Pumpkin");

        GroupIdLbl1.setText("group102");

        javax.swing.GroupLayout MainPage_UListStdLayout = new javax.swing.GroupLayout(MainPage_UListStd);
        MainPage_UListStd.setLayout(MainPage_UListStdLayout);
        MainPage_UListStdLayout.setHorizontalGroup(
            MainPage_UListStdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPage_UListStdLayout.createSequentialGroup()
                .addGroup(MainPage_UListStdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPage_UListStdLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPage_UListStdLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(MainPage_UListStdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GroupTeach)
                            .addComponent(GroupIdLbl))
                        .addGap(31, 31, 31)
                        .addGroup(MainPage_UListStdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GroupTeach1)
                            .addComponent(GroupIdLbl1))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        MainPage_UListStdLayout.setVerticalGroup(
            MainPage_UListStdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPage_UListStdLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MainPage_UListStdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPage_UListStdLayout.createSequentialGroup()
                        .addComponent(GroupIdLbl)
                        .addGap(18, 18, 18)
                        .addComponent(GroupTeach))
                    .addGroup(MainPage_UListStdLayout.createSequentialGroup()
                        .addComponent(GroupIdLbl1)
                        .addGap(18, 18, 18)
                        .addComponent(GroupTeach1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout MenuBarPanelLayout = new javax.swing.GroupLayout(MenuBarPanel);
        MenuBarPanel.setLayout(MenuBarPanelLayout);
        MenuBarPanelLayout.setHorizontalGroup(
            MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPage_UListStd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuBarPanelLayout.createSequentialGroup()
                        .addComponent(ProfVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UListVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DlgListVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SettVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PageTitle)
                        .addGap(126, 126, 126)
                        .addComponent(SupportIconPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        MenuBarPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DlgListVPnlBttn, ProfVPnlBttn, SettVPnlBttn, UListVPnlBttn});

        MenuBarPanelLayout.setVerticalGroup(
            MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SupportIconPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PageTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPage_UListStd, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProfVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UListVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DlgListVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SettVPnlBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(UserListStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserListStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserListStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserListStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserListStd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DlgListVPnlBttn;
    private javax.swing.JLabel GroupIdLbl;
    private javax.swing.JLabel GroupIdLbl1;
    private javax.swing.JLabel GroupTeach;
    private javax.swing.JLabel GroupTeach1;
    private javax.swing.JPanel MainPage_UListStd;
    private javax.swing.JPanel MenuBarPanel;
    private javax.swing.JLabel PageTitle;
    private javax.swing.JLabel ProfVPnlBttn;
    private javax.swing.JLabel SettVPnlBttn;
    private javax.swing.JLabel SupportIconPnlBttn;
    private javax.swing.JTable TblofStd;
    private javax.swing.JLabel UListVPnlBttn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/* Note about menu bar buttons: instead of buttons weuse labels(from swing). The icons can be added there in one quick step.
for now we leave labels without icons but with text fro distinguishment(plus all labeles' nnames were adjusted for clarity)
Icons would need some design fix before implementing them, which we will do at the end.

Note: may be issue about frame size that need our attention in the future.

[from Aisana]

*/
