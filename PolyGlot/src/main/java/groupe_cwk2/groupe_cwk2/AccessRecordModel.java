/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupe_cwk2.groupe_cwk2;

/**
 *
 * @author Amit
 */
public class AccessRecordModel extends DatabaseModel
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

    //inherited methods from DatabaseModel
    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
