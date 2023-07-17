package algorithms_Searching;

import java.util.Arrays;

public class seach_BinarySearchRecursive {
	
	static int binarySearch(int array[], int value) {
		
		int start = 0;
		int end = array.length;
		
		while(start < end) {
			int mid = (start+end) / 2;
			
			if(array[mid]==value) {
				return mid;
			} else if(array[mid] < value) {
				start  = mid+1;
			} else {
				end = mid;
			}
		}
		
		return -1;
	}
	
	
	static int binarySearchRecursive(int array[], int value, int start, int end) {
		if(start >= end) {
			return -1;
		}
		
		int mid = (start+end) / 2;
		
		if(array[mid]==value) {
			return mid;
		}
		
		else if(array[mid] < value) {
			return binarySearchRecursive(array, value, mid+1, end);
		} else {
			return binarySearchRecursive(array, value, start, mid);
		}
	}
	
	static int binarySearchRecursive(int array[], int value) {
		return binarySearchRecursive(array,value, 0, array.length);
	}
	
	public static void main(String[] args) {
		int[] myArray = {4,6,1,-7,3,2,5,0, -12, -9};


		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));

        System.out.println(binarySearchRecursive(myArray, -7));
        System.out.println(binarySearchRecursive(myArray, 0));
        System.out.println(binarySearchRecursive(myArray, 1));
        System.out.println(binarySearchRecursive	(myArray, 1236));
        
	}

}
