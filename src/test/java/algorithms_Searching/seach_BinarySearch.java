package algorithms_Searching;

import java.util.Arrays;

public class seach_BinarySearch {
	
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
	
	public static void main(String[] args) {
		int[] myArray = {4,6,1,-7,3,2,5,0, -12, -9};


		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));

        System.out.println(binarySearch(myArray, -7));
        System.out.println(binarySearch(myArray, 0));
        System.out.println(binarySearch(myArray, 1));
        System.out.println(binarySearch(myArray, 1236));
        
	}

}
