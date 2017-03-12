import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEx04 extends Frame implements ActionListener {

	Panel p1, p2, p3;
	TextArea ta;
	TextField tf;
	Button bClear, bExit;
	
	public AdapterEx04(){
		super("Adapter Class Test");
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		tf = new TextField(35);
		ta = new TextArea(10, 35);
		
		bClear = new Button("Clear");
		bExit = new Button("Exit");
		
		p1.add(tf);
		p2.add(ta);
		p3.add(bClear);
		p3.add(bExit);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
		
		bClear.addActionListener(this);
		bExit.addActionListener(this);
		
		//이벤트클래스를 따로 만들지 않고 익명 내부 클래스로 이벤트 연결
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		tf.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			}
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if(str.equals("Clear")){
			tf.setText(" ");
			tf.setText("");
			ta.setText(" ");
			ta.setText("");
			tf.requestFocus();
		}else if(str.equals("Exit")){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		new AdapterEx03();

	}

}
