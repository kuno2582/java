/*

this
 - 객체 내에서 객체 자신을 나타내고 싶을 때 사용
 - 지역변수명과 멤버변수명을 구별해야 할 때 사용
 - 클래스 내에서 객체 자신을 가리킬 수 있는 유일한 레퍼런스

*/
public class ThisEx02 {

	String name;
	int age;
	
	public ThisEx02(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		ThisEx02 t = new ThisEx02("uno",26);
		
		System.out.println(t.name);
		System.out.println(t.age);

	}

}
