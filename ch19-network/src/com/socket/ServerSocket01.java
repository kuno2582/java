package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
ServerSocket
TCP 서버 소켓
서버측 프로그램
클라이언트 프로그램에서 접속요청하기를 항시 대기하고 있습니다.
이런 역할을 담당하는 클래스
서버를 작성하기 위해 필요한 모든 기능을 제공
클라이언트의 TCP요청이 오면 accept()를 통해서 해당 요청을 수락하고 클라이언트와 통신할 수 있는
소켓을 생성한 후 반환합니다.

*/
public class ServerSocket01 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		//출력을 위한 스트림객체, 바이트단위로 출력
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
