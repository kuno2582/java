
public class RecursiveEx02 {

	public static void main(String[] args) {
		
		showJava(4);

	}
	
	public static void showJava(int cnt){
		System.out.println("JAVA");
		
		if(cnt==1)	//종료조건이 재귀호출문 전에 있어야한다.
			return;
		
		showJava(--cnt);	//선감소, 후감소 주의! ex) cnt--
		
		
	}

}
