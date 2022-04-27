/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;
import views.CardScrollV;
import views.DlgListV;
import views.SetUpDlgV;
import models.DialogueMDL;
import models.Card;

/**
 *
 * @author Zain
 */


public class PerfmDlgCont implements ActionListener
 {
    private SetUpDlgV SetUpDlgPage;
    private CardScrollV CardScrollPage;
    private String lang;
    private String roleName;
    private int id;
    DialogueMDL dialogue;
    Card card;

    public PerfmDlgCont(SetUpDlgV SetUpDlgPage, String lang) 
    {
        this.lang = lang;
        this.SetUpDlgPage = SetUpDlgPage;
        this.dialogue = new DialogueMDL();
        this.id = this.SetUpDlgPage.getID();
        setUpDlg();
    }
    
    public PerfmDlgCont(SetUpDlgV SetUpDlgPage) {
        this.SetUpDlgPage = SetUpDlgPage;
        this.dialogue = new DialogueMDL();
        this.id = this.SetUpDlgPage.getID();
        setUpDlg();
    }
    
    public PerfmDlgCont(CardScrollV CardScrollPage) {
        this.CardScrollPage = CardScrollPage;
        this.dialogue = new DialogueMDL();
        this.id = this.CardScrollPage.getID();
        cardScroll();
    }
    
    /**
     * This method is used to retrieve dialogue details such as
     * - Dialogue Name
     * - Dialogue Level
     * - Dialogue Topic
     * - Dialogue Grammar
     * Then @return a String Array of those values and view it per each JLabel
     * 
    */
    public ArrayList<String> retrieveDialogueInfo() {
        
        ArrayList<String> dialogueInfo = new ArrayList<>();
        dialogueInfo = this.dialogue.queryData("SELECT "
                                             + "dialogue_name, dialogue_lvl, "
                                             + "dialogue_topic, "
                                             + "dialogue_grammar "
                                             + "FROM Dialogue WHERE "
                                             + "dialogue_id = " 
                                             + this.id);
        
        return dialogueInfo;
    }
    
    public ArrayList<String> retrieveCardInfo() {
        
        ArrayList<String> cardInfo = new ArrayList<>();
        cardInfo = this.card.queryData("SELECT "
                                     + "card_text, card_role "
                                     + "FROM Card WHERE "
                                     + "dialogue_id = " 
                                     + this.id);
        
        return cardInfo;
    }
    
    public final void setUpDlg() {
        this.SetUpDlgPage.getDlgNameC().setText(retrieveDialogueInfo().get(0));
        this.SetUpDlgPage.getDlgLevelC().setText(retrieveDialogueInfo().get(1));
        this.SetUpDlgPage.getDlgTopicC().setText(retrieveDialogueInfo().get(2));
        this.SetUpDlgPage.getDlgGrmmarC().setText(retrieveDialogueInfo().get(3));
            }
    
    public void cardScroll() {
        this.CardScrollPage.getDlgNameAsTitle().setText(retrieveDialogueInfo().get(0));
        this.CardScrollPage.getCardTxtDisplayTxtArea().setText(retrieveCardInfo().get(0));
        this.CardScrollPage.getRoleNameLbl().setText(retrieveCardInfo().get(1));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       
       if(e.getSource() == SetUpDlgPage.getStartDlgBttn())
       {
           System.out.println(SetUpDlgPage.getDlgPartnerC().getText());
           SetUpDlgPage.dispose();
           new CardScrollV(this.id).show();
       }
       
       /*if(e.getSource() == SetUpDlgPage.getCloseBttn())
       {
          //Original:
          //String query ="SELECT * FROM Dialogue WHERE dialogue_language ='" 
                      // + this.lang + "'";
          //DialogueCont cont = new DialogueCont();
          //cont.setDlgList(query);
          //SetUpDlgPage.dispose();
          //new DlgListV().show();
          
          // Aisana's editing:
           SetUpDlgPage.dispose();
           MenuBarCont menuCont= new MenuBarCont();
            menuCont.setDlgListPage(lang);
       }*/
       
       
       
    }

}