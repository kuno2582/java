package com.stringtokenizerex;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		
		String source = "2017-02-09 18:50:59";
		
		StringTokenizer st = new StringTokenizer(source, "-: ");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
