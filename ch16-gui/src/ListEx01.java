/*
List
 - Choice�� ������ ���
 - �������� �׸��� �����ְ� ����ڰ� �ϳ� �Ǵ� �������� �׸��� ������ �� �ֵ���
 	�������ִ� ������Ʈ
 - �ϳ��� �׸� ������ �� ������ MultipleMode�� �����ϸ� �������� �׸��� 
 	�Ѳ����� ������ �� �ֽ��ϴ�.

*/
import java.awt.Frame;
import java.awt.List;


public class ListEx01 extends Frame {

	public static void main(String[] args) {
		
		ListEx01 lt = new ListEx01();
		lt.setTitle("List Test");
		
		List lst = new List(9, true);	//9�� ����Ʈ, ��Ƽ��� true
		
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("Mars");
		lst.add("Jupiter");
		lst.add("Saturn");
		lst.add("Uranus");
		lst.add("Neptune");
		lst.add("Pluto");
		
		lt.add(lst);
		
		String[] items = new String[10];
		items = lst.getItems();
		for(String str:items){
			System.out.println(str);
		}
		
		lst.select(1);
		System.out.println("Selected items are " + lst.getSelectedIndex() + 
				" : " + lst.getSelectedItem());
		
		lst.select(3);
		//System.out.println("1th item is selected : " + lst.isIndexSelected(1));
		
		for(int i=0; i<items.length; i++){
			System.out.println(i + "th item is selected: " + lst.isIndexSelected(i));
		}
		
		System.out.println("A number of lists is " + lst.getRows());
		
		String[] selItems = new String[3];
		selItems = lst.getSelectedItems();
		System.out.println("Selected Items =========");
		for(int i=0; i<selItems.length; i++){
			System.out.println("List[" + i + "] : " + selItems[i]);
		}
		
		System.out.println("Multiple mode : " + lst.isMultipleMode());
		
		lst.setMultipleMode(false);
		
		System.out.println("Multiple mode : " + lst.isMultipleMode());
		
		lst.replaceItem("First list", 0);	//0��° �׸��� "First list"�� �ٲ۴�
		
		lt.pack();
		lt.setSize(300,300);
		lt.setVisible(true);

	}

}
