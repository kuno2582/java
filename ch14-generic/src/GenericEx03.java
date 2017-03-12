
import static java.lang.System.out;

class GenericsEx<T>{
	T[] v;
	
	public void set(T[] str){
		v = str;
	}
	
	public void print(){
		for(T s:v){
			out.println(s);
		}
	}
}

public class GenericEx03 {

	public static void main(String[] args) {
		
		GenericsEx<String> t = new  GenericsEx<String>();
		
		String[] aStr = {"��","��","��","��","��","��"};
		t.set(aStr);
		t.print();

	}

}
