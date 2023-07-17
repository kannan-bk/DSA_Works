package algorithms_Sorting;

import java.util.Arrays;

public class Sorting_SelectionSort {
	
	public static void selectionSort(int[] array) {
        
		
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			
			}
			if(i!=minIndex) {
				 int temp = array[i];
			        array[i] = array[minIndex];
			        array[minIndex] = temp;
			}
		}
        
        
       
    }



    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3,2};

        selectionSort(myArray);

        System.out.println( Arrays.toString(myArray) );      

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]
            
         */
        
        System.out.println("-");
        anotherSelectionSort();

    }
    
    static void anotherSelectionSort() {
    	int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);

        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
