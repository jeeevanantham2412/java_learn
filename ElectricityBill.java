package javalearn.java;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	   System.out.println("enter your unit : ");
	    float u=sc.nextFloat();
	    sc.close();
	 float Rs=0;
	    if(u<=100) {                                      //belove 100 unit-0rs
	    Rs=u*0;
		}
	    else if(100<u&&200>=u) {                         //above 100 and below 200 ---1.5rs
	    	float unit =u-100;
	    	Rs=(float) (100*0+unit*1.5);
	    }
	    else if(200<u&&500>=u) {                           //above 100 --2rs
	    	float unit=u-100;
	    	Rs=(float)(100*0+unit*2);
	    }
	    else if(500<u) {
	    	float unit=u-500;
	    	//float unit1=unit-100;
	    	Rs=(float)(100*0+100*3.5+300*4.6+unit*6.6);
	    }
	    else {
	    	System.out.println("invalid value!!!!!!!!");
	    }
	    System.out.println("your Electricity bill amount = "+Rs+"Rs");
	
	}

}
