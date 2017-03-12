import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
	
	Server server;
	Socket sock;
	DataInputStream din;	//정보를 전해주기 위한 클래스
	DataOutputStream dout; 
	String ipAddr;
	
	public ServerThread(Server server,Socket sock){
		try {
			this.server = server;
			this.sock = sock;
			
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			
			ipAddr = sock.getInetAddress().toString();	//Inet어드레스 객체로 반환한다
			System.out.println(ipAddr + "에서 접속하였습니다.");
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.toString()); //위와 같은 표현
		}
	}
	
	public void sendMsg(String msg){
		try {
			dout.writeUTF(msg);	//인자로 받은 msg를 dout을 통해 출력하기
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run(){
		System.out.println("##ChatThread Start...");
		
		String str;
		
		try{
			while(true){
				str = din.readUTF();
				server.sendAll(str);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
