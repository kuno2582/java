import java.net.MalformedURLException;
import java.net.URL;

/*
URL 클래스
 - URL(Uniform Resource Locator): 인터넷상에서 접근가능한 자원의 주소를 표현하는 형식
 - URL을 이용해서 인터넷상의 다양한 프로토콜과 자원을 표시할 수 있습니다.
 - URL클래스는 URL을 추상화하여 만든 클래스
 - 인터넷상의 자원의 경로로 지정하여 필요한 정보를 추출할 수 있게 해주는 클래스
 
URL 구성
프로토콜://호스트주소:포트번호
http://kunoo.tistory.com:80/member/mem.jsp?name=hong
ftp://
telnet://


*/
public class URLEx01 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://java.sum.com/index.jsp?name=hong#content");
			//URL url = new URL("http://java.sum.com:80/index.jsp?name=hong#content");
			
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트명: " + url.getHost());
			System.out.println("포트번호: " + url.getPort());
			System.out.println("default 포트번호: " + url.getDefaultPort());
			System.out.println("패스: " + url.getPath());
			System.out.println("요청한 파일정보: " + url.getFile());
			System.out.println("쿼리: " + url.getQuery());
			
			System.out.println("레퍼런스: " + url.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
