# 💬 Java TCP Chat Application

A simple **Client-Server chat system** built using **Java TCP sockets**.  
The client and server can send messages to each other until either side types **"bye"**, which ends the chat for both.

---

## 📁 Project Structure

📦 TCP_Chat_App
┣ 📜 Server.java
┣ 📜 Client.java
┗ 📜 README.md

yaml
Copy code

---

## 🚀 How It Works

- **Server.java**
  - Listens for client connections on port `1000`.
  - Receives and sends messages to the connected client.
  - Ends chat when either user sends `"bye"`.

- **Client.java**
  - Connects to the server running on `localhost` (port `1000`).
  - Allows two-way message exchange.
  - Ends chat when either side types `"bye"`.

---

## ⚙️ How to Run

### 1️⃣ Compile both programs
```bash
javac Server.java
javac Client.java
2️⃣ Start the Server
bash
Copy code
java Server
You’ll see:

css
Copy code
Looking for a client....
3️⃣ Start the Client (in another terminal)
bash
Copy code
java Client
You’ll see:

nginx
Copy code
Connection successfully established
Now start chatting between the two terminals!

💬 Example Conversation
Server Side

arduino
Copy code
Looking for a client....
Connection successfully established

Client : Hello
Server : Hi there!
Client : bye
Chat ended by client
Client Side

arduino
Copy code
Connection successfully established

Client : Hello
Server : Hi there!
Client : bye
Chat ended by client
🧠 Key Concepts
Concept	Description
ServerSocket	Creates a server that listens for connections.
Socket	Used by the client to connect to the server.
DataInputStream / DataOutputStream	For sending and receiving UTF messages.
BufferedReader	For reading user input from console.
equalsIgnoreCase("bye")	Used to check for chat termination command.

🪄 Notes
Make sure Server runs before the Client.

Both must use the same port number (1000).

Works locally (localhost), but you can use an IP address to connect over a network.

