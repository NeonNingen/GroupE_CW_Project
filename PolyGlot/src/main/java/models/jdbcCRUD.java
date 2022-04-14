package models;

import java.io.File;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Connect {
    
    private String urlSQLite;
    private Driver driverSQLite;
    private Connection con;

    // Download SQLite Driver
    public Connect() {
        urlSQLite = "jdbc:sqlite:polyLang.db";

        try {
            driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("Driver for SQLite downloaded.");
        } catch (SQLException e) {
            System.out.println("Problem with download driver for SQLite: " + e.getMessage());
        }

        try {
            con = DriverManager.getConnection(urlSQLite);// create database if it does not exist.
            System.out.println("Connection to SQLite is done.");
        } catch (SQLException e) {
            System.out.println("Problem with connection to SQLite: " + e.getMessage());
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

public class jdbcCRUD {
    
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
    
    //To be unused
    public static String[] produceTables(int arr_lines) throws FileNotFoundException { //Setup SQL Table
        String[] tableParameters = new String[2];
        String sqlString = "";
        int lines = arr_lines;
        
        File myObj = new File(".\\src\\main\\java\\model\\tables.txt");
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
    
    //To be unused
    public static void createTable() throws FileNotFoundException {
        String[] tableParameters = new String[2];
        String sqlString = "";
        int lines = 0;
        
        Connection con = getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            con.setAutoCommit(false);
            for (int i = 0; i < 5; i++) {
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
    
    //To be unused
    public static void insertDefault() throws FileNotFoundException {
        String sqlString = "";
        
        Connection con = getConnection();
        Statement stmt = null;
        File myObj = new File(".\\src\\main\\java\\model\\defaultValues.txt");
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
            String user = sqlString.substring(0, 398);
            String access_Record = sqlString.substring(398, 646);
            String dialogue = sqlString.substring(646, 1054);
            String card = sqlString.substring(1054, 1292);
            String dialogue_Record = sqlString.substring(1292, 1578);
            stmt.executeUpdate(user);
            stmt.executeUpdate(access_Record);
            stmt.executeUpdate(dialogue);
            stmt.executeUpdate(card);
            stmt.executeUpdate(dialogue_Record);
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
    
    //Insert Tables
    
    // Access_Record
    public static void insertTable(int access_id, String date, String logintime,
                                   String logouttime, int user_id) {
        
        updateTable("INSERT INTO Access_Record (accessrecord_id, date, "
                         + "logintime, logouttime, user_id) VALUES "
                         + "(" + access_id + "," + date + ",'" + logintime 
                         + "','" + logouttime + "'," + user_id + ")");
    }
    
    // Card
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
    
    // Dialogue
    public static void insertTable(int dial_id, String name, String topic,
                                   String lvl, String grammar, int points,
                                   String state, String completed, 
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
    
    // Dialogue_Record
    public static void insertTable(String dial_id, int user_id, 
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
    
    // User
    public static void insertTable(int user_id, String name, String sname,
                                   String email, String pass, 
                                   String lang_lvl, String progress_points, 
                                   int user_type, String admin_access,
                                   String user_group_id) {
        
        updateTable("INSERT INTO User (user_id, user_name, user_sname,"
                         + "user_email, user_pass, user_lang_lvl, "
                         + "user_progresspoints, "
                         + "user_type, admin_access, user_group_id) VALUES "
                         + "(" + user_id + ",'" + name + "','" + sname
                         + "','" + email + "','" + pass 
                         + "','" + lang_lvl + "','" + progress_points + "'," 
                         +  user_type + ",'" + admin_access + "','" 
                         + user_group_id + "')");
    }
    
    // Delete Statement for String value
    public static void delRecord(String tableName, String rowName, 
                                 String value) {
        
        updateTable("DELETE from " + tableName + " WHERE " + rowName + "= '" +
                    value + "'");
    }
    
    // Delete Statement for Integer value
    public static void delRecord(String tableName, String rowName, 
                                 int value) {
        
        updateTable("DELETE from " + tableName + " WHERE " + rowName + "= " +
                    value);
    }
    
    // Change an Existing Value in a table
    // keyRow refers to primary (key) column
    public static void changeValue(String tableName, String rowName, 
                                   String value, String keyRow,
                                   String keyValue) {
        
        updateTable("UPDATE " + tableName + " set " + rowName + " = '" + 
                     value + "' WHERE " + keyRow + " = " + keyValue);
        
    }
    
    public static void changeValue(String tableName, String rowName, 
                                   int value, String keyRow, int keyValue) {
        
        updateTable("UPDATE " + tableName + " set " + rowName + "= " + 
                     value + " WHERE " + keyRow + "= " + keyValue);
        
    }
    
    public static void showData(String rowName, String tableName, String keyRow,
                                String keyValue) {
        queryData("SELECT " + rowName + " FROM "+ tableName + 
                        " WHERE " + keyRow + "= '" + keyValue + "'",
                  rowName);
    }
    
    public static void showData(String rowName, String tableName, String keyRow,
                                int keyValue) {
        queryData("SELECT " + rowName + " FROM "+ tableName + 
                        " WHERE " + keyRow + "= " + keyValue,
                  rowName);
    }
    
    // Pull data from the database
    public static void queryData(String sqlString, String rowName) {
        
        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqlString);
            while (rs.next()) {
                String rowValue = rs.getString(rowName);
                System.out.println(rowValue + "\n");
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
    }
    
    
        
    // Any SQL Action executed into the database
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

    public static void main(String[] args) throws FileNotFoundException {
        Connect connect = new Connect();
        File f = new File(".\\polyLang.db");
    }

}

/* 
Create Set Table & Values
createTable();
insertDefault();

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
