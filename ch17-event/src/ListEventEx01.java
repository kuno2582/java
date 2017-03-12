/*
ItemEvent
üũ�ڽ�, ����Ʈ, ���̽� �� ������Ʈ���� �׸��� �����ϰų� ������ �������� �� �߻��ϴ� �̺�Ʈ


ItemListener

*/
import java.awt.Frame;
import java.awt.List;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ListEventEx01 extends Frame {

	List fruits;
	
	public ListEventEx01(){
		setLayout(new FlowLayout());
		setTitle("ListEvent Test");
		
		fruits = new List();
		fruits.add("StrawBerry");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Banana");
		fruits.add("Apple");
		
		add(fruits);
		
		fruits.addItemListener(new FruitsHandler());
		
	}
	
	public class FruitsHandler implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e){
			System.out.println(fruits.getSelectedIndex() + " : " + 
					fruits.getSelectedItem());
		}
	}
	
	public static void main(String[] args) {
		
		ListEventEx01 le = new ListEventEx01();
		le.setSize(300, 200);
		le.setVisible(true);

	}

}
