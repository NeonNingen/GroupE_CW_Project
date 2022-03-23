/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupe_cwk2.groupe_cwk2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Amit
 */
abstract class DatabaseModel 
{
    //variables
    protected Statement stm; //variable needed to run the query
    protected ResultSet rs;  //variable used to store the result of the query
    protected String url  = "jdbc:sqlite:test2.db";;    //variable that stores the address of the SQLite database
    protected String query;  //variable used to store the query code
    

    //METHODS
    
    /**
     * 
     * @param url it's the location of the SQLite database
     * @return return connections to the method where it was called, this is done so a method can use the Connection
     * functions to create Statement
     */
    public static Connection getConnection(String url)
    {
        Connection con = null; //attribute needed to establish a connection with the database
        
        try 
        {
            con = DriverManager.getConnection(url); //connects with the database
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
    }
    
    /**
     * IMPORTANT executeUpdate & executeQuery do different things
     * executeUpdate is usually used for insert/update/delete data
     * executeQuery is only used when is expected to get data upon executing a query
     */
    
    /**
     * abstract method to insert rows/data in the database
     */
    public abstract void insert();
    
    
    /**
     * method used to perform the retrieve data function from the database
     * @param querySql the query to execute in the function
     * @return the result of the query in an ArrayList
     */
    public ArrayList<ArrayList<Object>> retrieve(String querySql)
    {
        Connection con = getConnection(url);
        ArrayList<Object> test = null;
        ArrayList<ArrayList<Object>> containerTest = new ArrayList<>();
        
        try 
        {
            stm = con.createStatement(); //through connection, a statement is created
            
            //stm.executeQuery executes the query passed as parameter and stores it inside the attribute rs, which can later be used to iterate throught it and use the data
            rs = stm.executeQuery(querySql); 
           
            while (rs.next()) //iterates through the result set, so it continues until it reaches the last row of the table
            {     
                int nCol = rs.getMetaData().getColumnCount(); //retrieves the number of columns in the resul table
                
                test = new ArrayList<>();
                for (int j = 1; j <= nCol; j++) //retrieves from each row in the result set the columns, the counter starts from 1 because of how it is numbered in the table
                {
                    // System.out.print(" " + rs.getObject(j));
                    test.add( rs.getObject(j)); //adds a data into the ArrayList
                }
                containerTest.add(test); //this arraylist will contain in each indexes the row with all the columns, this way it will be easy to handle the data
                //System.out.println("");
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            //closes resultset
            closeResultSet(rs);
            
             //closes statement
             closeStatement(stm);
            
            //closes connection
            closeConnection(con);
        }
        
        return containerTest;
    }
    
    /**
     * abstract method to update rows/data in the database
     */
    public abstract void update();
    
    /**
     * method used to delete rows/data in the database
     */
    public void delete(){};
    
    
    //methods for closing the different connections
    public void closeResultSet(ResultSet rs_end)
    {
        try 
        {
            if (rs_end != null) 
            {
                rs_end.close();
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeStatement(Statement stm_end)
    {
        try 
        {
            if (stm_end != null) 
            {
                stm_end.close();
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeConnection(Connection con)
    {
        try 
        {
            if (con != null) 
            {
                con.close();
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DatabaseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
