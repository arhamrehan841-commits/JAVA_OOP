/*
------------------------------------------------------------
    Server.java

    Description:
    This program implements a simple TCP chat server.
    - The server listens on port 1000 and waits for a client to connect.
    - Once connected, both the server and client can send messages.
    - The chat continues until either side types "bye".
    - When "bye" is sent or received, both sides end the chat gracefully.

    Key Concepts:
    - Uses ServerSocket for listening to connections.
    - Uses Socket for communication between client and server.
    - Uses DataInputStream and DataOutputStream for message transfer.
    - Uses BufferedReader for reading user input from the console.
------------------------------------------------------------
*/

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {

        // Create a server socket that listens on port 1000
        ServerSocket ss = new ServerSocket(1000);
        System.out.println("Looking for a client....");

        // Wait until a client connects, then accept the connection
        Socket s = ss.accept();
        System.out.println("Connection successfully established\n");
        
        // For reading input from the server user (keyboard)
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // For receiving data (messages) from the client
        DataInputStream dis = new DataInputStream(s.getInputStream());
        
        // For sending data (messages) to the client
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        
        String fromClient = "";
        String toClient = "";

        // Chat continues until one side sends "bye"
        while (true)
        {
            // Receive message from client
            fromClient = dis.readUTF();
            System.out.println("Client : " + fromClient);
            
            // If client says "bye", end the chat
            if (fromClient.equalsIgnoreCase("bye"))
            {
                System.out.print("\nChat ended by client");
                break;
            }

            // Prompt the server user to type a message
            System.out.print("Server : ");
            toClient = in.readLine();   // Read message from keyboard

            // Send the typed message to the client
            dos.writeUTF(toClient);

            // If server says "bye", end the chat
            if (toClient.equalsIgnoreCase("bye"))
            {
                System.out.print("\nChat ended by server");
                break;
            }
        }

        // Close all resources (streams and sockets)
        in.close();
        dis.close();
        dos.close();
        s.close();
        ss.close();
    }
}
