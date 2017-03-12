import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
MouseMotionEvent
���콺�� �������� �� �߻��ϴ� �̺�Ʈ
��ü������ ó�����ִ� �̺�Ʈ Ŭ������ �������� ������ MouseEventŬ������ �״�� ����մϴ�.

MouseMotionListener

java.awt.Point	
��ǥ���� ��ġ�� ��Ÿ�� �� ���(���콺�� ��ǥ�� ���� ��������)
x�� y��ǥ ���� �����ϱ� ���� ��������� ������ �ֽ��ϴ�.

*/

public class MouseEventEx03 extends Frame implements ActionListener, MouseMotionListener {

	Label move = new Label("-<@>-", Label.CENTER);
	Button btnExits = new Button("����");
	
	public MouseEventEx03(){
		setTitle("MouseEvent Test");
		
		move.setBackground(Color.RED);
		move.setForeground(Color.WHITE);
		
		setLayout(null);
		
		btnExits.addActionListener(this);
		addMouseMotionListener(this);
		
		move.setBounds(100, 50, 150, 20);
		btnExits.setBounds(250, 500, 50, 50);
		
		add(move);
		add(btnExits);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	@Override
	public void mouseMoved(MouseEvent e){
		Point p = e.getPoint();
		
		move.setLocation(p);
	}
	@Override
	public void mouseDragged(MouseEvent e){
		
	}
	
	
	public static void main(String[] args) {
		
		new MouseEventEx03();

	}

}
