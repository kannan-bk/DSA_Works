package samples;

import java.util.ArrayList;

public class Works {
	
	public static void main(String[] args) {
	
		
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10 21 3");
        arrayList.add("20 1 3");
        arrayList.add("1 4 2");
        arrayList.add("10 9 10");
        

        int arrayListSize = arrayList.size();
        
        int arraySize =0;
        int a[] = new int[20];
        String getAll ="";
        String temp = null;
        for(int i=0;i<arrayListSize;i++) {
        	
        	getAll = getAll + arrayList.get(i)+ " ";
        	//getAll = arrayList.get(i)+ " ";
        	
        	
	}
        
        System.out.println(getAll);
        
        
        for(int num:a) {
        //	System.out.println(num);
        	
        }
        
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 4, 1, 5, 1};

        // Create a frequency array to store the count of occurrences
        int[] frequency = new int[numbers.length];

        // Iterate over the array to count occurrences
        for (int i = 0; i < numbers.length; i++) {
            int count = 1; // Initialize count as 1 for each element

            // Skip the element if its count has already been calculated
            if (frequency[i] != 0) {
                continue;
            }

            // Count the number of occurrences of the current element
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            // Store the count in the frequency array
            frequency[i] = count;
        }

        // Print the occurrences of each element
        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(numbers[i] + " occurs " + frequency[i] + " time(s)");
            }
        }

	}
	
	
	
}
