package com.summatin.java;
import java.util.*;

public class Summation {
static int Summation(int[]arr, int n) {
	int sum = 0;
	for(int i = 0; i <= n-1; i++) {
		sum = sum + arr[i];
	}
	return sum;
}
	public static void main(String[] args) {
		int[]a = new int[200];
		int Sum, n;
		System.out.println("Enter a number");
		n = Integer.parseInt(new Scanner(System.in).nextLine());
		
		for(int i = 0; i<=n-1; i++) {
			a[i]=i+1;
			Sum = Summation(a,n);
			System.out.println(Sum);
		}
	}
}
