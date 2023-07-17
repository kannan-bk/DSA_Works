package algorithms_Searching;

import java.util.Arrays;

public class search_LinearSearch {
	
	static int linearSearch(int arr[], int value) {
		

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] myArray = {4,6,1,-7,3,2,5,0, -12, -9};



        System.out.println(linearSearch(myArray, -7));
        System.out.println(linearSearch(myArray, 0));
        System.out.println(linearSearch(myArray, 1));
        System.out.println(linearSearch(myArray, 1236));
        
	}

}
