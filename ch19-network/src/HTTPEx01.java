import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPEx01 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://www.naver.com");
		
		//http프로토콜을 가지고 데이터를 송수신할수 있게 해주는 클래스
		//URL객체로부터 커넥션객체정보를 얻어옴. 그리고 캐스팅하여 사용
		HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 

		conn.setDoInput(true);//입력상태(입력스트림)를 사용하겠다고 설정
		conn.setDoOutput(true);	//출력상태(출력스트림) 사용하겠다고 설정
		
		conn.setUseCaches(false);	//캐시를 사용하지 않겠다고 설정
		conn.setReadTimeout(20000);	//20초 뒤 리다이렉트
		conn.setRequestMethod("POST");	//GET방식을 사용하겠다
		
		
		StringBuffer stringBuffer = new StringBuffer();
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						conn.getInputStream()));
		
		for(;;){
			String line = br.readLine();
			
			if(line == null)
				break;
			
			stringBuffer.append(line + "\n");
		}
		
		//자원정리
		br.close();
		conn.disconnect();
		
		System.out.println(stringBuffer.toString());
	}

}
