
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
import models.AccessRecordMDL;
import models.UserMDL;

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
    }
    

    
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
            
            ProgV prog= new ProgV();
            //LoginRegisterCont logRegCont= new LoginRegisterCont();
            //logRegCont.setProgClasses(login, prog);
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
            String user_type = "Teacher";
           // String user_type = user.getUserType();
            //UserMDL otherUser= new UserMDL();
            UListTchV ulistTch= new UListTchV();
            UListStdV ulistStd= new UListStdV();
            UserCont userCont= new UserCont();
            
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
                
                
                menuBar.setPageTitle("Settings"); //change title
                menuBar.setPageTopicContent(setting.getSettingContent()); //clear page content and add content of view class Jpanel 
            //}
            
        }
        
        if(e.getSource() == menuBar.getDlgListBttn()){
            DialogueMDL dlgModel= new DialogueMDL();
            DlgListV dlgView= new DlgListV();
            DialogueCont cont= new DialogueCont(menuBar);
            cont.setDlgList(dlgView, dlgModel ,"SELECT * FROM Dialogue");
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
