import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/*
URLConnection Ŭ����
 - URL�� ����Ű�� ���ҽ��� ���� ������ ��Ÿ���� Ŭ����
 - URLConnection Ŭ������ ���� �ڿ��� �����ϴµ� �ʿ��� ������ ������ ����
 - ���ݼ����� �������, �ش��ڿ��� ����, Ÿ������, ������ ����
 - URLŬ������ ���ݼ��� �ڿ��� ���� ������ ������ �ֽ��ϴ�.
   URLConnectionŬ������ ���ݼ��� �ڿ��� ���� ������ ���ݼ����� ����������� ������ �ִ� Ŭ����



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
			//URLConnectionŬ������ new�� �ƴ� �ٸ� �߻�޼ҵ带 �̿��ؼ� �����ڸ� ȣ���Ѵ�
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
		//1970�� 1�� 1�� ���ķ� ��¥�� �� ���
		System.out.println("date: " + uc.getDate());
		//DateŬ������ �̿��� ���
		System.out.println("date(Date): " + new Date(uc.getDate()));

	}

}
