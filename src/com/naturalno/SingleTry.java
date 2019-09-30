package com.naturalno;

public class SingleTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
	      try {
	         
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("end of try block");
	      }
	      catch (ArithmeticException e) { 
	        
	         System.out.println("not divided by zero");
	      }
	      catch (Exception e) {
	        
	         System.out.println("Exception occurred");
	      }
	      System.out.println(" out of try-catch block.");
	   }
	}
