import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/*

Component(������Ʈ)
 - �߻�Ŭ����
 - AWT�� ���� ������Ʈ���� �ֻ��� Ŭ����, ��� ������Ʈ���� superŬ����
 - �� ������Ʈ���� ���������� ���Ǵ� �޼ҵ���� ������ �ֽ��ϴ�.

������Ʈ���� ����
Button, Canvas, Checkbox, Choice, Label, List, Scrollbar


Button
 - ��ư�� ���� �� ���
 - ��ư�� ����ڰ� ������ �� Ư���� �׼��� ������ �� �ֵ��� ���� ������Ʈ
 
 
*/
public class ButtonEx01 extends Frame {
	
	Button button1;
	Button button2;
	
	public ButtonEx01(){
		setLayout(new FlowLayout());
		
		button1 = new Button("��ư1");
		button2 = new Button();
		
		button2.setLabel("Button2");
		
		add(button1);
		add(button2);
		
		
		
	}

	public static void main(String[] args) {
		
		ButtonEx01 be = new ButtonEx01();
		be.setSize(300,300);
		be.setVisible(true);

	}

}
