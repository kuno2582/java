
public class SwitchEx04 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String operator;
		String result="";
		
		System.out.println("한국어를 입력하세요.");
		operator = input.nextLine();

		switch(operator){
			case "안녕하세요" :{
				result = "Hello";
				break;
			}
			case "안녕히가세요" :{
				result = "Good Bye";
				break;
			}
			case "잘생겼네요" :{
				result = "You are handsome";
				break;
			}
			default :
				result = "머라카노";
				break;
		}
		
		System.out.println(result);
		
		input.close();
	}

}
