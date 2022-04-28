
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.DialogueMDL;
import views.DlgHistV;
import views.DlgListV;
import views.MenuBarV;
import views.SettingV;
import views.SupportV;
import views.UListTchV;
import views.ProgV;
import views.UListStdV;
import views.LoginV;
import controllers.LoginRegisterCont;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import models.AccessRecordMDL;
import models.UserMDL;
import views.SetUpDlgV;

/**
 *
 * @author Amit 
 * further edited by Aisana 
 */
public class MenuBarCont implements ActionListener
{

    private MenuBarV menuBar;
    private LoginRegisterCont logCont;
    private UserMDL user;
    private AccessRecordMDL accessRC;
    private SetUpDlgV dlgSetUpPage;
    private String lang;//="SPN"; // user.gerCurrentLang()
    /*private LoginRegCont logRegCont;
    private DialogueMdl dlgMdl;
    private LoginV login;
    private ProgV prog;
    private DialogueMDL dlgModel;
    private DlgHistV dlgHist;
    private DialogueCont cont;
    private UserMDL otherUser;
    private UListTchV userList;
    private UserCont userCont;
    private SupportV support;
    private SettingV setting;
    private ProgV progPage;
    private DlgListV dlgView;*/
    
    
//    public MenuBarCont(MenuBarV menuBar) 
//    {
//        this.menuBar = menuBar;
//    }

    public MenuBarCont() 
    {
      this.menuBar = new MenuBarV();
      
    }

    public MenuBarCont(UserMDL userMDL, AccessRecordMDL accessRC) 
    {
        this.user = userMDL;
        this.accessRC = accessRC;
        
    }

    public MenuBarCont(UserMDL userMDL) 
    {
        this.user = userMDL;
        
    }
    
    public void setPage(MenuBarV menu) 
    {
        this.menuBar = menu;
        
        this.menuBar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) 
            {
                accessRC.setLogoutTime(accessRC.getAccessRecord_id(), user.getUserID());
            }
            
        });
    }
    /*
    public MenuBarCont(SetUpDlgV dlgSetUpPage) 
    {
        this.dlgSetUpPage = dlgSetUpPage;
    }*/
    
    /*public MenuBarCont(ProgV progPage) 
    {
        this.progPage = progPage;
    }*/

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == menuBar.getProVBttn()){
            //LoginV login= new LoginV();
            LoginRegisterCont logCont = new LoginRegisterCont(user);
            
            ProgV prog= new ProgV(user);
            
            activateBttn(menuBar.getProVBttn(), menuBar.getDlgListBttn(),menuBar.getSettBttn(), menuBar.getUListBttn());
            menuBar.setPageTitle("Profile");
            menuBar.setProgPageTopicContent(prog.getProgViewContent());
            //this way controller will collect info and update those two objects

        }
        
        if(e.getSource() == menuBar.getDlgHistBttn2()){
            DialogueMDL dlgModel= new DialogueMDL();
            DlgHistV dlgHist= new DlgHistV();
            DialogueCont cont= new DialogueCont(menuBar);
            cont.setDlgHist(dlgHist, dlgModel);
                
            menuBar.setPageTitle("Dialogue History");
            menuBar.setPageTopicContent(dlgHist.getDlgHistConent());
            
        }
        
        if(e.getSource() == menuBar.getUListBttn()){
            // need to retrieve userMDL from Main to see which page to open
            //String user_type = "Teacher";
            String user_type = user.getUserType();
            //UserMDL otherUser= new UserMDL();
            UListTchV ulistTch= new UListTchV();
            UListStdV ulistStd= new UListStdV();
            UserCont userCont= new UserCont();
            activateBttn(menuBar.getUListBttn(),menuBar.getDlgListBttn(),menuBar.getSettBttn(), menuBar.getProVBttn());
            if(user_type.equals("Student")){
                userCont.setUserList(ulistStd, user);
                menuBar.remove(menuBar.getDlgHistBttn2());
                menuBar.setPageTitle("User List");
                menuBar.setPageTopicContent(ulistStd.getUListContent());
            }else if (user_type.equals("Teacher")){
                
                userCont.setUserList(ulistTch, user);
                menuBar.remove(menuBar.getDlgHistBttn2());
                menuBar.setPageTitle("User List");
                menuBar.setPageTopicContent(ulistTch.getUListContent());
            }

        }

        if (e.getSource() == menuBar.getSupportBttn()) {
            SupportV support= new SupportV();
            LoginRegisterCont logRegCont= new LoginRegisterCont();
            logRegCont.setSmallSupport(support);
            menuBar.setPageTitle("Support");
            menuBar.setPageTopicContent(support.getSupportContent());

        }

        // Aisana edited to fix mennubar
        if (e.getSource() == menuBar.getSettBttn()) {
                SettingV setting= new SettingV(user);
                LoginRegisterCont logCont = new LoginRegisterCont(user);
                logCont.setAccRec(setting, menuBar, accessRC);
                setting.setContListener(logCont); //added by Amit
//                LoginRegisterCont logRegCont= new LoginRegisterCont();
                //logCont.setAccRec(setting);
                
                activateBttn(menuBar.getSettBttn(),menuBar.getDlgListBttn(), menuBar.getUListBttn(),menuBar.getProVBttn());
                menuBar.setPageTitle("Settings"); //change title
                menuBar.setPageTopicContent(setting.getSettingContent()); //clear page content and add content of view class Jpanel 
            //}
            
        }
        
        if(e.getSource() == menuBar.getDlgListBttn()){
            DialogueMDL dlgModel= new DialogueMDL();
            DlgListV dlgView= new DlgListV();
            
            String query;
            lang= user.getApplang();
            DialogueCont cont= new DialogueCont(this.menuBar, dlgView, dlgModel, lang);//, lang);// add user current lang string parameter
            //cont.setCurrentLang(lang);
            //if(){ 
                // set up condition if user lang is use user.gerCurrentLang, 
            //}
            query="SELECT * FROM Dialogue WHERE dialogue_language ='" + lang+ "'";
            cont.setDlgList(query); 
            activateBttn(this.menuBar.getDlgListBttn(),this.menuBar.getSettBttn(), this.menuBar.getUListBttn(),this.menuBar.getProVBttn());
            this.menuBar.setPageTitle("Dialogue List");
            this.menuBar.setPageTopicContent(dlgView.getDlgListContent());
            this.menuBar.show();
            
        }
        
        
    }
    
    /**
     * Method used to distinguish which button is clicked and disable it while enabling other buttons
     * @param bttn1 - button that is clicked
     * @param bttn2
     * @param bttn3
     * @param bttn4 
     */
    public void activateBttn(JButton bttn1,JButton bttn2,JButton bttn3,JButton bttn4){ //
        //if(bttn1.isSelected()){
            bttn1.setEnabled(false);
            bttn2.setEnabled(true);
            bttn3.setEnabled(true);
            bttn4.setEnabled(true);
            
            //menuBar.setDesign();
        //}
        
    }
    
}
