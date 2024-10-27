package com.spring.basics.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {


	public static void main(String[] args) {
		BinarySearchImpl b=new BinarySearchImpl(new BubbleSortAlgorithm());
		int res=b.binarySearch(new int[] {1,25}, 3);
		System.out.print(res);
		//SpringApplication.run(SpringdemoApplication.class, args);
	}

}
