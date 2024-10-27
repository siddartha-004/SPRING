package com.spring.basics.springdemo;

public class QuickSortAlgorithm implements SortAlgorithm{
	int partition (int a[], int start, int end)  
	{  
	    int pivot = a[end]; 
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        
	        if (a[j] < pivot)  
	        {  
	            i++; 
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[end];  
	    a[end] = t;  
	    return (i + 1);  
	}  
	  
	
	void quick(int a[], int start, int end) 
	{  
	    if (start < end)  
	    {  
	        int p = partition(a, start, end);   
	        quick(a, start, p - 1);  
	        quick(a, p + 1, end);  
	    }  
	}  
public int[] sort(int[] numbers)
{
	QuickSortAlgorithm q1 = new QuickSortAlgorithm();  
	int n=numbers.length; 
    q1.quick(numbers, 0, n - 1);  
	return numbers;
	
}
}
