package codelearning.basic.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String argv[]) throws Exception 
    { 
      String clientSentence; 
      ServerSocket welcomeSocket = new ServerSocket(6789); 
      Socket connectionSocket = welcomeSocket.accept(); 
      DataInputStream inFromClient  = new DataInputStream(connectionSocket.getInputStream());
      DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
      clientSentence = inFromClient.readUTF(); 
      outToClient.writeBytes(clientSentence.toUpperCase() + '\n'); 
    }
}
