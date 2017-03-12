import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPEx01 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://www.naver.com");
		
		//http���������� ������ �����͸� �ۼ����Ҽ� �ְ� ���ִ� Ŭ����
		//URL��ü�κ��� Ŀ�ؼǰ�ü������ ����. �׸��� ĳ�����Ͽ� ���
		HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 

		conn.setDoInput(true);//�Է»���(�Է½�Ʈ��)�� ����ϰڴٰ� ����
		conn.setDoOutput(true);	//��»���(��½�Ʈ��) ����ϰڴٰ� ����
		
		conn.setUseCaches(false);	//ĳ�ø� ������� �ʰڴٰ� ����
		conn.setReadTimeout(20000);	//20�� �� �����̷�Ʈ
		conn.setRequestMethod("POST");	//GET����� ����ϰڴ�
		
		
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
		
		//�ڿ�����
		br.close();
		conn.disconnect();
		
		System.out.println(stringBuffer.toString());
	}

}
