package models;

import java.util.ArrayList;

public class UserMDL extends DatabaseMDL {

    //variables
    private String name;
    private String surname;
    private String email;
    private String langLvl;
    private String userType;
    private String userID;
    private String groupID;
    private String applang;
    private int progPoints;
    private int progressPoint;
    private int langID;

    //Constructors 
    public UserMDL() {

    }

    //@Rahat Haider Amit
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
    
    //Monesha
    public UserMDL(String userID, String name, String surname, String email, String groupID, String userType) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.userType = userType;
        this.userID = userID;
        this.groupID = groupID;
    }

    /**
     * @author: Monesha 
     * @Desc: Insert users details when registering into the database
     * 
     * @param userID: String - user own unique id
     * @param name: String - user name
     * @param surname: String - user surname 
     * @param email: String - user email
     * @param groupID: String - the group id that the user is assigned to 
     * @param pswd : String - user passwords 
     */
    public void insertRegDets(String userID, String name, String surname, String email, String groupID, String pswd) {
        String userType = "Student";
        String adminAccess = "denied";
        String lang_lvl = "A1";
        int progressPnt = 0;
        insertTable(userID, name, surname, email, pswd, lang_lvl, progressPnt, userType, adminAccess, groupID);
    }

    /**
     * @author: Monesha 
     * @Desc: This function allows the user to retrieve info from the database. The user also
     * selects their current choice of language in the database.
     * 
     * @param user_id
     * @param langChoice 
     */
    public void chooseLangdb(String user_id, String langChoice) {
        String SQLlangID = "SELECT langID, langName, progressPoint FROM LangProcess WHERE langName='" + langChoice + "' AND user_id='" + user_id + "';";
        ArrayList<String> sqlResult = queryData(SQLlangID);
        if (sqlResult.size() == 1) {
            System.out.println("Language choosen on the database. ");
            this.langID = Integer.parseInt(sqlResult.get(0));
            this.applang = sqlResult.get(1);
            this.progPoints = Integer.parseInt(sqlResult.get(2));
        } else if (sqlResult.isEmpty()) {
            String sqlInput = "INSERT INTO LangProcess(langName, progressPoint, user_id) "
                    + "VALUES ('" + langChoice + "',0,'" + user_id + "')";
            updateTable(sqlInput);

            ArrayList<String> sqlResult2 = queryData(SQLlangID);
            this.langID = Integer.parseInt(sqlResult2.get(0));
            this.applang = sqlResult2.get(1);
            this.progPoints = Integer.parseInt(sqlResult2.get(2));
        }
        updateUserLang(user_id, langChoice);
    }

    /**
     * @author: Monesha 
     * @Desc: Update user table. Set their current language to their chosen language
     * 
     * @param user_id
     * @param langChoice 
     */ 
    private void updateUserLang(String user_id, String langChoice) {
        String sqlInput = "UPDATE User SET current_Lang='" + langChoice + "' WHERE user_id = '" + user_id + "';";
        updateTable(sqlInput);
    }

    /**
     * @author: Monesha 
     * @Desc: Creates records for all the languages in the LangProcess application for the user in the database
     * 
     * @param user_id
     * @param langList 
     */
    public void createLangData(String user_id, ArrayList<String> langList) {
        for (int i = 0; i < langList.size(); i++) {
            String sqlInput = "INSERT INTO LangProcess(langName, progressPoint, user_id) "
                    + "VALUES ('" + langList.get(i) + "',0,'" + user_id + "')";
            updateTable(sqlInput);
            System.out.println("New record is created for all the language available in this application. ");
        }
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
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
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
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
