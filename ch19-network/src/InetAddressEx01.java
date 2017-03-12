import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

/*
InetAddress
 - 자바에서 인터넷 주소에 관한 정보를 다루기 위해 모델링된 클래스
 - IP주소를 표현하고 제어하는 기능
 - InetAddress클래스는 내부적으로 컴퓨터에 설정된 Host Name(호스트 네임)서버를 자체적으로 가지고
 	주소를 표현해 주는 기능을 가지고 있습니다.

Host Name(호스트 네임)
kunoo.tistory.com <-> IP주소

*/
public class InetAddressEx01 {

	public static void main(String[] args) {
		
		//BufferedReader: 문자입력 스트림으로부터 문자를 읽어 들이거나 
		//문자를 출력하는 스트림으로부터 문자를 읽거나 보낼때 버퍼링기능과 함께 처리해주는 입출력 스트림
		//문자, 문자배열등을 보다 효율적으로 처리
		BufferedReader br = null;
		
		String url = null;
		
		InetAddress address;
		
		try{
			//InputStreamReader: 바이트를 읽어서 지정된 문자 인코딩에 따라 문자로 변환하는데 사용하는 클래스
			//한 문자씩 읽어옵니다.
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("웹사이트 주소 입력 > ");
			url = br.readLine();	//예외 발생 가능 부분이므로 try로 묶어줌
			
			address = InetAddress.getByName(url);	//인터넷 주소에 관한 정보를 InetAddress에 관한 객체 반환
			
			System.out.println("호스트 네임: " + address.getHostName());
			System.out.println("호스트 주소: " + address.getHostAddress());
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br!=null){
				try{
					br.close();	//외부자원 닫는 부분 + 예외 발생 가능한 부분
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

	}

}
