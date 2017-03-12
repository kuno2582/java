/*

생성자 오버로딩
 - 객체를 생성할 수 있는 다양한 방법을 제공하는 방식
 - 메소드 오버로딩방법과 똑같이 사용합니다.
 - 생성자 오버로딩은 하나의 클래스를 바탕으로해서 다양한 형태의 객체를 생성할 수 있게 해줍니다.

*/
public class OverloadingEx04 {

	public static void main(String[] args) {
		
		Person man = new Person("주수희", 880102, 32);
		Person idol = new Person("철수철", 18);
		
		man.showInfo();
		idol.showInfo();

	}

}

class Person{
	private String personName;
	private int personID;
	private int personAge;
	
	public Person(String name, int pID, int age){
		personName = name;
		personID = pID;
		personAge = age;
	}
	
	public Person(String name, int age){
		personName = name;
		personID = 0;
		personAge = age;
	}
	
	public void showInfo(){
		System.out.println(personName + "님 안녕하세요!!!");
		if(personID !=0){
			System.out.println("당신의 ID: " + personID);
			System.out.println("입장하세요.\n");
		}else{
			System.out.println("당신의 나이: " + personAge);
			System.out.println("당신은 미성년자입니다.\n돌아가세요.\n");
		}
	}
}

