
public class StringEx06 {

	public static void main(String[] args) {
		
		String str1 = "Java" + "Love";
		String str11 = "Java".concat("Like");
		System.out.println(str1);
		System.out.println(str11);
		
		String str2 = "Java" + 'A';
		String str22 = "Java".concat(String.valueOf('A'));
		System.out.println(str2);
		System.out.println(str22);
		
		String str3 = "Java" + 3;
		String str33 = "Java".concat(String.valueOf(3));
		System.out.println(str3);
		System.out.println(str33);
		
		String str4 = 4 + "Java" + 7;
		String str44 = String.valueOf(3).concat("Java").concat(String.valueOf(7));
		System.out.println(str4);
		System.out.println(str44);

		str4 += "!";
		System.out.println(str4);
	}

}
