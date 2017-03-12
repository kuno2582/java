import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
	
	Server server;
	Socket sock;
	DataInputStream din;	//������ �����ֱ� ���� Ŭ����
	DataOutputStream dout; 
	String ipAddr;
	
	public ServerThread(Server server,Socket sock){
		try {
			this.server = server;
			this.sock = sock;
			
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			
			ipAddr = sock.getInetAddress().toString();	//Inet��巹�� ��ü�� ��ȯ�Ѵ�
			System.out.println(ipAddr + "���� �����Ͽ����ϴ�.");
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.toString()); //���� ���� ǥ��
		}
	}
	
	public void sendMsg(String msg){
		try {
			dout.writeUTF(msg);	//���ڷ� ���� msg�� dout�� ���� ����ϱ�
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
