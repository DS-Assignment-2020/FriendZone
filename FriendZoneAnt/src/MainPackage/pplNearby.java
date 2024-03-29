/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author Owner
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class pplNearby extends javax.swing.JFrame {
    
    static int range = 0;
    static int searches = 0;
    static int i=0;
    static LinkedList<String> potential_matches = new LinkedList<>();
    String specialid;
    /**
     * Creates new form pplNearby
     */
    public pplNearby(String specialid) {
        this.specialid=specialid;
        initComponents();
        this.setLocationRelativeTo(null);
        search.setBackground(new Color(0,0,0,0));
        leftarrow.setBackground(new Color(0,0,0,0));
        rightarrow.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        search = new javax.swing.JButton();
        leftarrow = new javax.swing.JButton();
        rightarrow = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        interest = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        matches = new javax.swing.JLabel();
        distance = new javax.swing.JLabel();
        chat = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(false);


        search.setBackground(new java.awt.Color(52, 152, 219));
        search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        leftarrow.setBackground(new java.awt.Color(52, 152, 219));
        leftarrow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        leftarrow.setForeground(new java.awt.Color(255, 255, 255));
        leftarrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftarrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftarrowActionPerformed(evt);
            }
        });

        rightarrow.setBackground(new java.awt.Color(52, 152, 219));
        rightarrow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rightarrow.setForeground(new java.awt.Color(255, 255, 255));
        rightarrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightarrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightarrowActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.setText("username");

        location.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        location.setText("location");

        interest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        interest.setText("interest");

        num.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        num.setText("0");

        matches.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        matches.setText("0");

        distance.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        distance.setText("0");

        chat.setBackground(new java.awt.Color(204, 255, 255));
        chat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chat.setText("Chat ");
        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatActionPerformed(evt);
            }
        });

        bg.setIcon((new javax.swing.ImageIcon("pplnearby.jpg")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1500, 1500, 1500)
                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1210, 1210, 1210)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(819, 819, 819)
                .addComponent(rightarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(interest))
            .addGroup(layout.createSequentialGroup()
                .addGap(1500, 1500, 1500)
                .addComponent(matches, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1500, 1500, 1500)
                .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(leftarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(rightarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(630, 630, 630)
                .addComponent(interest))
            .addGroup(layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(matches, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(leftarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

                               
                              

    private void leftarrowActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(potential_matches.size()==1){
            
        }else if(i!=0){
            i-=1;
            displayInfo(i);
        }
        
    }                                         

    private void rightarrowActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(potential_matches.size()==1){
            
        }else if(i!=(potential_matches.size()-1)){
            i+=1;
            displayInfo(i);
        }
    }                                          

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        incrementRange();
        if(!potential_matches.isEmpty())
            potential_matches.clear();
        searches+=1;
        i=0;
        Distance dist = new Distance(range,specialid);
        LinkedList<String> distant_partners = dist.Main();
        if(!distant_partners.isEmpty()){
//            LinkedList<String> match_info = getUserInfo(potential_matches.get(i));
//            LinkedList<String> match_interests = getInterests(potential_matches.get(i));
//            username.setText(match_info.get(0));
//            location.setText(match_info.get(1));
//            String interest_text = "";
//            if(!match_interests.isEmpty()){
//                for(int i=0;i<match_interests.size();i++){
//                String uppercaseLetter = match_interests.get(i).substring(0,1).toUpperCase();
//                String uppercaseInterest = uppercaseLetter + match_interests.get(i).substring(1);
//                interest_text += uppercaseInterest+",";
//                }
//                StringBuilder minat = new StringBuilder(interest_text);
//                minat.deleteCharAt(interest_text.length()-1);
//                interest_text = minat.toString();
//            }
//            interest.setText(interest_text);
System.out.println(distant_partners);
            sortedInterest sort = new sortedInterest(distant_partners,specialid);
            potential_matches = sort.getPartners();
            System.out.println(potential_matches);
            displayInfo(i);
            String labelmatches = Integer.toString(potential_matches.size());
            matches.setText(labelmatches);
        }
         String labelrange = Integer.toString(range);
         distance.setText(labelrange);
        String labelsearches = Integer.toString(searches);
        num.setText(labelsearches);
    }
    
    public void displayInfo(int index){
         LinkedList<String> match_info = getUserInfo(potential_matches.get(index));
            LinkedList<String> match_interests = getInterests(potential_matches.get(index));
            username.setText(match_info.get(0));
            location.setText(match_info.get(1));
            String interest_text = "";
            if(!match_interests.isEmpty()){
                for(int i=0;i<match_interests.size();i++){
                String uppercaseLetter = match_interests.get(i).substring(0,1).toUpperCase();
                String uppercaseInterest = uppercaseLetter + match_interests.get(i).substring(1);
                interest_text += uppercaseInterest+",";
                }
                StringBuilder minat = new StringBuilder(interest_text);
                minat.deleteCharAt(interest_text.length()-1);
                interest_text = minat.toString();
            }
            interest.setText(interest_text);
    }
    
     public LinkedList<String> getInterests(String specialid){
        LinkedList<String> interests = new LinkedList<>();
         try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT interest FROM interestexample WHERE specialid = '"+specialid+"';");
            while ( rs.next() ) {
                String interest = rs.getString("interest");
                interests.add(interest);
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
         return interests;
    }
     
    public LinkedList<String> getUserInfo(String specialid){
        LinkedList<String> userinfo = new LinkedList<>();
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT username,location FROM signup WHERE specialid = '"+specialid+"';");
            while ( rs.next() ) {
                userinfo.add(rs.getString("username")+" ("+getGender(rs.getString("username"))+")");
                userinfo.add(rs.getString("location"));
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
            return userinfo;
    } 
    
    public static String getGender(String username){
         String gender = "";
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT gender FROM signup WHERE username = '"+username+"';");
            while ( rs.next() ) {
                gender = rs.getString("gender");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return gender;
    }
    
    public String getUsername(String specialid){
        String username = "";
         try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT username FROM signup WHERE specialid = '"+specialid+"';");
            while ( rs.next() ) {
                username = rs.getString("username");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
         return username;
    }

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
//        Server connect = new Server();
//        Client client1 = new Client();
//        Client client2 = new Client();
//        CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
//            Server connect = new Server();
//        });
//
//        CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
//            Client client1 = new Client();
//        });
//
//        CompletableFuture<Void> future3 = CompletableFuture.runAsync(()->{
//            Client client2 = new Client();
//        });
//
//        CompletableFuture<Void> future = CompletableFuture.allOf(future1, future2, future3); 
//            try {
//                future.get(); // this line waits for all to be completed
//            } catch (InterruptedException  | ExecutionException e) {
//         Handle
//        }
//        Client clientchat = new Client(getUsername(specialid),specialid);
        chat ch = new chat("00000001");
        ch.setVisible(true);
        ch.pack();
        ch.setLocationRelativeTo(null);
        ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.dispose();
    }  
    
    private int incrementRange(){
        return (range+=1000);
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
            java.util.logging.Logger.getLogger(pplNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pplNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pplNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pplNearby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            String username = "";
            String specialid = "";
            String location = "";
            String interest = "";
            public void run() {
                new pplNearby(specialid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel bg;
    private javax.swing.JButton chat;
    private javax.swing.JLabel close;
    private javax.swing.JLabel distance;
    private javax.swing.JLabel interest;
    private javax.swing.JButton leftarrow;
    private javax.swing.JLabel location;
    private javax.swing.JLabel matches;
    private javax.swing.JLabel num;
    private javax.swing.JButton rightarrow;
    private javax.swing.JButton search;
    private javax.swing.JLabel username;
    // End of variables declaration                   
}
