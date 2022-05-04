
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import models.AccessRecordMDL;
import models.UserMDL;
import views.SetUpDlgV;

/**
 *
 * @author Aisana (w1775375) - resposible for the code making for this class
 */
public class MenuBarCont implements ActionListener
{

    private MenuBarV menuBar;
    private LoginRegisterCont logCont;
    private UserMDL user;
    private AccessRecordMDL accessRC;
    private SetUpDlgV dlgSetUpPage;
    private String lang;
    
    
// ? should we do descriptions for constructors?
    
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
    /**
     * Method used to trace logout time when closing application
     * added by Amit 
     * @param menu 
     */
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

   /**
    * Will trace actions from MenubArV buttons and generate new objects to switch content of the content mage in MenuBarV
    * @param e 
    */
    @Override
    public void actionPerformed(ActionEvent e)  // catch buttons clicked from MenuBarV
    {
        
        if(e.getSource().equals(menuBar.getProVBttn())){
            LoginRegisterCont logCont = new LoginRegisterCont(user); //may be unused if authout of that class decided to implement it differently
            
            ProgV prog= new ProgV(user);
            
            activateBttn(menuBar.getProVBttn(), menuBar.getDlgListBttn(),menuBar.getSettBttn(), menuBar.getUListBttn());
            menuBar.setPageTitle("Profile");
            menuBar.setProgPageTopicContent(prog.getProgViewContent());

        }
        
        if(e.getSource().equals(menuBar.getDlgHistBttn2())){
            DialogueMDL dlgModel= new DialogueMDL();
            DlgHistV dlgHist= new DlgHistV();
            DialogueCont cont= new DialogueCont(menuBar);
            cont.setDlgHist(dlgHist, dlgModel);
                
            menuBar.setPageTitle("Dialogue History");
            menuBar.setPageTopicContent(dlgHist.getDlgHistConent());
             setBttnsFree(menuBar.getDlgHistBttn2());
        }
        
        if(e.getSource().equals(menuBar.getUListBttn())){
            // need to retrieve userMDL from Main to see which page to open
            String user_type = user.getUserType();
            UListTchV ulistTch= new UListTchV();
            UListStdV ulistStd= new UListStdV(user);
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

        if (e.getSource().equals(menuBar.getSupportBttn())) {
            SupportV support= new SupportV();
            LoginRegisterCont logRegCont= new LoginRegisterCont();
            logRegCont.setSmallSupport(support);
            menuBar.setPageTitle("Support");
            menuBar.setPageTopicContent(support.getSupportContent());
            setBttnsFree(menuBar.getSupportBttn());

        }

        
        if (e.getSource().equals(menuBar.getSettBttn())) {
            SettingV setting= new SettingV(user);
            LoginRegisterCont logCont = new LoginRegisterCont(user);
            logCont.setAccRec(setting, menuBar, accessRC);
            setting.setContListener(logCont); //added by Amit

            activateBttn(menuBar.getSettBttn(),menuBar.getDlgListBttn(), menuBar.getUListBttn(),menuBar.getProVBttn());
            menuBar.setPageTitle("Settings"); 
            menuBar.setPageTopicContent(setting.getSettingContent()); 
        }
        
        if(e.getSource().equals(menuBar.getDlgListBttn())){
            DialogueMDL dlgModel= new DialogueMDL();
            DlgListV dlgView= new DlgListV();
            
            String query;
            lang= user.getApplang();
            DialogueCont cont= new DialogueCont(this.menuBar, dlgView, dlgModel, lang, this.user);
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
     * @param bttn1 - button that is clicked and should become unclickable
     * @param bttn2 - other button that should be clickable
     * @param bttn3 - other button that should be clickable
     * @param bttn4 - other button that should be clickable
     */
    public void activateBttn(JButton bttn1,JButton bttn2,JButton bttn3,JButton bttn4){ 
            menuBar.updateIcon(bttn1);
            bttn1.setEnabled(false);
            bttn2.setEnabled(true);
            bttn3.setEnabled(true);
            bttn4.setEnabled(true);
            
        
    }
    
    /**
     * method used to enable all menu bar buttons at once (when clicking support or dlgHistlist button
     */
    public void setBttnsFree(JButton bttn){ 
            menuBar.updateIcon(bttn);
            menuBar.getUListBttn().setEnabled(true);
            menuBar.getDlgListBttn().setEnabled(true);
            menuBar.getProVBttn().setEnabled(true);
            menuBar.getSettBttn().setEnabled(true);
            
        
    }
    
}
