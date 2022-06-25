package javalearn.java;

import java.util.Scanner;

public class AverageofNnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	   System.out.println("enter number");
	   int num=sc.nextInt();
	   int sum=0,Average=0;
	   for(int i=1;i<=num;i++) {
		   sum=sum+i;
	      Average=sum/num; 
	      System.out.print(sum+" ");
	   }
	   System.out.println("Average number is : "+ Average);
	}

}
