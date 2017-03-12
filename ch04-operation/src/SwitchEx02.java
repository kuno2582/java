
public class SwitchEx02 {

	public static void main(String[] args) {
		
		char a = 'A';
		
		switch(a){
		case 'A':
			System.out.println("A 출력했습니다.");
			break;
		case 'B':
			System.out.println("B 출력했습니다.");
			break;
		case 'C':
			System.out.println("C 출력했습니다.");
			break;
		default:
			System.out.println("A,B,C 가 아닌 문자");
			break;
		}

	}

}
