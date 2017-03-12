
//두 개의 이벤트 처리

import java.awt.*;	//Frame, Button, TextArea, Checkbox, Panel, BorderLayout;
import java.awt.event.*;//ItemEvent, ItemListener, ActionEvent, ActionListener; 

public class ItemEventEx01 extends Frame implements ActionListener, ItemListener{
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	TextArea ta = new TextArea(5, 20);	//5행 20열
	Button exit = new Button("종료");
	
	Checkbox cb1 = new Checkbox("축구");
	Checkbox cb2 = new Checkbox("농구");
	Checkbox cb3 = new Checkbox("야구");
	Checkbox cb4 = new Checkbox("족구");
	Checkbox cb5 = new Checkbox("배구");
	Checkbox cb6 = new Checkbox("수영");
	
	public ItemEventEx01(){
		super("ItemEvent test");
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p1.add(cb5);
		p1.add(cb6);
		
		p2.add(exit);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
		
		exit.addActionListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
		setBounds(300, 300, 300, 300);//x좌표, y좌표, 너비, 높이
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
			ta.append(e.getItem() + "을 선택\n");
		}else if(e.getStateChange() == ItemEvent.DESELECTED){
			ta.append(e.getItem() + "을 취소\n");
		}
	}

	public static void main(String[] args) {
		
		new ItemEventEx01();

	}

}
