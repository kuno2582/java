package com.chat2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private ServerSocket serverSocket;
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	
	public EchoServer(int port){
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		while(true){
			
			try {
				System.out.println("클라이언트의 요청을 기다리는 중");
				
				Socket tcpSocket = serverSocket.accept();
				
				System.out.println("클라이언트 IP주소: " + 
					tcpSocket.getInetAddress().getHostAddress());
				
				//클라이언트로부터 입력 받은 객체를 처리하는 is
				is = tcpSocket.getInputStream();
				//InputStreamReader의 두번째 인자로 인코딩 타입을 지정할 수 있다.
				bufferR = new BufferedReader(new InputStreamReader(is,"UTF-8"));
				
				os = tcpSocket.getOutputStream();
				bufferW = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
				
				String message = bufferR.readLine();
				System.out.println("수신 메세지: " + message);
				
				//줄바꿈기호 덧붙이기
				message = message + System.getProperty("line.separator");
				
				bufferW.write(message);
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {	
				if(bufferW != null){try {bufferW.close();} catch (IOException e) {e.printStackTrace();}}
				if(os != null){	try {os.close();} catch (IOException e) {e.printStackTrace();}}
				if(bufferR != null){try {bufferR.close();} catch (IOException e) {e.printStackTrace();}}
				if(is != null){try {is.close();} catch (IOException e) {e.printStackTrace();}}
			}
		}
	}
	
	public static void main(String[] args) {
		
		new EchoServer(3000);

	}
}
