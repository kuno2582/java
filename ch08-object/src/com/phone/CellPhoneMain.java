package com.phone;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		DiCaPhone dc = new DiCaPhone("A1001","N1001",1001,"800만","F1.8");
		MP3Phone mp = new MP3Phone("B1001","M1001",2001,1024,"red");
		
		System.out.println("모델\t 번호\t 벨코드\t 옵션(화소수/사이즈/색상등)" );
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
