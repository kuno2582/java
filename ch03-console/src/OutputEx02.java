/*

System.out.printf()
- 문자열의 중간에 삽입될 데이터를 가지고 
하나의 문자열을 조합해서 출력하기위한 메소드
- %서식문자로 어떤 데이터를 표시하겠다고 지정

*/

public class OutputEx02 {

	public static void main(String[] args) {

		System.out.printf("정수는 %d, 실수는 %f, "
				+ "문자는 %c, 문자열은 %s", 
				7, 3.14f, 'J', "Love");
	}

}
