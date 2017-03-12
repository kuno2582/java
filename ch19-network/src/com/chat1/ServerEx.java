package com.chat1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	
	ServerSocket server;
	Socket socket;
	SocketEx client;
	
	public ServerEx(){
		try {
			server = new ServerSocket(5000);	//������ �����Ǿ� ��� ��ٸ�����
			
			while(true){
				
				socket = server.accept();
				client = new SocketEx(this, socket);
				client.start();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		new ServerEx();
		
	}

}
