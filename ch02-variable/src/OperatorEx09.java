/*
�� ������ (boolean ������)
true�� false ������ ������ �ٽ� �ѹ��� ���� �����ϴ� ������

&&	����	�־��� ���ǵ��� ��� true�� ��쿡�� -> true��ȯ
	AND


||	����	�־��� ���ǵ� �� �ϳ��� true�̸� -> true
	OR


!	����		true�̸� false
	NOT		false�̸� true


������ && ������		���
true	true		true
true	false		false
false	true		false
false	false		false

������ || ������		���
true	true		true	
true	false		true
false	true		true
false	false		false

!����	���
true	false
false 	true
*/
public class OperatorEx09 {
	
	public static void main(String[] args){
		boolean t, f, result;
		t = true;
		f = false;
		
		result = t && f;
		System.out.println("t && f: " + result);
		
		result = t || f;
		System.out.println("t || f: " + result);
		
		result = !t;
		System.out.println("!t: " + result);
		
	}
}
