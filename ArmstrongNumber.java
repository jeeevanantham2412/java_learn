package javalearn.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
	   System.out.println("enter the Armstrongnumber : ");
	   int num=sc.nextInt();
	   sc.close();
	   int ans=0;
	   for(int i=0;i<num;i++) {
		   int val=num%10;
		
		ans=ans+(val*val*val);
        	num=num/10;  
		}
	System.out.println(ans);
	
	
	}

}
