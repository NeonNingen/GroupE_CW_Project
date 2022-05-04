package models;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This class is used to:
 * - Download SQLite Driver.
 * - And creates the SQL Database (if it does not exist).
 * - Once the connect instance is closed, then the connection is turned off.
 * @author Zain
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
     * This function works in tandem with createTable method
     * Used to create each SQL tables with the required amount of rows
     * @param arr_lines: int - Create the necessary amount of rows
     * @return tableParameters
     * @throws FileNotFoundException: If it doesn't find database file
     */
    public static String[] produceTables(int arr_lines) 
           throws FileNotFoundException {
        String[] tableParameters = new String[2];
        String sqlString = "";
        int lines = arr_lines;
        
        File myObj = new File(".\\src\\main\\java\\models\\dbTables.txt");
        Scanner myReader = new Scanner(myObj);
        for(int i = 0; i < lines; ++i) {
                myReader.nextLine();
            }
        while (myReader.hasNextLine()) {
            lines++;
            String data = myReader.nextLine();
            if (data.isEmpty() == true) {
                myReader.close();
                break;
            }
            sqlString += "\n" + data;
      }
        //System.out.println(sqlString);
        myReader.close();
        tableParameters[0] = sqlString;
        tableParameters[1] = Integer.toString(lines);
      return tableParameters;
    }
    
    /**
     * This method creates the SQL tables for the database and it shows in 
     * SQLiteStudio
     * @throws FileNotFoundException 
     */
    public static void createTable() throws FileNotFoundException {
        String[] tableParameters = new String[2];
        String sqlString = "";
        int lines = 0;
        
        Connection con = getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            con.setAutoCommit(false);
            for (int i = 0; i < 7; i++) {
                tableParameters = produceTables(lines);
                sqlString = tableParameters[0];
                lines = Integer.valueOf(tableParameters[1]);
                stmt.executeUpdate(sqlString);
            }
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
     * This method inserts default values from a text file into the table
     * @throws FileNotFoundException 
     */
    public static void insertDefault() throws FileNotFoundException {
        String sqlString = "";
        
        Connection con = getConnection();
        Statement stmt = null;
        File myObj = new File(".\\src\\main\\java\\models\\defaultValues.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if (data.isEmpty() == true) {
                myReader.close();
                break;
            }
            sqlString += data + "\n";
      }
        myReader.close();
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            String user = sqlString.substring(0, 491);
            String access_Record = sqlString.substring(491, 759);
            String dialogue = sqlString.substring(759, 1159);
            String card = sqlString.substring(1159, 1382);
            String dialogue_Record = sqlString.substring(1382, 1664);
            String LangProcess = sqlString.substring(1664, 1813);
            stmt.executeUpdate(user);
            stmt.executeUpdate(access_Record);
            stmt.executeUpdate(dialogue);
            stmt.executeUpdate(card);
            stmt.executeUpdate(dialogue_Record);
            stmt.executeUpdate(LangProcess);
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
    public static void insertTable( String date, String logintime,
                                   String logouttime, String user_id) {
        
        updateTable("INSERT INTO Access_Record ( date, "
                         + "logintime, logouttime, user_id) VALUES "
                         + "('" + date + "','" + logintime 
                         + "','" + logouttime + "','" + user_id + "')");
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
    public static void insertTable(String card_id, int points, String role,
                                   String text, int order, String vocab,
                                   String dial_id) {
        
        updateTable("INSERT INTO Card (card_id, card_points, "
                         + "card_role, card_text, card_order, "
                         + "card_vocab, dialogue_id) VALUES "
                         + "('" + card_id + "'," + points + ",'" + role 
                         + "','" + text + "'," + order 
                         + ",'" + vocab + "','" + dial_id + "')");
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
    public static void insertTable(String dial_id, String name, String topic,
                                   String lvl, String grammar, int points,
                                   String state, int completed, 
                                   String lang) {
        
        updateTable("INSERT INTO Dialogue (dialogue_id, dialogue_name, "
                         + "dialogue_topic, dialogue_lvl, dialogue_grammar, "
                         + "dialogue_points, dialogue_state, "
                         + "dialogue_completed, dialogue_language) VALUES "
                         + "('" + dial_id + "','" + name + "','" + topic 
                         + "','" + lvl + "','" + grammar 
                         + "'," + points + ",'" + state + "'," 
                         + completed + ",'" + lang + "')");
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
                         + "('" + dial_id + "','" + user_id + "','" + d_completed
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
                         + "('" + user_id + "','" + name + "','" + sname
                         + "','" + email + "','" + pswd 
                         + "','" + lang_lvl + "'," + progress_points + ",'" 
                         +  user_type + "','" + admin_access + "','" 
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
     * changeValue
     * Change an Existing int Value in a table
     * @param tableName: String - Given table name.
     * @param rowName: String - Given row name.
     * @param value: int - Given value.
     * @param keyColumn: String - Primary (key) column.
     * @param keyValue: String - Key value being replaced.
     */
    public static void changeValue(String tableName, String rowName, 
                                   int value, String keyColumn, String keyValue) {
        
        updateTable("UPDATE " + tableName + " set " + rowName + "= " + 
                     value + " WHERE " + keyColumn + "= " + keyValue);
        
    }
    
    /**
     * QueryData
     * This is used to send a SQL statement to the database that will query
     * the existing tables for data requested.
     * @param sqlString: String - SQl Strings
     * @return The queried data within an ArrayList<String>.
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
     * @author Aisana
     * Method to get number of rows in the SQL table
     * @param sqlTable -  table name, name of the table for which you want to know number of rows 
     * @return 
     */
    public static int getRowCount(String sqlTable){
        
        int count = 0;
        Connection con = getConnection();
        Statement stmt = null;
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS rowcount FROM "+ sqlTable);
            rs.next();
            count = rs.getInt("rowCount");
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMDL.class.getName()).log(Level.SEVERE, null, ex);
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
        return count;
    }
    
    /**
     * @author Aisana
     * Method to get number of columns in the SQL table
     * @param sqlTable -  table name, name of the table for which you want to know number of columns 
     * @return 
     */
    public static int getColumnCount(String sqlTable){
        
        int count = 0;
        Connection con = getConnection();
        Statement stmt = null;
        
        try {

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + sqlTable);
            ResultSetMetaData rsMD = rs.getMetaData();
            count= rsMD.getColumnCount();
            //System.out.println("Columns: "+ count);
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMDL.class.getName()).log(Level.SEVERE, null, ex);
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
        return count;
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
    
    public static void readDlgDatabase()
    {    
        try 
        {
            FileInputStream fstream = new FileInputStream(".\\src\\main\\resources\\databaseFile\\Workbook with Conversations for Computer Science - Database.csv");
          
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            
            
            String strLine;
            ArrayList list = new ArrayList();
            //ArrayList idChecker = new ArrayList();
            
            int count = 0;
            while ((strLine = br.readLine()) != null ) 
            {  
                list.add(strLine);
                count++;
                
            }
            
            list.remove(0); //removes the row with column names
            Iterator itr;
            
            String dlgID;
            int id=0;
            
            for (itr = list.iterator(); itr.hasNext();) 
            {
                dlgID = "SPN";
                id++;
                String str = itr.next().toString();
                //System.out.println(str);
                
                String[] splitSt = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                String dlgLvl = splitSt[0];
                String dlgContext = splitSt[1];
                String dlgSubCont = splitSt[2];
                String dlgGramm = splitSt[3].replace("\"", "");
                
                
                String dlgCode = String.format("%04d", id);
                dlgID = dlgID.concat(dlgCode);
                
                insertTable(dlgID, dlgContext, dlgSubCont, dlgLvl, dlgGramm, 5, "incomplete", 0, "Spanish");

            }
            fstream.close();
            
        }
        catch (IOException ex) 
        {
            System.out.println("Error reading file");
            Logger.getLogger(DatabaseMDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void readCardDatabase()
    {    
        try 
        {
            FileInputStream fstream = new FileInputStream(".\\src\\main\\resources\\databaseFile\\Workbook with Conversations for Computer Science - Conversations.csv");
          
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;
            ArrayList list = new ArrayList();
            
            int count = 0;
            while ((strLine = br.readLine()) != null ) 
            {  
                list.add(strLine);
                //count++;
            }
            
            list.remove(0); //removes the row with column names
            Iterator itr;
            
            int card_order = 0;
            String cardID = "";
            String dlgID = "";
            int id_dlg = 0;
            int id_card = 0;
            int card_points = 0;
            
            for (itr = list.iterator(); itr.hasNext();) 
            {
                String str = itr.next().toString();
                String[] splitSt = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
   
                if (!str.equals(",,,,,,,,,,,,")) 
                {
                    if (!splitSt[0].equals("")) 
                    {
                        String level = splitSt[0];
                        switch (level) 
                        {
                            case "A1":
                                card_points = 10;
                                break;

                            case "A2":
                                card_points = 14;
                                break;

                            case "B1":
                                card_points = 20;
                                break;

                            case "B2":
                                card_points = 25;
                                break;

                            case "C1":
                                card_points = 28;
                                break;

                            case "C2":
                                card_points = 42;
                                break;

                        }

                        id_dlg++;
                        dlgID = "SPN";
                        String dlgCode = String.format("%04d", id_dlg);
                        dlgID = dlgID.concat(dlgCode);
                        card_order = 0;
                        
                    } 
                    else 
                    {
                        id_card++;
                        card_order++;
                        
                        cardID = dlgID + "_CRD" + String.format("%04d", id_card);
                        
                        String role = splitSt[3];
                        String card_text = splitSt[4].replace("\"", "");
                        String card_vocab = splitSt[12];

                        if (card_vocab.equals("/")) 
                            card_vocab = "";

                        insertTable(cardID, card_points, role, card_text, card_order, card_vocab, dlgID);

                    }

                }
            }
            in.close();
            br.close();
            fstream.close();
            
        }
        catch (IOException ex) 
        {
            System.out.println("Error reading file");
            Logger.getLogger(DatabaseMDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * main
     * Executes this file's code to the console.
     * If database file is empty, populate it with tables and default values
     */
    public static void main(String[] args) throws FileNotFoundException {
        Connect connect = new Connect();
        File f = new File(".\\polyLang.db");
        readDlgDatabase();
        readCardDatabase();
//        if (f.length() == 0) {
//            createTable();
//            insertDefault();
//        }
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
