/*
패키지(Package)
 - 서로 관련있는 클래스, 인터페이스들을 하나로 묶어주는 단위
 - 클래스의 중복문제 해결
 - 패키지는 폴더로 된 계층 구초로 관리가 됩니다.
 - 패키지 선언문은 반드시 한번만 사용가능
 - 클래스 선언보다 먼저 와야합니다.
 - 패키지명의 중복을 피하기 위해서 도메인형식으로 지정
 - JDK에서 제공해주는 API도 패키지 형태로 제공되고 있습니다.
 
패키지 사용 방법
 - 패키지에 있는 특정 클래스를 사용하려면 import문을 추가해야 합니다. (같은 프로젝트 내의)
 
import 선언 형식
 - import 선언
 - *
 
 import 패키지명.클래스명;
 import com.package2.PackageEx;
 
 import 패키지명.*;
 
//------------------------------------------

 import University.Korea.Student;
 import University.America.Student;	//클래스명(student)가 중복이어서 적절하지 않음.

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
