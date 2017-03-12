package com.inner4;

abstract class TestAbst {
	int data = 1234567;
	
	public abstract void printData();
}

public class AnonymousEx03 {
	
	//±¸ÇöºÎ 
	TestAbst inn = new TestAbst(){
		@Override
		public void printData(){
			System.out.println("data: " + data);
		}
	};

	public static void main(String[] args) {
		
		AnonymousEx03 anony = new AnonymousEx03();
		anony.inn.printData();

	}

}
