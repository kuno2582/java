/*
���׸� Ŭ���� ���� ����

���������� class Ŭ������<����1, ����2, ...>{

}

�������� class Ŭ������<T>{
	T s;
}

*/

class MyGeneric<T> {
	
	private T element;
	
	public void setElement(T data){
		element = data;
	}
	
	public T getElement(){
		return element;
	}
	
}

public class GenericEx02 {

	public static void main(String[] args) {
		
		MyGeneric<String> mg1 = new MyGeneric<String>();
		
		mg1.setElement("�ȵ���̵�");
		System.out.println(mg1.getElement());
		
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		mg2.setElement(2016);
		System.out.println(mg2.getElement());

	}

}
