package javalearn.java;

import java.util.Scanner;

public class BasicJava {
 Scanner sc=new Scanner(System.in);
	
	public void checkOddEven() {
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("it is even");
		}
		else if(num%2==1) {
			System.out.println("it is odd");
		}
	}
    public void greetingmsg() {
    	System.out.println("enter msg : ");
    	String name=sc.nextLine();
    	System.out.println("hi \n"+name+"\nhow are you"); 
    }
	public void simpleIntrest() {
		System.out.println("Enter the primary value"); 
		int P=sc.nextInt();
		System.out.println("Enter the number of year : "); 
		int N=sc.nextInt();
		System.out.println("Enter the rate of intrest"); 
		int R=sc.nextInt();
		int SimpleIntrest=(P*N*R)/100;
		System.out.println(SimpleIntrest);
		
	}
    public void largenum() {
	System.out.println("enter the numbers : ");
    int a=sc.nextInt();
    int b=sc.nextInt();
   int ans=0;
    if(a>b) {
    	 ans=a;
    }
    else if(a<b) {
    ans=b;
    }
System.out.println("your ans = "+ans);


}
	public void rupeestoUsd() {
		System.out.println("enter the ruppee :");
		int Rs=sc.nextInt();
		double Usd= (Rs/77.69);
		
		System.out.println(Usd); 
	}
    
//   public void sumOfNumber() {
//	   System.out.println("enter the number");
//	   int num=sc.nextInt();
//	   int sum=0;
//	   while(num!=0) {
//		   sum+=num;
//		  System.out.println(sum);
//		   num++;
//	  } System.out.println(num);
//	   
//   } 
    
    public static void main(String[] args) {
		BasicJava obj=new BasicJava();
		obj.checkOddEven();
//		obj.simpleIntrest();
//		obj.greetingmsg();
//		obj.largenum();
//		obj.rupeestoUsd();
       // obj.sumOfNumber();
	}

}
