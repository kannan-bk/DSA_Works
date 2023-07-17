package algorithms_Sorting;

import java.util.Arrays;

public class Sorting_QuickSort {
	
	
	static void swap(int[] array, int firstIndex, int secondIndex) {
		int temp =array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex]=temp;
	}
	
	static int pivot(int[] array, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;
		
		for (int i = pivotIndex+1	; i <= endIndex; i++) {
			if(array[i]<array[pivotIndex]) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
		}
		swap(array, pivotIndex, swapIndex);
		return swapIndex;
		
	}
	
	static void quickSortHelper(int[] array, int left, int right) {
		if(left < right) {
			int pivotIndex = pivot(array, left, right);
			quickSortHelper(array, left, pivotIndex-1);
			quickSortHelper(array, pivotIndex+1, right);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] myArray = {4,6,1,-7,3,2,5,0, -12, -9};

		quickSortHelper(myArray,0,myArray.length-1);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7]

         */
		
	}

}
