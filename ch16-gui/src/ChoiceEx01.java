
/*

Choice(초이스 = 드롭박스 = 콤보박스)
 - List클래스와 거의 유사한 기능을 가지고 있는 콤포넌트
 - 드롭다운 버튼을 클릭하면 여러 아이템 중에 하나를 선택할 수 있게 해주는 기능
 - 컴포넌트를 생성한 후 드롭다운 리스트 항목을 추가시켜서 사용하게 됩니다.


*/
import java.awt.*;

public class ChoiceEx01 extends Frame {

	public static void main(String[] args) {
		
		ChoiceEx01 cht = new ChoiceEx01();
		cht.setTitle("Choicebox Test");
		cht.setLayout(new FlowLayout());
		
		Choice ch = new Choice();
		
		ch.add("Item 1");
		ch.add("Item 2");
		ch.add("Item 3");
		ch.add("Item 4");
		
		cht.add(ch);
		
		System.out.println("아이템 수: " + ch.getItemCount());
		
		ch.addItem("Item 5");
		System.out.println("아이템 수: " + ch.getItemCount());
		
		System.out.println( ch.getItem(1) );	//2번째 아이템 문자열로 가져오기
		
		ch.select(2);	//3번째 아이템 선택하기
		
		System.out.println(ch.getSelectedIndex()+1 + "번째 아이템");
		
		cht.setSize(300, 200);
		cht.setVisible(true);
		
		ch.select("Item 4");
		System.out.println(ch.getSelectedItem());
		System.out.println(ch.getSelectedIndex());
		
		ch.remove(4);
		System.out.println("총 아이템 수: " + ch.getItemCount());
		
		ch.remove("Item 2");
		for(int i=0;i<3; i++){
			System.out.println(ch.getItem(i));
		}
		
	}

}
