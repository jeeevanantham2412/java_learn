package javalearn.java;

import java.util.Scanner;

public class LearnJava {
	Scanner sc=new Scanner (System.in);
	public LearnJava() {
		
	}
public void prime() {
	System.out.println("enter prime number  :");	
	int num=sc.nextInt();
	
	boolean flag=false;
	for (int i=1;i<num;i++) {
		if(num%i==0) {
			flag=true;
		}
		
	}
		if(flag==true )
			System.out.println("not prime");  
		else 
			System.out.println("prime");
			
		}
public void max() {
		int a=2;
		int b=7;
		int c=4;
		int max= a;
		if(max<b) {
			max=b;
			//System.out.println(b);
		}
		if(max<c) {
			max=c;
		}
	System.out.println(max);}
public void min() {
	int a=1;
	int b=9;
	int c=2;
	
	int min=a;
	if(min>b) {
		min=b;
	}
	if(min>c) {
		min=c;
	}
	System.out.println(min);
	//System.out.println(Math.min(c, Math.min(a, b)));
}	
public void alphabet() {
	
	for(char i='a';i<='z';i++) {
		System.out.print(i+" ");
	}
	
}
public void leapYear() {
	System.out.println("enter your year");
	int year=sc.nextInt();
	
	if(year%4==0&&year%100!=0||year%400==0) {
		System.out.println("it is leap year");
	}
	else
	System.out.println("not leap year");
}
public void sum() {
	System.out.println("enter your numbers  :");
	int n=sc.nextInt();
	int n1=sc.nextInt();
	int sum=n+n1; 
	System.out.println("entere your table  :");
  int n1=sc.nextInt();
  System.out.println("enter your length  : ");
  int n2 =sc.nextInt();
  for (int i=1;i<=n2;i++) {
	  System.out.println(i+"x"+n1+"="+i*n1);
  }
}
public void lcm() {
	int n1,n2,i,n3=0,x;
	System.out.println("number1");
	 n1=sc.nextInt();
	System.out.println("enter number 2");
	 n2=sc.nextInt();
		
	for( i=1;i<=n1&&i<=n2;i++) {
		
		if(n1%i==0&&n2%i==0) {
			 n3=i;
		//System.out.println(n3);
		}	
		}
	x=(n1*n2)/n3;
	System.out.println(x);

}

public void hcf() {
	int n1,n2,i,n3=0,x;
	System.out.println("enter the value lcm");
	 n1=sc.nextInt();
	 n2=sc.nextInt();
	  for (i=1;i<n1&&i<n2;i++) {
		  if(n1%i==0&&n2%i==0) {
			  n3=i;
		  }
	  }x=n1*n2/ n3;
	System.out.println(x);
}


public static void main(String[] args) {
		
		
	LearnJava obj=new LearnJava();
	//obj.prime();
	//obj.max();
	//obj.min();}
    //obj.alphabet();
     //obj.leapYear();
 //obj.sum();
//	obj.table();
obj.hcf();
//obj.lcm();
}}
