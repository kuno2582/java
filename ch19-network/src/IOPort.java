import java.io.IOException;
import java.net.ServerSocket;

public class IOPort {

	public static void main(String[] args) {
		
		//1~65535
		ServerSocket serverSocket = null;
		
		for(int i=1; i<=65535; i++){
			try{
			
				serverSocket = new ServerSocket(i);	//서버처리과정에서 예외발생할 수 있음
				serverSocket.close();
			}catch(IOException e){
				System.out.println(i +"번 TCP Port가 열려 있습니다.");
			}
			
		}

	}

}
