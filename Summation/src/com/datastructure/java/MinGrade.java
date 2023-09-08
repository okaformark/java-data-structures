package com.datastructure.java;
import java.util.*;

public class MinGrade {
	static int GetMinGrade(int []arr) {
		int min;
		min = arr[0];
		for (int i = 1; i<=arr.length-1; i++) {
			if(arr[i]<min) min = arr[i];
		}
		return min;
	}
	

	
 public static void main(String[] args) {
	
	 int []x = new int [100];
	 int minGrade;
	 //System.out.println("Enter a list of Grades");
	
	 for(int i = 0; i<x.length; i++) {
		 x[i] = (int)(Math.random()*100);
	 }
	 
	 for(int i = 0; i<x.length; i++) {
		 System.out.println("Grade"+ i + ":"+ x[i]);
	 }
	 minGrade = GetMinGrade(x);
	 System.out.println("The minimum Grade is:" + minGrade);
 }
}
