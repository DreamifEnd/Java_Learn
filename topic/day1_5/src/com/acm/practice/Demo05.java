package com.acm.practice;

import java.util.Arrays;

/**
 * 5、摸底
 */
public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="45 65 73 78 80 89 90";
		System.out.println(method(str));
	}
	public static double method(String str){
		String[] strs=str.split(" ");
		
		int[] ins=new int[strs.length];
		for(int i=0;i<strs.length;i++){
			int temp=Integer.parseInt(strs[i]);
			ins[i]=temp;
		}
		Arrays.sort(ins);
		int s=ins[0]+ins[ins.length-1]+ins[ins.length/2];
		return s/3.0;
	}
}
