
public class CastEx03 {

	public static void main(String[] args) {
		
		byte b1 = 127;
		byte b2 = 127;
//		byte b3 = b1 + b2;
		
		int i1 = b1 + b2;
		System.out.println("i1: " + i1 );
		
		byte b4 = 125;
		byte b5 = 125;
		byte result_byte = (byte)(b4 + b5);
		System.out.println("result_byte: " + result_byte );
		System.out.println("b4 + b5 = " + (b4 + b5) );	
		
		
	}

}
