
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Random;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;
import models.AccessRecordMDL;
import models.UserMDL;
import views.MenuBarV;
import views.RegisterV;
import views.SupportV;
import views.LoginV;
import views.ProgV;
import views.SettingV;
import views.SupportV2;


public class LoginRegisterCont implements ActionListener
{
    private LoginV loginPage;
    private UserMDL user;
    private SettingV settingPage ;
    private MenuBarV menubar;
    private int accessrecord_id ;
    private int user_id;
    AccessRecordMDL accessRecMDL;
    
    public LoginRegisterCont(LoginV loginPage) 
    {
        this.loginPage = loginPage;
        this.user = new UserMDL();
        this.accessRecMDL = new AccessRecordMDL();
    }
    public LoginRegisterCont(SettingV set, MenuBarV menubar) 
    {
        this.settingPage = set;
        this.user = new UserMDL();
        this.menubar = menubar;
        this.accessRecMDL = new AccessRecordMDL();
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        String test = e.getActionCommand();

        switch (test) {
            case "Login":
                if (checkUser() == true) {
                    //JOptionPane.showMessageDialog(loginPage, "", "Login", 1);
                    this.user = new UserMDL("", "", "", "", 0, "", 0, 0);
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
                loginPage.dispose();
                new RegisterV().show();
                break;

            case "Help":
                loginPage.dispose();
                new SupportV2().show();
                break;

            case "Logout":
                accessRecMDL.setLogoutTime(user_id,accessrecord_id);
                menubar.dispose();
                new LoginV().show();
                break;
        }
    }

    private Boolean checkUser() {
        String username = loginPage.getuNameLogin().getText();
        String pswd = loginPage.getPwdLogin().getText();

        //retrieve sql query
        String query
                = "SELECT user_email FROM User WHERE user_email= '" + username + "'"
                + " AND user_pass = '" + pswd + "'";

        user.getConnection();
        //String result = user.queryData(query, "user_email");

//        if(result.isBlank())
//            return false;
//        else 
//            return true;
        return true;
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
    
    public String generateSecurePwd(String password, String salt){
        //System.out.println("Password supplied: "+password);
        byte[] securePassword = hash(password.toCharArray(),salt.getBytes());
        String returnValue = Base64.getEncoder().encodeToString(securePassword);
        return salt + ":" + returnValue;
    }
    
    public boolean isValidPwd(String providedPwd, String storedPWD){
        boolean returnValue= false;
        String[] params = storedPWD.split(":");
        String sameSalt = params[0];
        
        //Generating new secure password with the same salt
        String newSecurePWD = generateSecurePwd(providedPwd,sameSalt);
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
