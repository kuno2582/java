/*
WindowEvent
윈도우와 관련된 윈도우가 활성화, 아이콘화, 최대화, 윈도우의 크기 조절, 창이 닫힐 때 발생하는 이벤트


WindowListener

*/
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx01 extends Frame implements WindowListener {
	
	Label lb;
	
	public WindowEventEx01(){
		super("WindowEvent Test");
		
		lb = new Label("프레임의 종료버튼을 눌러보세요!");
		
		add(lb);
		
		addWindowListener(this);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
	
	@Override
	public void windowOpened(WindowEvent e){	//처음 열릴때
		
	}
	@Override
	public void windowClosing(WindowEvent e){	//닫힐 때
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e){	//
		
	}
	@Override
	public void windowIconified(WindowEvent e){	//최소화
		
	}
	@Override
	public void windowDeiconified(WindowEvent e){	//최소화에서 다시 활성화
		
	}
	@Override
	public void windowActivated(WindowEvent e){	//활성화
		
	}
	@Override
	public void windowDeactivated(WindowEvent e){	//비활성화
		
	}

	public static void main(String[] args) {
		
		new WindowEventEx01();

	}

}
