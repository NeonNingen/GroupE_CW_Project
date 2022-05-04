/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.lang.Exception;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import views.CardScrollV;
import views.SetUpDlgV;
import models.DialogueMDL;
import models.Card;
import models.UserMDL;
import views.LoginV;
import views.MenuBarV;
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
    private MenuBarV menu;
    private int id;
    private long start;
    private long end;
    private float time;
    private String userID;
    private String partnerID;
    public int click = 1;
    DialogueMDL dialogue;
    Card card;
    DialogueCont dlgCont;
    UserMDL userMDL;
    LoginV loginPage;
    
    
    /**
     * Permfm constructor 
     * Used to construct an instance of the class to be invoked
     * Designated to SetUpDlgV for the start button
     * @param SetUpDlgPage - Instance of SetUpDlgV
     * @param dlgCont - Instance of DialogueCont
     */
    public PerfmDlgCont(SetUpDlgV SetUpDlgPage, DialogueCont dlgCont, String userID) {
        this.SetUpDlgPage = SetUpDlgPage;
        this.dlgCont = dlgCont;
        this.dialogue = new DialogueMDL();
        this.id = this.SetUpDlgPage.getID();
        this.userID = userID;
        setUpDlg();
    }
    
    /**
     * Permfm constructor
     * Used to construct an instance of the class to be invoked
     * Designated to CardScrollV for the next and previous buttons
     * @param CardScrollPage - Instance of CardScrollV
     * @param SetUpDlgPage - Instance of SetUpDlgPageV
     */
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
    
    /**
     * Permfm constructor 
     * Used to construct an instance of the class to be invoked
     * Designated to RatingV for the Ok button
     * @param RatingPage - Instance of RatingV
     * @param time: float - Float value for time.
     */
    public PerfmDlgCont(RatingV RatingPage, float time, String userID, String partnerID) {
        this.RatingPage = RatingPage;
        this.dialogue = new DialogueMDL();
        this.id = this.RatingPage.getID();
        this.time = time;
        this.userID = userID;
        this.partnerID = partnerID;
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
    
    /*
     * This method is used to retrieve card details such as
     * - Card Text
     * - Card Role
     * Then @return a String Array of values which allow the cards to be scrolled
     * 
    */
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
    
    /**
     * checkUser Function
     * Used to validate if the user has entered a partner name
     * and a role is selected.
     * If not either or one of those things have been done. Return false
     * otherwise return true.
     * @return Boolean for validation
     */
    private Boolean checkUser() {
        Boolean realUser;
        
            String userID = this.SetUpDlgPage.getDlgPartnerC().getText();
            Boolean RoleA = this.SetUpDlgPage.getRoleARadBttn().isSelected();
            Boolean RoleB = this.SetUpDlgPage.getRoleBRadBttn().isSelected();
            
            ArrayList<String> dlgName = new ArrayList<>();
            
            if(!userID.equals("")) {
                dlgName = userMDL.queryData(
                                  "SELECT "
                                + "user_name "
                                + "FROM User WHERE "
                                + "user_id = '" 
                                + userID + "'");
            } else {
                realUser = false;
            }
            if(!dlgName.isEmpty()) {
                if (RoleA==true || RoleB==true) realUser = true; else realUser = false;
            } else {
                realUser = false;
            }

        return realUser;
    }
    
    /**
     * ratingToDatabase Function
     * Submit the rating given by the user in RatingV to the database
     * In the user table under the user_progressscore column
     * @param userScore: int - user's rating (Your rating)
     * @param partnerScore: int - partner's rating
     */
    private void ratingsToDatabase(int userScore, int partnerScore) {
        
        ArrayList<String> prevScoreList = new ArrayList<>();
        prevScoreList = userMDL.queryData(
                                  "SELECT "
                                + "user_progresspoints "
                                + "FROM User WHERE "
                                + "user_id = '" 
                                + this.userID + "' "
                                + "or user_id = '"
                                + this.partnerID + "'");
                                
        userMDL.changeValue("User", "user_progresspoints",
                            userScore + Integer.parseInt(prevScoreList.get(0)),
                            "user_id", this.userID);
        userMDL.changeValue("User", "user_progresspoints",
                            partnerScore + Integer.parseInt(prevScoreList.get(1)),
                            "user_id", this.partnerID);
    }
    
    /**
     * setUpDlg Method
     * When the setUpDlg page is used. 
     * Display the Dialogue Name, Level, Topic and Grammar on the page.
     */
    private void setUpDlg() {
        this.SetUpDlgPage.getDlgNameC().setText(retrieveDialogueInfo().get(0));
        this.SetUpDlgPage.getDlgLevelC().setText(retrieveDialogueInfo().get(1));
        this.SetUpDlgPage.getDlgTopicC().setText(retrieveDialogueInfo().get(2));
        this.SetUpDlgPage.getDlgGrmmarC().setText(retrieveDialogueInfo().get(3));
        this.SetUpDlgPage.getDlgIdC().setText(this.userID);
        
    }
    
    /**
     * cardScroll Method
     * When the cardScroll page is used. 
     * Display the Card Text area and Role name on the page. 
     * Display the card collection in the console 
     */
    private void cardScroll(int textValue, int roleValue) {
        this.CardScrollPage.getCardTxtDisplayTxtArea().setText(retrieveCardInfo().get(textValue));
        this.CardScrollPage.getRoleNameLbl().setText(retrieveCardInfo().get(roleValue));
        System.out.println(retrieveCardInfo());
    }
    
    /**
     * Rating Method
     * When the Rating page is used. 
     * Display the Dialogue name, Level and Time taken on the page.
     */
    private void Rating() {
        this.RatingPage.getDlgC().setText(retrieveDialogueInfo().get(0));
        this.RatingPage.getLvlC().setText(retrieveDialogueInfo().get(1));
        this.RatingPage.getTimeTakenC().setText(this.time + " seconds");
    }
                

    /**
     * actionPerformed Method
     * Used to listen to any buttons pressed in a page.
     * Then follow up with an action
     * This method is overwritten with specific actions used per page
     * @param e - The action event parameter
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try {
            if(e.getSource() == this.SetUpDlgPage.getStartDlgBttn())
       {
           boolean realUser = checkUser();
           if (realUser == true) {
               System.out.println(SetUpDlgPage.getDlgPartnerC().getText());
               SetUpDlgPage.dispose();
               new CardScrollV(this.id, this.SetUpDlgPage, this.dlgCont).show();
           } else {
               JOptionPane.showMessageDialog(this.SetUpDlgPage, "User is invalid", "INVALID NAME", 0);
               Border border = BorderFactory.createLineBorder(Color.RED);
               this.SetUpDlgPage.getDlgPartnerC().setText("");
           } 
       }
            } catch (Exception e2) {
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
               new RatingV(this.id, this.time, this.userID, this.partnerID).show();
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
        }
           try {
           
        if(e.getSource() == this.RatingPage.getOkButton()) {
            int userPoints = Integer.parseInt(
           this.RatingPage.getYourRatingBoxC().getSelectedItem().toString());
            int partnerPoints = Integer.parseInt(
           this.RatingPage.getpartnerRatingBoxC().getSelectedItem().toString());
            
            ratingsToDatabase(userPoints, partnerPoints);
//            RatingPage.dispose();
//            new MenuBarV().show();
        }
           } catch (Exception e2) {
        }
        }

}