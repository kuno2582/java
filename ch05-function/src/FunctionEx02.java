
public class FunctionEx02 {

	public static void main(String[] args) {
		
		int minute = 30;
		
		tellTime(11,36);
		tellTime(12,50);
		
		tellTime(13,minute);

	}
	
	public static void tellTime(int hour, int minute){
		
		System.out.println("현재 시각: "+hour+"시 "+minute+"분");
		
	}

}
