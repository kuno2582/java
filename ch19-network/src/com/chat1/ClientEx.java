package com.chat1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {

	static String serverIP = "192.168.200.48";
	
	public static void main(String[] args) {
		
		try {
			
			@SuppressWarnings("unused")
			String str;
			@SuppressWarnings("resource")
			Socket socket = new Socket(serverIP, 5000);
			
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			@SuppressWarnings("unused")
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("서버에 접속되었습니다.");
			
			while(true){
				str = dataInputStream.readUTF();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
