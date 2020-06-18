package Chatsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class Client {

//    private static final String serverIP = "192.168.0.128";
    private static final String serverIP = "127.0.0.1";
    private static final int serverPORT = 9090;
    //private static ArrayList<Socket> allclientsocket;
    //private static HashMap<Integer, String> name;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(serverIP, serverPORT);
        
        ServerConnection serverConn = new ServerConnection(socket);
        //BufferedReader serveroutput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter outtoserver = new PrintWriter(socket.getOutputStream(), true);
        //name = new HashMap<Integer, String>();
        new Thread(serverConn).start();
        
        
//        System.out.println("Give yourself a name in the app");hello
//        String appname = keyboard.readLine();
////        allclientsocket.add(socket);
//        int a = 1;
//        name.put(1, appname);
//        for(HashMap.Entry m : name.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
        System.out.println("Please input your name in chat: ");
        System.out.print("> ");
        while (true) {
            //TrollMessage troll = new TrollMessage();
            
            String clientinput = keyboard.readLine();
            //String afterTroll = troll.CompareVAdj(clientinput);
            outtoserver.println(clientinput);
            
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
    }
}
