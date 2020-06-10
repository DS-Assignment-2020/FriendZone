/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class SignupForm extends javax.swing.JFrame {

    /**
     * Creates new form SignupForm
     */

    public SignupForm() {
        initComponents();
        groupButton();
    }

    private void groupButton() {
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(female);
        bg1.add(male);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        min = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        gender = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        textusername = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        email = new javax.swing.JLabel();
        textemail = new javax.swing.JTextField();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        
         min.setFont(new java.awt.Font("Arial Black", 0, 40)); // NOI18N
        min.setForeground(new java.awt.Color(236, 240, 241));
        min.setText("—");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        
        

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        male.setText("Male");

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        female.setText("Female");

        gender.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        gender.setForeground(new java.awt.Color(87, 96, 111));
        gender.setText("Gender:");

        signup.setBackground(new java.awt.Color(46, 213, 115));
        signup.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign up");
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
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

        email.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        email.setForeground(new java.awt.Color(87, 96, 111));
        email.setText("E-mail:");

        textemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textemailActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Arial Black", 0, 40)); // NOI18N
        close.setForeground(new java.awt.Color(236, 240, 241));
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
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

        background.setIcon(new javax.swing.ImageIcon("friendzone (signup)..jpg")); // NOI18N
        background.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(940, 940, 940)
                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1730, 1730, 1730)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1660, 1660, 1660)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))        
            .addGroup(layout.createSequentialGroup()
                .addGap(810, 810, 810)
                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(670, 670, 670)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(male))
            .addGroup(layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(email))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
             .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))        
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(female))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String email_text = textemail.getText();
        String username_text = textusername.getText();
        String pass_word = new String(password.getPassword());
        String gender_select;
        if(male.isSelected())
            gender_select = "M";
        else if(female.isSelected())
            gender_select = "F";
        else
            gender_select = "?";
        
        String newID = newID();
        if(checkAccount(email_text).length()==8){
            ExistingUser<String,Character> signup = new ExistingUser(email_text,pass_word,username_text,gender_select,newID);
            signup.storeDatabase();
        }else{
            UserInfo<String,Character> signup = new UserInfo(email_text,pass_word,username_text,gender_select,newID);
            signup.storeDatabase();
        } 
    } 
    
    public String checkAccount(String email_text){
        String id = "";
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT specialid FROM signupuser WHERE email = '"+email_text+"';");
            while ( rs.next() ) {
                id = rs.getString("specialid");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        return id;
    }
    
    public String newID(){
        String id = "";
        int bigID = 0;
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection connect = DriverManager.getConnection(url, "root", "password");
            Statement query = connect.createStatement();
            ResultSet rs = query.executeQuery("SELECT specialid FROM signupuser;");
            while ( rs.next() ) {
                id = rs.getString("specialid");
                int temp = Integer.parseInt(id);
                if(temp>bigID)
                    bigID = temp;
            }
            connect.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        bigID +=1;
        String last_ID = Integer.toString(bigID);
        String finalID="";
        for(int i=0;i<8;i++){
            if(i<(8-last_ID.length())){
                finalID += "0";
            }else
                finalID += last_ID;
        }
        
        return finalID;
    }
    
    private void minMouseClicked(java.awt.event.MouseEvent evt) {
                 this.setState(JFrame.ICONIFIED);
            }

    private void textemailActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        System.exit(0);
    }                                  

    private void backMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        LoginForm f = new LoginForm();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel gender;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textusername;
    private javax.swing.JLabel username;
    private javax.swing.JLabel min;
    // End of variables declaration                   
}
