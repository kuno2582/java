import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEventEx01 extends Frame {
	
	MenuBar mb;
	
	public MenuEventEx01(){
		setTitle("MenuEvent Test");
		setLayout(new FlowLayout());
		setBackground(Color.lightGray);
		
		mb = new MenuBar();
		
		Menu m1 = new Menu("MainMenu1");
		
		MenuItem m1_mi1 = new MenuItem("SubMenu1");
		MenuItem m1_mi2 = new MenuItem("SubMenu2");
		MenuItem m1_mi3 = new MenuItem("SubMenu3");
		
		m1.add(m1_mi1);
		m1.add(m1_mi2);
		m1.add(m1_mi3);
		
		mb.add(m1);
		
		setMenuBar(mb);	//메뉴바 붙이는 메서드
		
		//m1_mi2.addActionListener(new MenuHandler()); 보통 이런방식으로 하지 않는다
		m1.addActionListener(new MenuHandler());
		
	}
	
	public class MenuHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e){
			//System.out.println("서브메뉴2가 선택되었습니다."); 보통 이런방식으로 하지 않는다
			if(e.getActionCommand() == "SubMenu3"){
				System.exit(0);
				
			}
			System.out.println(e.getActionCommand() + "가 선택되었습니다.");
		}
		
	}

	public static void main(String[] args) {
		
		MenuEventEx01 me = new MenuEventEx01();
		me.setSize(300, 200);
		me.setVisible(true);

	}

}
