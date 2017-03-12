/*
ActionEvent
 - 컴포넌트가 선택될 때 발생하는 이벤트
 - 텍스트 필드(TextField)에서 엔터를 쳤을 때도 발생하는 이벤트
 
 //-----------------------------
 컴포넌트 이베트 처리 4단계
 1단계: 이벤트 소스 결정
 		이벤트가 발생되면 처리할 이벤트 클래스도 결정
 		버튼을 눌렀을 때 이벤트라면 ActionEvent
 		
 2단계: 이벤트 리스너 작성
 		이벤트를 실제적으로 처리할 수 있는 이벤트 처리 리스터 인터페이스를 구현하여 
 		이벤트 리스터 클래스를 작성합니다.
 		
 3단계: 이벤트 소스와 이벤트 리스터 연결
 		addOOOOListener()
 		
 4단계: 이벤트 핸들러 내용 구현
 		이벤트 리스너의 추상메소드 구현
 		실제적으로 이벤트의 처리 내용
 		

이벤트 핸들러 구현하는 2가지 방법
 - 클래스의 인스턴스를 생성한 후 사용
 - 인라인인스턴스 생성한 후 사용
 

*/
import java.awt.*;	//Frame, FlowLayout, Button
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx01 extends Frame {

	Button button;
	
	public ActionEventEx01(){
		setLayout(new FlowLayout());
		setTitle("MouseEvent Test");
		
		button = new Button("Click Me");
		
		ButtonHandler btnHandler = new ButtonHandler();
		button.addActionListener(btnHandler);
		
		add(button);
	}
	
	public class ButtonHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("눌렀다!");
		}
	}
	
	public static void main(String[] args) {
		
		ActionEventEx01 ae = new ActionEventEx01();
		ae.setSize(300, 200);
		ae.setVisible(true);

	}

}
