package com.acm.practice;

/**
 * 4、数乌龟
 */
public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method(8));
	}
	public static int method(int year) {
		int[] ins=new int[100];
		ins[0]=1;
		ins[1]=2;
		ins[2]=3;
		for(int i=3;i<ins.length;i++){
			ins[i]=ins[i-1]+ins[i-3];
		}
		return ins[year-1];
	}
}
