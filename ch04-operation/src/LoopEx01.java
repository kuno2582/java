/*
���� ����
- ��� �ݺ����� ���� ������ ������ �ʵ��� ����!
- break;���� �Բ� ����� �־�� �մϴ�.

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
			
			//���ѹݺ��� ���������� ���� ����
			if(num%17==0 && num%13==0)
				break;
			
			num++;
		}
		
		System.out.println("ã�� ����: " + num);
		

	}

}
