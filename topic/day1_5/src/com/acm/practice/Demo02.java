package com.acm.practice;

/**
 * 2、大小写互换
 */
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Acm";
		System.out.println(method(str));
	}
	private static String method(String str) {
		//大写A-65
		//小写a-97
		char[] chs=str.toCharArray();
		for(int i=0;i<chs.length;i++){
			if(chs[i]>='A' && chs[i]<='Z'){ //大写转小写
				chs[i]+=32;
			}else if(chs[i]>='a' && chs[i]<='z'){ //小写转大小
				chs[i]-=32;
			}
		}
		return new String(chs); //String的构造方法
	}
}
