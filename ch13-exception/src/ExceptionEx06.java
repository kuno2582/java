/*
throw 
예외를 인위적으로 발생
개발자가 의도적으로 예외를 발생시키고자 할 때 사용
사용자에게 왜 예외가 발생했는지 알리는 역할


throw new 예외클래스(인자);



*/
public class ExceptionEx06 {
	
	public void methodA(String[] a) throws Exception{
		
		if(a.length > 0){
			for(int i=0; i<a.length; i++){
				System.out.println("a[" + i + "]: " + a[i]);
			}
		}else{
			throw new Exception("입력한 데이터가 없습니다.");
		}
		
	}

	public static void main(String[] args) {
		
		ExceptionEx06 ex = new ExceptionEx06();
		
		
		
		try{
		
			ex.methodA(args);
			
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}

	}

}
