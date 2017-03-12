
public class MyClassCreate {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass();	//µğÆúÆ®
		MyClass mc2 = new MyClass("È£¶ûÀÌ");
		MyClass mc3 = new MyClass("È£¶ûÀÌ",20);
		MyClass mc4 = new MyClass(35,"È£¶ûÀÌ");
		
		System.out.println(mc1.getName() + ", " + mc1.getAge());
		System.out.println(mc2.getName() + ", " + mc2.getAge());
		System.out.println(mc3.getName() + ", " + mc3.getAge());
		System.out.println(mc4.getName() + ", " + mc4.getAge());

	}

}
