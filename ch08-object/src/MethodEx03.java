
public class MethodEx03 {

	public int add(int a, int b){
		return a + b;
	}
	
	public void print(){
		System.out.println("반환하는 데이터가 없는 메소드");
		
	}
	
	public static void main(String[] args) {
		
		MethodEx03 m = new MethodEx03();
		
		m.add(10,20);

	}

}
