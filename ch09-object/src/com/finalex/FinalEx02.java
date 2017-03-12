package com.finalex;

class Me {
	
	public final void play(){
		System.out.println("플레이 메소드");
	}
	
}

public class FinalEx02 extends Me {
	
	public static void main(String[] args) {
		
		FinalEx02 f = new FinalEx02();
		f.play();

	}

}
