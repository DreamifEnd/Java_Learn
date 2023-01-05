package com.acm.practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 6、合并
 */
public class Demo06 {

	public static void main(String[] args) {
		SortedSet<Integer> sortedSet=new TreeSet<Integer>();
		int[] i1=new int[]{1,3,5,7};
		int[] i2=new int[]{5,7,2,9}; //1,2,3,5,7,9
		for(int i=0;i<i1.length;i++){
			sortedSet.add(i1[i]);
			sortedSet.add(i2[i]);
		}
		
		//遍历输出
		Iterator<Integer> it=sortedSet.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] i1=new int[]{1,3,5,7};
//		int[] i2=new int[]{5,7,2,9}; //1,2,3,5,7,9
//		//ArrayList（动态数组）,LinkedList（链表）
//		List<Integer> list=new LinkedList<Integer>();
//		for(int i=0;i<i1.length;i++){
//			list.add(i1[i]);
//		}
//		for(int i=0;i<i2.length;i++){
//			if(!list.contains(i2[i])){
//				list.add(i2[i]);				
//			}
//		}
//		//排序
//		Collections.sort(list);
//		
//		//遍历输出
//		for(int i=0;i<list.size();i++){
//			System.out.print(list.get(i)+" ");
//		}
//	}

}
