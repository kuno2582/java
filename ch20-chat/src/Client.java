import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//서버에 접속하기 위한 클라이언트 파일, GUI로 구현

public class Client extends Frame implements Runnable {
	
	TextField tf;
	TextArea ta;
	Socket sock;
	DataInputStream din;
	DataOutputStream dout;
	
	public Client(){
		setLayout(new FlowLayout());
		
		tf = new TextField(30);	//30자 입력크기
		ta = new TextArea(7, 30);	//7줄 30자
		
		add(tf);
		add(ta);
		
		tf.addActionListener(new TfHandler());
	}
	
	@Override
	public void run(){
		//127.0.0.1 현재 나의 주소를 가리킴 = 트랙백주소
		try {
			sock = new Socket("192.168.200.21", 5000);
			
			din = new DataInputStream(sock.getInputStream());
			dout = new DataOutputStream(sock.getOutputStream());
			
			ta.append("서버에 접속 되었습니다.\n");
			
			while(true){
				
				String str = din.readUTF();
				ta.append(str+"\n");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	public void sendMsg(String msg){
		
		try {
			dout.writeUTF(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public class TfHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			sendMsg(tf.getText());
			tf.setText("");
			tf.requestFocus();
			
		}
		
	}

	public static void main(String[] args) {

		Client chatc = new Client();
		chatc.setSize(300, 200);
		chatc.setVisible(true);
		
		Thread t = new Thread(chatc);
		t.start();

	}

}
