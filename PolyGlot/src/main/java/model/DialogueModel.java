/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amit
 */
public class DialogueModel extends DatabaseModel
{
    //varibles
    private String dlg_id;
    private String dlg_lang;
    private String dlg_topic;
    private String dlg_level;
    private String dlg_grammar;
    private int dlg_points;
    
    
    //getters
    public String getDlg_id() 
    {
        return dlg_id;
    }

    public String getDlg_lang() 
    {
        return dlg_lang;
    }

    public String getDlg_topic() 
    {
        return dlg_topic;
    }

    public String getDlg_level() 
    {
        return dlg_level;
    }

    public String getDlg_grammar() 
    {
        return dlg_grammar;
    }

    public int getDlg_points() 
    {
        return dlg_points;
    }
    
    
    //setters
    public void setDlg_id(String dlg_id) 
    {
        this.dlg_id = dlg_id;
    }

    public void setDlg_lang(String dlg_lang) 
    {
        this.dlg_lang = dlg_lang;
    }

    public void setDlg_topic(String dlg_topic) 
    {
        this.dlg_topic = dlg_topic;
    }

    public void setDlg_level(String dlg_level) 
    {
        this.dlg_level = dlg_level;
    }

    public void setDlg_grammar(String dlg_grammar) 
    {
        this.dlg_grammar = dlg_grammar;
    }

    public void setDlg_points(int dlg_points) 
    {
        this.dlg_points = dlg_points;
    }

    //inherited methods from DatabaseModel
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
