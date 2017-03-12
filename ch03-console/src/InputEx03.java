import java.util.Scanner;

public class InputEx03 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		/*System.out.println("당신의 이름은?");
		
		String str = keyboard.nextLine();
		System.out.println("안녕하세요. " + str + "님");
		
		
		System.out.println("씨 당신은 잘 생겼다고 생각하십니까?" + 
				"예(true)/아니오(false)로 답하세요.");
		
		boolean isTrue = keyboard.nextBoolean();
		
		if(isTrue == true){
			System.out.println("잘생겼군요.");
		}else{
			System.out.println("못생겼군요.");
		}*/
		
		/*System.out.println("당신과 짝궁의 영어점수는?");
		
		double num1 = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		double diff = num1 - num2;
		if(diff>0){
			System.out.println("당신이 "+diff+"만큼 더 높습니다.");
		}else{
			System.out.println("상대방이 "+(-diff)+"만큼 높습니다.");
		}*/
		
		System.out.println("당신의 키는?");
		double num3 = keyboard.nextDouble();
		
		System.out.println("당신의 키는 " + num3 + "입니다.");
		
		keyboard.close();

	}

}
