package models;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * This class is used to:
 * - Download SQLite Driver.
 * - And creates the SQL Database (if it does not exist).
 * - Once the connect instance is closed, then the connection is turned off.
 * @author Zain and Rafael
 */

class Connect {
    
    private String urlSQLite;
    private Driver driverSQLite;
    private Connection con;

    
    public Connect() {
        
        urlSQLite = "jdbc:sqlite:polyLang.db";

        try {
            driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("Driver for SQLite downloaded.");
        } catch (SQLException e) {
            System.out.println("Problem with download driver for SQLite: " 
                                                        + e.getMessage());
        }

        try {
            //create database if it does not exist.
            con = DriverManager.getConnection(urlSQLite);
            System.out.println("Connection to SQLite is done.");
        } catch (SQLException e) {
            System.out.println("Problem with connection to SQLite: " 
                                                        + e.getMessage());
        }

        try {
            if (!con.isClosed()) {
                con.close();
                System.out.println("Connection to SQLite closed.");
            }
        } catch (SQLException e) {
            System.out.println("Problem with close connection of SQLite");
        }
    }
}

/**
 * Main Class for the database functionality
 */
public class DatabaseMDL {
    
    /**
     * This method is used for:
     * - Connecting to the existing SQL database.
     * - Catches an exception if it cannot connect find or connect to the 
     *   database.
     */
    public static Connection getConnection() {

        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:polyLang.db";
            Connection con = DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    /**
     * Insert Tables
     * - Each method is used for a separate SQL database table, to insert values 
     * into each individual table.
     * - Using the UpdateTable method to send the statements to the table, to
     * add the values to each table.
     */
    
    /**
     * Access_Record
     * @param access_id: int - AccessRecord ID.
     * @param date: String - User's date logged when accessing the system.
     * @param logintime: String - Time when the user logs in.
     * @param logouttime: String - Time when the user logs out.
     * @param user_id: String - User's ID logged when accessing the system.
     */
    public static void insertTable(int access_id, String date, String logintime,
                                   String logouttime, String user_id) {
        
        updateTable("INSERT INTO Access_Record (accessrecord_id, date, "
                         + "logintime, logouttime, user_id) VALUES "
                         + "(" + access_id + "," + date + ",'" + logintime 
                         + "','" + logouttime + "'," + user_id + ")");
    }
    
    /**
     * Card
     * @param card_id: int - Card ID.
     * @param points: int - Points given to users for each card.
     * @param role: String - User given either Role A or Role B.
     * @param text: String - Text on the card.
     * @param order: String - Card order placement.
     * @param vocab: String - Vocab for each card.
     * @param dial_id: int - Dialogue ID.
     */
    public static void insertTable(int card_id, int points, String role,
                                   String text, String order, String vocab,
                                   int dial_id) {
        
        updateTable("INSERT INTO Card (card_id, card_points, "
                         + "card_role, card_text, card_order, "
                         + "card_vocab, dialogue_id) VALUES "
                         + "(" + card_id + "," + points + ",'" + role 
                         + "','" + text + "','" + order 
                         + "','" + vocab + "'," + dial_id + ")");
    }
    
    /**
     * Dialogue
     * @param dial_id: int - Dialogue ID.
     * @param name: String - Dialogue's given name
     * @param topic: String - What this dialogue entry is about.
     * @param lvl: String - Dialogue's difficulty.
     * @param grammar: String - Grammar parts of the text.
     * @param points: int - Points given to users for each dialogue.
     * @param state: String - If dialogue card has been completed or not.
     * @param completed: int - The amount of dialogue's completed.
     * @param lang: String - Language of the dialogue.
     */
    public static void insertTable(int dial_id, String name, String topic,
                                   String lvl, String grammar, int points,
                                   String state, int completed, 
                                   String lang) {
        
        updateTable("INSERT INTO Dialogue (dialogue_id, dialogue_name, "
                         + "dialogue_topic, dialogue_lvl, dialogue_grammar, "
                         + "dialogue_points, dialogue_state, "
                         + "dialogue_completed, dialogue_language) VALUES "
                         + "(" + dial_id + ",'" + name + "','" + topic 
                         + "','" + lvl + "','" + grammar 
                         + "'," + points + ",'" + state + "','" 
                         + completed + "','" + lang + "')");
    }
    
    /**
     * Dialogue_Record
     * @param dial_id: int - Dialogue ID.
     * @param user_id: String - User's ID logged when accessing the system.
     * @param d_completed: String - What year the dialogue was completed.
     * @param t_completed: String - What time the dialogue wad completed.
     * @param userA_id: String - UserA's ID.
     * @param userB_id: String - UserB's ID.
     * @param userA_points: int - The amount of points userA has.
     * @param userB_points: int - The amount of points userB has.
     */
    public static void insertTable(String dial_id, String user_id, 
                                   String d_completed, String t_completed, 
                                   String userA_id, String userB_id, 
                                   int userA_points,  int userB_points) {
        
        updateTable("INSERT INTO Dialogue_Record (dialogue_id, user_id, "
                         + "date_completed, time_completed, userA_id, "
                         + "userB_id, userA_points, userB_points) VALUES "
                         + "('" + dial_id + "'," + user_id + ",'" + d_completed
                         + "','" + t_completed + "','" + userA_id 
                         + "','" + userB_id + "'," + userA_points + "," 
                         + userB_points + ")");
    }
    
    /**
     * User
     * @param user_id: String - User's ID logged when accessing the system.
     * @param name: String - User's first name
     * @param sname: String - User's surname.
     * @param email: String - User's Email.
     * @param pswd: String - User's Password.
     * @param lang_lvl: String - Dialogue's difficulty.
     * @param progress_points: int - The amount of points userB has.
     * @param user_type: String - What category is the user, Teacher or Student.
     * @param admin_access: String - Access to admin level features.
     * @param user_group_id: String - What group ID is the user under.
     */
    public static void insertTable(String user_id, String name, String sname,
                                   String email, String pswd, 
                                   String lang_lvl, int progress_points, 
                                   String user_type, String admin_access,
                                   String user_group_id) {
        
        updateTable("INSERT INTO User (user_id, user_name, user_sname,"
                         + "user_email, user_pswd, user_lang_lvl, "
                         + "user_progresspoints, "
                         + "user_type, admin_access, user_group_id) VALUES "
                         + "(" + user_id + ",'" + name + "','" + sname
                         + "','" + email + "','" + pswd 
                         + "','" + lang_lvl + "','" + progress_points + "'," 
                         +  user_type + ",'" + admin_access + "','" 
                         + user_group_id + "')");
    }
    
    /**
     * delRecord
     * Delete statement for String values
     * @param tableName: String - Given table name.
     * @param rowName: String - Given row name.
     * @param value: String - Given value.
     */
    public static void delRecord(String tableName, String rowName, 
                                 String value) {
        
        updateTable("DELETE from " + tableName + " WHERE " + rowName + "= '" +
                    value + "'");
    }
    
    /**
     * delRecord
     * Delete statement for Integer values
     * @param tableName: String - Given table name.
     * @param rowName: String - Given row name.
     * @param value: int - Given value.
     */
    public static void delRecord(String tableName, String rowName, 
                                 int value) {
        
        updateTable("DELETE from " + tableName + " WHERE " + rowName + "= " +
                    value);
    }
    
    /**
     * changeValue
     * Change an Existing String Value in a table
     * @param tableName: String - Given table name.
     * @param rowName: String - Given row name.
     * @param value: String - Given value.
     * @param keyColumn: String - Primary (key) column.
     * @param keyValue: String - Key value being replaced.
     */
    public static void changeValue(String tableName, String rowName, 
                                   String value, String keyColumn,
                                   String keyValue) {
        
        updateTable("UPDATE " + tableName + " set " + rowName + " = '" + 
                     value + "' WHERE " + keyColumn + " = " + keyValue);
        
    }
    
    /**
     * changeValue
     * Change an Existing int Value in a table
     * @param tableName: String - Given table name.
     * @param rowName: String - Given row name.
     * @param value: int - Given value.
     * @param keyColumn: String - Primary (key) column.
     * @param keyValue: int - Key value being replaced.
     */
    public static void changeValue(String tableName, String rowName, 
                                   int value, String keyColumn, int keyValue) {
        
        updateTable("UPDATE " + tableName + " set " + rowName + "= " + 
                     value + " WHERE " + keyColumn + "= " + keyValue);
        
    }
    
    /**
     * QueryData
     * This is used to send a SQL statement to the database that will query
     * the existing tables for data requested.
     * @param sqlString: String - SQl Strings
     * @retrun The queried data within an ArrayList<String>.
     */
    public static ArrayList<String> queryData(String sqlString) {
        
        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String rowValue = "";
        ArrayList<String> data = new ArrayList<>();
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqlString);
            int col = rs.getMetaData().getColumnCount();
            
            while (rs.next()) {
                for(int i = 1; i <= col; i++)
                {
                    data.add(rs.getString(i));
                }
            }
            stmt.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
        return data;
    }
        
