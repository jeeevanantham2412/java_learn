package javalearn.java;

import java.util.Scanner;

public class AlpapetSearch {

	public static void main(String[] args) {
//		char [] arr;
//	Scanner in=new Scanner(System.in);
//	System.out.println("enter length of array  : ");
//	int n=in.nextInt();
//    for(int i=0;i<n;i++) {
//    	arr=in.next().trim().toCharArray();
//    }
		char []arr= {'c','f','j'};
    char target='c';
  int ans=  alphapetsearch(arr,target);
    System.out.println((char)ans);
	}
static int alphapetsearch(char arr[],char target) {
	int start=0;
	int end =arr.length-1;
	while(start<=end) {
		int mid =start+(end-start)/2;
//		if(target>arr[arr.length-1]) {
//			return arr[0];
//		}
		if(target<arr[mid]){
			end=mid-1;
		}
		else {
			start=mid+1;
	
			}
		}
	return arr[start%arr.length];
}
}
