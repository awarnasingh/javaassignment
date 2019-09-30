package com.naturalno;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countx=0, 
			county=0, 
			countz=0, 
			i;
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter 10 Numbers : ");
        for(i=0; i<10; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<10; i++)
        {
            if(arr[i] < 0)
            {
                countx++;
            }
            else if(arr[i] == 0)
            {
                county++;
            }
            else
            {
                countz++;
            }
        }
		
        System.out.print(countx + " Positive Numbers");
        System.out.print(county + " Negative Numbers");
        System.out.print(countz + " Zero");
    }
}