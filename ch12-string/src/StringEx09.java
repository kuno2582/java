import java.nio.charset.Charset;

/*
���ڵ�(encoding)
 - ������ ���³� ������ ��ȯ�ϴ� ó�� ���
 - ���ڸ� ǥ���ϴ� ����� ���ڵ��̶�� ���� ����մϴ�.
 - ���ڸ� ��ǻ�Ϳ� �����ϰų� ��ſ� ����� �������� ��ȣȭ�� ��

���ڵ�(decoding)
 - ��ȣȭ �� ���ڸ� ������� �ǵ����� ��


*/
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class StringEx09 {

	public static void main(String[] args) {
		
		String[] types = {"UTF-8", "EUC-KR", "ISO-8859-1"};	//��ǥ�� 3���� ���ڵ�Ÿ��
		String testValue = "�ѱ�";
		System.out.println("���� ����: " + testValue);
		System.out.println("�⺻ Charset: " + Charset.defaultCharset());
		String encode_result = null;
		
		try{
			//��ü�� ������ ���� for�� = Ȯ��for��
			for(String type : types){
				
				encode_result = URLEncoder.encode(testValue, type);
				System.out.println("encode with " + type + " : " + URLEncoder.encode(testValue, type));
				
				for(String type2 : types){
					System.out.println("decode with " + type2 + " : "
					+ URLDecoder.decode(encode_result, type2));
				}
				
			}
		}catch(UnsupportedEncodingException e){
			
		}
		
	}

}
