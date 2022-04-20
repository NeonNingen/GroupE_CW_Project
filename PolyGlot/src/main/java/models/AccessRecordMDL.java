
package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccessRecordMDL extends DatabaseMDL
{
    //variables
    private String accessRecord_id;

    
    //getters
    public String getAccessRecord_id() 
    {
        return accessRecord_id;
    }

    
    //setters
    public void setAccessRecord_id(String accessRecord_id) 
    {
        this.accessRecord_id = accessRecord_id;
    }

    //Records logout date&time in database
    public void setLogoutTime(int accessrecord_id, int user_id){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("LOGOUT TIME!!!!!!!!!: "+ dtf.format(now));
       //Only changes the logout date time
        String sqlString = "UPDATE Access_Record SET logouttime = '"+dtf.format(now)+"' WHERE accessrecord_id="+accessrecord_id+" AND user_id = "+user_id;
        updateTable(sqlString);
    }
    
    
}
