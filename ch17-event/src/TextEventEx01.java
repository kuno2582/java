/*
TextEvent
 - 텍스트 컴포넌트(TextField, TextArea)에서 키가 입력이 되어 내용이 바뀌었을 때 발생하는 이벤트
 - 사용자가 입력할 때마다 처리해야할 필요가 있는 경우 사용하는 이벤트

TextListener

*/
import java.awt.*;//Frame,Button,Panel,TextField,TextArea,Label,BorderLayout
import java.awt.event.*;//TextEvent,TextListener,ActionEvent,ActionListener

public class TextEventEx01 extends Frame implements ActionListener, TextListener {
	
	TextField tf = new TextField(20);
	Button input = new Button("입력");
	Button exit = new Button("종료");
	TextArea ta = new TextArea();
	
	public TextEventEx01(){
		super("TextEvent Test");
		
		input.setEnabled(false);
		
		Panel p = new Panel();
		p.add(new Label("제목: "));
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
		if(e.getActionCommand().equals("입력")){
			ta.append(tf.getText() + "\n");
			tf.setText("");
			tf.requestFocus();	//다시 포커스 맞추기
		}else if(e.getActionCommand().equals("종료")){
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
