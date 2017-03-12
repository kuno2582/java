/*
public class ObjectEx01 {

	public static void main(String[] args) {
		
		Number myNumber = new Number();	//인자가 없는 생성자 = 디폴트 생성자
		
		System.out.println("메소드 호출 전 값: " + myNumber.getNum());
		
		//myNumber.addNum(10);
		instMethod(myNumber);
		
		System.out.println("메소드 호출 후 값: " + myNumber.getNum());

	}
	
	public static void instMethod(Number number){
		number.addNum(7);
		
	}

}

class Number{		//주클래스가 아니면 public을 붙이지 않는다
	
	int num = 0;
	
	public void addNum(int n){
		num += n;
	}
	
	public int getNum(){
		return num;
	}
	
}*/