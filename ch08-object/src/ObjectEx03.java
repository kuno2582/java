
/*

디폴트 생성자
 - 생성자를 정의하지 않았을 경우엔 호출되어지는 생성자입니다.

*/
public class ObjectEx03 {

	public static void main(String[] args) {
		
		Number myNumber1 = new Number(10);
		Number myNumber2 = new Number();
		
		System.out.println("myNumber1의 값: " + myNumber1.getNum());
		System.out.println("myNumber2의 값: " + myNumber2.getNum());
		instMethod(myNumber1);
		instMethod(myNumber2);
		System.out.println("myNumber1의 값: " + myNumber1.getNum());
		System.out.println("myNumber2의 값: " + myNumber2.getNum());

	}
	
	public static void instMethod(Number number){	//static이 있어야 객체생성없이 사용
		number.addNum(10);
	}

}

class Number {

	int num;
	
	public Number(){
		
	}
	
	public Number(int a){
		num = a;
		System.out.println("생성자 호출");
		System.out.println("전달된 인자값: " + a);
	}
	
	public void addNum(int n){
		num += n;
	}
	
	public int getNum(){
		return num;
	}
	
}