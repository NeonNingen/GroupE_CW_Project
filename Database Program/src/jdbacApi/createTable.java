package jdbacApi;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class createTable {
    
    public static String[] produceTables(int arr_lines) throws FileNotFoundException { //Setup SQL Table
        String[] tableParameters = new String[2];
        String sqlString = "";
        int lines = arr_lines;
        
        File myObj = new File(".\\src\\jdbacApi\\tables.txt");
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

    public static void main(String[] args) throws FileNotFoundException{
        String[] tableParameters = new String[2];
        String sqlString = "";
        int lines = 0;
        
        Connection con = connectDB.getConnection();
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
}

