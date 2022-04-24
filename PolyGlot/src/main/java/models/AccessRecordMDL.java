
package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AccessRecordMDL extends DatabaseMDL
{
    //variables
    private int accessRecord_id;

    
    //getters
    public int getAccessRecord_id() 
    {
        return accessRecord_id;
    }

    
    //setters
    public void setAccessRecord_id(int accessRecord_id) 
    {
        this.accessRecord_id = accessRecord_id;
    }

    //Records logout date&time in database
    public void setLogoutTime(int accessrecord_id, String user_id){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("LOGOUT TIME: "+ dtf.format(now));
       //Only changes the logout date time
        String sqlString = "UPDATE Access_Record SET logouttime = '"+dtf.format(now)+"' WHERE accessrecord_id="+accessrecord_id+" AND user_id = '"+user_id + "'";
      
        updateTable(sqlString);
    }
    
    public void setLoginTime(int access_id, UserMDL user) 
    {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        String date = LocalDate.now().format(dateFormat);
        String logintime = LocalTime.now().format(timeFormat);
        
        System.out.println(date + " : " + logintime);
        
        insertTable(access_id, date, logintime, "", user.getUserID());
    }
    
    
}
