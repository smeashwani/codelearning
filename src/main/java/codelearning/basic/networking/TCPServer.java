package codelearning.basic.networking;

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String argv[]) throws Exception 
    { 
      ServerSocket welcomeSocket = new ServerSocket(6789);
      System.out.println("Waiting to connect...");
      Socket connectionSocket = welcomeSocket.accept();
      System.out.println("Connected....");
      DataInputStream inFromClient  = new DataInputStream(connectionSocket.getInputStream());
      DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
      String clientSentence = inFromClient.readUTF();
      System.out.println("From Client:"+ clientSentence);
      outToClient.writeBytes(clientSentence.toUpperCase() + '\n'); 
    }
}
