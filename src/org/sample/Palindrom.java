package org.sample;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter any number");
	int i=sc.nextInt();
	int temp=i;
	int rev=0,rem;
	while(temp !=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(i==rev) {
		System.out.println(i+" is palindrome number");
	}
	else {
		System.out.println(i+" is not palindrome number");

	}
}
}
