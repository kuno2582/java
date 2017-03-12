/*
이벤트 처리 순서
1	이벤트 소스 결정
2	이벤트 리스너 구현
3	이벤트 소스와 이벤트 리스너 연결
4	이벤트 핸들러 내용을 구현

*/
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Panel;

public class ActionEventEx02 extends Frame implements ActionListener {
	
	Panel p;
	Button input, exit;
	TextArea ta;
	
	public ActionEventEx02(){
		super("ActionEvent 테스트");
		
		p = new Panel();
		
		input = new Button("입력");
		exit = new Button("종료");
		ta = new TextArea();
		
		p.add(input);
		p.add(exit);
		
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		input.addActionListener(this);	//이벤트 리스너 연결
		exit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		String name = e.getActionCommand();

		if(name.equals("입력")){
			ta.append("입력버튼 클릭.\n");
		}else{
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
		new ActionEventEx02();

	}

}
