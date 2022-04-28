
package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import models.AccessRecordMDL;
import models.UserMDL;
import views.MenuBarV;
import views.RegisterV;
import views.LoginV;
import views.ProgV;
import views.SettingV;
import views.SupportV;
import views.SupportV2;

public class LoginRegisterCont implements ActionListener {

    private LoginV loginPage;
    private ProgV profilePage;
    private RegisterV registerPage;
    private UserMDL userMDL;
    private SettingV settingPage;
    private MenuBarV menubar;
    private SupportV2 supportPage;
    private SupportV supportMenu;
//    private int accessrecord_id;
//    private String user_id;
    private MenuBarCont menuCont;
    AccessRecordMDL accessRecMDL;

    public LoginRegisterCont(LoginV loginPage) {
        this.loginPage = loginPage;
        this.registerPage = new RegisterV();
        this.userMDL = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();
    }

//    public LoginRegisterCont(SettingV set, MenuBarV menubar) {
//        this.settingPage = set;
//        this.userMDL = new UserMDL();
//        this.menubar = menubar;
//        this.accessRecMDL = new AccessRecordMDL();
//    }
    
    public LoginRegisterCont(SettingV set) {
        this.settingPage = set;
        this.accessRecMDL = new AccessRecordMDL();
    }

    public LoginRegisterCont(UserMDL user) 
    {
        this.userMDL = user;
    }
    
    public void setAccRec(SettingV set, MenuBarV menu, AccessRecordMDL accessRC) {
        this.settingPage = set;
        this.menubar = menu;
        this.accessRecMDL = accessRC;
        
    }
    
    public LoginRegisterCont(RegisterV reg) {
        this.registerPage = reg;
        this.userMDL = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();
    }

    public LoginRegisterCont() 
    {
        
    }
    
    /**
     * suggested by Aiasana
     * method to set/reference up view and model for profile page
     * @param login
     * @param prog 
     */
    public void setProgClasses(LoginV login, ProgV prog)
    {
        this.loginPage=login;
        this.profilePage=prog;
    }
    /**
     * Suggested by Aisana [feedback]
     * method that will retrieve specific user based on login view input
     * 
     */
//    public UserMDL getUserInfo(){ 
//        return userMDL;
//    }
    
    /**
     * Suggested by Aisana (for main and menubar functionalities)
     * Method will begin app with a specific userMDL
     * @param user  - reference for user model object
     */
    public void startApp()
    {
        LoginV loginPage = new LoginV();
        loginPage.show();
    }
    
    public void setSmallSupport(SupportV support){
        this.supportMenu = support;
    }

    //Methods created by Monesha
    //These are small methods that triggers an action made by user
    //Events get activated when user is choosing a language in Setting page
    public void choosingLang(ActionEvent e) {
        if (!(this.settingPage == null) && e.getSource()== this.settingPage.getSelectLang()) {
            String langChoice = (String) settingPage.getSelectLang().getSelectedItem();
            System.out.println("User choose language: " + langChoice);
            //this.settingPage.changeLangOrder(langChoice);
            //settingPage.getSelectLang().setSelectedItem(langChoice);
            //settingPage.setLangChoice(langChoice);
            this.userMDL.setApplang(langChoice);
            settingPage.setSelectedLang(this.userMDL);
            userMDL.chooseLangdb(userMDL.getUserID(), langChoice);
            
        }
    } 

