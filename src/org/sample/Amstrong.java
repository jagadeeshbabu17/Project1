package org.sample;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Please enter the value to check Armstrong number:");
		int n=sc.nextInt();
		int c=0,a,temp;
		temp=n;
		while (n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
		if(temp==c)
			System.out.println("Armstrong number");
		else
			System.out.println("Number is not Armstrong number");
	}

}
