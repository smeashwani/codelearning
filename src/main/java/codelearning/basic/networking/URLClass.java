package codelearning.basic.networking;

import java.net.URL;

public class URLClass {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ducatindia.com/blog?page=3");
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("Default Port Number: " + url.getDefaultPort());
			System.out.println("Query String: " + url.getQuery());
			System.out.println("Path: " + url.getPath());
			System.out.println("File: " + url.getFile());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
