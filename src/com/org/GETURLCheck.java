package com.org;

import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;

public class GETURLCheck {
	public static HttpURLConnection con;

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/posts");
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setConnectTimeout(8000);
			con.setReadTimeout(3000);

			int output = con.getResponseCode();
			System.out.println("The response code for GET request triggered is: "+output);
			
			if(output==200) {
				System.out.println("Success");
			}
			else {
				System.out.println("failed");
			}

		} catch (ProtocolException e) {

			e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();
			
		
		}
	}
}
