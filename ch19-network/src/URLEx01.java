import java.net.MalformedURLException;
import java.net.URL;

/*
URL Ŭ����
 - URL(Uniform Resource Locator): ���ͳݻ󿡼� ���ٰ����� �ڿ��� �ּҸ� ǥ���ϴ� ����
 - URL�� �̿��ؼ� ���ͳݻ��� �پ��� �������ݰ� �ڿ��� ǥ���� �� �ֽ��ϴ�.
 - URLŬ������ URL�� �߻�ȭ�Ͽ� ���� Ŭ����
 - ���ͳݻ��� �ڿ��� ��η� �����Ͽ� �ʿ��� ������ ������ �� �ְ� ���ִ� Ŭ����
 
URL ����
��������://ȣ��Ʈ�ּ�:��Ʈ��ȣ
http://kunoo.tistory.com:80/member/mem.jsp?name=hong
ftp://
telnet://


*/
public class URLEx01 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://java.sum.com/index.jsp?name=hong#content");
			//URL url = new URL("http://java.sum.com:80/index.jsp?name=hong#content");
			
			System.out.println("��������: " + url.getProtocol());
			System.out.println("ȣ��Ʈ��: " + url.getHost());
			System.out.println("��Ʈ��ȣ: " + url.getPort());
			System.out.println("default ��Ʈ��ȣ: " + url.getDefaultPort());
			System.out.println("�н�: " + url.getPath());
			System.out.println("��û�� ��������: " + url.getFile());
			System.out.println("����: " + url.getQuery());
			
			System.out.println("���۷���: " + url.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
