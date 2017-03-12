package com.ext4;

class Point_ {
	
	int x,y;
	
	public Point_(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation(){
		return "x: " + x + ", y: " + y;
	}
}

class Point3D_ extends Point_ {
	
	int z;
	
	public Point3D_(int x, int y, int z){
		super(x,y);	//가장 먼저 적어야한다.
		this.z = z;
	}
	
	@Override
	public String getLocation(){
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}

public class SuperEx05 {

	public static void main(String[] args) {
		
		Point3D_ p3d = new Point3D_(7, 8, 9);
		System.out.println(p3d.getLocation());

	}

}
