
public class MyClass {
	
	private String name;
	private int age;
	
	public MyClass(){
		name = "kuno";
	}
	
	public MyClass(String n){
		name = n;
	}
	
	public MyClass(String n, int a){
		name = n;
		age = a;
	}
	
	public MyClass(int a, String n){
		name = n;
		age = a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
}
