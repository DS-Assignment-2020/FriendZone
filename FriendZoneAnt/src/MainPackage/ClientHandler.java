package MainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import static MainPackage.chat.getUsername;
import static MainPackage.chat.specialid;

public class ClientHandler implements Runnable {
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    private ArrayList<ClientHandler> clients;
    private ArrayList<String> clientname = new ArrayList<String>();
    private static final String clientele  = getUsername(specialid);
//    private ArrayList<Socket> allclientsocket;
//    private HashMap<String, ArrayList<Socket>> name;
    
    public ClientHandler (Socket clientSocket, ArrayList<ClientHandler> clients) throws IOException{
        this.client = clientSocket;
        this.clients = clients;
//        name = new HashMap<String, ArrayList<Socket>>();
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintWriter (client.getOutputStream(), true );
    }
    
    @Override
    public void run() {
        TrollMessage troll = new TrollMessage();
        int count = 0;
        try {
//            String firstclientinput = in.readLine();
//            clientname.add(firstclientinput);
            while (true) {
                String clientinput = in.readLine();
                String afterTroll = troll.CompareVAdj(clientinput);
                if (clientinput.equalsIgnoreCase("quit")){
                    break;
                    
                }
                else/*(clientinput.startsWith("say"))*/{
//                    int firstspace = clientinput.indexOf(" ");
//                    if (firstspace != -1){
                        outToAll(clientele + ": " + afterTroll/*.substring(firstspace+1)*/);
                    }
//                System.out.println(count);
                //out.println(clientinput);
                //out.println("Let's chat!");
                count++;
            }
        } catch (IOException e){
            System.err.println("IO exception in client handler");
            System.err.println(e.getStackTrace());
        }finally {
            out.close();
            try{
                in.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }
    }

    public void outToAll(String message) {
        for (ClientHandler aClient : clients){
            aClient.out.println(message);
        }
    }
    
}
