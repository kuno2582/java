import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx02 extends Frame {

	int x, y;
	
	public MouseEventEx02(){
		setLayout(new FlowLayout());
		setTitle("MouseEvent Test");
		
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
			x = (int)e.getX();
			y = (int)e.getY();
			
			repaint();
		}
		@Override
		public void mouseEntered(MouseEvent e){
			
		}
		@Override
		public void mouseExited(MouseEvent e){
			
		}
	}
	
	@Override
	public void update(Graphics g){
		g.drawOval(x, y, 30, 30);
	}
	
	public static void main(String[] args) {
		
		MouseEventEx02 me = new MouseEventEx02();
		me.setSize(300, 200);
		me.setVisible(true);

	}

}
