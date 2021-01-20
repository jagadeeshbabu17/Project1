package org.sample;

import java.util.Scanner;

public class StarRev {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
