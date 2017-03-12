import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx02 {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		String url = null;
		
		InetAddress[] addresses;
		
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("������Ʈ �ּ� �Է� > ");
			url = br.readLine();
			
			//�ϳ��� ȣ��Ʈ���ӿ� �ش��ϴ� ��� IP�ּ� �о����
			addresses = InetAddress.getAllByName(url);
			
			for(int i=0; i<addresses.length; i++){
				System.out.println(addresses[i]);
			}
			
			System.out.println("Local Computer's IP: " + 
				InetAddress.getLocalHost());
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

	}

}
