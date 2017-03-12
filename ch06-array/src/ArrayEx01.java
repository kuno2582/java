/*

배열 (array)
 - 같은 자료형을 여러개 모아둔 하나의 묶음(집합)을 의미
 - 하나의 배열은 하나의 객체로 인식합니다.
 
종류
1차원 배열
다차원 배열		1차원 배열이 여러개 있는 배열
객체형 배열		객체를 참조하는 참조변수들의 집함

배열 작업 단계
1	배열 선언
2	배열 생성
3	배열 초기화
4	배열 사용


배열 선언 방법
1방법:	배열 선언 및 생성
2방법:	배열 선언 및 생성, 초기화(명시적 배열 생성)
3방법:	배열 선언 및 생성, 초기화 C언어 배열 초기화 방법 비슷(암시적 배열 생성)


배열의 접근방법
 - 배열의 접근은 0부터 시작하는 인덱스 값을 사용하게 됩니다.
 - 배열의 크기 n이라면 가장 첫번째 배열요소의 인덱스는 0이고 
   n번째 요소의 인덱스는 n-1입니다.
 - 배열 인스턴스의 멤버변수 length에는 배열의 길이정보가 저장되어 있습니다.
 

*/
public class ArrayEx01 {

	public static void main(String[] args) {
		
		char[] ch;			//1단계
		
		ch = new char[4];	//2단계
		
		ch[0]='A';			//3단계
		ch[1]='O';
		ch[2]='A';
		ch[3]='!';
		
		ch[1]='K';
		
		System.out.println(ch);	//4단계
		
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
			
		}
		System.out.println("");
		System.out.println(ch[0]+ch[1]+ch[2]+ch[3]);
		
		
		//배열 선언방법 3가지
		int[] i = new int[7];
		char[] ch2 = new char[]{'H','E','L','L','O'};
		
		char[] ch3 = {'자','바'};
		
		System.out.println(i);
		System.out.println(ch2);
		System.out.println(ch3);
		
	}
}
