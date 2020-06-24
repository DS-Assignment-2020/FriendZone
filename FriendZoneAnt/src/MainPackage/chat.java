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
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class chat extends javax.swing.JFrame {
    
    private static final String serverIP = "127.0.0.1";
    private static final int serverPORT = 9090;
    static Socket socket;
    static ServerConnection serverConn;
    static  BufferedReader keyboard;
    static PrintWriter outtoserver;
    static String specialid = "00000001";
    /**
     * Creates new form chat
     */
    public chat(String specialid) {
        initComponents();
        this.setLocationRelativeTo(null);
        entermsg.setBackground(new Color(0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        entermsg = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        send = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1800, 1012));

        close.setFont(new java.awt.Font("Arial Black", 0, 40)); // NOI18N
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        min.setFont(new java.awt.Font("Arial Black", 0, 40)); // NOI18N
        min.setText("—");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        entermsg.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        back.setText(" ");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        Name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Name.setText("name");

        search.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        send.setBackground(new java.awt.Color(0, 0, 0));
        send.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        send.setText(" ");
        send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginandregister/chat.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1650, 1650, 1650)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1640, 1640, 1640)
                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(entermsg, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1730, 1730, 1730)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(930, 930, 930)
                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(930, 930, 930)
                .addComponent(entermsg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        System.exit(0);
    }                                  

    private void backMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
//        addinterest f=new addinterest();
//        f.setVisible(true);
//        f.pack();
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }                                 

    private void minMouseClicked(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }                                

    private void sendMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        String msgout = "";
        msgout = entermsg.getText().trim();
        Encrypt enc = new Encrypt(msgout);
        storeMessage(enc.encrypt());
        outtoserver.println(msgout);
    }    
    
    public static void storeMessage(String clientinput){
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = DriverManager.getConnection(url, "root", "password");
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO message (message) VALUES('"+clientinput+"');");

            con.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
    
     public static String getUsername(String specialid){
        String username = "";
         try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
             System.out.println(specialid);
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        String specialid = "00000001";
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat(specialid).setVisible(true);
            }
        });
        
        try{
            System.out.println(specialid);
            socket = new Socket(serverIP, serverPORT);
            serverConn = new ServerConnection(socket);
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            outtoserver = new PrintWriter(socket.getOutputStream(), true);
            new Thread(serverConn).start();
            int count = 0;
            while (true) {
            //TrollMessage troll = new TrollMessage();
            String clientinput = "";
            
            if(count!=0){
                clientinput = keyboard.readLine();
                Encrypt enc = new Encrypt(clientinput);
                storeMessage(enc.encrypt());
            }
//            String afterTroll = troll.CompareVAdj(clientinput);
            jTextArea1.setText(jTextArea1.getText().trim()+"\n"+clientinput);
            outtoserver.println(clientinput);
            count++;
            if (clientinput.equalsIgnoreCase("quit")){
                break;
            }
//            int firstspace = clientinput.indexOf(" ");
//            if (firstspace != -1){
//                System.out.println("[me]: " + clientinput.substring(firstspace+1));
//            }else{
//                System.out.println("[me]: " + clientinput);
//            }
            
//            String serverResponse = serveroutput.readLine();
//            System.out.println("[Server]: " + serverResponse);
        }
        socket.close();
        System.exit(0);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            
        }
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Name;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private static javax.swing.JTextField entermsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel min;
    private javax.swing.JTextField search;
    private javax.swing.JLabel send;
    // End of variables declaration                   
}
