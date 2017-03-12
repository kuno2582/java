import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
MouseEvent
���콺�� �������ų� Ư�� ������Ʈ �������� �����ų� ����� �߻��ϴ� �̺�Ʈ


MouseListener


*/
public class MouseEventEx01 extends Frame {
	
	public MouseEventEx01(){
		setLayout(new FlowLayout());
		setTitle("MouseEvent Test");
		setBackground(Color.PINK);
		
		this.addMouseListener(new MouseHandler());
	}
	
	public class MouseHandler implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e){
			
		}
		@Override
		public void mouseReleased(MouseEvent e){
			
		}
		@Override
		public void mousePressed(MouseEvent e){
			System.out.println("X(" + e.getX() + "), Y(" + e.getY() + ")");
		}
		@Override
		public void mouseEntered(MouseEvent e){
			
		}
		@Override
		public void mouseExited(MouseEvent e){
			
		}
	}

	public static void main(String[] args) {
		
		MouseEventEx01 me = new MouseEventEx01();
		me.setSize(300,200);
		me.setVisible(true);

	}

}
