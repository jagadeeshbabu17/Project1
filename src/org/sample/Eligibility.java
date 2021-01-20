package org.sample;

import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease Enter your Age");
		float i=sc.nextFloat();
		System.out.println("YOur age is :" +i);
		if (i>=18) {
			System.out.println("You are Eligible for voting");
			}
		else {
			System.out.println("You are not Eligible for voting");
		}
		
	}

}
