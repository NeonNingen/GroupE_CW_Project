/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Amit
 */
public class DialogueRecordMDL extends DatabaseMDL
{
    //variables
    private String dlgRecord_id;

    
    //getters
    public String getDlgRecord_id() 
    {
        return dlgRecord_id;
    }

    
    //setters
    public void setDlgRecord_id(String dlgRecord_id) 
    {
        this.dlgRecord_id = dlgRecord_id;
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
