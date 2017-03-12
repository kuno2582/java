import java.awt.Button;
import java.awt.Frame;

public class ButtonEx03 extends Frame {
	
	public ButtonEx03(){
		super("button Test 02");
		setSize(300, 300);
		
		Button b = new Button("»Æ¿Œ");
		
		setLayout(null);
		b.setSize(100,50);
		b.setLocation(100,50);
		
		add(b);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new ButtonEx03();

	}

}
