/*

���(Inheritance)
 - ��ü�� Ư���� �״�� �����޴� �� �ٸ� ��ü�� ����� ��
 - Ư�� Ŭ����(super class)�� ������ �Ӽ��� ����� �ٸ� ���ο� Ŭ����(sub class)����
 	�����ϱ� ���� �´� Ŭ�����鰣�� ����
 - extends ���
 - �������, ����޼ҵ�� ��ӵ����� �����ڴ� ����� ���� �ʽ��ϴ�.
 - ����� ���� ������ Ŭ������ ���� �������� �Ծ��� �����ϰ� �����ϱ� ���ؼ�
 	����� ����ϰ� �˴ϴ�.
 - ��Ӱ��迡 �ִ� �� Ŭ���� ���̿��� IS-A���谡 �����ؾ� �մϴ�.
 - ����: ��ü�� ���뼺�� ���δ�. -> �ڵ��� ����ȭ
 
 
Ŭ���� ��� ����
 class Ŭ����B(sub class) extends Ŭ����A(super class) {}
 
  ����� �ϱ� ���� �غ�� Ŭ����, �����ִ� Ŭ����, ����� ���ִ� ��
 super class(���� Ŭ����, ����Ŭ����)
 base class(�⺻ Ŭ����, ���� Ŭ����, ��� Ŭ����)
 parent class(�θ� Ŭ����)
  
  Ư�� Ŭ�����κ��� ����� �޾� ���Ӱ� ���ǵǴ� Ŭ����, �����޴� Ŭ����, ����� �޴� ��
 sub class(���� Ŭ����)
 derivation class(���� Ŭ����, �Ļ� Ŭ����)
 child class(�ڽ� Ŭ����)

*/
package com.ext1;

class Parent {
	int a = 100;
}

class Child extends Parent{
	int b = 200;
	int a = 300;
}

public class Exten01 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		System.out.println(ch.a);

	}

}
