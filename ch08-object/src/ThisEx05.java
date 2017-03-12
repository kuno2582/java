
public class ThisEx05 {

	public static void main(String[] args) {
		
		People pp1 = new People();
		People pp2 = new People(18);
		People pp3 = new People("Hiro",18);
		People pp4 = new People("Claire",18,"Accountant");

		pp1.showInfo();
		pp2.showInfo();
		pp3.showInfo();
		pp4.showInfo();
	}

}

class People {
	private String name;
	private int age;
	private int sex;
	private String job;
	
	public People(String name, int age, int sex, String job){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.job = job;
	}
	
	public People(String name, int age, String job){
		this(name, age, 1, job);
	}
	
	public People(String name, int age){
		this(name, age, 1, null);
	}
	
	public People(int age){
		this(null, age, 1, null);
	}
	
	public People(){
		this(null, 0, 1, null);
	}
	
	public void showInfo(){
		System.out.println(name + "\t" + age + "\t" + sex + "\t" + job);
	}
	
}