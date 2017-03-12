
//객체					TV
//속성, 데이터(변수)		전원유무, 채널, TV색상		
//기능, 행위(메소드)		전원 ON/OFF, 채널증감

class Tv{
	boolean power;
	int channel;
	String color;
	
	public void power(){
		power = !power;
	}
	
	public void channelUp(){
		channel++;
	}
	
	public void channelDown(){
		channel--;
	}
}

public class TvRemoteControl {

	public static void main(String[] args) {

		Tv t = new Tv();
		
		System.out.println("TV전원 상태 : " + t.power);
		
		t.power();
		System.out.println("TV전원 상태 : " + t.power);
		
		System.out.println("현재 채널 : " + t.channel);
		t.channel = 11;
		System.out.println("현재 채널 : " + t.channel);
		
		t.channelUp();
		System.out.println("현재 채널 : " + t.channel);
		
		t.channelDown();
		t.channelDown();
		t.channelDown();
		System.out.println("현재 채널 : " + t.channel);

	}

}
