import java.awt.Frame;
import java.awt.Graphics;

public class ThreadEx04 extends Frame implements Runnable {

	int x,y;
	
	public ThreadEx04(){
		setTitle("Thread Test");
	}
	
	@Override
	public void update(Graphics g){	//붓에 해당하는 Graphics
		g.drawOval(x, y, 30, 30);
	}
	
	@Override
	public void run(){
		while(true){
			x = (int)(Math.random()*300);
			y = (int)(Math.random()*300);
			
			repaint();
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadEx04 te = new ThreadEx04();
		te.setSize(300, 300);
		te.setVisible(true);
		
		Thread t = new Thread(te);
		t.start();

	}

}
