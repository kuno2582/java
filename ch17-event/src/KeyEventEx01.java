import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
KeyEvent
����ڰ� Ű����� ���� �Է���ġ�� ���ؼ� Ű�� �Է����� �� �߻��ϴ� �̺�Ʈ

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
