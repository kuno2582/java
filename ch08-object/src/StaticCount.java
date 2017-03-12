/*
static변수
 - 객체 생성과 상관없이 초기화되는 변수
 - 하나만 선언되는 변수
 - = class변수


*/
public class StaticCount {

	int c;
	
	static int count;
	
	public StaticCount(){
		c++;
		count++;
	}

}
