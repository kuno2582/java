/*

레이블 정렬
Label.LEFT		0
Label.CENTER	1
Label.RIGHT		2

*/
import java.awt.Frame;
import java.awt.Label;
import java.awt.GridLayout;

public class LabelEx02 extends Frame {
	
	public void printAlignment(int state){
		switch(state){
		case 0:
			System.out.println(" Left Alignment");
			break;
		case 1:
			System.out.println(" Center Alignment");
			break;
		case 2:
			System.out.println(" Right Alignment");
			break;
		default:
			System.out.println("Wrong!");
			break;
		}
	}

	public static void main(String[] args) {
		
		LabelEx02 lt = new LabelEx02();
		lt.setTitle("Label Test Window");
		lt.setLayout(new GridLayout(3, 1));	//3행 1열 그리드 레이아웃
		
		Label label1 = new Label();
		label1.setText("Label 1");
		label1.setAlignment(Label.LEFT);	//기본값
		lt.add(label1);
		
		Label label2 = new Label();
		label2.setAlignment(Label.CENTER);
		label2.setText("Label 2");
		lt.add(label2);
		
		Label label3 = new Label("Label 3", Label.RIGHT);
		lt.add(label3);
		
		System.out.print(label1.getText() + " is ");
		lt.printAlignment(label1.getAlignment());
		
		System.out.print(label2.getText() + " is ");
		lt.printAlignment(label2.getAlignment());
		
		System.out.print(label3.getText() + " is ");
		lt.printAlignment(label3.getAlignment());
		
		lt.setSize(300, 200);
		lt.setVisible(true);

	}

}
