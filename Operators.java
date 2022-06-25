package javalearn.java;

import java.util.Scanner;

public class Operators {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.print("enter the operator : ");
    
    while(true) {
    	char op=sc.next().trim().charAt(0);
    	if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%') {
    		System.out.print("enter the numbers : ");
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		sc.close();
    		int ans=0;
    		if(op=='+') {ans=a+b;
    		}
            if(op=='-') {ans=a-b;
            } 
            if(op=='*') {ans=a*b;}

            if(op=='/') {
            	if(b!=0) {ans=a/b;}
            }
            if(op=='%') {ans=a%b;	
            }
            if(op=='X'||op=='x') {
            	break;
            }
    	 System.out.println("your ans = "+ans); 
    	 }
    	else {
    		System.out.println("invalid key");}
}
}}
