package com.dateex;
/*
java.util.Date
 - 연월일 시분초를 한꺼번에 출력할 때 사용
 - 연월일 시분초를 따로 구하고 싶은 경우에는 Calendar클래스를 사용



*/
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateEx01 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		/*System.out.println(now.toLocaleString());
		System.out.println(now.toGMTString());*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 E요일 a hh:mm:ss");
		String today = sdf.format(now);
		System.out.println(today);

		
	}

}
