/*
Canvas
 - 특정한 모양을 갖고 있지는 않은 사각형 영역만 가지는 컴포넌트
 - 그림을 그릴 수 있는 도화지 역할을 하는 컴포넌트
 
*/
import java.awt.*;

class DrawingCanvas extends Canvas {
	
	@Override
	public void paint(Graphics g){	//Graphics가 붓의 역할
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
