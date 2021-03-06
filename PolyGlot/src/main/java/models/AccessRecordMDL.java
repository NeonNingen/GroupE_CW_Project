
package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author Amit Rahat Haider
 * @author Monesha Dhali
 */

public class AccessRecordMDL extends DatabaseMDL {

    private int accessRecord_id;

    //getters and setters
    public int getAccessRecord_id() {
        return accessRecord_id;
    }

    public void setAccessRecord_id(int accessRecord_id) {
        this.accessRecord_id = accessRecord_id;
    }
    
    /**
     * @author: Monesha
     * @Desc: Records logout date&time in database when the user logs out 
     * 
     * @param accessrecord_id : int - the id of the current session that the user is in
     * @param user_id : String - users unique id
     */
    public void setLogoutTime(int accessrecord_id, String user_id) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("LOGOUT TIME: " + dtf.format(now));
        String sqlString = "UPDATE Access_Record SET logouttime = '" + dtf.format(now) + "' WHERE accessrecord_id=" + accessrecord_id + " AND user_id = '" + user_id + "'";
        updateTable(sqlString);
    }
    
    /**
     * records login date and time of user in the database
     * @author Amit
     * @param user_id the user's user id needed to store inside the database
     */
    public void setLoginTime(String user_id) 
    {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String date = LocalDate.now().format(dateFormat);
        String logintime = LocalTime.now().format(timeFormat);
        System.out.println(date + " : " + logintime);
        insertTable(date, logintime, "", user_id);
    }

    /**
     * stores the access record id that has been generated when storing the values into the AccessRecordMDL
     * @param user_id 
     */
    public void storeAccessRecord(String user_id) 
    {
        ArrayList<String> result;
        String query = "SELECT MAX(date), MAX(logintime), accessrecord_id FROM Access_Record WHERE user_id = '" + user_id + "'";
        result = queryData(query);
        this.accessRecord_id = Integer.parseInt(result.get(2));
    }
}
