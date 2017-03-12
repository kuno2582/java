/*

AdjustmentEvent
��ũ�ѹٸ� �¿�� �Ǵ� ���Ϸ� �����϶� ���°� ��ȭ�˴ϴ�. �� �� �߻��ϴ� �̺�Ʈ


AdjustmentListener

*/
import java.awt.*;
import java.awt.event.*;

public class AdjustmentEventEx01 extends Frame {

	Scrollbar sb;
	TextField tf;
	
	public AdjustmentEventEx01(){
		setTitle("Adjustment Test");
		setLayout(new BorderLayout());
		
		sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
		tf = new TextField();
		
		add("North", sb);
		add("Center", tf);
		
		sb.addAdjustmentListener(new ScrollbarHandler());
	}
	
	public class ScrollbarHandler implements AdjustmentListener {
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e){
			tf.setText(sb.getValue() + "");
		}
	}
	
	public static void main(String[] args) {
		
		AdjustmentEventEx01 ae = new AdjustmentEventEx01();
		ae.setSize(300,200);
		ae.setVisible(true);

	}

}
