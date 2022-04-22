
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
import models.UserMDL;

/**
 *
 * @author Amit 
 * further edited by Aisana 
 */
public class MenuBarCont implements ActionListener
{

    private MenuBarV menuBar;
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
    
    public MenuBarCont(MenuBarV menuBar) 
    {
        this.menuBar = menuBar;
    }

    /*
    public MenuBarCont() {
        logRegCont= new LoginRegCont();
        dlgMdl= new DialogueMdl();
        login= new LoginV();
        prog= new ProgV();
        dlgModel= new DialogueMDL();
        dlgHist = new DlgHistV();
        cont = new DialogueCont();
        otherUser = new UserMDL();
        userList= new UListTchV();
        userCont= new UserCont();
        support = new SupportV();
        setting = new SettingV();
        progPage= new ProgV();
        dlgView = new DlgListV();
        
        
    }*/

    
    /*public MenuBarCont(ProgV progPage) 
    {
        this.progPage = progPage;
    }*/

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == menuBar.getProVBttn()){
            LoginV login= new LoginV();
            ProgV prog= new ProgV();
            LoginRegisterCont logRegCont= new LoginRegisterCont();
            logRegCont.setProgClasses(login, prog);
            menuBar.setPageTitle("Profile");
            menuBar.setProgPageTopicContent(prog.getProgViewContent());
            //this way controller will collect info and update those two objects
            
            
            
        }
        if(e.getSource() == menuBar.getDlgHistBttn2()){
            DialogueMDL dlgModel= new DialogueMDL();
            DlgHistV dlgHist= new DlgHistV();
            DialogueCont cont= new DialogueCont();
            cont.setDlgHist(dlgHist, dlgModel);
                
            menuBar.setPageTitle("Dialogue History");
            menuBar.setPageTopicContent(dlgHist.getDlgHistConent());
            
        }
        
        if(e.getSource() == menuBar.getUListBttn()){
            // need to retrieve userMDL from Main to see which page to open
            String user_type = "Tch";
            UserMDL otherUser= new UserMDL();
            UListTchV ulistTch= new UListTchV();
            UListStdV ulistStd= new UListStdV();
            UserCont userCont= new UserCont();
            
            if(user_type.equals("Std")){
                userCont.setUserList(ulistStd, otherUser);
                menuBar.remove(menuBar.getDlgHistBttn2());
                menuBar.setPageTitle("User List");
                menuBar.setPageTopicContent(ulistStd.getUListContent());
            }else if (user_type.equals("Tch")){
                userCont.setUserList(ulistTch, otherUser);
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
            //if (e.getSource() == menuBar.getSettBttn()) {
                SettingV setting= new SettingV();
                LoginRegisterCont logRegCont= new LoginRegisterCont();
                logRegCont.setAccRec(setting);
                
                
                menuBar.setPageTitle("Settings"); //change title
                menuBar.setPageTopicContent(setting.getSettingContent()); //clear page content and add content of view class Jpanel 
            //}
            
        }
        
        if(e.getSource() == menuBar.getDlgListBttn()){
            DialogueMDL dlgModel= new DialogueMDL();
            DlgListV dlgView= new DlgListV();
            DialogueCont cont= new DialogueCont();
            cont.setDlgList(dlgView, dlgModel);
            menuBar.setPageTitle("Dialogue List");
            menuBar.setPageTopicContent(dlgView.getDlgListContent());
            
        }
        
        
        
        
//        if(e.getSource() == menuBar.getProVBttn())
//        {
//            new ProgV().show();
//        }
//        
        //This if statement needs to be sorted out because of the different versions of User List page in the project
//        if(e.getSource() == menuBar.getUListBttn())
//        {
//        int num = (int) (Math.random() * 10);
//        if (num % 2 == 0) 
//        {
//           new UListStdV().show();
//        }
//        else
//        {
//           new UListTchV().show();
//        }

//        }
//        
//        if(e.getSource() == menuBar.dlgListBttn())
//        {
//            new DlgListV().show();
//        }
//        
//        if(e.getSource() == menuBar.getSettBttn())
//        {
//            new SettingV().show();
//        }
        
//        if(e.getSource() == menuBar.getSupportBttn())
//        {
//           new SupportV().show(); 
//        }
        
    }
    
    
}
