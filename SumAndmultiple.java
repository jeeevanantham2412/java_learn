package javalearn.java;

import java.util.Scanner;

public class SumAndmultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter your number :");
      int num=sc.nextInt();
      int a, b, i, Sum = 0;
      for (i = 1; i < num; i++)
      {
          a = i % 3;
          b = i % 5;
          if (a == 0 || b == 0)
          {
              Sum = Sum + i;
      System.out.print( Sum+" ");
      
          }
      }
     
  }
	
	
	
	
	}


