


import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListEventEx02 extends Frame {
	
	List sports;
	TextArea ta;
	
	public ListEventEx02(){
		setLayout(new BorderLayout());
		setTitle("Most popular sports in the world");
		
		sports = new List();
		ta = new TextArea();
		
		sports.add("Soccer");
		sports.add("Cricket");
		sports.add("Field Hockey");
		sports.add("Tennis");
		sports.add("Volleyball");
		sports.add("table Tennis");
		sports.add("Baseball");
		sports.add("Golf");
		sports.add("Basketball");
		sports.add("American Football");
		
		add("North", sports);
		add("Center", ta);
		
		sports.addActionListener(new SportsHandler());
	}
	
	public class SportsHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			ta.append(sports.getSelectedItem() + "\n");
		}
	}

	public static void main(String[] args) {
		
		ListEventEx02 le = new ListEventEx02();
		le.setSize(300,200);
		le.setVisible(true);

	}

}
