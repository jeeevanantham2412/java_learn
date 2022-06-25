package javalearn.java;

import java.util.Scanner;

public class DiscountProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		   System.out.println("enter amount :");
		   int num=sc.nextInt();
		   System.out.println("enter discount amount :");
		   int value=sc.nextInt();
		     // int value =(num*discount)/100;
		   int Discount=(100*value)/num;
		   
		   System.out.println("your discount is : "+Discount+"%");
	}

}
