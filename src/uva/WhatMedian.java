package uva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WhatMedian {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m,size;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while(in.hasNext()){
			n= in.nextInt();
			nums.add(n);
			Collections.sort(nums);
			size=nums.size();
			if(size%2!=0)
				m=nums.get((size-1)/2);
			else
				m= (nums.get((size-1)/2) + nums.get(size/2))/2; 
			System.out.println(m);
		}
		

	}

}