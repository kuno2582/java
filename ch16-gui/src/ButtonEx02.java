import java.awt.Button;
import java.awt.Frame;

public class ButtonEx02 extends Frame {

	public ButtonEx02(){
		
		super("Button 테스트 01");
		setSize(300, 300);
		setVisible(true);
		
		Button b = new Button("확인");
		b.setSize(100, 50);	//기본 프레임 사용시 설정사이즈보다 확장되서 표현
		
		add(b);
		
	}
	
	public static void main(String[] args) {
		
		new ButtonEx02();

	}

}
