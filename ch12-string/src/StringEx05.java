
public class StringEx05 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		if(str1.equals(str2))
			System.out.println("str1과 str2의 내용이 같습니다.");
		else
			System.out.println("str1과 str2의 내용이 다릅니다.");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("---------------------------");
		
		
		String msg1 = new String("World");
		String msg2 = new String("World");
		
		if(msg1 == msg2)
			System.out.println("msg1과 msg2는 동일 인스턴스 참조");
		else
			System.out.println("msg1과 msg2는 다른 인스턴스 참조");
		
		if(msg1.equals(msg2))
			System.out.println("msg1과 msg2는 내용이 같습니다.");
		else
			System.out.println("msg1과 msg2는 내용이 다릅니다.");
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg1.getClass());
		System.out.println(msg2.getClass());
		System.out.println(msg1.hashCode());
		System.out.println(msg2.hashCode());

	}

}
