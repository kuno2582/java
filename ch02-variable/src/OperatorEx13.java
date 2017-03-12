
public class OperatorEx13 {
	
	public static void main(String[] args){
		byte a = 12;
		//128 64 32 16 8 4 2 1
		//0   0  0  0  1 1 0 0
		
		byte b = 20;
		//128 64 32 16 8 4 2 1
		//0   0  0  1  0 1 0 0
		
		byte c = (byte)(a & b);
		//0   0  0  0  1 1 0 0
		//0   0  0  1  0 1 0 0
		//--------------------
		//0   0  0  0  0 1 0 0
		//128 64 32 16 8 4 2 1
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		
		byte d = (byte)(a | b);
		//0   0  0  0  1 1 0 0
		//0   0  0  1  0 1 0 0
		//--------------------
		//0   0  0  1  1 1 0 0
		//128 64 32 16 8 4 2 1
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("d: " + d);
		
		
		
		byte e = (byte)(a^b);
		//0   0  0  0  1 1 0 0
		//0   0  0  1  0 1 0 0
		//--------------------
		//0   0  0  1  1 0 0 0
		//128 64 32 16 8 4 2 1
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("e: " + e);
	} 

}
