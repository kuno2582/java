import java.io.IOException;
import java.net.ServerSocket;

public class IOPort {

	public static void main(String[] args) {
		
		//1~65535
		ServerSocket serverSocket = null;
		
		for(int i=1; i<=65535; i++){
			try{
			
				serverSocket = new ServerSocket(i);	//����ó���������� ���ܹ߻��� �� ����
				serverSocket.close();
			}catch(IOException e){
				System.out.println(i +"�� TCP Port�� ���� �ֽ��ϴ�.");
			}
			
		}

	}

}
