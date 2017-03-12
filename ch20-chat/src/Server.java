import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

	ServerSocket serv;	//���� ������� �ִ� ��������
	Socket sock;		//Ŭ���̾�Ʈ�� �����ϸ� ������ִ� ����
	Vector vector;		//Ŭ���̾�Ʈ �������� �����ϴ� ����Ŭ����
	
	public Server(){
		vector = new Vector();
		
		try {
			serv = new ServerSocket(5000);
			System.out.println("ä�ü����� ���� �Ǿ����ϴ�.");
			
			while(true){
				sock = serv.accept();	//�����ؾ� ������ �� ����, ������ ������ sock�� ����
				ServerThread client = new ServerThread(this, sock);
				client.start();
				vector.addElement(client);	//��ü�� �� Ŭ���̾�Ʈ ������ Vector(��ü����)�� �ױ�
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void sendAll(String msg){
		for(int i=0; i<vector.size(); i++){
			ServerThread client = (ServerThread)vector.get(i);	//ĳ�����Ͽ� ����
			client.sendMsg(msg);
		}
	}
	
	public static void main(String[] args) {
		
		Server chats = new Server();

	}

}
