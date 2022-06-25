package javalearn.java;

import java.util.Scanner;

public class Cgpa {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     System.out.println("enter your tamil : ");
      int tamil=sc.nextInt();
     System.out.println("enter your English : ");
     int english=sc.nextInt();
     System.out.println("enter your Maths : ");
     int maths=sc.nextInt();
     System.out.println("enter your Science : ");
     int Sience=sc.nextInt();
     System.out.println("enter your Social : ");
     int Social=sc.nextInt();
     
     double CGPA=((tamil/100)+(english/100)+(maths/100)+(Sience/100)+(Social/100))/5;
     System.out.println(CGPA);
   double  CGPAper=9.5*CGPA;
     System.out.println(CGPAper);
	}

}
