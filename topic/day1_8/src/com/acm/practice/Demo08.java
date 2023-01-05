package com.acm.practice;

import java.util.Arrays;

/**
 * 8、吃花生
 */
public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1 4 3 5 17 8 10";
		System.out.println(method(str,"Sunday"));
	}
	public static int method(String str,String week) {
		String[] strs=str.split(" ");
		int[] ins=new int[strs.length];
		for(int i=0;i<strs.length;i++){
			ins[i]=Integer.parseInt(strs[i]);
		}
		Arrays.sort(ins);
		
		int footer=0; 
		switch(week){
			case "Monday":footer=1;break;
			case "Tuesday":footer=2;break;
			case "Wednesday":footer=3;break;
			case "Thursday":footer=4;break;
			case "Friday":footer=5;break;
			case "Saturday":footer=6;break;
			case "Sunday":footer=7;break;
		}
		return ins[footer-1];
	}
}
