import java.util.Vector;

/*

제네릭(Generics)
 - 클래스를 정의할 때는 데이터 타입을 확정하지 않고 인스턴스를 생성할 때 데이터타입을 지정하는 방법을
 	제네릭이라고 합니다.
 - 컬렉션(자료구조), 객체들을 저장할 수 있는 구조를 제공해줍니다.
 - 제네릭은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미
 - 코드를 간결하게 작성할 수 있게 하는 기능

Vector 클래스
 - 제네릭을 사용할 수 있게 해주는 대표적인 클래스
 - 제네릭을 표현하기 위해서 클래스명 다음에 <>를 사용해서 자료형을 지정해야 합니다.

Vector<자료형> v = new Vector<자료형>();

Vector<String> v = new Vector<String>();

제네릭 사용시 별도의 형변환이 필요하지 않습니다.
벡터 클래스를 사용할 경우 원소들은 Object형으로 업캐스팅 되어져서 저장이 됩니다.
저장된 원소를 다시 추출할 경우에는 처음 저장 당시의 타입으로 다운캐스팅됩니다.
제네릭을 사용하면 다운캐스팅하지 않고도 원소 추출이 가능합니다.

//----------------------------------------------
확장 for문 (for-each문)
 - 배열의 일부가 아닌, 배열의 전체를 참조할 경우에 유용하게 사용할 수 있는 반복문
 - :(콜론) 왼쪽에는 배열의 값이 반복적으로 저장된 변수 선언
 - :(콜론) 오른쪽에는 반복대상(배열 or 컬렉션)이 위치합니다.
 - 저장된 원소타입은 배열 또는 컬렉션에 저장된 원소의 타입과 동일해야 합니다.
 - {} 부분은 일반적인 for문과 역할이 동일합니다.
 

for(저장원소의 자료형타입 변수:반복대상){
	일반적인 for문과 동일;
}



*/
public class GenericEx01 {

	public static void main(String[] args) {
		
		Vector<String> gen = new Vector<String>();
		
		gen.add("대한민국");
		gen.add("미국");
		gen.add("중국");
		gen.add("일본");
		
		String tmp;
		
		for(int i=0; i<gen.size() ;i++){	//벡터객체의 사이즈 측정 size()
			
			tmp = gen.get(i);	//n번째 요소를 가져오는 get(n)메소드,elementAt(n)
			System.out.println(i+"번째 요소: " + tmp);
			
		}
		
		for(String str: gen){
			System.out.println(str);
		}

	}

}
