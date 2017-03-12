/*
ActionEvent
 - ������Ʈ�� ���õ� �� �߻��ϴ� �̺�Ʈ
 - �ؽ�Ʈ �ʵ�(TextField)���� ���͸� ���� ���� �߻��ϴ� �̺�Ʈ
 
 //-----------------------------
 ������Ʈ �̺�Ʈ ó�� 4�ܰ�
 1�ܰ�: �̺�Ʈ �ҽ� ����
 		�̺�Ʈ�� �߻��Ǹ� ó���� �̺�Ʈ Ŭ������ ����
 		��ư�� ������ �� �̺�Ʈ��� ActionEvent
 		
 2�ܰ�: �̺�Ʈ ������ �ۼ�
 		�̺�Ʈ�� ���������� ó���� �� �ִ� �̺�Ʈ ó�� ������ �������̽��� �����Ͽ� 
 		�̺�Ʈ ������ Ŭ������ �ۼ��մϴ�.
 		
 3�ܰ�: �̺�Ʈ �ҽ��� �̺�Ʈ ������ ����
 		addOOOOListener()
 		
 4�ܰ�: �̺�Ʈ �ڵ鷯 ���� ����
 		�̺�Ʈ �������� �߻�޼ҵ� ����
 		���������� �̺�Ʈ�� ó�� ����
 		

�̺�Ʈ �ڵ鷯 �����ϴ� 2���� ���
 - Ŭ������ �ν��Ͻ��� ������ �� ���
 - �ζ����ν��Ͻ� ������ �� ���
 

*/
import java.awt.*;	//Frame, FlowLayout, Button
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx01 extends Frame {

	Button button;
	
	public ActionEventEx01(){
		setLayout(new FlowLayout());
		setTitle("MouseEvent Test");
		
		button = new Button("Click Me");
		
		ButtonHandler btnHandler = new ButtonHandler();
		button.addActionListener(btnHandler);
		
		add(button);
	}
	
	public class ButtonHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("������!");
		}
	}
	
	public static void main(String[] args) {
		
		ActionEventEx01 ae = new ActionEventEx01();
		ae.setSize(300, 200);
		ae.setVisible(true);

	}

}
