/*

������ �����ε�
 - ��ü�� ������ �� �ִ� �پ��� ����� �����ϴ� ���
 - �޼ҵ� �����ε������ �Ȱ��� ����մϴ�.
 - ������ �����ε��� �ϳ��� Ŭ������ ���������ؼ� �پ��� ������ ��ü�� ������ �� �ְ� ���ݴϴ�.

*/
public class OverloadingEx04 {

	public static void main(String[] args) {
		
		Person man = new Person("�ּ���", 880102, 32);
		Person idol = new Person("ö��ö", 18);
		
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
		System.out.println(personName + "�� �ȳ��ϼ���!!!");
		if(personID !=0){
			System.out.println("����� ID: " + personID);
			System.out.println("�����ϼ���.\n");
		}else{
			System.out.println("����� ����: " + personAge);
			System.out.println("����� �̼������Դϴ�.\n���ư�����.\n");
		}
	}
}

