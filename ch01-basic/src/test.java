import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int[] arr = {2, 5, 7, 5, 4, 6, 9};
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,len;
		
		System.out.println("첫번째 입력>");
		a = sc.nextInt();
		System.out.println("두번째 입력>");
		b = sc.nextInt();
		
		len = b-a;
		
		int count=0;
		int[] arr2=new int[arr.length-(len+1)];
		for(int i=0; i<arr.length; i++){
			if((i>=a)&&(i<=b))
				continue;
			arr2[count] = arr[i];
			count++;
		}
		
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+"\t");
		}
		
		sc.close();

	}

}
