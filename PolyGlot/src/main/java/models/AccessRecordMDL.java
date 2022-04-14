
package models;

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

    //inherited methods from DatabaseMDL
//    @Override
//    public void insert() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void update() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}
