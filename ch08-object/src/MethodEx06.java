/*

��������(Varargs; Variable ARGuments)
 - Ÿ���� ��ġ������ ������ ������ ������ ȣ��
 - �޼ҵ� ���ǽ� "..."��� ����ϸ� �˴ϴ�.
 - �޼ҵ� ȣ��� �ʿ��� ������ ���� �����ϰ� ������ �� �ֽ��ϴ�.
 
 
 ������ ����Ÿ�� �޼ҵ��(������Ÿ��... ������) {}	//���ڸ� �迭�� �޴´�.

*/
public class MethodEx06 {
	
	public void getNum(int num){
		System.out.println("���޵� ����: " + num);
	}
	
	public void argsTest(int ... n){
		for(int i=0; i<n.length; i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("----------");
	}

	public static void main(String[] args) {
		
		MethodEx06 m = new MethodEx06();
		m.getNum(50);
		m.argsTest(50, 60, 70);
		m.argsTest(22,33);
		m.argsTest(50, 60, 70, 100, 500, 9900, 800, 545);

	}

}
