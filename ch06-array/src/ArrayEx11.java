
public class ArrayEx11 {

	public static void main(String[] args) {
		
		int [][] arr = {
			{10},
			{20, 30},
			{40, 50, 60},
			{70, 80, 90, 100},
			{77,22}
		};
		
		System.out.println("�迭 ��ü ���� : " + arr.length);

		for(int i=0; i<arr.length; i++){
			System.out.println(i+"��° ����� ���� : " + arr[i].length);
		}
		
		System.out.println("----------");
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println("");
		}

	}

}
