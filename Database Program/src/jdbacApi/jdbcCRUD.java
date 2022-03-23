package jdbacApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class jdbcCRUD {

    public static void insertTable() throws FileNotFoundException { // Default
        String sqlString = "";
        
        Connection con = connectDB.getConnection();
        Statement stmt = null;
        File myObj = new File(".\\src\\jdbacApi\\defaultValues.txt");
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
    
    public static void insertTable(int Eid, String Ename, String Ejob, int Esal) { // User Input, to be worked on

        Connection con = connectDB.getConnection();
        Statement stmt = null;
        int empID = Eid;
        String empName = Ename;
        String job = Ejob;
        int sal = Esal;
        String sqlString = "INSERT INTO employee (empName, empID, empSal, empJob) VALUES ('" + empName + "'," + empID + "," + sal + ",'" + job + "')";
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

        Connection con = connectDB.getConnection();
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

        Connection con = connectDB.getConnection();
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
        Connection con = connectDB.getConnection();
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
        insertTable();
        //showAll();
        //delEmp(11)
        //amendEmp(11);
        //showAll();

    }

}
