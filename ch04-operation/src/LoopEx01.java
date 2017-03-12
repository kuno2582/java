/*
무한 루프
- 모든 반복문은 무한 루프에 빠지지 않도록 주의!
- break;문과 함께 사용해 주어야 합니다.

while(true) {}

do{}while(true);

for(; true ;){}

*/
public class LoopEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		
		while(true){
			System.out.println(num);
			
			//무한반복을 빠져나오기 위한 구문
			if(num%17==0 && num%13==0)
				break;
			
			num++;
		}
		
		System.out.println("찾은 정수: " + num);
		

	}

}
