package MainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static MainPackage.chat.jTextArea1;

public class ServerConnection implements Runnable {

    private Socket server;
    private BufferedReader in;
    static int count = 0;
    //private PrintWriter out;

    public ServerConnection(Socket s) throws IOException {
        server = s;
        in = new BufferedReader(new InputStreamReader(server.getInputStream()));
        //out = new PrintWriter (server.getOutputStream(), true );
    }

    @Override
    public void run() {
        try {
            while (true) {
                String serverResponse = in.readLine();
                if(serverResponse == null){
                    break;
                }
                
                jTextArea1.setText(jTextArea1.getText().trim()+"\n"+serverResponse);
                
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


