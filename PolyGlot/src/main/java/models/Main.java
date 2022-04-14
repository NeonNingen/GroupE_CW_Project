
package models;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import views.LoginV;

public class Main {
    
    static JFrame mainFrame= new JFrame("Application Prototype version1.0");
    
    
    
    
    
    
    public static void main(String[] args) {
       //to test that everything works, UserModel was used to test the methods
   // UserModel user = new UserModel();
        
        //Dimension frameSize= new Dimension(414,667);
        //mainFrame.setPreferredSize(frameSize);
        openJFrame();
        

//       //calling the methodss
//       //user.insert();
 //      user.retrieveUserList();
//       //user.delete();
//       //user.update();
        
    }  
    public static void openJFrame(){
        LoginV loginPage = new LoginV();
        mainFrame.add(loginPage.getLoginPanel());
        mainFrame.pack();
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    public void changePanel(JPanel newPnl){
        mainFrame.removeAll();
        mainFrame.revalidate();
        mainFrame.repaint();
        mainFrame.add(newPnl);
    }
}
