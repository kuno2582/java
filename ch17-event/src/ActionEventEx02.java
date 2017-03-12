/*
�̺�Ʈ ó�� ����
1	�̺�Ʈ �ҽ� ����
2	�̺�Ʈ ������ ����
3	�̺�Ʈ �ҽ��� �̺�Ʈ ������ ����
4	�̺�Ʈ �ڵ鷯 ������ ����

*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Panel;

public class ActionEventEx02 extends Frame implements ActionListener {
	
	Panel p;
	Button input, exit;
	TextArea ta;
	
	public ActionEventEx02(){
		super("ActionEvent �׽�Ʈ");
		
		p = new Panel();
		
		input = new Button("�Է�");
		exit = new Button("����");
		ta = new TextArea();
		
		p.add(input);
		p.add(exit);
		
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		input.addActionListener(this);	//�̺�Ʈ ������ ����
		exit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		String name = e.getActionCommand();

		if(name.equals("�Է�")){
			ta.append("�Է¹�ư Ŭ��.\n");
		}else{
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
		new ActionEventEx02();

	}

}
