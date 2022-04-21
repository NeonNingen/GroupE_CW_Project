
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;
import models.AccessRecordMDL;
import models.UserMDL;
import views.MenuBarV;
import views.RegisterV;
import views.LoginV;
import views.ProgV;
import views.SettingV;
import views.SupportV2;

public class LoginRegisterCont implements ActionListener {

    private LoginV loginPage;
    private RegisterV registerPage;
    private UserMDL userMDL;
    private SettingV settingPage;
    private MenuBarV menubar;
    private SupportV2 supportPage;
    private int accessrecord_id;
    private String user_id;
    AccessRecordMDL accessRecMDL;

    public LoginRegisterCont(LoginV loginPage) {
        this.loginPage = loginPage;
        this.registerPage = new RegisterV();
        this.userMDL = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();
    }

    public LoginRegisterCont(SettingV set, MenuBarV menubar) {
        this.settingPage = set;
        this.userMDL = new UserMDL();
        this.menubar = menubar;
        this.accessRecMDL = new AccessRecordMDL();
    }

    public LoginRegisterCont(RegisterV reg) {
        this.registerPage = reg;
        this.userMDL = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();
    }

    public void choosingLang(ActionEvent e) {
        if (!(this.settingPage == null)) {
            String langChoice = (String) settingPage.getSelectLang().getSelectedItem();
            System.out.println("User choose language: " + langChoice);
            //this.settingPage.changeLangOrder(langChoice);
            //settingPage.getSelectLang().setSelectedItem(langChoice);
            //settingPage.setLangChoice(langChoice);
            settingPage.setSelectedLang(langChoice);
            userMDL.updateLangdb(user_id, langChoice);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        choosingLang(e);
        String test = e.getActionCommand();

        switch (test) {
            case "Login":
                if (checkUser() == true) {
                    //JOptionPane.showMessageDialog(loginPage, "", "Login", 1);
                    this.userMDL = new UserMDL("", "", "", "", "");
                    MenuBarV menu = new MenuBarV();
                    loginPage.dispose();
                    menu.setPageTitle("Profile");
                    menu.setProgPageTopicContent(new ProgV().getProgViewContent());
                    //menu.addHistBttn();
                    menu.show();
                    //Access the accessrecord id + store it locally
                    //INSERT INTO method
                    //new ProgV().show();
                } else {
                    JOptionPane.showMessageDialog(loginPage, "User and/or password incorrect!", "INVALID DETAILS", 0);
                }
                break;

            case "Register":
                if (e.getSource() == this.registerPage.getRegBttn()) {
                    String uName = registerPage.getNameReg().getText().trim().toLowerCase();
                    String uSurname = registerPage.getSurnameReg().getText().trim().toLowerCase();
                    String uEmail = registerPage.getEmailReg().getText().trim().toLowerCase();
                    String uGroup = (String) registerPage.getGroupIdSelect().getSelectedItem();
                    String uPwd = registerPage.getPwdReg1().getText().trim().toLowerCase();
                    String uPwdConfirm = registerPage.getPwdReg2().getText().trim().toLowerCase();
                    boolean selectTermCond = registerPage.getTermsCond().isSelected();
                    String userID = "w12236";

                    System.out.println("Display"
                            + "User name: " + uName + "\n"
                            + "User last name: " + uSurname + "\n"
                            + "User email: " + uEmail + "\n"
                            + "User Group:" + uGroup + "\n"
                            + "User pwd:" + uPwd + "\n"
                            + "userID:" + userID + "\n"
                            + "Did user select Item: " + selectTermCond + "\n");

                    // if(checkRegData(uName, uSurname, uEmail, uGroup, uPwd,uPwdConfirm,selectTermCond)==true){
                    this.userMDL = new UserMDL(userID, uName, uSurname, uEmail, uGroup);
                    userMDL.insertRegDetss(userID, uName, uSurname, uEmail, uGroup, uPwd);
                    this.registerPage.dispose();

                    MenuBarV menu = new MenuBarV();
                    menu.setPageTitle("Setting");
                    menu.setPageTopicContent(new SettingV(menu).getSettingContent());
                    menu.setVisible(true);
//                    }else{
//                        System.out.println("ENTER CORRECT DETAILS!");
//                    }

                } else if (e.getSource() == this.loginPage.getRegisterBttn()) {
                    loginPage.dispose();
                    this.registerPage = new RegisterV();
                    this.registerPage.setVisible(true);
                }
                break;

            case "Help":
                if (e.getSource() == this.registerPage.getSupportBttn()) {
                    this.registerPage.dispose();
                    this.supportPage = new SupportV2();
                    this.supportPage.setVisible(true);
                } else if (e.getSource() == this.loginPage.getSupportBttn()) {
                    loginPage.dispose();
                    new SupportV2().show();
                }
                break;

            case "Logout":
                accessRecMDL.setLogoutTime(accessrecord_id, user_id);
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

    private Boolean checkUser() {
        Boolean userExist = false;
        String username = loginPage.getuNameLogin().getText();
        String pswd = loginPage.getPwdLogin().getText();

        loginPage.getuNameLogin().setText("");
        loginPage.getPwdLogin().setText("");

        //retrieve sql query
        String query
                = "SELECT user_email FROM User WHERE user_email= '" + username + "'"
                + " AND user_pswd = '" + pswd + "'";

        userMDL.getConnection();
        ArrayList<String> result = userMDL.queryData(query);

//        if(!result.isEmpty())
//        {
//            userExist = true;
//        }
        // return userExist;
        return true;
    }

    public boolean checkRegData(String uName, String uSurname, String uEmail, String uGroup, String uPwd, String uPwdConfirm, boolean selectTermCond) {
        if (uName.isEmpty() && uSurname.isEmpty() && uEmail.isEmpty() && uGroup.isEmpty() && uPwd.isEmpty() && uPwdConfirm.isEmpty()) {
            System.out.println("Please fill in all the variables of the form");
            return false;
        } else {
            if (selectTermCond == false) {
                System.out.println("Please agrre our terms and condition before using our application");
                return false;
            } else {

                boolean isValidEmail = isValidEmail(uEmail);
                if (isValidEmail == false) {
                    System.out.println("Email not Valid");
                    return false;
                } else {
                    System.out.println("Email is valid");
                }

                boolean isValidPwd = isValidPassword(uPwd);
                if (isValidPwd = false) {
                    System.out.println("""
                                       Password is not valid. 
                                       Insert at least 8 chars. 
                                       Insert Lower case, uppercase, digit, special character at least once. Do not include any white spaces!""");
                    return false;
                } else {
                    System.out.println("Correct password format entered");
                    if (!(uPwd.equalsIgnoreCase(uPwdConfirm))) {
                        System.out.println("Please enter matching password!!");
                        return false;
                    } else {
                        System.out.println("All Registered details are entered correctly. Data is being processed...");
                        return true;
                    }
                }
            }
        }
    }

    public boolean isValidPassword(String password) {
        //regex refer to user have to insert at least 8 chars. Lower case, uppercase, digit, special character occur at least once. No white spaces allowed.
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex); //Compiling the regex
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean isValidEmail(String email) {
        //regex refer to user have to insert at least 8 chars. Lower case, uppercase, digit, special character occur at least once. No white spaces allowed.
        String regex = "/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/";
        Pattern pattern = Pattern.compile(regex); //Compiling the regex
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //Methods by Monesha
    //GENERATING SECURE PASSWORDS 
    private final int ITERATIONS = 100;
    private final int KEY_LENGHT = 256;

    public static String getSalt(int lenght) throws NoSuchAlgorithmException {
        //Secure Random generator
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt); //Generates salt
        String finalSalt = new String(salt, StandardCharsets.UTF_8);
        return finalSalt;
    }

    //Generate Hash of the password
    public byte[] hash(char[] password, byte[] salt) {
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

    public boolean isValidPwd(String providedPwd, String storedPWD) {
        boolean returnValue = false;
        String[] params = storedPWD.split(":");
        String sameSalt = params[0];

        //Generating new secure password with the same salt
        String newSecurePWD = generateSecurePwd(providedPwd, sameSalt);
        returnValue = newSecurePWD.equalsIgnoreCase(storedPWD);
        return returnValue; //IF TRUE password matches
    }

    //NEXT STEPS (for Monesha and Amit)
    //GET User password from the database
    //Input it into the function isValidPwd as a STRING
    //If the resutl of function isValidPwd is true THEN LOGIN
    //else Password incorrect
    //GENERATE password using generateSecurePwd
    //INPUT it into Database
}
