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
마우스를 움직였을 때 발생하는 이벤트
자체적으로 처리해주는 이벤트 클래스가 존재하지 않으며 MouseEvent클래스를 그대로 사용합니다.

MouseMotionListener

java.awt.Point	
좌표상의 위치를 나타낼 때 사용(마우스의 좌표를 쉽게 관리해줌)
x와 y좌표 값을 저장하기 위한 멤버변수를 가지고 있습니다.

*/

public class MouseEventEx03 extends Frame implements ActionListener, MouseMotionListener {

	Label move = new Label("-<@>-", Label.CENTER);
	Button btnExits = new Button("종료");
	
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
