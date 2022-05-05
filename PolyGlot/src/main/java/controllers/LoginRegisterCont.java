package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.AccessRecordMDL;
import models.UserMDL;
import views.MenuBarV;
import views.RegisterV;
import views.LoginV;
import views.ProgV;
import views.SettingV;
import views.SupportV;
import views.SupportV2;
import views.TermsCondV;

/**
 * @author Amit Rahat 
 * @author Joshua
 * @author Monesha Dhali - added main methods 
 */

public class LoginRegisterCont implements ActionListener, FocusListener {

    private LoginV loginPage;
    private RegisterV registerPage;
    private UserMDL userMDL;
    private SettingV settingPage;
    private MenuBarV menubar;
    private SupportV2 supportPage;
    private SupportV supportMenu;
    private TermsCondV termsCondPage;
    private AccessRecordMDL accessRecMDL;
    private Color errColor = new Color(238, 105, 94);

    //default constructor
    public LoginRegisterCont() {
        this.userMDL = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();

        this.loginPage = new LoginV();
        this.settingPage = new SettingV(userMDL);
        this.menubar = new MenuBarV();
        this.supportMenu = new SupportV();
        this.supportPage = new SupportV2();
    }

    //Constrcutors
    public LoginRegisterCont(LoginV loginPage) {
        this.loginPage = loginPage;
        this.registerPage = new RegisterV();
        this.userMDL = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();
        this.supportPage = new SupportV2();
        
    }

    public LoginRegisterCont(SettingV set) {
        this.settingPage = set;
        this.accessRecMDL = new AccessRecordMDL();
    }

    public LoginRegisterCont(UserMDL user) {
        this.userMDL = user;
        this.accessRecMDL = new AccessRecordMDL();
        this.supportPage = new SupportV2();
    }

    public LoginRegisterCont(RegisterV reg) {
        this.registerPage = reg;
        this.supportPage = new SupportV2();
        this.userMDL = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();
    }

    public LoginRegisterCont(SupportV2 aThis) {
        this.supportPage = aThis;
    }

    public LoginRegisterCont(TermsCondV tc) {
        this.termsCondPage = tc;
    }

    /**
     * Suggested by Aisana (for main and menubar functionalities) Method will
     * begin app with a specific userMDL
     */
    public void startApp() {
        loginPage = new LoginV();
        loginPage.show();
    }

    /**
     * initialises the setting page, menubar view and the access record model
     *
     * @param set setting page
     * @param menu menu bar view
     * @param accessRC access record
     */
    public void setAccRec(SettingV set, MenuBarV menu, AccessRecordMDL accessRC) {
        this.settingPage = set;
        this.menubar = menu;
        this.accessRecMDL = accessRC;
    }

    /**
     * initialises the support page
     *
     * @param support support page
     */
    public void setSmallSupport(SupportV support) {
        this.supportMenu = support;
    }

    /**
     * @author: Monesha
     * @Desc: Events get activated when user is choosing a language in Setting
     * page
     * @param e : ActionEvent
     */
    public void choosingLang(ActionEvent e) {
        if (!(this.settingPage == null) && e.getSource() == this.settingPage.getSelectLang()) {
            String langChoice = (String) settingPage.getSelectLang().getSelectedItem();
            System.out.println("User choose language: " + langChoice);
            this.userMDL.setApplang(langChoice);
            settingPage.setSelectedLang(this.userMDL);
            userMDL.chooseLangdb(userMDL.getUserID(), langChoice);
        }
    }

    /**
     * @author: Monesha and Rahat Haider Amit
     * @Desc: Events get activated when user is pressing on the help button in
     * login/ register page
     * @param e : ActionEvent
     */
    public void actionPermHelp(ActionEvent e) {
        
        if ((this.registerPage != null) && (e.getSource() == this.registerPage.getSupportBttn())) {
            this.registerPage.dispose();
            this.supportPage.setVisible(true);
        } else if ((this.loginPage != null) && (e.getSource() == this.loginPage.getSupportBttn())) {
            this.loginPage.dispose();
            this.supportPage.setVisible(true);
        }
    }

