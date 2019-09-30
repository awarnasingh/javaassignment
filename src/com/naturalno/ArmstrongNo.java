package com.naturalno;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 371, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + "an armstrong no");
        else
            System.out.println(number + " not armstrong no");
    }
}