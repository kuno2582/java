/*
Checkbox(üũ�ڽ�)
 - ���������� �׸��� ������ �� �ְ� ���ִ� ������Ʈ


*/
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Color;

public class CheckBoxEx01 extends Frame {
	

	public static void main(String[] args) {
		
		CheckBoxEx01 cbt = new CheckBoxEx01();
		cbt.setTitle("Checkbox Test");
		cbt.setLayout(new FlowLayout());
		
		Checkbox cb1 = new Checkbox();
		Checkbox cb2 = new Checkbox("Checkbox 2");
		
		cb1.setLabel("Checkbox 1 label");
		cb1.setBackground(Color.green);
		
		cbt.add(cb1);
		cbt.add(cb2);
		cbt.add(new Checkbox("Checkbox 3"));
		
		Checkbox cb4 = new Checkbox("Checkbox 4", true);
		cbt.add(cb4);
		
		cbt.pack();	//������Ʈ�� ��� �����ֱ����� �������� �ڵ����� ũ���������ִ� �޼ҵ�
		
		cbt.setVisible(true);

	}

}
