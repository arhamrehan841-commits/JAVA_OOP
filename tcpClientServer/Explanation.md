# Java TCP Client-Server Chat Application

This project demonstrates a simple TCP-based chat application in Java, consisting of a **Server** and a **Client**. They communicate over a network socket until either side sends `"bye"` to end the chat.

---

## Overview

- **Server**: Listens on a port for incoming connections from clients.
- **Client**: Connects to the server using the server's IP address and port.
- Both can **send and receive messages** in real-time.
- Chat continues in a loop until either the server or client types `"bye"`.

---

## How It Works

1. **Server Setup**:
   - The server creates a `ServerSocket` and waits for a client connection using `accept()`.
   - Once a client connects, a `Socket` is created for communication.

2. **Client Setup**:
   - The client creates a `Socket` to connect to the server.
   - Connection is established using the server's IP (e.g., `localhost`) and port number.

3. **Message Exchange**:
   - Both server and client use input/output streams:
     - `DataInputStream` or equivalent to **read incoming messages**.
     - `DataOutputStream` or equivalent to **send messages**.
   - User input is taken from the console using a reader (like `BufferedReader`).

4. **Chat Loop**:
   - The program runs a continuous loop:
     - Receive a message from the other side.
     - Display it on the console.
     - Take user input for the next message.
     - Send it to the other side.
   - The loop continues **until `"bye"` is sent or received**, which ends the chat.

5. **Closing Resources**:
   - After the chat ends, all streams and sockets are properly closed to free system resources.

---

## Key Points

- **Port and IP**: Server listens on a specific port; client must use the same port and server IP.
- **Real-time Communication**: Messages are sent and received immediately.
- **Termination Condition**: Chat ends cleanly when either side types `"bye"`.
- **Resource Management**: Always close sockets and streams after the chat to avoid resource leaks.
- **Local Testing**: Can run on the same machine using `localhost`, or across machines on a network using the server's IP.

---

## Running the Program

1. Start the **server** first; it waits for a client to connect.
2. Start the **client**, which connects to the server.
3. Begin chatting in the console.
4. Type `"bye"` on either side to end the chat.

---

This setup provides a simple yet complete example of a **TCP client-server communication in Java**, suitable for learning networking fundamentals and basic socket programming.
