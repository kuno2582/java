package com.phone;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		DiCaPhone dc = new DiCaPhone("A1001","N1001",1001,"800��","F1.8");
		MP3Phone mp = new MP3Phone("B1001","M1001",2001,1024,"red");
		
		System.out.println("��\t ��ȣ\t ���ڵ�\t �ɼ�(ȭ�Ҽ�/������/�����)" );
		System.out.print(dc.getModel() + "\t");
		System.out.print(dc.getNumber() + "\t");
		System.out.print(dc.getBellSound() + "\t");
		System.out.print(dc.getPixel() + "\t");
		System.out.print(dc.getLens() + "\t");
		System.out.println();

		System.out.print(mp.getModel() + "\t");
		System.out.print(mp.getNumber() + "\t");
		System.out.print(mp.getBellSound() + "\t");
		System.out.print(mp.getSize() + "\t");
		System.out.print(mp.getColor() + "\t");
	}

}
