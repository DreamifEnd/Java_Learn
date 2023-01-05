package com.acm.practice;

/**
 * 1、水仙花数
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method(153)? "YES":"NO");
	}
	//对传入的整数n，判断是否是水仙花数
	public static boolean method(int n) {
		//153%10=3 153/10=15, 15%10=5...  1/10=0
		int m=n;
		int sum=0;
		int temp=1;
		while(n!=0){
			temp=n%10;
			sum+=Math.pow(temp, 3);
			n=n/10;
		}
		//每一位的立方和等于这个数本身(pow(temp,3)==n)
		if(sum==m){
			return true;
		}else{
			return false;			
		}
	}
}
