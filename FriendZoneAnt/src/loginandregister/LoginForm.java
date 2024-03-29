/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginandregister;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newtofriendzone = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        textusername = new javax.swing.JTextField();
        loginOtherAcc = new javax.swing.JLabel();
        createNewAcc = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        textemail1 = new javax.swing.JTextField();
        textemail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newtofriendzone.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        newtofriendzone.setForeground(new java.awt.Color(52, 73, 94));
        newtofriendzone.setText("New to Friendzone? ");

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        textusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textusernameActionPerformed(evt);
            }
        });

        loginOtherAcc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        loginOtherAcc.setForeground(new java.awt.Color(52, 73, 94));
        loginOtherAcc.setText("Log in with other account");
        loginOtherAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginOtherAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginOtherAccMouseClicked(evt);
            }
        });

        createNewAcc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        createNewAcc.setForeground(new java.awt.Color(255, 51, 51));
        createNewAcc.setText(" Create a new account");
        createNewAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createNewAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewAccMouseClicked(evt);
            }
        });

        email1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        email1.setForeground(new java.awt.Color(87, 96, 111));
        email1.setText("E-mail:");

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

        username.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        username.setForeground(new java.awt.Color(87, 96, 111));
        username.setText("Username:");

        pass.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        pass.setForeground(new java.awt.Color(87, 96, 111));
        pass.setText("Password: ");

        textemail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textemail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textemail1ActionPerformed(evt);
            }
        });

        textemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textemail.setIcon(new javax.swing.ImageIcon("C:\\Users\\Elaine Tee\\Downloads\\friend login..jpg")); // NOI18N
        textemail.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(textemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(810, 810, 810)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(loginOtherAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newtofriendzone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(createNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 1800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(username)
                .addGap(5, 5, 5)
                .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(email1)
                .addGap(5, 5, 5)
                .addComponent(textemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginOtherAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newtofriendzone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textusernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void createNewAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewAccMouseClicked
        // TODO add your handling code here:
        SignupForm f=new SignupForm();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_createNewAccMouseClicked

    private void loginOtherAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginOtherAccMouseClicked
        // TODO add your handling code here:
        ChooseAcc c=new ChooseAcc();
        c.setVisible(true);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_loginOtherAccMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if(!authenticate(textusername.getText(),new String(password.getPassword()))){
           LoginForm.infoBox("Incorrect email or password. Please try again", "Error");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void textemail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textemail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textemail1ActionPerformed

    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean authenticate(String email, String password){
       try{
            Scanner scan = new Scanner(new FileInputStream("Database.txt")); 
                while(scan.hasNextLine()){
                    String line = scan.nextLine();
                    String [] userinfo = line.split(" ");
                    if(userinfo[0].equals(email)){
                        if(password.equals(userinfo[1]))
                        return true;
                    }
            }
            }catch(FileNotFoundException e){
                System.out.println("Sorry, database could not be retrieved");
            }
        
        return false; 
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createNewAcc;
    private javax.swing.JLabel email1;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginOtherAcc;
    private javax.swing.JLabel newtofriendzone;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel textemail;
    private javax.swing.JTextField textemail1;
    private javax.swing.JTextField textusername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
