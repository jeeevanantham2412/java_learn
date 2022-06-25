package javalearn.java;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your num  :");
		int num=sc.nextInt();
		sc.close();
		int f = 0,s = 1;
		int t;
		for(int i=0;i<=num;i++) {
	System.out.println(f);	
	    t=f+s;
		f=s;
		s=t;
		}

}

}
