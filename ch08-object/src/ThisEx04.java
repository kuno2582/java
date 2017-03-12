/*

this 용법

this			객체 자신
this.멤버변수		매개변수와 객체 자신이 가지고 있는 멤버변수의 이름이 같을 때 
				서로 구분하기 위해서 사용
this(매개변수)		자신의 생성자를 가리킴 


*/
public class ThisEx04 {

	public static void main(String[] args) {
		
		Human h1 = new Human("고영태", 123456789, 42, 1, "호빠");
		Human h2 = new Human("삼둥이", 52, 0, "국민삼둥이");
		
		h1.showInfo();
		h2.showInfo();

	}

}

class Human {
	
	private String name;
	private int personID;
	private int age;
	private int sex;
	private String position;
	
	public Human(String name, int personID, int age, int sex, String position){
		this.name = name;
		this.personID = personID;
		this.age = age;
		this.sex = sex;
		this.position = position;
	}
	
	public Human(String name, int age, int sex, String position){
		this(name, 0, age, sex, position);
	}
	
	public void showInfo(){
		System.out.println(name + "님 안녕하세요.");
		System.out.println("당신의 나이는 " + age + "이군요.");
		System.out.println("당신의 성별은 " + sex + "이군요.");
		System.out.println("당신의 별명은 " + position + "이군요.");
		
		if(personID != 0){
			System.out.println("당신의 ID는 " + personID);
			System.out.println("입장하세요.");
		}else{
			System.out.println("더 커서 오세요.");
		}
	}
	
}