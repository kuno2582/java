
public class Student2 {

	String name;
	int korean;
	int math;
	int english;
	int sum;
	float avg;
	
	public int sum(int a, int b, int c){
		return a+b+c;
	}
	
	public float avg(int a){
		return a/3;
	}
	
	public static void main(String[] args) {
	
		Student2 student = new Student2(); 
		
		student.name = "±èÀ±È£";
		student.korean = 100;
		student.math = 100;
		student.english = 97;
		
		student.sum = student.sum(student.korean, student.math, student.english);
		student.avg = student.avg(student.sum);
		
		/*student.sum = student.korean + student.math + student.english;
		student.avg = student.sum/3;*/
		
		System.out.println("ÀÌ¸§\t±¹¾î\t¼öÇĞ\t¿µ¾î\tÃÑÁ¡\tÆò±Õ");
		System.out.println(student.name + "\t" + student.korean + "\t" + 
			student.math + "\t" +
			student.english + "\t" + 
			student.sum + "\t" +
			student.avg + "\t"
		);
	
	}

}
