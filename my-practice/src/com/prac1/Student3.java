package com.prac1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student3 {
	public static void main(String[] args) throws IOException {
		int x = 5; // wait 2 seconds at most

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		while ((System.currentTimeMillis() - startTime) < x * 1000 && !in.ready()) {
			System.out.println('a');
		}
		if (in.ready()) {
			System.out.println("You entered: " + in.readLine());
		} else {
			System.out.println("You did not enter data");
		}
	}
}