    /**
     * updateTable
     * This is used to send a SQL statement to the database that will update
     * the existing tables with new/remove/replace data.
     * @param sqlString: String - SQl Strings from the 
     *                            insert/delete/change methods above.
     */
    public static void updateTable(String sqlString) {
        
        Connection con = getConnection();
        Statement stmt = null;
        
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            stmt.executeUpdate(sqlString);
            stmt.close();
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
        }

    /**
     * main
     * Executes this file's code to the console.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Connect connect = new Connect();
        File f = new File(".\\polyLang.db");
    }

}

/* 
Query Data
ArrayList<String> data = queryData("SELECT date, logintime, logouttime, user_id FROM Access_Record WHERE accessrecord_id = 1234;");
System.out.println(data);

Insert Values into any table
insertTable(20, "2022-03-28", "16:19 PM", "17:19 PM", 50);
insertTable(6, 100, "A", "BRUH", "ngl what is this", "english lmao", 69);
insertTable(890, "bob", "sleeping", "100", "fix this engrish pls", 100, "True",
"yes", "English");
insertTable("Reading", 100, "2020", "07:30 a.m", "400", "100", 30, 40);
insertTable(50, "bob", "smith", "bobsmith@outlook.com", "bobsmith1", "100", 
"200", 1, "crazy", "20");

Delete Values from any table
delRecord("Access_Record", "user_id", 50);

Change Values from any table
changeValue("Access_Record", "logintime", "18:02 PM", "user_id", "50");

Show Values from any table
showData("logintime", "Access_Record", "user_id", "50");
*/
