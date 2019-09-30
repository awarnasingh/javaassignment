package com.naturalno;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerOf2(1));
	 }

	 private static boolean powerOf2(int number){
	     return (number > 0) && ((number & (number - 1)) == 0);
	 }
	}