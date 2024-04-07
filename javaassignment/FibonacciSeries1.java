
//Find the Fibonacci Series up to Nth Term in Java Language
//a. Method 1: Using Iteration (Using Three variables)

package javaassignment;

import java.util.Scanner;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		// 1st Method
		Scanner sc = new Scanner(System.in);
		int first = 0, second = 1, third = 1;
		
		System.out.print(first + " " + second);
		for (int i = 2; i < 9; i++) {
			third = first + second;
			System.out.print(" " + third);
			first = second;
			second = third;
		}

	}


	}


