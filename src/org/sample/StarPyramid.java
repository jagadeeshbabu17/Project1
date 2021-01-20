package org.sample;

import java.util.Scanner;

public class StarPyramid {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter any number");
		int i=sc.nextInt();
		int a,b;
		for(a=1;a<=i;a++)
		{
			for(b=1;b<=a;b++) {
				System.out.print("*" );
			}
			System.out.println("");
			
		}
	}

}
