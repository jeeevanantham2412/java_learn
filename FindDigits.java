package javalearn.java;

public class FindDigits {

	public static void main(String[] args) {
		int nums[]= {-12,2,23,-123,1234};
		System.out.println(findDigits(nums));
	}
static int findDigits(int []nums) {
	int count=0;
	
	for(int num:nums) {
		if(even(num)) {
			
			count++;
		}
		
	}
	return count;
//	for(int i=0;i<nums.length;i++) {
//		if(even(nums)) {
//		return	count++;
//		}
//	}
//	return count;
//	
}
static boolean even(int num) {
	int numberofdigits=digits(num);
	if(numberofdigits%2==0) {
		
		return true;
	}
	return false;
}
static int digits(int num) {
	int count=0;
	if(num<0) {
		return num*-1;
	}
	else if(num==0){
		return -1;
	}
	while(num>0) {
		count++;
		num=num/10;
	}
	return count++;
}
}
