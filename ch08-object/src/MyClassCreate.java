
public class MyClassCreate {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass();	//����Ʈ
		MyClass mc2 = new MyClass("ȣ����");
		MyClass mc3 = new MyClass("ȣ����",20);
		MyClass mc4 = new MyClass(35,"ȣ����");
		
		System.out.println(mc1.getName() + ", " + mc1.getAge());
		System.out.println(mc2.getName() + ", " + mc2.getAge());
		System.out.println(mc3.getName() + ", " + mc3.getAge());
		System.out.println(mc4.getName() + ", " + mc4.getAge());

	}

}
