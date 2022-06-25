package javalearn.java;

import java.util.Scanner;

public class AreaofShapes {
	Scanner sc=new Scanner(System.in);
	public void areaOfRectangle() {
		 System.out.println("enter rectangle length   :");
		    float h=sc.nextFloat();
		     System.out.println("enter rectangle width  :");
		   float w=sc.nextFloat();
		   sc.close();
		   double A=h*w;
		   System.out.println(A);
		
		}


public void areaOfCircle() {

	
	System.out.println("enter radius of cicle :");
     int r=sc.nextInt();
	 sc.close();
	 double A= 3.14*r*r;
	 
	System.out.println("Area of Circle   : "+ A);
	
	
}

public void areaOfTriangle (){

	System.out.println("enter triangle height  :");
	      float h=sc.nextFloat();
		//int h=sc.nextInt();
	System.out.println("enter triangle base  :");
          float b=sc.nextFloat();
          sc.close();
        //  int b=sc.nextInt();
         double A=0.5*h*b;
         // int A=(h*b)/2;
          System.out.println("Area of triangle  = "+ A);
	}
public void areaOfParallelogram() {
	System.out.println("enter the base :");
        float b=sc.nextFloat();
    System.out.println("enter the height");
        float h=sc.nextFloat();
        double A=b*h;
        System.out.println(A);


}
	
public static void main(String[] args) {
     AreaofShapes obj=new AreaofShapes();
     obj.areaOfCircle();
     obj.areaOfCircle();
     obj.areaOfCircle();
     obj.areaOfParallelogram();     
     
     
     
     
     
     
     
     
     
     
     
}
}