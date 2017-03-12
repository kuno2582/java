package com.gen09;

public class GenericEx13 {

	public static <T> void showArrayData(T[] arr){
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("");
		for(T str : arr){
			System.out.println(str);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String[] strArr = new String[]{
			"Hi! Everyone!",
			"JAVA Generic Programming",
			"I'm Programmer"
		};
		
		Integer[] intArr = new Integer[]{10, 20, 30, 40, 50};
		
		showArrayData(strArr);
		showArrayData(intArr);

	}

}
