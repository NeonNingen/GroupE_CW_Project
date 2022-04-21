/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Amit
 * @author Aisana - added main methods 
 */
public class DialogueMDL extends DatabaseMDL
{
    //varibles
    private String dlg_id;
    private String dlg_name;
    
    private String dlg_topic;
    private String dlg_level;
    private String dlg_grammar;
    private int dlg_points;
    private String dlg_state;
    private String dlg_completed;
    private String dlg_lang;
    private int rowCount=0;
    private int clmnCount=0;
    
    
    public DialogueMDL(String id, String name, String topic, String level, String grammar, String points, 
            String state, String completed, String lang){
        
            this.dlg_id= id;
            this.dlg_name= name;
            this.dlg_topic= topic;
            this.dlg_level= level;
            this.dlg_grammar= grammar;
            this.dlg_points= Integer.parseInt(points);
            this.dlg_state= state;
            this.dlg_completed= completed;
            this.dlg_lang= lang;
        
    }

    public DialogueMDL() {
        
    }
    
    
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
