
public class Student1 {

	String name;
	int age;
	
	//컴파일러가 자동으로 디폴트생성자를 생성시켜줍니다.
	/*public Student1(){
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 student1 = new Student1();
		System.out.println(student1);
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		student1.name = "박가윤";
		student1.age = 400;
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		Student1 newstudent = new Student1();
		System.out.println(newstudent);
		
		newstudent.name = "김선익";
		newstudent.age = 300;
		System.out.println(newstudent.name);
		System.out.println(newstudent.age);
		
	}

}
