package com.chat2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	private String ip;
	private int port;
	
	private String str;
	BufferedReader br_file;
	
	public EchoClient(String ip, int port) throws IOException{
		this.ip = ip;
		this.port = port;
		
		Socket tcpSocket = getSocket();
		
		OutputStream os_socket = tcpSocket.getOutputStream();
		InputStream is_socket = tcpSocket.getInputStream();
		
		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os_socket,"UTF-8"));
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is_socket,"UTF-8"));
		
		System.out.println("ют╥б > ");
		br_file = new BufferedReader(new InputStreamReader(System.in));
		
		str = br_file.readLine();
		str += System.getProperty("line.separator"); //EOF (End Of File)
		
		bufferW.write(str);
		bufferW.flush();
		
		str = bufferR.readLine();
		System.out.println("Echo Result: " + str);
		
	}
	
	public Socket getSocket(){
		
		Socket tcpSocket = null;
		
		try {
			tcpSocket = new Socket(ip, port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		return tcpSocket;
		
	}
	
	public static void main(String[] args) {
		
		try {
			new EchoClient("192.168.200.21", 3000);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
