package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Runtime 클래스
 - 자바VM이 작동하는 시스템과의 인터페이스 역할을 하는 클래스
 - 운영체제에 대한 정보를 제공하는 클래스



*/
public class ClientSocket01 {

	public static void main(String[] args) throws IOException {
		
		String ip = "yahoo.com";
		//String pingResult = "";
		String pinCmd = "ping " + ip;
		
		Runtime runtime = Runtime.getRuntime();
		
		Process process = runtime.exec(pinCmd);
		
		BufferedReader input = new BufferedReader(
				new InputStreamReader(
						process.getInputStream()));
		
		String inputLine;
		while( (inputLine = input.readLine()) != null ){
			System.out.println(inputLine + "\n");
		}
		
		input.close();

	}

}
