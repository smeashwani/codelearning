package codelearning.basic.networking;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionHeader {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ducatindia.com/blog?page=3");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			for (int i = 1; i <= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}
			System.out.println(huc.getResponseCode());
			huc.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
