/*

BorderLayout
 - �����̳��� ������ ��, ��, ��, ��, �߾����� 5���� �������� �����ؼ� ������Ʈ���� ��ġ�ϴ� ��ġ������
 - �� �������� �ϳ��� ������Ʈ�� ��ġ�� �� �ֽ��ϴ�.


BorderLayout.NORTH	��
BorderLayout.WEST	��
BorderLayout.CENTER	�߾�
BorderLayout.EAST	��
BorderLayout.SOUTH	��

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
