
public class Student1 {

	String name;
	int age;
	
	//�����Ϸ��� �ڵ����� ����Ʈ�����ڸ� ���������ݴϴ�.
	/*public Student1(){
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 student1 = new Student1();
		System.out.println(student1);
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		student1.name = "�ڰ���";
		student1.age = 400;
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		Student1 newstudent = new Student1();
		System.out.println(newstudent);
		
		newstudent.name = "�輱��";
		newstudent.age = 300;
		System.out.println(newstudent.name);
		System.out.println(newstudent.age);
		
	}

}