    /**
     * @author: Monesha and Rahat Haider Amit
     * @Desc: Events get activated when user press the terms and condition
     * button/ revert back to register page
     * @param e : ActionEvent
     */
    public void actionPermTC(ActionEvent e) {
        if ((this.registerPage != null) && (e.getSource() == this.registerPage.getTcBttnR())) {
            this.registerPage.dispose();
            this.termsCondPage = new TermsCondV();
            this.termsCondPage.setVisible(true);
        }
        if ((this.termsCondPage != null) && (e.getSource() == this.termsCondPage.getRmvTCBttn())) {
            this.termsCondPage.dispose();
            this.registerPage = new RegisterV();
            this.registerPage.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        choosingLang(e);
        actionPermHelp(e);
        actionPermTC(e);
        String buttonAction = e.getActionCommand();

        //depending on which button was pressed it will call a method
        switch (buttonAction) {
            case "Sign In":
                logUser();
                break;

            case "Register":
                if (e.getSource() == this.registerPage.getRegBttn()) {
                    try {
                        registerUser(e);
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(LoginRegisterCont.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if ((this.loginPage != null) && e.getSource() == this.loginPage.getRegisterBttn()) {
                    loginPage.dispose();
                    this.registerPage = new RegisterV();
                    this.registerPage.setVisible(true);
                }
                break;

            case "Logout":
                System.out.println(userMDL.getUserID() + " : " + accessRecMDL.getAccessRecord_id());
                accessRecMDL.setLogoutTime(accessRecMDL.getAccessRecord_id(), userMDL.getUserID());
                menubar.dispose();
                new LoginV().show();
                break;

            case "Cancel":
                this.registerPage.dispose();
                this.loginPage = new LoginV();
                this.loginPage.setVisible(true);
                break;

            case "Back to Register":
                this.supportPage.dispose();
                this.registerPage = new RegisterV();
                this.registerPage.setVisible(true);
                break;

            case "Back to Login":
                this.supportPage.dispose();
                this.loginPage = new LoginV();
                this.loginPage.setVisible(true);
                break;
        }
    }

    /**
     * @author: Monesha
     * @Desc: setting field to null when user focuses on the JTextField
     * @param txt
     */
    private void rmvFocus(JTextField txt) {
        txt.setText("");
        txt.removeFocusListener(this);
    }

    /**
     * @author: Monesha
     * @Desc: setting field to null when user focuses on the JPasswordField
     * @param txt
     */
    private void rmvFocus(JPasswordField txt) {
        txt.setText("");
        txt.removeFocusListener(this);
    }

    /**
     * @author: Amit Rahat Haider and Monesha
     * @param e : FocusEvent - set the text to null when the user focuses on a
     * field for the 1st time
     */
    @Override
    public void focusGained(FocusEvent e) {
        if ((this.loginPage != null) && (e.getSource() == loginPage.getuNameLogin())) {
            rmvFocus(loginPage.getuNameLogin());
        }
        if ((this.loginPage != null) && (e.getSource() == loginPage.getPwdLogin())) {
            rmvFocus(loginPage.getPwdLogin());
        }
        if ((this.registerPage != null) && (e.getSource() == registerPage.getUserNameReg())) {
            rmvFocus(registerPage.getUserNameReg());
        }
        if ((this.registerPage != null) && (e.getSource() == registerPage.getSurnameReg())) {
            rmvFocus(registerPage.getSurnameReg());
        }
        if ((this.registerPage != null) && (e.getSource() == registerPage.getEmailReg())) {
            rmvFocus(registerPage.getEmailReg());
        }
        if ((this.registerPage != null) && (e.getSource() == registerPage.getUseridReg())) {
            rmvFocus(registerPage.getUseridReg());
        }
        if ((this.registerPage != null) && (e.getSource() == registerPage.getPwdReg1())) {
            rmvFocus(registerPage.getPwdReg1());
        }
        if ((this.registerPage != null) && (e.getSource() == registerPage.getPwdReg2())) {
            rmvFocus(registerPage.getPwdReg2());
        }
    }

    /**
     * method implemented by the FocusListener
     *
     * @param e
     */
    @Override
    public void focusLost(FocusEvent e) {
    }

    /**
     * method used to log in a user
     *
     * @author Amit
     */
    private void logUser(){
        ArrayList<String> userDetails;

        try {
            //calls the method checkUser() to see if the user trying to log in exist
            userDetails = checkUser();

            if (!userDetails.isEmpty()) {
                openPage(userDetails);    //if the user exists the page will be directed to another page
            } else {
                JOptionPane.showMessageDialog(loginPage, "Username and/or password not valid!", "INVALID DETAILS", 0);
                nameErrMsg(loginPage.getuNameLogin(), loginPage.getuErrorLbl(), errColor, Boolean.TRUE);
                nameErrMsg(loginPage.getPwdLogin(), loginPage.getPswdErrorLbl(), errColor, Boolean.TRUE);
            }
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Login authentication failed");
            Logger.getLogger(LoginRegisterCont.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @author Amit
     * @return an ArrayList containing the user if exists, else it will return
     * an empty list if the user doesn't exist
     * @throws NoSuchAlgorithmException
     */
    private ArrayList<String> checkUser() throws NoSuchAlgorithmException {
        String username = loginPage.getuNameLogin().getText();
        String pswd = loginPage.getPwdLogin().getText();

        ArrayList<String> result = new ArrayList<>();
        if (!username.equals("") && !pswd.equals("")) {
            String queryPswd
                    = "SELECT user_pswd FROM User WHERE user_id = '" + username + "'";

            ArrayList<String> resultPswd = userMDL.queryData(queryPswd);

            if (!resultPswd.isEmpty()) {
                String storedPswd = resultPswd.get(0);

                if (isValidPwd(pswd, storedPswd) == true) {
                    //retrieve sql query
                    String query
                            = "SELECT * FROM User WHERE user_id= '" + username + "'"
                            + " AND user_pswd = '" + storedPswd + "'";

                    result = userMDL.queryData(query);
                }
            }
        } else {
            if (username.equals("")) {
                nameErrMsg(loginPage.getuNameLogin(), loginPage.getuErrorLbl(), errColor, Boolean.TRUE);
                JOptionPane.showMessageDialog(loginPage, "Please enter a valid username !", "INVALID DETAILS", 0);
            } else if (pswd.equals("")) {
                nameErrMsg(loginPage.getPwdLogin(), loginPage.getPswdErrorLbl(), errColor, Boolean.TRUE);
                JOptionPane.showMessageDialog(loginPage, "Please enter a valid password !", "INVALID DETAILS", 0);
            }

            result = new ArrayList<>(); //empty list because the user did not enter the login credentials
        }

        return result;
    }

    /**
     * opens the profile page
     *
     * @param userDetails an ArrayList with the user details
     */
    private void openPage(ArrayList<String> userDetails) {
        //storing the user details in variables that will be used to create an instance of UserMDL
        String userID = userDetails.get(0);
        String uName = userDetails.get(1);
        String uSurname = userDetails.get(2);
        String uEmail = userDetails.get(3);
        String langLvl = userDetails.get(5);
        String uType = userDetails.get(7);
        String groupID = userDetails.get(9);
        String appLang = userDetails.get(10);
        int uProgPoints = Integer.parseInt(userDetails.get(6));

        this.userMDL = new UserMDL(uName, uSurname, uEmail, langLvl, uProgPoints, uType, userID, groupID, appLang);

        //saving the login time into the database
        accessRecMDL.setLoginTime(userMDL.getUserID());
        accessRecMDL.storeAccessRecord(userMDL.getUserID());

        //switching pages
        loginPage.dispose();
        MenuBarCont menuCont = new MenuBarCont(userMDL, accessRecMDL);
        MenuBarV menu = new MenuBarV(menuCont);
        menuCont.activateBttn(menu.getProVBttn(), menu.getUListBttn(), menu.getDlgListBttn(), menu.getSettBttn());
        menu.setPageTitle("Profile");
        menu.setProgPageTopicContent(new ProgV(userMDL).getProgViewContent());
        menu.show();
    }

    /**
     * @author: Monesha
     * @Desc: This function validates the inputs entered by the user, then
     * registers the user officially
     * @param e: ActionEvent - This gets activated if the user presses the
     * register button
     * @throws NoSuchAlgorithmException
     */
    private void registerUser(ActionEvent e) throws NoSuchAlgorithmException {
        String uName = registerPage.getUserNameReg().getText().trim().toLowerCase();
        String uSurname = registerPage.getSurnameReg().getText().trim().toLowerCase();
        String uEmail = registerPage.getEmailReg().getText().trim();
        String uGroup = (String) registerPage.getGroupIdSelect().getSelectedItem();
        String userID = registerPage.getUseridReg().getText().trim().toLowerCase();

        String uPwd = registerPage.getPwdReg1().getText();
        String uPwdConfirm = registerPage.getPwdReg2().getText();
        boolean selectTermCond = registerPage.getTermsCond().isSelected();

        if (isRegDataValid(userID, uName, uSurname, uEmail, uGroup, uPwd, uPwdConfirm, selectTermCond) == true) {
            String currentUserID = userID;
            this.userMDL = new UserMDL(userID, uName, uSurname, uEmail, uGroup, "Student");

            String salt = getSalt(getRandomInteger(16, 40));
            String secure_pwd = generateSecurePwd(uPwd, salt);
            userMDL.insertRegDets(userID, uName, uSurname, uEmail, uGroup, secure_pwd);
            accessRecMDL.setLoginTime(userMDL.getUserID());
            accessRecMDL.storeAccessRecord(userMDL.getUserID());
            this.registerPage.dispose();

            MenuBarCont menuC = new MenuBarCont(userMDL, accessRecMDL); //added by Amit (start)
            MenuBarV menu = new MenuBarV(menuC);
            menuC.activateBttn(menu.getSettBttn(), menu.getProVBttn(), menu.getUListBttn(), menu.getDlgListBttn());
            SettingV setting = new SettingV(userMDL);
            this.settingPage = setting;
            this.menubar = menu;

            setting.setContListener(this); //added by Amit (end)
            userMDL.createLangData(currentUserID, settingPage.getLangList());
            menu.setPageTitle("Setting");
            menu.setPageTopicContent(settingPage.getSettingContent());
            menu.setVisible(true);
        }
    }

    //Checks if the userid is unique
    private boolean isUniqueID(String userID) {
        ArrayList<String> result;
        String query = "SELECT user_id FROM User WHERE user_id = '" + userID + "'";
        result = accessRecMDL.queryData(query);
        if (!result.isEmpty()) {
            System.out.println("user_id already used. Choose another user id");
            return false;
        } else {
            System.out.println("User id is unique");
            return true;
        }
    }

    /**
     * @author: Monesha
     * @Desc: Displays the error symbol and the turns the border to red (HCI)
     * @param txt:JTextField - Specifying the JTextField that needs to implement
     * action on
     * @param lbl:JLabel - The icon error being displayed
     * @param color: Colour - the warning colour
     * @param state: Boolean - If the icon state should be displayed / or not
     */
    private void nameErrMsg(JTextField txt, JLabel lbl, Color color, Boolean state) {
        txt.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, color));
        txt.setForeground(color);
        lbl.setVisible(state);
    }

    /**
     * @author: Monesha
     * @Desc: Displays the error symbol and the turns the border to red (HCI)
     * @param txt:JPasswordField - Specifying the JPasswordField that needs to
     * implement action on
     * @param lbl:JLabel - The icon error being displayed
     * @param color: Colour - the warning colour
     * @param state: Boolean - If the icon state should be displayed / or not
     */
    private void nameErrMsg(JPasswordField txt, JLabel lbl, Color color, Boolean state) {
        txt.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, color));
        lbl.setVisible(state);
    }

    //Checks if any input field entered by the user in the register page is empty
    private boolean isRegEmpty(String userID, String uName, String uSurname, String uEmail, String uGroup, String uPwd, String uPwdConfirm) {
        this.registerPage.getTermsCond().setForeground(new Color(238, 105, 94));
        String msgEpty = "Please fill in the necessary info of the form";
        if (uName.isEmpty() || uSurname.isEmpty() || uEmail.isEmpty() || uGroup.isEmpty() || uPwd.isEmpty() || uPwdConfirm.isEmpty()) {
            nameErrMsg(this.registerPage.getUserNameReg(), this.registerPage.getHiddenErr1(), errColor, true);
            nameErrMsg(this.registerPage.getSurnameReg(), this.registerPage.getHiddenErr2(), errColor, true);
            nameErrMsg(this.registerPage.getEmailReg(), this.registerPage.getHiddenErr3(), errColor, true);
            nameErrMsg(this.registerPage.getUseridReg(), this.registerPage.getHiddenErr4(),errColor, true);
            nameErrMsg(this.registerPage.getPwdReg1(), this.registerPage.getHiddenErr5(), errColor, true);
            nameErrMsg(this.registerPage.getPwdReg2(), this.registerPage.getHiddenErr6(),errColor, true);
            JOptionPane.showMessageDialog(null, msgEpty, "Problem", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    //Checks if all the details entered by the user is valid and follows the valid format
    public boolean isRegDataValid(String userID, String uName, String uSurname, String uEmail, String uGroup, String uPwd, String uPwdConfirm, boolean selectTermCond) {
        boolean emptyChceks = isRegEmpty(userID, uName, uSurname, uEmail, uGroup, uPwd, uPwdConfirm);
        if (emptyChceks == false) {
            return false;
        } else {
            if (selectTermCond == false) {
                String msgTC = "Please agree our terms and condition before using our application";
                JOptionPane.showMessageDialog(null, msgTC, "Problem", JOptionPane.ERROR_MESSAGE);
                this.registerPage.getTermsCond().setForeground(errColor);
                return false;
            } else {
                boolean isValidEmail = isValidEmail(uEmail);
                if (isValidEmail == false) {
                    String msgE1 = "Email not Valid";
                    JOptionPane.showMessageDialog(null, msgE1, "Problem", JOptionPane.ERROR_MESSAGE);
                    nameErrMsg(this.registerPage.getEmailReg(), this.registerPage.getHiddenErr3(), errColor, true);
                    return false;
                } else {
                    boolean isValidPwd = isValidPassword(uPwd);
                    if (isValidPwd == false) {
                        String msgVP = """
                                    Password is not valid. 
                                    Insert at least 8 chars. 
                                    Insert Lower case, uppercase, digit, special character at least once. Do not include any white spaces!""";
                        JOptionPane.showMessageDialog(null, msgVP, "Problem", JOptionPane.ERROR_MESSAGE);
                        nameErrMsg(this.registerPage.getPwdReg1(), this.registerPage.getHiddenErr5(), errColor, true);
                        return false;
                    } else {
                        if (!(uPwd.equalsIgnoreCase(uPwdConfirm))) {
                            String msgMP = "Password don't match";
                            JOptionPane.showMessageDialog(null, msgMP, "Problem", JOptionPane.ERROR_MESSAGE);
                            nameErrMsg(this.registerPage.getPwdReg1(), this.registerPage.getHiddenErr5(), errColor, true);
                            nameErrMsg(this.registerPage.getPwdReg2(), this.registerPage.getHiddenErr6(), errColor, true);
                            return false;
                        } else {
                            boolean isValidUserID = isUniqueID(userID);
                            if (isValidUserID == false) {
                                String msgUid = "User id is already in use.";
                                JOptionPane.showMessageDialog(null, msgUid, "Problem", JOptionPane.ERROR_MESSAGE);
                                nameErrMsg(this.registerPage.getUseridReg(), this.registerPage.getHiddenErr4(), errColor, true);
                                return false;
                            } else {
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
        System.out.println("Password being valid status: " + matcher.matches());
        return matcher.matches();
    }

    public boolean isValidEmail(String email) {
        //regex refer to user have to insert at least 8 chars. Lower case, uppercase, digit, special character occur at least once. No white spaces allowed.
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex); //Compiling the regex
        Matcher matcher = pattern.matcher(email);
        System.out.println("Email being valid status: " + matcher.matches());
        return matcher.matches();
    }

    //Methods by Monesha
    //Methods for GENERATING SECURE PASSWORDS 
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

    public static int getRandomInteger(int minNum, int maxNum) {
        return ((int) (Math.random() * (maxNum - minNum))) + minNum;
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
