/*
TextComponent
 - �ؽ�Ʈ �ٷ�� Ŭ������ superŬ����
 - �ؽ�Ʈ�� ó���ϱ� ���� ���� �޼ҵ���� ����
 
 
TextField	���� ���ٸ� �Է��� ���� �� ���
TextArea	���� ���� ���ڸ� �Է¹��� �� ���


*/
import java.awt.*;

public class TextComponentEx01 extends Frame {

	TextField tf;
	TextArea ta;
	
	public TextComponentEx01(){
		setLayout(new FlowLayout());
		
		tf = new TextField(30);		//����� ���� ���ڷ� ����
		ta = new TextArea(7, 30);	//��,���� ���ڷ� ����
		
		add(tf);
		add(ta);
		
	}
	
	public static void main(String[] args) {
		
		TextComponentEx01 tc = new TextComponentEx01();
		
		tc.setSize(300, 200);
		tc.setVisible(true);

	}

}