    //Events get activated when user is pressing on the help button in login/ register page
    public void actionPermHelp(ActionEvent e) {
        
        this.supportPage = new SupportV2();
        if ( (this.registerPage != null) && (e.getSource() == this.registerPage.getSupportBttn()) ) 
        {
                this.registerPage.dispose();
                this.supportPage.setVisible(true);
            
        } 
        else
        {
            if ( (this.loginPage != null) && (e.getSource() == this.loginPage.getSupportBttn() )) 
            {
                this.loginPage.dispose();
                this.supportPage.setVisible(true);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        choosingLang(e);
        actionPermHelp(e);
        String buttonAction = e.getActionCommand();
        
        switch (buttonAction) {
            case "Sign In": 
                if (loginPage.getuNameLogin().getText().equals("w185")) {
                    openPage2();
                } else {
                    ArrayList<String> userDetails;
                    try {
                        userDetails = checkUser();
                        if (!userDetails.isEmpty()) {
                            openPage(userDetails);
                        } else {
                            JOptionPane.showMessageDialog(loginPage, "User and/or password incorrect!", "INVALID DETAILS", 0);
                            Border border = BorderFactory.createLineBorder(Color.RED);
                            loginPage.getuNameLogin().setBorder(border);
                            loginPage.getPwdLogin().setBorder(border);
                            loginPage.getPwdLogin().setText("");
                        }

                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(LoginRegisterCont.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                break;

            case "Register":
                if (e.getSource() == this.registerPage.getRegBttn()) {
                    try {
                        registerUser(e);
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(LoginRegisterCont.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (e.getSource() == this.loginPage.getRegisterBttn()) {
                    loginPage.dispose();
                    this.registerPage = new RegisterV();
                    this.registerPage.setVisible(true);
                }
                break;
                
            case "Logout":
                System.out.println(userMDL.getUserID()+ " : " + accessRecMDL.getAccessRecord_id());
                accessRecMDL.setLogoutTime(accessRecMDL.getAccessRecord_id(), userMDL.getUserID());
                menubar.dispose();
                new LoginV().show();
                break;
                
            case "Cancel":
                this.registerPage.dispose();
                this.loginPage = new LoginV();
                this.loginPage.setVisible(true);
                break;
        }
    }

    
    
    private ArrayList<String> checkUser() throws NoSuchAlgorithmException 
    {
        Boolean userExist = false;
        String username = loginPage.getuNameLogin().getText();
        String pswd = loginPage.getPwdLogin().getText();
        
        ArrayList<String> result = new ArrayList<>();
        if(!pswd.equals("") && !pswd.equals("password"))
        {
            userMDL.getConnection();
            String queryPswd
                    = "SELECT user_pswd FROM User WHERE user_id = '" + username + "'";

            ArrayList<String> resultPswd = userMDL.queryData(queryPswd);

            if(!resultPswd.isEmpty())
            {
//                String query
//                        = "SELECT * FROM User WHERE user_email= '" + username + "'"
//                        + " AND user_pswd = '" + resultPswd.get(0) + "'";
//
//                result = userMDL.queryData(query);
                String storedPswd = resultPswd.get(0);
                
                if (isValidPwd(pswd, storedPswd) == true) {
                    System.out.println("yahooo");
                    //retrieve sql query
                    String query
                            = "SELECT * FROM User WHERE user_id= '" + username + "'"
                            + " AND user_pswd = '" + storedPswd + "'";

                    result = userMDL.queryData(query);
                }
                
            }
            
        }
        else
            result = new ArrayList<>();
        
        
        return result;
    }
    
    private void openPage(ArrayList<String> userDetails) 
    {
        String userID = userDetails.get(0);
        String uName = userDetails.get(1);
        String uSurname = userDetails.get(2);
        String uEmail = userDetails.get(3);
        String langLvl = userDetails.get(5);
        int uProgPoints = Integer.parseInt(userDetails.get(6));
        String uType = userDetails.get(7);
        String groupID = userDetails.get(9);
        String appLang = userDetails.get(11);
        
        this.userMDL = new UserMDL(uName, uSurname, uEmail, langLvl, uProgPoints, uType, userID, groupID, appLang);

        accessRecMDL.setLoginTime(userMDL.getUserID());
        accessRecMDL.storeAccessRecord(userMDL.getUserID());
        
        loginPage.dispose();
        MenuBarCont menuCont = new MenuBarCont(userMDL, accessRecMDL);
        
        MenuBarV menu = new MenuBarV(menuCont); 
        menuCont.activateBttn(menu.getProVBttn(), menu.getUListBttn(),menu.getDlgListBttn(), menu.getSettBttn());
        menu.setPageTitle("Profile");
        menu.setProgPageTopicContent(new ProgV(userMDL).getProgViewContent());
        menu.show();
    }

    //temp method for login
    
    private void openPage2() 
    {
        ArrayList<String> result = new ArrayList<>();
        String query
                            = "SELECT * FROM User WHERE user_id= 'w185'";

         result = userMDL.queryData(query);
         openPage(result);
    }
    
    //Methods by Monesha
    //It validates the inputs entered by User
    public void registerUser(ActionEvent e) throws NoSuchAlgorithmException 
    {
        String uName = registerPage.getNameReg().getText().trim().toLowerCase();
        String uSurname = registerPage.getSurnameReg().getText().trim().toLowerCase();
        String uEmail = registerPage.getEmailReg().getText().trim();
        String uGroup = (String) registerPage.getGroupIdSelect().getSelectedItem();
        String userID = registerPage.getUseridReg().getText().trim().toLowerCase();
        
        String uPwd = registerPage.getPwdReg1().getText();
        String uPwdConfirm = registerPage.getPwdReg2().getText();
        
        boolean selectTermCond = registerPage.getTermsCond().isSelected();
        
        if (checkRegData(userID, uName, uSurname, uEmail, uGroup, uPwd, uPwdConfirm, selectTermCond) == true) 
        {
            String currentUserID = userID;
            this.userMDL = new UserMDL(userID, uName, uSurname, uEmail, uGroup, "Student");
            
            String salt = getSalt(getRandomInteger(16,40));
            String secure_pwd = generateSecurePwd(uPwd, salt);
            userMDL.insertRegDets(userID, uName, uSurname, uEmail, uGroup, secure_pwd);
            
            accessRecMDL.setLoginTime(userMDL.getUserID());
            accessRecMDL.storeAccessRecord(userMDL.getUserID());
            
            this.registerPage.dispose();

            
            MenuBarCont menuC = new MenuBarCont(userMDL,accessRecMDL); //added by Amit (start)
            
            MenuBarV menu = new MenuBarV(menuC);
            menuC.activateBttn( menu.getSettBttn(),menu.getProVBttn(), menu.getUListBttn(),menu.getDlgListBttn());
            SettingV setting= new SettingV(userMDL);
            this.settingPage = setting;
            setAccRec(settingPage, menu, accessRecMDL);
            setting.setContListener(this); //added by Amit (end)
            userMDL.createLangData(currentUserID,  settingPage.getLangList());
            
            menu.setPageTitle("Setting");
            menu.setPageTopicContent(settingPage.getSettingContent());
            menu.setVisible(true);
        }
    }
    
    //Checks if the userid is unique
    private boolean uniqueID(String userID){
        ArrayList<String> result;
        String query = "SELECT user_id FROM User WHERE user_id = '" + userID+"'";
        result = accessRecMDL.queryData(query);
 
        if(!result.isEmpty()){
            System.out.println("user_id already used. Choose another user id");
            return false;
        }else{
            System.out.println("User id is unique");
            return true;
        }
        
    }

    public boolean checkRegData(String userID, String uName, String uSurname, String uEmail, String uGroup, String uPwd, String uPwdConfirm, boolean selectTermCond) 
    {
        if (uName.isEmpty() || uSurname.isEmpty() || uEmail.isEmpty() || uGroup.isEmpty() || uPwd.isEmpty() || uPwdConfirm.isEmpty()) 
        {
            String msgEpty = "Please fill in all the variables of the form";
            JOptionPane.showMessageDialog(null, msgEpty, "Problem", JOptionPane.ERROR_MESSAGE);
            //Border border = BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK);
            this.registerPage.getNameReg().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
            this.registerPage.getSurnameReg().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
            this.registerPage.getEmailReg().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
            this.registerPage.getUseridReg().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
            this.registerPage.getPwdReg1().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
            this.registerPage.getPwdReg2().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
            this.registerPage.getTermsCond().setForeground(Color.red);
            System.out.println(msgEpty);
            return false;
        } 
        else 
        {
            if (selectTermCond == false) 
            {
                String msgTC = "Please agree our terms and condition before using our application";
                JOptionPane.showMessageDialog(null, msgTC, "Problem", JOptionPane.ERROR_MESSAGE);
                this.registerPage.getTermsCond().setForeground(Color.red);
                System.out.println(msgTC);
                return false;
            } 
            else 
            {
                boolean isValidEmail = isValidEmail(uEmail);
                if (isValidEmail == false) 
                {
                    String msgE1 = "Email not Valid";
                    JOptionPane.showMessageDialog(null, msgE1, "Problem", JOptionPane.ERROR_MESSAGE);
                    
                    this.registerPage.getEmailReg().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
                    System.out.println(msgE1);
                    return false;
                } 
                else 
                {
                    boolean isValidPwd = isValidPassword(uPwd);
                    if (isValidPwd == false) 
                    {
                        String msgVP = """
                                    Password is not valid. 
                                    Insert at least 8 chars. 
                                    Insert Lower case, uppercase, digit, special character at least once. Do not include any white spaces!""";
                        JOptionPane.showMessageDialog(null, msgVP, "Problem", JOptionPane.ERROR_MESSAGE);
                        this.registerPage.getPwdReg1().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
                        System.out.println(msgVP);
                        return false;
                    } 
                    else 
                    {
                        System.out.println("Correct password format entered");
                        if (!(uPwd.equalsIgnoreCase(uPwdConfirm))) 
                        {
                            String msgMP = "Password don't match";
                            JOptionPane.showMessageDialog(null, msgMP, "Problem", JOptionPane.ERROR_MESSAGE);                  
                            this.registerPage.getPwdReg1().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
                            this.registerPage.getPwdReg2().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
                            System.out.println(msgMP);
                            return false;
                        } 
                        else 
                        {
                            boolean isValidUserID = uniqueID(userID);
                            if(isValidUserID==false) {
                                String msgUid = "User id is already in use.";
                                JOptionPane.showMessageDialog(null, msgUid, "Problem", JOptionPane.ERROR_MESSAGE);
                                this.registerPage.getUseridReg().setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(238, 105, 94)));
                                System.out.println(msgUid);
                                return false;
                            }else{
                                System.out.println("All Registered details are entered correctly. Data is being processed...");
                                return true;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private static final String PATTERN = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%£?!^&+=]).*)[^\\s]{8,}$";
    public boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PATTERN); //Compiling the regex
        Matcher matcher = pattern.matcher(password);
        System.out.println("Password being valid status: "+matcher.matches());
        return matcher.matches();
    }

    
    public boolean isValidEmail(String email) {
        //regex refer to user have to insert at least 8 chars. Lower case, uppercase, digit, special character occur at least once. No white spaces allowed.
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex); //Compiling the regex
        Matcher matcher = pattern.matcher(email);
        System.out.println("Email being valid status: "+matcher.matches());
        return matcher.matches();
    }

    //Methods by Monesha
    //GENERATING SECURE PASSWORDS 
    private final int ITERATIONS = 100;
    private final int KEY_LENGHT = 256;

    private static String getSalt(int lenght) throws NoSuchAlgorithmException {
        //Secure Random generator
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt); //Generates salt
        String finalSalt = new String(salt, StandardCharsets.UTF_8);
        return finalSalt;
    }

    //Generate Hash of the password
    private byte[] hash(char[] password, byte[] salt) {
        PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGHT);
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            byte[] hash = skf.generateSecret(spec).getEncoded();
            return hash;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error while hashing a password" + e.getMessage(), e);
        } finally {
            spec.clearPassword();
            System.gc();
        }
    }

    public String generateSecurePwd(String password, String salt) {
        //System.out.println("Password supplied: "+password);
        byte[] securePassword = hash(password.toCharArray(), salt.getBytes());
        String returnValue = Base64.getEncoder().encodeToString(securePassword);
        return salt + ":" + returnValue;
    }

    public static int getRandomInteger(int minNum, int maxNum){ 
        return ((int) (Math.random()*(maxNum - minNum))) + minNum;
    }
    
    public boolean isValidPwd(String providedPwd, String storedPWD) {
        boolean returnValue = false;
        String[] params = storedPWD.split(":");
        String sameSalt = params[0];

        //Generating new secure password with the same salt
        String newSecurePWD = generateSecurePwd(providedPwd, sameSalt);
        returnValue = newSecurePWD.equalsIgnoreCase(storedPWD);
        return returnValue; //IF TRUE password matches
    }

    
}
