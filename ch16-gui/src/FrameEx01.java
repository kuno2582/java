/*

GUI 프로그래밍(Graphic User Interface)
 - GUI는 DOS와 같은 방식과 같은 텍스트기반의 프로그램이 아닌
 	그래픽을 이용하여 사용자와 프로그램간의 상호작용을 할 수 있도록 해주는 
 	인터페이스 역할을 합니다.
 - JAVA 이런 그래픽 기반 프로그래밍을 지원하기 위해서 AWT를 제공합니다.
 

AWT(Abstract Window Toolkit)
 - GUI프로그래밍을 할 수 있도록 자바에서 제공하는 라이브러리 모음
 - 버튼, 체크박스 컴포넌트와 이벤트 처리를 위한 인터페이스를 제공합니다.
 

Container(컨테이너)
 - 추상클래스로서 다른 컴포넌트들을 포함할 수 있는 기능을 가진 컴포넌트들의 상위 클래스
 - 컨테이너는 자신의 영역 내부에 다른 컴포넌트를 포함시키고 관리하는 역할을 합니다.
 - 컴포넌트들은 컨테이너에 들어가지 않으면(부착시키지 않으면) 독자적으로 화면에 출력될 수 없습니다.
 - 반드시 컨테이너에 부착시켜야 화면에 출력됩니다.
 - 부착은 add()메소드를 이용합니다.
 - 컨테이너에 컴포넌트의 위치를 결정하는 것을 Layout(배치; 레이아웃)이라고 합니다.


컨테이너 클래스 종류
 - Frame
 - Window
 - Pannel
 - Applet
 - Dialog
 - Filedialog
 - Scrollpanel
 

Frame
 - Window클래스의 하위클래스
 - 일반적인 응용프로그램에서 윈도우를 생성하기 위해 사용하는 클래스
 - Window클래스는 타이틀, 메뉴등의 기능을 지원하지 않기 때문에 일반적으로 
 	Window클래스는 사용하지 않고 Frame클래스를 사용합니다.
 - Frame은 다른 윈도우에 속해 있지 않은 윈도우(최상위 레벨 윈도우)
 - setSize(), setBounds()메소드들을 이용해서 윈도우의 크기를 설정한 후 
 	setVisible(), show()메소드를 통해서 화면에 보여주게 됩니다.



*/
import java.awt.Frame;

public class FrameEx01 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Frame Test");	// ctrl shift O 자동 임포트 시키기
		
		frame.setSize(400, 300);
		frame.setVisible(true);

	}

}
