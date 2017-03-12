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
		s.getPrint("이름 : ");
		s.name = input.nextLine();
		s.getPrint("국어 점수 : ");
		s.korean = input.nextInt();
		s.getPrint("영어 점수 : ");
		s.english = input.nextInt();
		s.getPrint("수학 점수 : ");
		s.math = input.nextInt();
		
		s.getPrint("이름 : " + s.name);
		s.getPrint("국어 점수 : " + s.korean);
		s.getPrint("영어 점수 : " + s.english);
		s.getPrint("수학 점수 : " + s.math);
		s.getPrint("총점 : " + s.getSum());
		s.getPrint("평균 : " + s.getAvg());
		
		input.close();
	}

}
