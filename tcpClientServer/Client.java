/*
------------------------------------------------------------
    Client.java

    Description:
    This program implements a simple TCP chat client.
    - The client connects to a server running on localhost (port 1000).
    - Once connected, both the client and server can send messages.
    - The chat continues until either side types "bye".
    - When "bye" is sent or received, both sides close the connection gracefully.

    Key Concepts:
    - Uses Socket to connect to the server.
    - Uses DataInputStream and DataOutputStream for message transfer.
    - Uses BufferedReader for reading user input from the console.
------------------------------------------------------------
*/

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {

        // Create a socket and connect to the server running on localhost at port 1000
        Socket s = new Socket("localhost", 1000);
        System.out.println("Connection successfully established\n");

        // For reading input from the client user (keyboard)
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // For receiving messages sent by the server
        DataInputStream dis = new DataInputStream(s.getInputStream());

        // For sending messages to the server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        
        String toServer = "";
        String fromServer = "";

        // Chat continues until one side types "bye"
        while (true)
        {
            // Prompt the client user to type a message
            System.out.print("Client : ");
            toServer = in.readLine();

            // Send the typed message to the server
            dos.writeUTF(toServer);
            dos.flush();
            
            // If client types "bye", end the chat
            if (toServer.equalsIgnoreCase("bye"))
            {
                System.out.print("\nChat ended by client");
                break;
            }

            // Receive a message from the server
            fromServer = dis.readUTF();
            System.out.println("Server : " + fromServer);

            // If server says "bye", end the chat
            if (fromServer.equalsIgnoreCase("bye"))
            {
                System.out.print("\nChat ended by server");
                break;
            }
        }

        // Close all resources (streams and socket)
        in.close();
        dis.close();
        dos.close();
        s.close();
    }
}
