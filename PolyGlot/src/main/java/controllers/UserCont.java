
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.UserMDL;
import views.UListStdV;
import views.UListTchV;
import views.ProgV;

public class UserCont implements ActionListener
{
    private UListStdV uListStudentPage;
    private UListTchV uListTeacherPage;
    private UserMDL user;
    private ProgV profilePage;
    ArrayList <UserMDL> userList = new ArrayList <UserMDL>();
    
    
    public UserCont()
    {
        
    }
    public UserCont(ProgV page)
    {
        this.profilePage=page;
    }

    public UserCont(UListTchV UserListTeacherPage) 
    {
        this.uListTeacherPage = UserListTeacherPage;
    }
    
    
    /**
     * Suggested by Aisana (as addition to menubar)
     * method would need to collect user list and store them into table for student list
     * @param ulistStd
     * @param userMDL 
     */
    public void setUserList(UListStdV ulistStd,UserMDL userMDL ){
        this.uListStudentPage=ulistStd;
        
        
        
    }
    
    /**
     * Suggested by Aisana (as addition to menubar)
     * method would need to collect user list and store them into table for teacher list
     * @param UListTchV
     * @param userMDL 
     */
    public void setUserList(UListTchV ulistTch, UserMDL userMDL ){
        this.uListTeacherPage=ulistTch;
        this.user=userMDL;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {   
        if(e.getSource()== uListTeacherPage.getGroupFilterCbox())
        {
            updateTeacherTable();
        }
        
        if(e.getSource() == uListTeacherPage.getULvlFilterCbox())
        {
            updateTeacherTable();
        }
        
        if(e.getSource() == uListTeacherPage.getSortCbox())
        {
            updateTeacherTable();          
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
    
    /**
     * this method calls other method to update the data in the current table
     */
    private void updateTeacherTable() 
    {
       String selectedItemGroup;
       String selectedItemLvl;
       String selectedItemSort;
        
       String query;
       
       selectedItemGroup = (String) uListTeacherPage.getGroupFilterCbox().getSelectedItem();
       selectedItemLvl = (String) uListTeacherPage.getULvlFilterCbox().getSelectedItem();
       selectedItemSort = (String) uListTeacherPage.getSortCbox().getSelectedItem();
            
       query = selectQuery(selectedItemGroup, selectedItemLvl);
       query = query.concat(completeQuery(selectedItemSort)); 
            
       sortTableByFilter(query);
    }
    
    /**
     * shows the table's data based on the criteria selected by the user
     * @param query the sql query that will be run to sort the table
     */
    private void sortTableByFilter(String query)
    {
        user.getConnection();
        ArrayList<String> result = user.queryData(query);
        
        //System.out.println(result.toString());
        
        String[] columnNames = {"Lvl", "Student ID", "Student Name", "Group ID", "Points"};
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
    
    /**
     * checks if the group filter or the level filter have default values
     * @param selectedItem the combobox value to check
     * @return true if the current value is default
     */
    private Boolean comboSelect(String selectedItem) 
    {
        if(selectedItem.contains("Select"))
        {
            return true;
        }
        else
            return false;
    }

    /**
     * returns a query depending if both, none or one of the combo boxes, used in the comboSelect method,
     * have a default value
     * @param selectedItemGroup current group item selected
     * @param selectedItemLvl current level item selected
     * @return a query
     */
    private String selectQuery(String selectedItemGroup, String selectedItemLvl) 
    {
        Boolean itemG = comboSelect(selectedItemGroup);
        Boolean itemLvl = comboSelect(selectedItemLvl);
        
        if( (itemG == true) && (itemLvl == true))
        {
            return "SELECT user_lang_lvl, user_id, user_name, user_group_id, user_progresspoints FROM User"
                    + " WHERE user_type = 'Student'";
        }
        else
        {
            if(itemG == true)
            {
                return "SELECT user_lang_lvl, user_id, user_name, user_group_id, user_progresspoints FROM User"
                        + " WHERE user_type = 'Student' "
                        + " AND user_lang_lvl = '" + selectedItemLvl + "'";
            }
            else
                if(itemLvl == true)
                {
                   return "SELECT user_lang_lvl, user_id, user_name, user_group_id, user_progresspoints FROM User"
                        + " WHERE user_type = 'Student'"
                        + " AND user_group_id = '" + selectedItemGroup + "'";
                }
                else
                {
                    return "SELECT user_lang_lvl, user_id, user_name, user_group_id, user_progresspoints FROM User"
                        + " WHERE user_type = 'Student'"
                        + " AND user_group_id = '" + selectedItemGroup + "'"
                        + " AND user_lang_lvl = '" + selectedItemLvl + "'";
                }
            
        }
        
        
    }

    /**
     * adds a line to the query that will be used to sort the tables
     * @param selectedItemSort current order item selected
     * @return a query
     */
    private String completeQuery(String selectedItemSort) 
    {
        String query="";
        
        switch(selectedItemSort)
        {
            case "Select points":
                query = "";
                break;
                    
            case "points (lowest)":
                query = " ORDER BY user_progresspoints";
                break;
            
            case "points (highest)":
                query = " ORDER BY user_progresspoints DESC";
                break;
        }
        
        
        return query;
    }

}