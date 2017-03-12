/*



*/
public class OverloadingEx01 {

	public static void main(String[] args) {
		
		OverloadingEx01 oe = new OverloadingEx01();
		
		oe.intLength(845938);
		oe.floatLength(3.14f);
		oe.stringLength("10000");
		
	}
	
	public void stringLength(String s){
		System.out.println("입력한 값의 길이: " + s.length());
	}
	
	public void intLength(int a){
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이: " + s.length());
	}
	
	public void floatLength(float f){
		String s = String.valueOf(f);
		System.out.println("입력한 값의 길이: " + s.length());
	}

}
