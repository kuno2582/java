/*
Canvas
 - Ư���� ����� ���� ������ ���� �簢�� ������ ������ ������Ʈ
 - �׸��� �׸� �� �ִ� ��ȭ�� ������ �ϴ� ������Ʈ
 
*/
import java.awt.*;

class DrawingCanvas extends Canvas {
	
	@Override
	public void paint(Graphics g){	//Graphics�� ���� ����
		g.setColor(Color.RED);
		g.drawRect(30, 30, 230, 100);
	}
}

public class CanvasEx01 extends Frame {

	public CanvasEx01() {
		super("Canvas test");
		
		DrawingCanvas dc = new DrawingCanvas();
		dc.setSize(400, 300);
		dc.setBackground(Color.YELLOW);
		
		add(dc);
		
		setSize(500,400);
	}
	
	public static void main(String[] args) {
		
		CanvasEx01 cv = new CanvasEx01();
		cv.setVisible(true);
	}

}
