package com.ext4;

class Point {
	int x;
	int y;
	
	public Point(){
		
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation(){
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point {
	
	int z;
	
	public Point3D(){
		
	}
	
	public Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String getLocation(){
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}

public class SuperEx04 {

	public static void main(String[] args) {
		
		Point3D p3d = new Point3D(10, 20, 30);
		System.out.println(p3d.getLocation());

	}

}
