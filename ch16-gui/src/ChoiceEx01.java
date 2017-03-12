
/*

Choice(���̽� = ��ӹڽ� = �޺��ڽ�)
 - ListŬ������ ���� ������ ����� ������ �ִ� ������Ʈ
 - ��Ӵٿ� ��ư�� Ŭ���ϸ� ���� ������ �߿� �ϳ��� ������ �� �ְ� ���ִ� ���
 - ������Ʈ�� ������ �� ��Ӵٿ� ����Ʈ �׸��� �߰����Ѽ� ����ϰ� �˴ϴ�.


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
		
		System.out.println("������ ��: " + ch.getItemCount());
		
		ch.addItem("Item 5");
		System.out.println("������ ��: " + ch.getItemCount());
		
		System.out.println( ch.getItem(1) );	//2��° ������ ���ڿ��� ��������
		
		ch.select(2);	//3��° ������ �����ϱ�
		
		System.out.println(ch.getSelectedIndex()+1 + "��° ������");
		
		cht.setSize(300, 200);
		cht.setVisible(true);
		
		ch.select("Item 4");
		System.out.println(ch.getSelectedItem());
		System.out.println(ch.getSelectedIndex());
		
		ch.remove(4);
		System.out.println("�� ������ ��: " + ch.getItemCount());
		
		ch.remove("Item 2");
		for(int i=0;i<3; i++){
			System.out.println(ch.getItem(i));
		}
		
	}

}
