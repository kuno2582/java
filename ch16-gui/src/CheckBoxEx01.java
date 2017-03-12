/*
Checkbox(체크박스)
 - 여러종류의 항목중 선택할 수 있게 해주는 컴포넌트


*/
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Color;

public class CheckBoxEx01 extends Frame {
	

	public static void main(String[] args) {
		
		CheckBoxEx01 cbt = new CheckBoxEx01();
		cbt.setTitle("Checkbox Test");
		cbt.setLayout(new FlowLayout());
		
		Checkbox cb1 = new Checkbox();
		Checkbox cb2 = new Checkbox("Checkbox 2");
		
		cb1.setLabel("Checkbox 1 label");
		cb1.setBackground(Color.green);
		
		cbt.add(cb1);
		cbt.add(cb2);
		cbt.add(new Checkbox("Checkbox 3"));
		
		Checkbox cb4 = new Checkbox("Checkbox 4", true);
		cbt.add(cb4);
		
		cbt.pack();	//컴포넌트를 모두 보여주기위해 프레임을 자동으로 크기조절해주는 메소드
		
		cbt.setVisible(true);

	}

}
