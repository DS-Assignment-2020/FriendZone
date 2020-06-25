/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LoginExistingUser extends javax.swing.JFrame {

    /**
     * Creates new form LoginExistingUser
     */
    String email_text = "";
    String username_text = "";
    
    public LoginExistingUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        email = new javax.swing.JLabel();
        textemail = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        textusername = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(false);

        email.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        email.setForeground(new java.awt.Color(87, 96, 111));
        email.setText("E-mail:");

        textemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textemailActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        username.setForeground(new java.awt.Color(87, 96, 111));
        username.setText("Username:");

        textusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        pass.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        pass.setForeground(new java.awt.Color(87, 96, 111));
        pass.setText("Password: ");

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(52, 152, 219));
        login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Log In");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        back.setText("←");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });


        background.setIcon(new javax.swing.ImageIcon("friendzone loginwithacc..jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(810, 810, 810)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(email)
                .addGap(5, 5, 5)
                .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background)
        );

        pack();
    }// </editor-fold>                        

    private void textemailActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }
    
     private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(!authenticate(textemail.getText(),new String(password.getPassword()),textusername.getText())){
            LoginForm.infoBox("Incorrect email, password or username. Please try again", "Error");
        }else{
        String email_text = textemail.getText();
        String username_text = textusername.getText();
        addinterest c=new addinterest(email_text,username_text,getGender(username_text),getLocation(username_text));
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
    } 
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String getGender(String username){
        String gender = "";
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT gender FROM signup WHERE email = '"+textemail.getText()+"' AND username = '"+username+"';");
            while ( rs.next() ) {
                gender = rs.getString("gender");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return gender;
    }
    
    public String getLocation(String username){
        String loc = "";
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT location FROM signup WHERE email = '"+textemail.getText()+"' AND username = '"+username+"';");
            while ( rs.next() ) {
                loc = rs.getString("location");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        return loc;
    }
    
    private boolean authenticate(String email_text, String pass_word,String user){
        boolean check;
       try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT password,username FROM signup WHERE email = '"+email_text+"';");
            while ( rs.next() ) {
                String password = rs.getString("password");
                String username = rs.getString("username");
                if(pass_word.equals(password)&&user.equals(username))
                    return true;
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
       
        return false; 
    }

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void backMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        NewSignupForm c=new NewSignupForm();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                 

                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginExistingUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginExistingUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginExistingUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginExistingUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginExistingUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel email;
    private javax.swing.JButton login;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textusername;
    private javax.swing.JLabel username;
    // End of variables declaration                   
}

