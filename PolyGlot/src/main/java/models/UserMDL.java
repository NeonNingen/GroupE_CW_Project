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
    
    //Insert user details when registering into the database
    public void insertRegDetss(String userID, String name, String surname, String email, String groupID, String pswd){
      //  Connection con = getConnection();
        String userType = "Student";
        String adminAccess = "No";
        String lang_lvl = "null";
        int progressPnt = 0;
        insertTable(userID ,name, surname, email, pswd, lang_lvl ,progressPnt,userType, adminAccess , groupID);
       
    }
    
    
//    //Getting list of languages availbale in the application -by Monesha
//    public static ArrayList<String> getLangList(){
//        String sqlString= "SELECT user_name FROM User";
//        ArrayList<String> langList= queryData(sqlString);
//        return langList;
//    }
    
    //This allows the user to put thrit choice of language in the database
    public void updateLangdb(String user_id, String langChoice){
        
            //SQL that retrieves the langid of the user who choose a specific language AND the user_id
            //If return result is null then create a record and INSERT INTO Database (UserMDL)
            String SQLlangID = "SELECT langID FROM LangProcess WHERE langName='"+langChoice+"' AND user_id='"+user_id+"';";
            ArrayList<String> language = queryData(SQLlangID);
            if(language.size()==1){
                System.out.println("Language choosen on the database. ");
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
    
    /**
     * custom retrieve method that will pass the query of retrieving the user list to super.retrieve()
     */
//    public void retrieveUserList()
//    {
//        String querySql = "SELECT * FROM User";
//        ArrayList<ArrayList<Object>> data = super.retrieve(querySql, this.url);
////        ArrayList data = new ArrayList();
//        
////        try {
////            while(userRS.next())
////            {
////                int id = userRS.getInt("user_id");
////                String name = userRS.getString("name");
////                data.add(id);
////                data.add(name);
////                
////                System.out.println(id + ": " + name);
////            }
////        } catch (SQLException ex) {
////            Logger.getLogger(UserMDL.class.getName()).log(Level.SEVERE, null, ex);
////        }
//        
//        for (ArrayList<Object> arrayList : data) 
//        {
//            System.out.println(arrayList.get(0) + " : " + arrayList.get(1));
//        }
//    }
//    
//    /**
//     * deletes row from the table
//     * This method can be written like the method retrieveUserList
//     */
//    public void delete() 
//    {
//        Connection con = super.getConnection(this.url);
//        try 
//        {
//            super.stm = con.createStatement();
//            query = "DELETE FROM user WHERE user_id=" + 0;
//            
//            super.stm.executeUpdate(query);
//        } 
//        catch (SQLException ex) 
//        {
//            Logger.getLogger(UserMDL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            //closes statement
//            super.closeStatement(super.stm);
//            
//            //closes connection
//            super.closeConnection(con);
//        }
//    }
//
//    
//    //inherited methods from DatabaseMDL
//     /**
//     * insert method used to insert rows/data to the database
//     */
//    @Override
//    public void insert() 
//    {
//        Connection con = super.getConnection(this.url);
//        try 
//        {
//            super.stm = con.createStatement();
//            
//            String query = "INSERT INTO user(user_id, name) VALUES(0000, '[CURSED] Lord Mad Scientist')";
//            
//            super.stm.executeUpdate(query);
//        } 
//        catch (SQLException ex) 
//        {
//            Logger.getLogger(UserMDL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            //closes statement
//            super.closeStatement(super.stm);
//            
//            //closes connection
//            super.closeConnection(con);
//        }
//       
//    }
//
//    
//    /**
//     * update method (an abstract method inherited from DatabaseMDL) used to update rows/data in the database
//     */
//    @Override
//    public void update() 
//    {
//        Connection con = super.getConnection(this.url);
//        try 
//        {
//            super.stm = con.createStatement();    //since the variable stm is protected it can be accessed directly with or without super
//            query = "UPDATE user SET name= 'True Lord Mad Scientist' WHERE user_id=" + 1234;
//            
//            super.stm.executeUpdate(query); //executes query
//        } 
//        catch (SQLException ex) 
//        {
//            Logger.getLogger(UserMDL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {   
//            //closes statement
//            super.closeStatement(super.stm);
//            
//            //closes connection
//            super.closeConnection(con);
//        }
//        
//    }

    

}
