package model;

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
        System.out.println(sqlString);
        myReader.close();
        tableParameters[0] = sqlString;
        tableParameters[1] = Integer.toString(lines);
      return tableParameters;
    }
    
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
    
    public static void insertDefault() throws FileNotFoundException { // Default
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
    
    public static void insertTable(int choice) {
    // Placeholder method for testing insertTable options
    // Replace variable idea
        int card_id = 20;
        String date = "2022-03-28";
        String logintime = "16:19 PM";
        String logouttime = "17:19 PM";
        String user_id = "W69420";
        int points = 100;
        String role = "A";
        String text = "BRUH";
        String order = "ngl what is this";
        String vocab = "english lmao";
        int dial_id = 69;
        String name = "bob";
        String topic = "sleeping";
        String lvl = "100";
        String grammar = "fix this engrish pls";
        String state = "True";
        String completed = "Yes";
        String lang = "English";
        String d_completed = "2022-03-28";
        String t_completed = "16:35 PM";
        String userA_id = "W69420";
        String userB_id = "W42069";
        int userA_points = 69;
        int userB_points = 420;
        String sname = "smith";
        String email = "bobsmith@outlook.com";
        String pass = "bobsmith1";
        String lang_lvl = "100";
        String progress_points = "200";
        int type = 1;
        String admin_access = "crazy";
        String user_group_id = "20";
        
        Connection con = getConnection();
        Statement stmt = null;
        String sqlString = "";
        
        switch (choice) {
            case 1: // Access_Record
                sqlString = "INSERT INTO Access_Record (accessrecord_id, date, "
                         + "logintime, logouttime, user_id) VALUES "
                         + "(" + card_id + "," + date + ",'" + logintime 
                         + "','" + logouttime + "','" + user_id + "')";
                break;
            case 2: // Card
                sqlString = "INSERT INTO employee (empName, empID, empSal, empJob) VALUES ('" + card_id + "'," + date + "," + logintime + ",'" + user_id + "')";
                break;
            case 3: // Dialogue
                sqlString = "INSERT INTO employee (empName, empID, empSal, empJob) VALUES ('" + card_id + "'," + date + "," + logintime + ",'" + user_id + "')";
                break;
            case 4: // Dialogue_Record
                sqlString = "INSERT INTO employee (empName, empID, empSal, empJob) VALUES ('" + card_id + "'," + date + "," + logintime + ",'" + user_id + "')";
                break;
            case 5: // User
                sqlString = "INSERT INTO employee (empName, empID, empSal, empJob) VALUES ('" + card_id + "'," + date + "," + logintime + ",'" + user_id + "')";
                break;
        }
        
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

    public static void delEmp(int Eid) {

        Connection con = getConnection();
        Statement stmt = null;
        //String sqlString = "SELECT empID, empName, empJob " +" FROM employee WHERE EmployeeID=1001";
        String sqlString = "DELETE from employee WHERE empID=" + Eid;
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            stmt.executeUpdate(sqlString);
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

    public static void amendEmp(int Eid) {

        Connection con = getConnection();
        Statement stmt = null;
        String sqlString = ("UPDATE employee set empSal =" + 12345 + " WHERE empID=" + Eid);
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            stmt.executeUpdate(sqlString);
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

    public static void showAll() {
        Connection con = getConnection();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from employee ");
//

            int n = 0;
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                n++;
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(" " + rs.getObject(i));
                }

                System.out.println("");
            }

            rs.close();
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
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        //insertEmp();
        //showAll();
        Connect connect = new Connect();
        File f = new File(".\\polyLang.db");
        if (!f.exists()) {
        createTable();
        insertDefault();
        System.out.println("This shouldn't print");
        }
        insertTable(1);
        //showAll();
        //delEmp(11)
        //amendEmp(11);
        //showAll();

    }
    
    

}
