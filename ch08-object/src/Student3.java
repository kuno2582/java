import java.util.Scanner;

public class Student3 {

	String name;
	int korean;
	int english;
	int math;
	
	public int getSum(){
		return korean + english + math;
	}
	
	public int getAvg(){
		return getSum()/3;
	}
	
	public void getPrint(String str){
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Student3 s = new Student3();
		s.getPrint("�̸� : ");
		s.name = input.nextLine();
		s.getPrint("���� ���� : ");
		s.korean = input.nextInt();
		s.getPrint("���� ���� : ");
		s.english = input.nextInt();
		s.getPrint("���� ���� : ");
		s.math = input.nextInt();
		
		s.getPrint("�̸� : " + s.name);
		s.getPrint("���� ���� : " + s.korean);
		s.getPrint("���� ���� : " + s.english);
		s.getPrint("���� ���� : " + s.math);
		s.getPrint("���� : " + s.getSum());
		s.getPrint("��� : " + s.getAvg());
		
		input.close();
	}

}
