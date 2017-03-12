package com.prac1;

import java.util.ArrayList;

class Pitem{
	String name;
	int num;
	static int count=0;
	
	Pitem(){
		num=count;
		count++;
	}
}

public class ArrayObject {

	public static void main(String[] args) {
		
		ArrayList<Pitem> al = new ArrayList<Pitem>();
		
		for(int i=0; i<10; i++){
			al.add(new Pitem());
		}
		
		for(Pitem p:al){
			System.out.println(p.num);
		}

	}

}
