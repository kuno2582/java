import java.nio.charset.Charset;

/*
인코딩(encoding)
 - 정보의 형태나 형식을 변환하는 처리 방식
 - 글자를 표현하는 방식을 인코딩이라고 많이 사용합니다.
 - 문자를 컴퓨터에 저장하거나 통신에 사용할 목적으로 부호화한 것

디코딩(decoding)
 - 부호화 된 문자를 원래대로 되돌리는 것


*/
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class StringEx09 {

	public static void main(String[] args) {
		
		String[] types = {"UTF-8", "EUC-KR", "ISO-8859-1"};	//대표적 3가지 인코딩타입
		String testValue = "한글";
		System.out.println("원본 글자: " + testValue);
		System.out.println("기본 Charset: " + Charset.defaultCharset());
		String encode_result = null;
		
		try{
			//객체를 가지고 도는 for문 = 확장for문
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
