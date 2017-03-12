/*
SCROLLBARS_BOTH				0	수직/수평 스크롤바를 모두 표시
SCROLLBARS_VERTICAL_ONLY		1	수직 스크롤바만 표시
SCROLLBARS_HORIZONTAL_ONLY	2	수평 스크롤바만 표시
SCROLLBARS_NONE				3	스크롤바 미표시

*/
import java.awt.*;

public class TextAreaEx01 extends Frame {

	public static void main(String[] args) {
		
		TextAreaEx01 tae = new TextAreaEx01();
		tae.setTitle("TextArea Test");
		tae.setLayout(new GridLayout(2, 4));
		
		TextArea ta1 = new TextArea();
		ta1.append("TextArea 1");
		ta1.setColumns(10);
		ta1.setRows(4);
		tae.add(ta1);
		
		TextArea ta2 = new TextArea("TextArea 2");
		ta2.setColumns(10);
		ta2.setRows(4);
		tae.add(ta2);
		
		TextArea ta3 = new TextArea("TextArea 3", 10, 4);
		tae.add(ta3);
		
		TextArea ta4 = new TextArea("TextArea 4", 10, 4, 
				TextArea.SCROLLBARS_NONE);
		tae.add(ta4);
		
		TextArea ta5 = new TextArea("TextArea 5", 10, 4, 
				TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		tae.add(ta5);
		
		TextArea ta6 = new TextArea("TextArea 6", 10, 4, 
				TextArea.SCROLLBARS_VERTICAL_ONLY);
		tae.add(ta6);
		
		TextArea ta7 = new TextArea("TextArea 7", 10, 4, 
				TextArea.SCROLLBARS_BOTH);
		tae.add(ta7);
		
		System.out.println("TextArea 1 열수: " + ta1.getColumns());
		System.out.println("TextArea 1 행수: " + ta1.getRows());
		
		System.out.println("Visibility of TextArea 2 : " + 
				ta2.getScrollbarVisibility());
		
		System.out.println("Visibility of TextArea 4 : " + 
				ta4.getScrollbarVisibility());
		
		ta2.insert("Inserted String", 5);//5번째 문자위치부터 삽입
		
		tae.pack();
		tae.setVisible(true);

	}

}
