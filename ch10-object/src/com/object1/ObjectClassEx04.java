package com.object1;

public class ObjectClassEx04 {

	public static void main(String[] args) {
		
		ObjectClassEx04 ob = new ObjectClassEx04();
		
		System.out.println("ob: " + ob);	//�ڵ����� toString()����
		
		System.out.println("toString(): " + ob.toString()); //16������ ���
		
		System.out.println("getClass(): " + ob.getClass()); //Ŭ���� ��������
		
		System.out.println("hashCode(): " + ob.hashCode());

	}

}
