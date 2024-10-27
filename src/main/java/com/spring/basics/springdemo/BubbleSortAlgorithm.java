package com.spring.basics.springdemo;

public class BubbleSortAlgorithm implements SortAlgorithm{
public int[] sort(int[] numbers) {
	for(int i=0;i<numbers.length;i++)
	{
		for(int j=i+1;j<numbers.length;j++)
		{
			if(numbers[i]>numbers[j])
			{
				int c=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=c;
			}
		}
	}
	return numbers;
}
}
