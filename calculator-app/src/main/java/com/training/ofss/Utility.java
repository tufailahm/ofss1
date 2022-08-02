package com.training.ofss;

public class Utility
{
	public boolean checkPalindrome(String original) {
	      String  reverse = ""; // Objects of String class  
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	        return true;
	      else  
	        return false;
	}
}
