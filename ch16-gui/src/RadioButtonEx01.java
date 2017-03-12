/*

Checkbox를 그룹으로 묶어 RadioButton형태로 활용
여러개의 체크박스를 하나의 그룹으로 만들면 그룹내에서는 하나의 항목만 선택할 수 있게됩니다.
그룹으로 묶을 때는 CheckboxGroup


*/
import java.awt.*;

public class RadioButtonEx01 extends Frame {

	public static void main(String[] args) {
		
		RadioButtonEx01 cbt = new RadioButtonEx01();
		cbt.setTitle("RadioButton Test");
		cbt.setLayout(new FlowLayout());

		CheckboxGroup cbg = new CheckboxGroup();
		
		Checkbox cb1 = new Checkbox("Radio button 1", cbg ,false);
		Checkbox cb2 = new Checkbox("Radio button 2", cbg ,false);
		Checkbox cb3 = new Checkbox("Radio button 3", cbg ,true);
		Checkbox cb4 = new Checkbox("Radio button 4", cbg ,false);
		
		cbt.add(cb1);
		cbt.add(cb2);
		cbt.add(cb3);
		cbt.add(cb4);
		
		cbt.pack();
		
		cbt.setVisible(true);
		
	}

}
