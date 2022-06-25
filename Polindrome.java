package javalearn.java;

public class Polindrome {
	public static void main(String[] args) {
		String name="jeeva";
		String str=" ";
		char[]n=name.toCharArray();
		for(int i=n.length-1;i>=0;i--) {
			str=str+n[i];
			
		}
		//System.out.println(str);
	  if(name==str) {
		  System.out.println("it is Polindrome");
	  }
	  else
		  System.out.println(" it not polindrome");
	}

}
