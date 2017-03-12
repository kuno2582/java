/*

BorderLayout
 - 컨테이너의 영역을 동, 서, 남, 북, 중앙으로 5개의 영역으로 분할해서 컴포넌트들을 배치하는 배치관리자
 - 각 영역에는 하나의 컴포넌트만 배치할 수 있습니다.


BorderLayout.NORTH	북
BorderLayout.WEST	서
BorderLayout.CENTER	중앙
BorderLayout.EAST	동
BorderLayout.SOUTH	남

*/
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class BorderLayoutEx01 extends Frame {

	public BorderLayoutEx01(){
		
		setTitle("BorderLayout Test");
		setSize(300, 300);
		setLayout(new BorderLayout());
		
		Panel pc = new Panel();
		Panel pe = new Panel();
		
		Button btnEast = new Button("east");
		Button btnWest = new Button("west");
		Button btnNorth = new Button("north");
		Button btnCenter = new Button("center");
		Button btnSouth = new Button("south");
		
		pc.add(btnCenter);
		pe.add(btnEast);
		
		add(pe, BorderLayout.EAST);
		add(btnWest, BorderLayout.WEST);
		add(btnNorth, BorderLayout.NORTH);
		add(btnSouth, BorderLayout.SOUTH);
		add(pc, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new BorderLayoutEx01();

	}

}
