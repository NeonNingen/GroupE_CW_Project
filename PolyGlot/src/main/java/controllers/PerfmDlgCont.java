/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.lang.Exception;
import javax.swing.JDialog;
import views.CardScrollV;
import views.SetUpDlgV;
import views.RatingV;
import models.DialogueMDL;
import models.Card;
import views.ProgV;
import views.RatingV;

/**
 *
 * @author Zain
 */


public class PerfmDlgCont implements ActionListener
 {
    private SetUpDlgV SetUpDlgPage;
    private CardScrollV CardScrollPage;
    private RatingV RatingPage;
    private String lang;
    private String roleName;
    private int id;
    private long start;
    private long end;
    private float time;
    public int click = 1;
    DialogueMDL dialogue;
    Card card;
    DialogueCont dlgCont;
    
    public PerfmDlgCont(SetUpDlgV SetUpDlgPage, DialogueCont dlgCont) {
        this.SetUpDlgPage = SetUpDlgPage;
        this.dlgCont = dlgCont;
        this.dialogue = new DialogueMDL();
        this.id = this.SetUpDlgPage.getID();
        setUpDlg();
    }
    
    public PerfmDlgCont(CardScrollV CardScrollPage, SetUpDlgV SetUpDlgPage) {
        this.start = System.currentTimeMillis();
        this.CardScrollPage = CardScrollPage;
        this.SetUpDlgPage = SetUpDlgPage;
        this.dialogue = new DialogueMDL();
        this.id = this.CardScrollPage.getID();
        this.CardScrollPage.getDlgNameAsTitle().setText(retrieveDialogueInfo().get(0));
        cardScroll(0, 1);
        this.end = System.currentTimeMillis();
        this.time = (end - start) / 1000F;
    }
    
    public PerfmDlgCont(RatingV RatingPage, float time) {
        this.RatingPage = RatingPage;
        this.dialogue = new DialogueMDL();
        this.id = this.RatingPage.getID();
        this.time = time;
        Rating();
        
    }
    
    /*
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
                                     + this.id
                                     + " AND card_order = "
                                     + click);
        
        return cardInfo;
    }
    
    private void setUpDlg() {
        this.SetUpDlgPage.getDlgNameC().setText(retrieveDialogueInfo().get(0));
        this.SetUpDlgPage.getDlgLevelC().setText(retrieveDialogueInfo().get(1));
        this.SetUpDlgPage.getDlgTopicC().setText(retrieveDialogueInfo().get(2));
        this.SetUpDlgPage.getDlgGrmmarC().setText(retrieveDialogueInfo().get(3));
            }
    
    private void cardScroll(int textValue, int roleValue) {
        this.CardScrollPage.getCardTxtDisplayTxtArea().setText(retrieveCardInfo().get(textValue));
        this.CardScrollPage.getRoleNameLbl().setText(retrieveCardInfo().get(roleValue));
        System.out.println(retrieveCardInfo());
    }
    
    private void Rating() {
        this.RatingPage.getDlgC().setText(retrieveDialogueInfo().get(0));
        this.RatingPage.getLvlC().setText(retrieveDialogueInfo().get(1));
        this.RatingPage.getTimeTakenC().setText(this.time + " seconds");
    }
                

    // Add action listener to next
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try {
            if(e.getSource() == this.SetUpDlgPage.getStartDlgBttn())
       {
           System.out.println("goodbye");
           System.out.println(SetUpDlgPage.getDlgPartnerC().getText());
           SetUpDlgPage.dispose();
           new CardScrollV(this.id, this.SetUpDlgPage, this.dlgCont).show();
       }
            } catch (Exception e2) {
            //System.out.println(e2);
        }
        
        try {
            
       
       if(e.getSource() == this.CardScrollPage.getNextCardBttn()) {
           try {
               click += 1;
               cardScroll(0, 1);
           } catch (Exception e2) {
               click = 1;
               System.out.println("No more cards");
               CardScrollPage.dispose();
               new RatingV(this.id, this.time).show();
           }
       }
           
        if(e.getSource() == this.CardScrollPage.getPrevCardBttn()) {
           try {
               click -= 1;
               cardScroll(0, 1);
           } catch (Exception e2) {
               click = 1;
               System.out.println("No cards this way");
           }
          
        }
        } catch (Exception e2) {
            //System.out.println(e2);
        }
           
           try {
           
        if(e.getSource() == this.RatingPage.getOkButton()) {
            RatingPage.dispose();
            new ProgV().show();
            
        }
           } catch (Exception e2) {
            //System.out.println(e2);
        }
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
       
       
       
    
    
    public int getClick() {
        return click;
    }

}