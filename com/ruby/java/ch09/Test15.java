package com.ruby.java.ch09;

import java.util.Arrays;
import java.util.Random;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = new int[10];
		Random r2 = new Random();
		for (int i = 0; i < 10; i++) {
			data[i] = r2.nextInt(10);
		}
		for (int num: data)
			System.out.print(" " +num);
		System.out.println();
		Arrays.sort(data);  // 정렬해주는
		for (int num: data)
			System.out.print(" " + num);
		System.out.println();
		System.out.println(Arrays.toString(data));
				//tostring쓰면 []을 만들어 주었다
		
	}

}
