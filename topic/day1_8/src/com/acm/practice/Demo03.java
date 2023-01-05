package com.acm.practice;

/**
 * 3、正三角形的外接圆面积
 */
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method(13));
	}
	public static double method(int d){
		double s=Math.PI*d*d/(3*1.0); //外接圆的面积
		return s;
	}
}
