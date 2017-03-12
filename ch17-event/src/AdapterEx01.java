/*
Listener
자체적으로 메소드의 바디(내용)을 가지고 있지 않은 인터페이스(추상메소드)
인터페이스를 다른 클래스에 구현하게되면 Listener가 가지고 있는 모든 추상메소드들을
구현해야 합니다. 

Adapter
Listener를 클래스 형태로 변형한 형태
필요한 메소드만 재정의해서 사용할 수 있도록 모든 추상메소드를 빈 메소드로 구현해 놓았습니다.

이벤트			리스너					어댑터클래스
ComponentEvent	ComponentListener		ComponentAdapter
ContainerEvent	ContainerListener		ContainerAdapter
FocusEvent		FocusListener			FocusAdapter
KeyEvent		KeyListener				KeyAdapter
MouseEvent		MouseListener			MouseAdapter
MouseMotion		MouseMotionListener		MouseMotionAdapter
WindowEvent		WindowListener			WindowAdapter

*/
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEx01 extends Frame {
	
	Button btn;
	
	public AdapterEx01(){
		super("AdapterClass Test");
		setLayout(new FlowLayout());
		
		btn = new Button("Click to Exit icon");
		
		add(btn);
		addWindowListener(new ExitHandler());
		
		setSize(300,200);
		setVisible(true);
	}
	
	public class ExitHandler extends WindowAdapter{	//다중상속이 불가하여 따로 클래스 생성
		@Override
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
		new AdapterEx01();

	}

}
