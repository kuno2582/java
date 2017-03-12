/*

Label
 - 사각형 영역에 문자열을 표시할 때 사용하는 컴포넌트
 - 경계선이 없고 특별한 상태를 가지고 있지 않은 컴포넌트
 - 레이블의 문자열은 좌,우,중앙으로 정렬시킬 수 있습니다.


*/
import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Color;

public class LabelEx01 extends Frame {
	
	Label lbl1;
	Label lbl2;
	
	LabelEx01(){
		setLayout(new FlowLayout());
		
		lbl1 = new Label("레이블1");
		lbl2 = new Label();
		
		lbl2.setText("레이블2");
		
		lbl2.setBackground(Color.PINK);
		
		add(lbl1);
		add(lbl2);
		
	}

	public static void main(String[] args) {
		
		LabelEx01 lb = new LabelEx01();
		
		lb.setSize(300, 200);
		lb.setVisible(true);

	}

}
