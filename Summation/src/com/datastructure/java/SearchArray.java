package com.datastructure.java;
import java.util.*;
public class SearchArray {
	
	static int Search(int arr[], int item) {
		int i = 0;
		while(i< arr.length) {
			if(arr[i] == item) {
				return i;
			}
				i++;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arrayToSearch = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(arrayToSearch));
		
		System.out.println("Enter a number from the array to search");
		
		int item = Integer.parseInt(new Scanner(System.in).nextLine());
		
		int searchedInt = Search(arrayToSearch,item);
		
		System.out.println("searched item returned is:" + searchedInt);
	}
}
