
//��ü					TV
//�Ӽ�, ������(����)		��������, ä��, TV����		
//���, ����(�޼ҵ�)		���� ON/OFF, ä������

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
		
		System.out.println("TV���� ���� : " + t.power);
		
		t.power();
		System.out.println("TV���� ���� : " + t.power);
		
		System.out.println("���� ä�� : " + t.channel);
		t.channel = 11;
		System.out.println("���� ä�� : " + t.channel);
		
		t.channelUp();
		System.out.println("���� ä�� : " + t.channel);
		
		t.channelDown();
		t.channelDown();
		t.channelDown();
		System.out.println("���� ä�� : " + t.channel);

	}

}
