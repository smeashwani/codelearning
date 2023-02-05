package codelearning.basic.networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String argv[]) throws Exception {
		
		String modifiedSentence;
		Socket clientSocket = new Socket("localhost", 6789);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		System.out.print("Enter Msg:....");
		Scanner inFromUser = new Scanner(System.in);
		String sentence = inFromUser.next();
		outToServer.writeUTF(sentence + '\n');
		System.out.println("FROM SERVER: " + inFromServer.readLine());
		clientSocket.close();
	}
}
