import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/*

Component(컴포넌트)
 - 추상클래스
 - AWT의 각종 컴포넌트들의 최상위 클래스, 모든 컴포넌트들의 super클래스
 - 각 컴포넌트들의 공통적으로 사용되는 메소드들을 가지고 있습니다.

컴포넌트들의 종류
Button, Canvas, Checkbox, Choice, Label, List, Scrollbar


Button
 - 버튼을 만들 때 사용
 - 버튼을 사용자가 눌렀을 때 특정한 액션을 실행할 수 있도록 만든 컴포넌트
 
 
*/
public class ButtonEx01 extends Frame {
	
	Button button1;
	Button button2;
	
	public ButtonEx01(){
		setLayout(new FlowLayout());
		
		button1 = new Button("버튼1");
		button2 = new Button();
		
		button2.setLabel("Button2");
		
		add(button1);
		add(button2);
		
		
		
	}

	public static void main(String[] args) {
		
		ButtonEx01 be = new ButtonEx01();
		be.setSize(300,300);
		be.setVisible(true);

	}

}
