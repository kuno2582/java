/*
indexOf(char ch)
 - 현재 문자열 객체에서 ch문자가 첫번째로 발견된 위치를 반환
 - -1 반환

indexOf(String str)
 - 현재 문자열 객체에서 str을 찾아서 첫번째 위치를 반환
 - -1 반환


lastIndexOf(String str)
 - str문자열이 마지막 몇번째에 있는지 그 위치를 반환

substring(int begin) //소문자인 것에 주의할 것.  
 -시작위치부터 문자열 끝까지에 해당하는 문자열을 반환한다.
 
substring(int begin, int end)
 -시작위치부터 끝위치 범위에 포함된 문자열을 반환한다.
 -start <= index < end    -> 시작문자는 포함하나, 끝문자는 포함하지 않는다.

length()
 - 문자열 길이 반환

split(String regex)
 - 문자열로 지정된 분리자(regex)로 나누어진 문자열 배열을 반환한다.

*/
public class StringEx07 {

	public static void main(String[] args) {
				   // "0123456789101112"
		String name = "Hong Kill Dong";

		int index = name.indexOf('n');
		System.out.println(index);

		index = name.indexOf("kill");
		System.out.println(index);

		index = name.lastIndexOf('n');
		System.out.println(index);

		char c = name.charAt(index);
		System.out.println(c);

		index = name.indexOf('K');
		System.out.println(index);

		String str = name.substring(index);
		System.out.println(str);

		index = 5;
		str = name.substring(index, index + 4);
		System.out.println(str);
		
		int length = name.length();
		System.out.println(length);
		
		String[] arr = name.split(" ");
		for(int i=0; i<arr.length; i++){
			System.out.println("arr[" + i + "]: " + arr[i]);
		}

	}

}
