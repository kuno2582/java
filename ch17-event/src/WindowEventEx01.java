/*
WindowEvent
������� ���õ� �����찡 Ȱ��ȭ, ������ȭ, �ִ�ȭ, �������� ũ�� ����, â�� ���� �� �߻��ϴ� �̺�Ʈ


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
		
		lb = new Label("�������� �����ư�� ����������!");
		
		add(lb);
		
		addWindowListener(this);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
	
	@Override
	public void windowOpened(WindowEvent e){	//ó�� ������
		
	}
	@Override
	public void windowClosing(WindowEvent e){	//���� ��
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e){	//
		
	}
	@Override
	public void windowIconified(WindowEvent e){	//�ּ�ȭ
		
	}
	@Override
	public void windowDeiconified(WindowEvent e){	//�ּ�ȭ���� �ٽ� Ȱ��ȭ
		
	}
	@Override
	public void windowActivated(WindowEvent e){	//Ȱ��ȭ
		
	}
	@Override
	public void windowDeactivated(WindowEvent e){	//��Ȱ��ȭ
		
	}

	public static void main(String[] args) {
		
		new WindowEventEx01();

	}

}
