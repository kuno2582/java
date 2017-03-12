/*
제네릭 클래스 정의 형식

접근제한자 class 클래스명<유형1, 유형2, ...>{

}

접근제한 class 클래스명<T>{
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
		
		mg1.setElement("안드로이드");
		System.out.println(mg1.getElement());
		
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		mg2.setElement(2016);
		System.out.println(mg2.getElement());

	}

}
