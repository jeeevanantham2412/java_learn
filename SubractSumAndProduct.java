package javalearn.java;

import java.util.Scanner;

public class SubractSumAndProduct {

public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your SumAndProduct  : ");
	int val=sc.nextInt();
	sc.close();
	SubractSumAndProduct obj=new SubractSumAndProduct();
	System.out.println(obj.subtractProductAndSum( val));

}
	 public int subtractProductAndSum(int n) {
	        int sum = 0;
			int product = 1;
	        while (n > 0) {
	            sum += n % 10;
	            product *= n % 10;
	            n /= 10;
	           // System.out.println(product );
	        }
	     return product-sum ;
	    }

}


