/*

���� ������(Access modifier)
 - ����������, ����������
 - ������� ��ü �ڽŸ��� �Ӽ�, Ư���̹Ƿ� ��������� �����ϸ� �ȵ� ���� �ֽ��ϴ�.
 - ������� �ϱ� ���ؼ� ��ü�� ����鿡�� ���������ڸ� �ɾ��� �� �ֽ��ϴ�.
 - ���߰� �������� ���߰� �����ְ� ���� ���� �����ְ� �� �� �ֽ��ϴ�.
 
 
private		<	default		<	protected	<	public
Ŭ���� ����		<	������Ű��		<	��� Ŭ����		<	��� ��

*/
package com.america;



public class Student {

	public static void main(String[] args) {

		com.korea.Student instance = new com.korea.Student();
		instance.getMessage();
		
		Student student = new Student();
		student.getMessage();
	}
	
	void getMessage(){
		System.out.println("American Student");
	}

}
