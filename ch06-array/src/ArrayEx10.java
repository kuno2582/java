/*
������ �迭
- 1���� �迭�� ���� �� ���� �迭�� �ǹ�
- 99% 2���� �迭


2���� �迭
- 2������ ������ ������ �迭
- ���ο� ������ ���̸� ���� �迭�� �ν��Ͻ��� �����մϴ�.

����������[][] �迭�� = new ����������[����][����] 

*/

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int test[][];
//		
//		test = new int[2][3];
//		
//		test[0][0]=100;
//		test[0][1]=200;
//		test[0][2]=300;
//				
//		test[1][0]=400;
//		test[1][1]=500;
//		test[1][2]=600;
		
		int [][] test = {
				{100, 200, 300},
				{400, 500, 600}
		};
		
		for(int i=0; i<test.length; i++){
			for(int j=0; j<test[i].length; j++){
				
				System.out.println(test[i][j]);
				
			}
		}

	}

}
