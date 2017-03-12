import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

/*
Panel 클래스
 - 컴포넌트들을 그룹별로 묶어서 처리할 때 주로 사용
 - 컴포넌트들을 Panel에 추가(배치)하고 이 Panel을 Frame에 부착합니다.
 - 다른 Panel을 생성한 후 자신의 Panel에 붙일 수 있습니다.
 - 프레임은 윈도우 형태로 표현할 때 사용
 - 패널은 다른 컴포넌트를 포함시켜서 프레임에 배치할 때 사용한다.

객체 직렬화(Serialization)
 - 객체를 지정하는 방법
 - 객체의 내용을 바이트 단위로 변환하여 파일 또는 내트워크를 통해서 송수신(스트림)이 가능하게
 	하는 것을 의미
 - 객체를 직렬화 하기 위해서는 Serializable 인터페이스와 Extenalizable 인터페이스를
 	구현해야합니다.

*/
//@SuppressWarnings("serial")
public class PanelEx01 extends Frame {

	public PanelEx01(){
		setLayout(new FlowLayout());	//컨테이너의 레이아웃을 인자값의 방식으로 바꿔줌
		setTitle("Panel Test");
		setSize(300, 300);
		setBackground(Color.pink);
		
		Panel p = new Panel();
		p.setBackground(Color.green);
		
		Button b = new Button("확인");
		p.add(b);	//패널에 버튼 추가
		
		add(p);	//프레임에 패널 추가
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new PanelEx01();

	}

}
