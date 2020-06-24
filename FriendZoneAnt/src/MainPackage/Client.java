/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import static MainPackage.chat.jTextArea1;
import static MainPackage.chat.keyboard;
import static MainPackage.chat.outtoserver;
import static MainPackage.chat.storeMessage;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import static MainPackage.chat.jTextArea1;

/**
 *
 * @author Owner
 */
public class Client {
    
    //    private static final String serverIP = "192.168.0.128";
    private static final String serverIP = "127.0.0.1";
    private static final int serverPORT = 9090;
    String username = "";
    
    public Client(String username){
     this.username=username;
        try{
        Socket socket = new Socket(serverIP, serverPORT);
        TrollMessage troll = new TrollMessage();
        ServerConnection serverConn = new ServerConnection(socket);
        //BufferedReader serveroutput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter outtoserver = new PrintWriter(socket.getOutputStream(), true);
        
        //name = new HashMap<Integer, String>();
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
        socket.close();
        System.exit(0);
    }
        }catch(IOException e){
            System.out.println("Sorry, we could not connect you to our server");
    }
    }
    
    

}
