package com.ext5;
/*

instanceof 연산자
 - 형변환이 가능한지를 묻는 연산자
 - 형변환이 가능하면 true
 - 형변환이 불가능하면 false
 
참조변수 instanceof 클래스명
참조변수가 클래스명의 클래스자료형으로 형변환 가능여부에 따라 true, false

*/

class Box {
	
	public void simpleWrap(){
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box {
	
	public void paperWrap(){
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox{
	
	public void goldWrap(){
		System.out.println("gold wrap");
	}
}

public class InstanceOfEx01 {
	
	public static void wrapBox(Box box){
		
		if(box instanceof GoldPaperBox)
			((GoldPaperBox)box).goldWrap();
		else if(box instanceof PaperBox)
			((PaperBox)box).paperWrap();
		else
			box.simpleWrap();
	}

	public static void main(String[] args) {
		
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

	}

}
