package com.acm.practice;

/**
 * 7、画图
 */
public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(5);
	}
	public static void method(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
