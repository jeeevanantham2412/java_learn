package javalearn.java;

import java.util.Scanner;

public class FindFactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter factor num : ");
		int n=sc.nextInt();
       sc.close();
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.print(i+", ");
		}
	}
	
	
	
	
	}}