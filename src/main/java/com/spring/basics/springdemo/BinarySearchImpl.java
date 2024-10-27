package com.spring.basics.springdemo;

public class BinarySearchImpl {
	private SortAlgorithm sa;

	
public BinarySearchImpl(SortAlgorithm sa) {
		super();
		this.sa = sa;
	}


public int binarySearch(int[] numbers,int num) {

	int[] sortednumbers=sa.sort(numbers);
	System.out.println(sa);
	return 3;
}
}
