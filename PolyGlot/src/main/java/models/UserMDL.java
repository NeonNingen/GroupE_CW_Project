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
    
    private String applang;
    private int progressPoint;
    private int langID;
    
    public UserMDL() 
    {
        
    }
    
    public UserMDL(String name, String surname, String email, String langLvl, int progPoints, String userType, String userID, String groupID, String applang) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.langLvl = langLvl;
        this.progPoints = progPoints;
        this.userType = userType;
        this.userID = userID;
        this.groupID = groupID;
        this.applang = applang;
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
    public void insertRegDets(String userID, String name, String surname, String email, String groupID, String pswd){
      //  Connection con = getConnection();
        String userType = "Student";
        String adminAccess = "denied";
        String lang_lvl = "A1";
        int progressPnt = 0;
        insertTable(userID ,name, surname, email, pswd, lang_lvl ,progressPnt,userType, adminAccess , groupID);
       
    }
    
    
    //This allows the user to put thrit choice of language in the database
    public void chooseLangdb(String user_id, String langChoice) {
        String SQLlangID = "SELECT langID, langName, progressPoint FROM LangProcess WHERE langName='" + langChoice + "' AND user_id='" + user_id + "';";
        ArrayList<String> sqlResult = queryData(SQLlangID);
        if (sqlResult.size() == 1) {
            System.out.println("Language choosen on the database. ");
            this.langID = Integer.parseInt(sqlResult.get(0));
            this.applang = sqlResult.get(1);
            this.progPoints = Integer.parseInt(sqlResult.get(2));
            //updateUserLang(user_id,langChoice);
        } else if (sqlResult.isEmpty()) {
            //INSERT new record of user and its choosen language if a record of it doesnt exists already
            String sqlInput = "INSERT INTO LangProcess(langName, progressPoint, user_id) "
                    + "VALUES ('"+langChoice+"',0,'"+user_id+"')";
            updateTable(sqlInput);
            System.out.println("New record is created for the language choosen option. ");
            
            ArrayList<String> sqlResult2 = queryData(SQLlangID);
            this.langID = Integer.parseInt(sqlResult2.get(0));
            this.applang = sqlResult2.get(1);
            this.progPoints = Integer.parseInt(sqlResult2.get(2));
            
        }
        updateUserLang(user_id,langChoice);
    }
    
    //Update user table. Set their current language to their choosen language
    private void updateUserLang(String user_id, String langChoice){
        String sqlInput = "UPDATE User SET current_Lang='"+langChoice+"' WHERE user_id = '"+user_id+"';"; 
        updateTable(sqlInput);
    }
    
    //Creates records for all the specific language for a user in the LangProcess table
    public void createLangData(String user_id, ArrayList<String> langList) {
        for (int i = 0; i < langList.size(); i++) {
            String sqlInput = "INSERT INTO LangProcess(langName, progressPoint, user_id) "
                    + "VALUES ('"+langList.get(i)+"',0,'"+user_id+"')";
            updateTable(sqlInput);
            System.out.println("New record is created for all the language available in this application. ");   
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

    public String getApplang() {
        return applang;
    }

    public void setApplang(String applang) {
        this.applang = applang;
    }
    
    
}
