package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Runtime Ŭ����
 - �ڹ�VM�� �۵��ϴ� �ý��۰��� �������̽� ������ �ϴ� Ŭ����
 - �ü���� ���� ������ �����ϴ� Ŭ����



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
