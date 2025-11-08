# Java TCP Client-Server Chat Application

This project demonstrates a simple TCP-based chat application in Java. It consists of a **Server** and a **Client** program that communicate over a network socket. The chat continues until either side sends the message `"bye"`.

---

## Table of Contents
1. [Overview](#overview)
2. [Files](#files)
3. [How It Works](#how-it-works)
4. [Code Explanation](#code-explanation)
   - [Server.java](#serverjava)
   - [Client.java](#clientjava)
5. [Running the Program](#running-the-program)
6. [Sample Output](#sample-output)

---

## Overview

- The **Server** listens on a specific port for incoming client connections.
- The **Client** connects to the server using the server's IP and port.
- Both can send and receive messages.
- The chat ends when either the server or client types `"bye"`.

---

## Files

1. **Server.java** – Implements the server-side of the chat.
2. **Client.java** – Implements the client-side of the chat.

---

## How It Works

1. **Server** creates a `ServerSocket` and waits for a connection using `accept()`.
2. **Client** creates a `Socket` to connect to the server.
3. Both server and client use:
   - `DataInputStream` to read incoming messages.
   - `DataOutputStream` to send messages.
   - `BufferedReader` to read user input from the console.
4. A `while(true)` loop handles sending and receiving messages.
5. If either side sends `"bye"`, the chat session ends, and all resources are closed.

---

## Code Explanation

### Server.java

```java
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1000); // Server listens on port 1000
        System.out.println("Looking for a client....");
        Socket s = ss.accept(); // Accept connection from client
        System.out.println("Connection successfully established\n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        String fromClient = "";
        String toClient = "";

        while(true) {
            // Receive message from client
            fromClient = dis.readUTF();
            System.out.println("Client : " + fromClient);

            // Check if client wants to end chat
            if(fromClient.equalsIgnoreCase("bye")) {
                System.out.print("\nChat ended by client");
                break;
            }

            // Send message to client
            System.out.print("Server : ");
            toClient = in.readLine();
            dos.writeUTF(toClient);

            // Check if server wants to end chat
            if(toClient.equalsIgnoreCase("bye")) {
                System.out.print("\nChat ended by server");
                break;
            }
        }

        // Close all resources
        in.close();
        dis.close();
        dos.close();
        s.close();
        ss.close();
    }
}
