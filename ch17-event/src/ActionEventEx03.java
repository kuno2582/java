
import java.awt.*;
import java.awt.event.*;

public class ActionEventEx03 extends Frame {

	TextField tf;
	TextArea ta;
	
	public ActionEventEx03(){
		super("ActionEvent 테스트");
		setLayout(new BorderLayout());
		
		tf = new TextField();
		ta = new TextArea();
		
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		/*TfHandler tfHandeler = new TfHandler();
		tf.addActionListener(tfHandeler);*/
		
		tf.addActionListener(new TfHandler());	//같은 표현
	}
	
	public class TfHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			ta.append(tf.getText() + "\n");
		}
	}
	
	
	public static void main(String[] args) {
		
		ActionEventEx03 ae = new ActionEventEx03();
		ae.setSize(300,200);
		ae.setVisible(true);

	}

}
