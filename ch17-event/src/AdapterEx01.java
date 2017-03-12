/*
Listener
��ü������ �޼ҵ��� �ٵ�(����)�� ������ ���� ���� �������̽�(�߻�޼ҵ�)
�������̽��� �ٸ� Ŭ������ �����ϰԵǸ� Listener�� ������ �ִ� ��� �߻�޼ҵ����
�����ؾ� �մϴ�. 

Adapter
Listener�� Ŭ���� ���·� ������ ����
�ʿ��� �޼ҵ常 �������ؼ� ����� �� �ֵ��� ��� �߻�޼ҵ带 �� �޼ҵ�� ������ ���ҽ��ϴ�.

�̺�Ʈ			������					�����Ŭ����
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
	
	public class ExitHandler extends WindowAdapter{	//���߻���� �Ұ��Ͽ� ���� Ŭ���� ����
		@Override
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
		new AdapterEx01();

	}

}
