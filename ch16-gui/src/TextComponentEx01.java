/*
TextComponent
 - 텍스트 다루는 클래스의 super클래스
 - 텍스트를 처리하기 위한 각종 메소드들을 제공
 
 
TextField	문자 한줄만 입력을 받을 때 사용
TextArea	여러 줄의 문자를 입력받을 때 사용


*/
import java.awt.*;

public class TextComponentEx01 extends Frame {

	TextField tf;
	TextArea ta;
	
	public TextComponentEx01(){
		setLayout(new FlowLayout());
		
		tf = new TextField(30);		//몇글자 쓸지 인자로 받음
		ta = new TextArea(7, 30);	//행,열을 인자로 받음
		
		add(tf);
		add(ta);
		
	}
	
	public static void main(String[] args) {
		
		TextComponentEx01 tc = new TextComponentEx01();
		
		tc.setSize(300, 200);
		tc.setVisible(true);

	}

}
