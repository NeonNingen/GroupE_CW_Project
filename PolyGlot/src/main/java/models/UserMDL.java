/*
Contains all database methods
 */
package models;

import java.util.ArrayList;


public class UserMDL extends DatabaseMDL
{
    //variables
    private String name;
    private String surname;
    private String email;
    private String langLvl;
    private int progPoints;
    private String userType;
    private String userID;
    private String groupID;
    
    public UserMDL() 
    {
        
    }
    
    public UserMDL(String userID, String name, String surname, String email, String groupID) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.groupID = groupID;
    }

    public UserMDL(String userID, String name, String surname, String email, String groupID, String userType) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.userType = userType;
        this.userID = userID;
        this.groupID = groupID;
    }
    
    
    
    //Insert user details when registering into the database
    public void insertRegDetss(String userID, String name, String surname, String email, String groupID, String pswd){
      //  Connection con = getConnection();
        String userType = "Student";
        String adminAccess = "denied";
        String lang_lvl = "null";
        int progressPnt = 0;
        insertTable(userID ,name, surname, email, pswd, lang_lvl ,progressPnt,userType, adminAccess , groupID);
       
    }
    
    
    //This allows the user to put thrit choice of language in the database
    public void updateLangdb(String user_id, String langChoice) {
        String SQLlangID = "SELECT langID FROM LangProcess WHERE langName='" + langChoice + "' AND user_id='" + user_id + "';";
        ArrayList<String> language = queryData(SQLlangID);
        if (language.size() == 1) {
            System.out.println("Language choosen on the database. ");
        } else if (language.isEmpty()) {
            //INSERT new record of user and its choosen language if a record of it doesnt exists already
            String sqlInput = "INSERT INTO LangProcess(langName, progressPoint, user_id) "
                    + "VALUES ('"+langChoice+"',0,'"+user_id+"')";
            updateTable(sqlInput);
            System.out.println("New record is created for the language choosen option. ");
        }
    }
    
    //getters
    public String getName() 
    {
        return name;
    }

    public String getSurname() 
    {
        return surname;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getLangLvl() {
        return langLvl;
    }

    public int getProgPoints() {
        return progPoints;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserID() {
        return userID;
    }

    public String getGroupID() {
        return groupID;
    }

    //setters
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setSurname(String surname) 
    {
        this.surname = surname;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public void setLangLvl(String langLvl) {
        this.langLvl = langLvl;
    }

    public void setProgPoints(int progPoints) {
        this.progPoints = progPoints;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    } 
    
}
