package org.sample;

public class Fibbinocci {
public static void main(String[] args) {
	long i=1l,n=100,t1=0l,t2=1l;
	System.out.println("First 100 terms");
	while (i<=n) {
		System.out.println(t1+",");
		long sum=t1+t2;
		t1=t2;
		t2=sum;
		i++;
		
	}
}
}
