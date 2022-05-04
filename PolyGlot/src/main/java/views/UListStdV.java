/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.UserMDL;

/**
 *
 * @author Joshua
 */
public class UListStdV extends javax.swing.JFrame {

    //Creates new form UListStdV   
    
    private UserMDL user;
    
    public UListStdV(UserMDL user) {
        this.user = user;
        initComponents();
        groupDisplay.setText(user.getGroupID());
        textTeacher();
        
        setSize(414,667);
        MenuBarV menu = new MenuBarV();
        this.setContentPane(menu.getContentPane());
        menu.setPageTitle("User List");
        menu.setPageTopicContent(userListContent);
        fillTable();
    }

    private UListStdV() {        
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userListContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblofStd = new javax.swing.JTable();
        groupIdLbl = new javax.swing.JLabel();
        groupTeach = new javax.swing.JLabel();
        groupDisplay = new javax.swing.JLabel();
        teacherDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userListContent.setBackground(new java.awt.Color(255, 255, 255));
        userListContent.setMinimumSize(new java.awt.Dimension(414, 550));
        userListContent.setPreferredSize(new java.awt.Dimension(414, 550));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        TblofStd.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TblofStd.setForeground(new java.awt.Color(135, 178, 240));
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
        TblofStd.setRowMargin(2);
        TblofStd.setSelectionBackground(new java.awt.Color(135, 178, 240));
        TblofStd.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TblofStd);
        TblofStd.getTableHeader().setForeground(new Color(255, 255, 255));
        TblofStd.getTableHeader().setBackground(new Color(135, 178, 240));

        groupIdLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        groupIdLbl.setForeground(new java.awt.Color(135, 178, 240));
        groupIdLbl.setText("Group ID:");

        groupTeach.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        groupTeach.setForeground(new java.awt.Color(135, 178, 240));
        groupTeach.setText("Teacher:");

        groupDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        groupDisplay.setForeground(new java.awt.Color(135, 178, 240));

        teacherDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        teacherDisplay.setForeground(new java.awt.Color(135, 178, 240));

        javax.swing.GroupLayout userListContentLayout = new javax.swing.GroupLayout(userListContent);
        userListContent.setLayout(userListContentLayout);
        userListContentLayout.setHorizontalGroup(
            userListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userListContentLayout.createSequentialGroup()
                .addGroup(userListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userListContentLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(userListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupIdLbl)
                            .addComponent(groupTeach))
                        .addGap(18, 18, 18)
                        .addGroup(userListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(groupDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(teacherDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(userListContentLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        userListContentLayout.setVerticalGroup(
            userListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userListContentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(userListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupIdLbl)
                    .addComponent(groupDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userListContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(groupTeach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userListContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //getters and setters
    public JLabel getGroupDisplay() {
        return groupDisplay;
    }

    public JLabel getTeacherDisplay() {
        return teacherDisplay;
    }

    public void setGroupDisplay(JLabel groupDisplay) {
        this.groupDisplay = groupDisplay;
    }

    public void setTeacherDisplay(JLabel teacherDisplay) {
        this.teacherDisplay = teacherDisplay;
    }

    public JTable getTblofStd() {
        return TblofStd;
    }

    public void setTblofStd(JTable TblofStd) {
        this.TblofStd = TblofStd;
    }

    public JPanel getUListContent() {
        return userListContent;
    }

    public void setUListContent(JPanel UListContent) {
        this.userListContent = UListContent;
    }
    
    /**
     * @param args the command line arguments
     */
    
    //reused and modified code from UListTchV    
    public void fillTable()
    {
        UserMDL.getConnection();
        ArrayList<String> resultQuery = UserMDL.queryData("SELECT user_name, user_sname FROM User WHERE user_type = 'Student' AND user_group_id = '" + user.getGroupID() + "'");
        
       
        String[] stdName = {"Student First Name", "Student Surname"};
        int row = resultQuery.size()/stdName.length;
        String[][] data = new String[row][stdName.length];
        
        int count = 0;
        for (int i = 0; i < data.length; i++) 
        {
            for (int j = 0; j < stdName.length; j++) 
            {
                data[i][j] = resultQuery.get(count);
                count++;
            }
            
        }
        
        DefaultTableModel td = new DefaultTableModel(data, stdName)
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                    
        };
        getTblofStd().setModel(td);
    }
    
    //sets teacher name 
    public void textTeacher() {
       UserMDL.getConnection();
       ArrayList<String> query = UserMDL.queryData("SELECT user_name, user_sname FROM User WHERE user_type = 'Teacher' AND user_group_id = '" + user.getGroupID() + "'");
       String s = query.toString().replaceAll("(^\\[|\\]$)", "");
       if (s.isEmpty()) {
           teacherDisplay.setText("No teacher assigned");
       } else 
       teacherDisplay.setText(s);
    }


    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblofStd;
    private javax.swing.JLabel groupDisplay;
    private javax.swing.JLabel groupIdLbl;
    private javax.swing.JLabel groupTeach;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel teacherDisplay;
    private javax.swing.JPanel userListContent;
    // End of variables declaration//GEN-END:variables

   
    
}