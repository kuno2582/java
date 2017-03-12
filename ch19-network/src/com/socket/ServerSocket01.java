package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
ServerSocket
TCP ���� ����
������ ���α׷�
Ŭ���̾�Ʈ ���α׷����� ���ӿ�û�ϱ⸦ �׽� ����ϰ� �ֽ��ϴ�.
�̷� ������ ����ϴ� Ŭ����
������ �ۼ��ϱ� ���� �ʿ��� ��� ����� ����
Ŭ���̾�Ʈ�� TCP��û�� ���� accept()�� ���ؼ� �ش� ��û�� �����ϰ� Ŭ���̾�Ʈ�� ����� �� �ִ�
������ ������ �� ��ȯ�մϴ�.

*/
public class ServerSocket01 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		//����� ���� ��Ʈ����ü, ����Ʈ������ ���
		OutputStream outputStream = null;
		PrintStream printStream = null;
		
		try {
			serverSocket = new ServerSocket(8989);
			System.out.println("Server waiting");
			
			socket = serverSocket.accept();
			outputStream = socket.getOutputStream();
			printStream = new PrintStream(outputStream);
			printStream.println("Hello. server connected!");
			
			printStream.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(serverSocket!=null){
					serverSocket.close();
				}
				if(outputStream!=null){
					outputStream.close();
				}
				if(printStream!=null){
					printStream.close();
				}
				if(socket!=null){
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Server disconnected!");
		}

	}

}
