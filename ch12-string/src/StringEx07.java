/*
indexOf(char ch)
 - ���� ���ڿ� ��ü���� ch���ڰ� ù��°�� �߰ߵ� ��ġ�� ��ȯ
 - -1 ��ȯ

indexOf(String str)
 - ���� ���ڿ� ��ü���� str�� ã�Ƽ� ù��° ��ġ�� ��ȯ
 - -1 ��ȯ


lastIndexOf(String str)
 - str���ڿ��� ������ ���°�� �ִ��� �� ��ġ�� ��ȯ

substring(int begin) //�ҹ����� �Ϳ� ������ ��.  
 -������ġ���� ���ڿ� �������� �ش��ϴ� ���ڿ��� ��ȯ�Ѵ�.
 
substring(int begin, int end)
 -������ġ���� ����ġ ������ ���Ե� ���ڿ��� ��ȯ�Ѵ�.
 -start <= index < end    -> ���۹��ڴ� �����ϳ�, �����ڴ� �������� �ʴ´�.

length()
 - ���ڿ� ���� ��ȯ

split(String regex)
 - ���ڿ��� ������ �и���(regex)�� �������� ���ڿ� �迭�� ��ȯ�Ѵ�.

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
