/*
��Ű��(Package)
 - ���� �����ִ� Ŭ����, �������̽����� �ϳ��� �����ִ� ����
 - Ŭ������ �ߺ����� �ذ�
 - ��Ű���� ������ �� ���� ���ʷ� ������ �˴ϴ�.
 - ��Ű�� ������ �ݵ�� �ѹ��� ��밡��
 - Ŭ���� ���𺸴� ���� �;��մϴ�.
 - ��Ű������ �ߺ��� ���ϱ� ���ؼ� �������������� ����
 - JDK���� �������ִ� API�� ��Ű�� ���·� �����ǰ� �ֽ��ϴ�.
 
��Ű�� ��� ���
 - ��Ű���� �ִ� Ư�� Ŭ������ ����Ϸ��� import���� �߰��ؾ� �մϴ�. (���� ������Ʈ ����)
 
import ���� ����
 - import ����
 - *
 
 import ��Ű����.Ŭ������;
 import com.package2.PackageEx;
 
 import ��Ű����.*;
 
//------------------------------------------

 import University.Korea.Student;
 import University.America.Student;	//Ŭ������(student)�� �ߺ��̾ �������� ����.

*/
package com.package2;

//import com.package1.PackOneJellybeans;
import com.package1.PackOneIcecreamsandwich;

//import com.package1.*;

public class PackageEx {

	public static void main(String[] args) {
		
		//com.package2.PackTwoKitKat p2k = new com.package2.PackTwoKitKat();
		
		PackTwoKitKat p2k = new PackTwoKitKat();
		System.out.println(p2k.str);
		
		PackTwoLollipop p2l = new PackTwoLollipop();
		System.out.println(p2l.str);
		
		com.package1.PackOneJellybeans p1j = new com.package1.PackOneJellybeans();
		System.out.println(p1j.getStr());
		
		PackOneIcecreamsandwich p1i = new PackOneIcecreamsandwich();
		System.out.println(p1i.getStr());
		System.out.println(p1i.msg);

	}

}
