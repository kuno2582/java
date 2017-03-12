/*
MenuComponent
 - 사용자가 항목을 선택하여 항목에 따른 변화가 일어날 수 있도록 구현한 클래스
 - 메뉴는 보통 최상위 레벨의 윈도우 타이틀바 아래에 존재하는 것입니다.
 - 사용자가 프로그램의 기능을 선택할 수 있도록 해주는 컴포넌트
 - 메뉴의 구성은 MenuBar, Menu, MenuItem으로 구성이 됩니다.

MenuBar				메뉴바를 만들 때 사용
Menu				메뉴바에 올려 놓을 수 있는 메뉴를 만들 때 사용
MenuItem			메뉴의 하위 메뉴를 만들 때 사용
CheckboxMenuItem	체크박스가 있는 메뉴 아이템을 만들 때 사용
PopupMenu			동적으로 표현할 수 있는 메뉴를 만들 때 사용


메뉴 사용 단계
메뉴바 객체 생성
메유바에 삽입할 메뉴를 생성
서브 메뉴 항목 추가
메뉴를 메뉴바에 붙이기
메뉴바를 프레임에 붙이기


*/

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.CheckboxMenuItem;

public class MenubarEx01 extends Frame {
	
	MenuBar mb;
	
	public MenubarEx01(){
		super("Menu Test");
		
		//주메뉴
		mb = new MenuBar();
		setMenuBar(mb);	//프레임에 메뉴바 생성
		
		//서브메뉴
		Menu mn_mode = new Menu("Mode");
		Menu mn_options = new Menu("Options");
		Menu mn_help = new Menu("Help");
		
		//서브메뉴 및 서브항목
		MenuItem basic = new MenuItem("Basic");
		MenuItem advance = new MenuItem("Advance");
		CheckboxMenuItem check1 = new CheckboxMenuItem("Expert", true);
		
		Menu mn_morelang = new Menu("More Language");
		MenuItem mi1 = new MenuItem("C");
		MenuItem mi2 = new MenuItem("HTML5");
		MenuItem mi3 = new MenuItem("Java");
		MenuItem mi4 = new MenuItem("Android");
		CheckboxMenuItem check2 = new CheckboxMenuItem("Check");
		
		MenuItem exit = new MenuItem("Exit");
		mn_morelang.add(mi1);
		mn_morelang.add(mi2);
		mn_morelang.add(mi3);
		mn_morelang.add(mi4);
		mn_morelang.add(check2);
		
		mn_mode.add(basic);
		mn_mode.add(advance);
		mn_mode.add(check1);
		mn_mode.addSeparator();
		mn_mode.add(mn_morelang);
		mn_mode.addSeparator();
		mn_mode.add(exit);
		
		MenuItem userdefine = new MenuItem("User define");
		MenuItem windowsetting = new MenuItem("Window setting");
		
		mn_options.add(userdefine);
		mn_options.add(windowsetting);
		
		MenuItem about = new MenuItem("지우개");
		mn_help.add(about);
		
		mb.add(mn_mode);
		mb.add(mn_options);
		mb.add(mn_help);
		
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new MenubarEx01();

	}

}
