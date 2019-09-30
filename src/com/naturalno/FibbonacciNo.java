package com.naturalno;

public class FibbonacciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=0,
			no2=1,
			no3,i,
			count=10;    
		 System.out.print(no1+" "+no2);   
		    
		 for(i=2;i<count;++i)   
		 {    
		  no3=no1+no2;    
		  System.out.print(" "+no3);    
		  no1=no2;    
		  no2=no3;    
		 }    
		  
		}
	}  