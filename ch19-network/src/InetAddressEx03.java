import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		InetAddress[] inetAddress = null;
		
		System.out.println("URL주소를 입력해주세요 > ");
		String str = scan.nextLine();
		
		try {
			inetAddress = InetAddress.getAllByName(str);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<inetAddress.length; i++){
			System.out.println("getHostName: " + inetAddress[i].getHostName());
			System.out.println("getHostAddress: " + inetAddress[i].getHostAddress());
			System.out.println("toString: " + inetAddress[i].toString());
			System.out.println("------------------------------------------");
		}
		
		scan.close();

	}

}
