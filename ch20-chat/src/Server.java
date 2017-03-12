import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

	ServerSocket serv;	//서버 열어놓고 있는 서버소켓
	Socket sock;		//클라이언트가 접속하면 만들어주는 소켓
	Vector vector;		//클라이언트 스택정보 저장하는 벡터클래스
	
	public Server(){
		vector = new Vector();
		
		try {
			serv = new ServerSocket(5000);
			System.out.println("채팅서버가 구동 되었습니다.");
			
			while(true){
				sock = serv.accept();	//승인해야 접속할 수 있음, 승인한 정보를 sock에 저장
				ServerThread client = new ServerThread(this, sock);
				client.start();
				vector.addElement(client);	//객체로 된 클라이언트 정보를 Vector(객체전용)에 쌓기
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void sendAll(String msg){
		for(int i=0; i<vector.size(); i++){
			ServerThread client = (ServerThread)vector.get(i);	//캐스팅하여 저장
			client.sendMsg(msg);
		}
	}
	
	public static void main(String[] args) {
		
		Server chats = new Server();

	}

}
