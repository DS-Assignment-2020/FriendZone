/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author Owner
 */
public class Client {
    
    //    private static final String serverIP = "192.168.0.128";
    private static final String serverIP = "127.0.0.1";
    private static final int serverPORT = 9090;
    String specialid = "";
    String username = "";
    
    public Client(String username,String specialid){
     this.username=username;
     this.specialid=specialid;
        try{
        Socket socket = new Socket(serverIP, serverPORT);
        TrollMessage troll = new TrollMessage();
        ServerConnection serverConn = new ServerConnection(socket);
        //BufferedReader serveroutput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter outtoserver = new PrintWriter(socket.getOutputStream(), true);
        
        //name = new HashMap<Integer, String>();
        new Thread(serverConn).start();
        
         System.out.println("Please input your name in chat: ");
        System.out.print("> ");
        while (true) {
            
            
            String clientinput = keyboard.readLine();
            String afterTroll = troll.CompareVAdj(clientinput);
            System.out.println(afterTroll);
            outtoserver.println(afterTroll);
            
            if (clientinput.equalsIgnoreCase("quit")){
                break;
            }
             }
        socket.close();
        System.exit(0);
    }catch(IOException e){
            System.out.println("Sorry, we could not connect you to our server");
    }
    }
    
    

}
