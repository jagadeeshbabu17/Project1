package org.sample;

public class CountOfNo {
	public static void main(String[] args) {
		int count = 0, num = 123456789;
		while (num != 0) {
			num = num / 10;
			count++;

		}
		System.out.println("Number of digits in number is :" + count);
	}

}
