import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

/*
Panel Ŭ����
 - ������Ʈ���� �׷캰�� ��� ó���� �� �ַ� ���
 - ������Ʈ���� Panel�� �߰�(��ġ)�ϰ� �� Panel�� Frame�� �����մϴ�.
 - �ٸ� Panel�� ������ �� �ڽ��� Panel�� ���� �� �ֽ��ϴ�.
 - �������� ������ ���·� ǥ���� �� ���
 - �г��� �ٸ� ������Ʈ�� ���Խ��Ѽ� �����ӿ� ��ġ�� �� ����Ѵ�.

��ü ����ȭ(Serialization)
 - ��ü�� �����ϴ� ���
 - ��ü�� ������ ����Ʈ ������ ��ȯ�Ͽ� ���� �Ǵ� ��Ʈ��ũ�� ���ؼ� �ۼ���(��Ʈ��)�� �����ϰ�
 	�ϴ� ���� �ǹ�
 - ��ü�� ����ȭ �ϱ� ���ؼ��� Serializable �������̽��� Extenalizable �������̽���
 	�����ؾ��մϴ�.

*/
//@SuppressWarnings("serial")
public class PanelEx01 extends Frame {

	public PanelEx01(){
		setLayout(new FlowLayout());	//�����̳��� ���̾ƿ��� ���ڰ��� ������� �ٲ���
		setTitle("Panel Test");
		setSize(300, 300);
		setBackground(Color.pink);
		
		Panel p = new Panel();
		p.setBackground(Color.green);
		
		Button b = new Button("Ȯ��");
		p.add(b);	//�гο� ��ư �߰�
		
		add(p);	//�����ӿ� �г� �߰�
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new PanelEx01();

	}

}
