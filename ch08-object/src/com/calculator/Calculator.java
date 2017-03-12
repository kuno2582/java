package com.calculator;

public class Calculator {

		private Adder adder;
		private Multiplier multiplier;
		private Divider divider;
		private Substractor substractor;
		
		public Calculator(){
			adder = new Adder();
			multiplier = new Multiplier();
			divider = new Divider();
			substractor = new Substractor();
		}
		
		public int add(int num1, int num2){
			return adder.add(num1, num2);
		}
		
		public int times(int num1, int num2){
			return multiplier.times(num1, num2);
		}
	
		public int divide(int num1, int num2){
			return divider.devide(num1, num2);
		}
		
		public int substract(int num1, int num2){
			return substractor.substract(num1, num2);
		}
}
