import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/*
URLConnection 클래스
 - URL이 가리키는 리소스에 대한 연결을 나타내는 클래스
 - URLConnection 클래스는 원격 자원에 접근하는데 필요한 정보를 가지고 있음
 - 원격서버의 헤더정보, 해당자원의 길이, 타입정보, 언어등의 정보
 - URL클래스는 원격서버 자원에 대한 정보만 가지고 있습니다.
   URLConnection클래스는 원격서버 자원에 대한 정보와 원격서버의 헤더정보까지 가지고 있는 클래스



*/
public class URLConnectionEx01 {

	public static void main(String[] args) {
		
		URL url = null;
		URLConnection uc = null;
		
		try {
			url = new URL("http://www.naver.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		try {
			//URLConnection클래스는 new가 아닌 다른 추상메소드를 이용해서 생성자를 호출한다
			uc = url.openConnection();
			uc.connect();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("uc: " + uc.toString());
		System.out.println("Interaction: " + uc.getAllowUserInteraction());
		
		try{
			System.out.println("content: " + uc.getContent());
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println("encoding: " + uc.getContentEncoding());
		System.out.println("length: " + uc.getContentLength());
		System.out.println("type: " + uc.getContentType());
		//1970년 1월 1일 이후로 날짜를 센 결과
		System.out.println("date: " + uc.getDate());
		//Date클래스를 이용한 출력
		System.out.println("date(Date): " + new Date(uc.getDate()));

	}

}
