/*

static �޼ҵ�
 - static������ ����
 

*/
public class StaticEx02_staticMethod {
	
	String s1 = "�ν��Ͻ� ����";
	static String s2 = "STATIC ����";

	public static String getString(){
		return s2;
	}
	
	public static void main(String[] args) {

		StaticEx02_staticMethod sc = new StaticEx02_staticMethod();
		System.out.println(sc.s1);
		
		System.out.println(StaticEx02_staticMethod.s2);
		System.out.println(s2);
		System.out.println(getString());
		
		StaticEx02_staticMethod st = new StaticEx02_staticMethod();
//		System.out.println(st.s2); ��õ���� �ʴ� static ȣ�� ���
		System.out.println(s2);
		System.out.println(st.s1);
		
	}

}
