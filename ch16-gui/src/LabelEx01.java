/*

Label
 - �簢�� ������ ���ڿ��� ǥ���� �� ����ϴ� ������Ʈ
 - ��輱�� ���� Ư���� ���¸� ������ ���� ���� ������Ʈ
 - ���̺��� ���ڿ��� ��,��,�߾����� ���Ľ�ų �� �ֽ��ϴ�.


*/
import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Color;

public class LabelEx01 extends Frame {
	
	Label lbl1;
	Label lbl2;
	
	LabelEx01(){
		setLayout(new FlowLayout());
		
		lbl1 = new Label("���̺�1");
		lbl2 = new Label();
		
		lbl2.setText("���̺�2");
		
		lbl2.setBackground(Color.PINK);
		
		add(lbl1);
		add(lbl2);
		
	}

	public static void main(String[] args) {
		
		LabelEx01 lb = new LabelEx01();
		
		lb.setSize(300, 200);
		lb.setVisible(true);

	}

}
