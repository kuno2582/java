import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

/*
InetAddress
 - �ڹٿ��� ���ͳ� �ּҿ� ���� ������ �ٷ�� ���� �𵨸��� Ŭ����
 - IP�ּҸ� ǥ���ϰ� �����ϴ� ���
 - InetAddressŬ������ ���������� ��ǻ�Ϳ� ������ Host Name(ȣ��Ʈ ����)������ ��ü������ ������
 	�ּҸ� ǥ���� �ִ� ����� ������ �ֽ��ϴ�.

Host Name(ȣ��Ʈ ����)
kunoo.tistory.com <-> IP�ּ�

*/
public class InetAddressEx01 {

	public static void main(String[] args) {
		
		//BufferedReader: �����Է� ��Ʈ�����κ��� ���ڸ� �о� ���̰ų� 
		//���ڸ� ����ϴ� ��Ʈ�����κ��� ���ڸ� �аų� ������ ���۸���ɰ� �Բ� ó�����ִ� ����� ��Ʈ��
		//����, ���ڹ迭���� ���� ȿ�������� ó��
		BufferedReader br = null;
		
		String url = null;
		
		InetAddress address;
		
		try{
			//InputStreamReader: ����Ʈ�� �о ������ ���� ���ڵ��� ���� ���ڷ� ��ȯ�ϴµ� ����ϴ� Ŭ����
			//�� ���ھ� �о�ɴϴ�.
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("������Ʈ �ּ� �Է� > ");
			url = br.readLine();	//���� �߻� ���� �κ��̹Ƿ� try�� ������
			
			address = InetAddress.getByName(url);	//���ͳ� �ּҿ� ���� ������ InetAddress�� ���� ��ü ��ȯ
			
			System.out.println("ȣ��Ʈ ����: " + address.getHostName());
			System.out.println("ȣ��Ʈ �ּ�: " + address.getHostAddress());
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br!=null){
				try{
					br.close();	//�ܺ��ڿ� �ݴ� �κ� + ���� �߻� ������ �κ�
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

	}

}
