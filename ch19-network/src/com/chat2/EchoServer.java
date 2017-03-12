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
				System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��");
				
				Socket tcpSocket = serverSocket.accept();
				
				System.out.println("Ŭ���̾�Ʈ IP�ּ�: " + 
					tcpSocket.getInetAddress().getHostAddress());
				
				//Ŭ���̾�Ʈ�κ��� �Է� ���� ��ü�� ó���ϴ� is
				is = tcpSocket.getInputStream();
				//InputStreamReader�� �ι�° ���ڷ� ���ڵ� Ÿ���� ������ �� �ִ�.
				bufferR = new BufferedReader(new InputStreamReader(is,"UTF-8"));
				
				os = tcpSocket.getOutputStream();
				bufferW = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
				
				String message = bufferR.readLine();
				System.out.println("���� �޼���: " + message);
				
				//�ٹٲޱ�ȣ �����̱�
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
