/*
TextEvent
 - �ؽ�Ʈ ������Ʈ(TextField, TextArea)���� Ű�� �Է��� �Ǿ� ������ �ٲ���� �� �߻��ϴ� �̺�Ʈ
 - ����ڰ� �Է��� ������ ó���ؾ��� �ʿ䰡 �ִ� ��� ����ϴ� �̺�Ʈ

TextListener

*/
import java.awt.*;//Frame,Button,Panel,TextField,TextArea,Label,BorderLayout
import java.awt.event.*;//TextEvent,TextListener,ActionEvent,ActionListener

public class TextEventEx01 extends Frame implements ActionListener, TextListener {
	
	TextField tf = new TextField(20);
	Button input = new Button("�Է�");
	Button exit = new Button("����");
	TextArea ta = new TextArea();
	
	public TextEventEx01(){
		super("TextEvent Test");
		
		input.setEnabled(false);
		
		Panel p = new Panel();
		p.add(new Label("����: "));
		p.add(tf);
		p.add(input);
		
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(exit, BorderLayout.SOUTH);
		
		input.addActionListener(this);
		exit.addActionListener(this);
		tf.addTextListener(this);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("�Է�")){
			ta.append(tf.getText() + "\n");
			tf.setText("");
			tf.requestFocus();	//�ٽ� ��Ŀ�� ���߱�
		}else if(e.getActionCommand().equals("����")){
			System.exit(0);
		}
	}
	
	@Override
	public void textValueChanged(TextEvent e){
		if(tf.getText().equals("")){
			input.setEnabled(false);
		}else{
			input.setEnabled(true);
		}
	}

	public static void main(String[] args) {
		
		new TextEventEx01();

	}

}
