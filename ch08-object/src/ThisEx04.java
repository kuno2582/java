/*

this ���

this			��ü �ڽ�
this.�������		�Ű������� ��ü �ڽ��� ������ �ִ� ��������� �̸��� ���� �� 
				���� �����ϱ� ���ؼ� ���
this(�Ű�����)		�ڽ��� �����ڸ� ����Ŵ 


*/
public class ThisEx04 {

	public static void main(String[] args) {
		
		Human h1 = new Human("����", 123456789, 42, 1, "ȣ��");
		Human h2 = new Human("�����", 52, 0, "���λ����");
		
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
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("����� ���̴� " + age + "�̱���.");
		System.out.println("����� ������ " + sex + "�̱���.");
		System.out.println("����� ������ " + position + "�̱���.");
		
		if(personID != 0){
			System.out.println("����� ID�� " + personID);
			System.out.println("�����ϼ���.");
		}else{
			System.out.println("�� Ŀ�� ������.");
		}
	}
	
}