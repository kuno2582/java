import java.util.Scanner;

/*
if ~else

if(���ǽ�){
	true�϶� ����Ǵ� ����
}else{
	false�϶� ����Ǵ� ����
}

*/
public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.println("������ ������ �ϳ��� �Է� > ");
		a = input.nextInt();
		
		if(a%2 == 1){	//Ȧ�� üũ
			System.out.println("Ȧ���Դϴ�.");
		}else{
			System.out.println("¦���Դϴ�.");
		}
		
		input.close();
		
	}

}
