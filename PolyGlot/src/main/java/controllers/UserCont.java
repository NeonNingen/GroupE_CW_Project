/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.UserMDL;
import views.MenuBarV;
import views.UListStdV;
import views.UListTchV;
import views.ProgV;

/**
 *
 * @author New User
 */
public class UserCont implements ActionListener
{
    private UListStdV uListStudentPage;
    private UListTchV uListTeacherPage;
    private ProgV profilePage;
    private MenuBarV menuBar;
    private UserMDL user = new UserMDL();
    
    public UserCont(ProgV page)
    {//), MenuBarV menu){
        this.profilePage=page;
        
        //this.menuBar=menu;
    }

    public UserCont(UListTchV UserListTeacherPage) 
    {
        this.uListTeacherPage = UserListTeacherPage;
        fillTable();
        fillCombo();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {   
        String query;
        if(e.getSource()== uListTeacherPage.getGroupFilterCbox())
        {
            JComboBox sortCombo = uListTeacherPage.getGroupFilterCbox();
            
            if(sortCombo.getSelectedItem().equals("w123"))
            {
                ArrayList<ArrayList<String>> test = user.queryDataUList("SELECT user_lang_lvl, user_id, user_name, user_pass FROM User WHERE user_type = 'Student' AND user_group_id = 'w123'");
                String[] columnNames = {"Lvl", "Student ID", "Student Name", "Dialogues Done"};

                //https://stackoverflow.com/questions/26726366/convert-nested-list-to-2d-array
                String[][] data2 = test.stream().map(l -> l.stream().toArray(String[]::new)).toArray(String[][]::new);

                DefaultTableModel td = new DefaultTableModel(data2, columnNames) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }

                };
                uListTeacherPage.getTblofStd().setModel(td);
            }
        }
       
        
        /*if(e.getSource() == profilePage.getDlgHistBtn()){
            profilePage.dispose();
            MenuBarV menu= new MenuBarV();
            menu.setPageTitle("Dialogeu History");
            menu.setPageTopicContent(new DlgHistV().getDlgHistConent());
            menu.show();
            menu.setPageTitle("Dialogue History");
            
        }*/
      /*
        after checking both UserList Pages, I noticed that the code written below won't be needed 
        as the 'linking' part is done by the MenuBarController
        
        [Amit]
      */
        
        
        /*if(e.getSource() == uListStudentPage.getUserListBttn())
       
        {
            uListStudentPage.dispose();
            new UListStdV().show();
        }
        
        if(e.getSource() == uListTeacherPage.getUserListBttn())
        {
            uListTeacherPage.dispose();
            new UListTchV().show();
        }*/
        
        
    }
    
    public void fillTable()
    {
        user.getConnection();
        ArrayList<ArrayList<String>> test = user.queryDataUList("SELECT user_lang_lvl, user_id, user_name, user_pass FROM User WHERE user_type = 'Student'");
        //ArrayList<ArrayList<String>> test2 = user.queryDataUList("SELECT COUNT(dialogue_id) FROM Dialogue D JOIN User U ON D.user_id = U.user_id" );
       
        String[] columnNames = {"Lvl", "Student ID", "Student Name", "Dialogues Done"};
        
        //https://stackoverflow.com/questions/26726366/convert-nested-list-to-2d-array
        String[][] data2 = test.stream().map(l -> l.stream().toArray(String[]::new)).toArray(String[][]::new);
        
//        String[][] data = 
//        {
//            {test.get(0).get(0), test.get(0).get(1), test.get(0).get(2), test.get(0).get(3)},
//            {test.get(1).get(0), test.get(1).get(1), test.get(1).get(2), test.get(1).get(3)},
//            {test.get(2).get(0), test.get(2).get(1), test.get(2).get(2), test.get(2).get(3)},
//            
//        };
        
        DefaultTableModel td = new DefaultTableModel(data2, columnNames)
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                    
        };
        uListTeacherPage.getTblofStd().setModel(td);
    }

    public void fillCombo()
    {
        String query;
        
        query = "SELECT DISTINCT user_group_id FROM User";
        user.getConnection();
        ArrayList<ArrayList<String>> test = user.queryDataUList(query);
        
        DefaultComboBoxModel groupMod;
        
        groupMod = new DefaultComboBoxModel();
        for (int i = 0; i < test.size(); i++) 
        {
            ArrayList<String> haha = test.get(i);
            
            for (int j = 0; j < haha.size(); j++) {
                groupMod.addElement(haha.get(j));
            }
            
        }
        uListTeacherPage.getGroupFilterCbox().setModel(groupMod);
        
        query = "SELECT DISTINCT user_lang_lvl FROM User";
        user.getConnection();
        test = user.queryDataUList(query);
        
        groupMod = new DefaultComboBoxModel();
        for (int i = 0; i < test.size(); i++) 
        {
            ArrayList<String> haha = test.get(i);
            
            for (int j = 0; j < haha.size(); j++) {
                groupMod.addElement(haha.get(j));
            }
            
        }
        uListTeacherPage.getULvlFilterCbox().setModel(groupMod);
        
        //UListTeacherPage.getGroupFilterCbox().setModel();
    }
    
}