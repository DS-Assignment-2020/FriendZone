package MainPackage;

import Chatsystem.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private static final int PORT = 9090;
    

    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(100);
    
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(PORT); //create server socket using port 9090
        
        while (true) {
            System.out.println("[Server] Waiting for client connection..");
            Socket clientSocket = listener.accept(); //accept connection from clientSocket
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            System.out.println("[Server] Connected to client from " + clientSocket);
            ClientHandler clientThread = new ClientHandler(clientSocket, clients);
            clients.add(clientThread);
            //out.println("Client " + clients.indexOf(clientThread) + ": ");
            pool.execute(clientThread);
        }

//        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        try {
//            while (true) {
//                String clientinput = in.readLine();
//                if (clientinput.equalsIgnoreCase("quit")){
//                    break;
//                }
//                //out.println(clientinput);
//                out.println("hey");
//            }
//        } finally {
//            clientSocket.close();
//            listener.close();
//        }
    }

}
