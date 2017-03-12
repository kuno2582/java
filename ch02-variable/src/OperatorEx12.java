/*
비트 연산자
피연산자 즉 연산의 대상이 되는 값들을 내부적으로 bit(0/1)단위로 변경한 후
연산을 수행하는 연산자

&	비트단위 AND
1 & 1 	1
1 & 0	0
0 & 1	0
0 & 0	0


|	비트단위 OR
1 | 1 	1
1 | 0	1
0 | 1	1
0 | 0	0


^	배타적 OR(XOR)
1 ^ 1	0
1 ^ 0	1
0 ^ 1	1
0 ^ 0	0

~	피연자의 모든 비트를 반전시키는 결과를 반환
~1	0
~0	1
*/
public class OperatorEx12 {
	
	public static void main(String[] args){
						//128 64 32 16 8 4 2 1					
		int num1=5;		//0   0  0  0  0 1 0 1
		int num2=3;		//0   0  0  0  0 0 1 1	
		int num3=-1;	//1   1  1  1  1 1 1 1
		
		
		System.out.println(num1 & num2);
		//0   0  0  0  0 1 0 1
		//0   0  0  0  0 0 1 1
		//0   0  0  0  0 0 0 1 -> 1
		
		System.out.println(num1 | num2);
		//0   0  0  0  0 1 0 1
		//0   0  0  0  0 0 1 1
		//0   0  0  0  0 1 1 1
		//128 64 32 16 8 4 2 1
		
		
		System.out.println(num1 ^ num2);
		//0   0  0  0  0 1 0 1
		//0   0  0  0  0 0 1 1
		//0   0  0  0  0 1 1 0
		
		System.out.println(~num3);
		//1   1  1  1  1 1 1 1
		//0   0  0  0  0 0 0 0
	}

}
