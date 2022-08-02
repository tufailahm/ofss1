package com.training.ofss;

public class Calculator {
		public int add(int num1,int num2) {
			return num1+num2;	
		}
		public int divide(int num1,int num2)	//Test exception if the input is zero(second number)
		{
			return num1/num2;	
		}
		public int convertToNumber(String number)
		{
			return Integer.parseInt(number);
		}
}
