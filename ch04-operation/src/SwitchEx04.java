
public class SwitchEx04 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String operator;
		String result="";
		
		System.out.println("�ѱ�� �Է��ϼ���.");
		operator = input.nextLine();

		switch(operator){
			case "�ȳ��ϼ���" :{
				result = "Hello";
				break;
			}
			case "�ȳ���������" :{
				result = "Good Bye";
				break;
			}
			case "�߻���׿�" :{
				result = "You are handsome";
				break;
			}
			default :
				result = "�Ӷ�ī��";
				break;
		}
		
		System.out.println(result);
		
		input.close();
	}

}
