import java.awt.Button;
import java.awt.Frame;

/*

LayoutManager (��ġ������)
 - �����̳ʴ� �ڱ� �ڽ��� �����̳� �ȿ� ������Ʈ�� �߰���ų �� ���, � ������� ��ġ ��ų����
	�̹� ����(��� ����)�ϰ� �ִ�.
 - �����̳ʵ��� �̸� ������ ���̾ƿ��� ���� ������Ʈ���� �ڵ����� ��ġ��ŵ�ϴ�.
 
 
Layout(���̾ƿ�)
 - ��ġ �� ��ü, ��ġ ����, ��� ����� ���迡 ���� ��ġ��Ű�� ��
 - �����̳ʿ� ������Ʈ�� ��ġ�� �����ϴ� ��
 

Frame	BorderLayout(�⺻��)
Dialog	BorderLayout(�⺻��)
Panel	FlowLayout(�⺻��)
Applet	FlowLayout(�⺻��)


���̾ƿ� ������ �����
setLayout()�� �̿��ؼ� ���̾ƿ� �����ڸ� ����
�޼ҵ��� ���ڷ� ���̾ƿ� �������� �ν��Ͻ��� ������ �ݴϴ�.


*/
public class LayoutEx01 extends Frame {

	Button btn1,btn2;	//���� ���ְ� �ٸ������� �����ϸ� ����
	
	public LayoutEx01(){
		
		setLayout(null);	//��ġ�������� �ν��Ͻ��� ���ڰ����� �־���, null�� ��� ���� ��������
		setTitle("Layout Test");
		
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		
		btn1.setBounds(0, 30, 150, 170);	//��ǥ�� �������ִ� �޼ҵ�
		btn2.setBounds(150, 30, 150, 170);	//����,��,����,����
		
		add(btn1);
		add(btn2);
		
	}
	
	public static void main(String[] args) {
		
		LayoutEx01 le = new LayoutEx01();
		
		le.setSize(300,200);
		le.setVisible(true);

	}

}
