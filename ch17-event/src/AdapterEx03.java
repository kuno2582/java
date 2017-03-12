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

public class AdapterEx03 extends Frame implements ActionListener {
	
	Panel p1, p2, p3;
	TextArea ta;
	TextField tf;
	Button bClear, bExit;
	
	public AdapterEx03(){
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
		
		addWindowListener(new WindowEventHandlers());
		
		tf.addKeyListener(new KeyEventHandlers());
		
	}
	
	//내부클래스로 했을 때 객체에 바로접근 가능(레퍼런스를 생성자로 하여금 받아올 필요 x)
	class KeyEventHandlers extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e){
			if(e.getKeyChar() == KeyEvent.VK_ENTER){
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		}
	}
	
	class WindowEventHandlers extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
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
