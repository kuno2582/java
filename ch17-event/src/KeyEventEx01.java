import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
KeyEvent
사용자가 키보드와 같은 입력장치를 통해서 키를 입력했을 때 발생하는 이벤트

KeyListener

*/
public class KeyEventEx01 extends Frame implements KeyListener {

	TextArea ta = new TextArea();
	
	public KeyEventEx01(){
		super("KeyEvent Test");
		
		add(ta);
		
		ta.addKeyListener(this);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
	
	@Override
	public void keyPressed(KeyEvent e){
	
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			ta.append("DOWN key \n");
		}else if(e.getKeyCode() == KeyEvent.VK_UP){
			ta.append("UP key \n");
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			ta.append("UP key \n");
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			ta.append("UP key \n");
		}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
			ta.append("UP key \n");
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e){
		
	}
	
	@Override
	public void keyReleased(KeyEvent e){
		
	}
	
	public static void main(String[] args) {
		
		new KeyEventEx01();

	}

}
