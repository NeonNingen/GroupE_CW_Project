/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.UserMDL;
import views.DlgHistV;
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
    private UserMDL user = new UserMDL();
    
    public UserCont(ProgV page)
    {
        this.profilePage=page;
    }

    public UserCont(UListTchV UserListTeacherPage) 
    {
        this.uListTeacherPage = UserListTeacherPage;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {   
        String selectedItem;
        if(e.getSource()== uListTeacherPage.getGroupFilterCbox())
        {
            selectedItem = (String) uListTeacherPage.getGroupFilterCbox().getSelectedItem();
            sortTableByFilter("user_group_id", selectedItem);
        }
        
        if(e.getSource() == uListTeacherPage.getULvlFilterCbox())
        {
            selectedItem = (String) uListTeacherPage.getULvlFilterCbox().getSelectedItem();
            sortTableByFilter("user_lang_lvl", selectedItem);
        }
        
        if(e.getSource() == uListTeacherPage.getSortCbox())
        {
            selectedItem = (String) uListTeacherPage.getSortCbox().getSelectedItem();
            if(selectedItem.contains("points"))
            {
                sortTableByPoints("user_progresspoints", selectedItem);
            }
            else
                sortTableByPoints("totDlg", selectedItem);            
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
        
        
    //}

    }
    
    private void sortTableByFilter(String column, String selectedItem) 
    {
        String query;
        if(selectedItem.contains("Select"))
        {
            query = "SELECT user_lang_lvl, user_id, user_name, user_progresspoints FROM User "
               + "WHERE user_type = 'Student'";
        }
        else
        {
            query = "SELECT user_lang_lvl, user_id, user_name, user_progresspoints FROM User "
               + "WHERE user_type = 'Student' AND " + column + " = '"+ selectedItem + "'";
        }
        
        user.getConnection();
        ArrayList<String> result = user.queryData(query);
        
        String[] columnNames = {"Lvl", "Student ID", "Student Name", /*"Dialogues Done",*/ "Points"};
        int row = result.size()/columnNames.length;
        String[][] data = new String[row][columnNames.length];
        
        int count = 0;
        for (int i = 0; i < data.length; i++) 
        {
            for (int j = 0; j < columnNames.length; j++) 
            {
                data[i][j] = result.get(count);
                count++;
            }
            
        }
        
        DefaultTableModel tableMod = new DefaultTableModel(data, columnNames)
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                    
        };
        uListTeacherPage.getTblofStd().setModel(tableMod);
        
    }

    private void sortTableByPoints(String column, String selectedItem) 
    {
        String query;
        
        if(selectedItem.contains("lowest"))
        {
            query = "SELECT user_lang_lvl, user_id, user_name, user_progresspoints FROM User "
               + "WHERE user_type = 'Student' ORDER BY " + column;
        }
        else
            query = "SELECT user_lang_lvl, user_id, user_name, user_progresspoints FROM User "
               + "WHERE user_type = 'Student' ORDER BY " + column + " DESC";
        
        user.getConnection();
        ArrayList<String> result = user.queryData(query);
        
        String[] columnNames = {"Lvl", "Student ID", "Student Name", /*"Dialogues Done,*/ "points"};
        int row = result.size()/columnNames.length;
        String[][] data = new String[row][columnNames.length];
        
        int count = 0;
        for (int i = 0; i < data.length; i++) 
        {
            for (int j = 0; j < columnNames.length; j++) 
            {
                data[i][j] = result.get(count);
                count++;
            }
            
        }
        
        DefaultTableModel tableMod = new DefaultTableModel(data, columnNames)
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                    
        };
        uListTeacherPage.getTblofStd().setModel(tableMod);
    }

    
}