import java.awt.Button;
import java.awt.Frame;

/*

LayoutManager (배치관리자)
 - 컨테이너는 자기 자신의 컨테이너 안에 컴포넌트를 추가시킬 때 어디에, 어떤 방식으로 배치 시킬지를
	이미 결정(가운데 정렬)하고 있다.
 - 컨테이너들은 미리 정해진 레이아웃에 따라 컴포넌트들을 자동으로 배치시킵니다.
 
 
Layout(레이아웃)
 - 배치 그 자체, 배치 설계, 출력 양식의 설계에 따라 배치시키는 것
 - 컨테이너에 컴포넌트의 위치를 결정하는 것
 

Frame	BorderLayout(기본값)
Dialog	BorderLayout(기본값)
Panel	FlowLayout(기본값)
Applet	FlowLayout(기본값)


레이아웃 관리자 사용방법
setLayout()을 이용해서 레이아웃 관리자를 설정
메소드의 인자로 레이아웃 관리자의 인스턴스를 지정해 줍니다.


*/
public class LayoutEx01 extends Frame {

	Button btn1,btn2;	//선언만 해주고 다른곳에서 생성하면 편함
	
	public LayoutEx01(){
		
		setLayout(null);	//배치관리자의 인스턴스를 인자값으로 넣어줌, null일 경우 모든것 수동지정
		setTitle("Layout Test");
		
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		
		btn1.setBounds(0, 30, 150, 170);	//좌표를 설정해주는 메소드
		btn2.setBounds(150, 30, 150, 170);	//왼쪽,폭,넓이,높이
		
		add(btn1);
		add(btn2);
		
	}
	
	public static void main(String[] args) {
		
		LayoutEx01 le = new LayoutEx01();
		
		le.setSize(300,200);
		le.setVisible(true);

	}

}
