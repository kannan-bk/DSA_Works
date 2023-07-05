package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SampleTest {
	
	public static void listexamples() {
		int [] array = {6,1,2,3,3,4,5,6,5,5,6};
		Arrays.sort(array);

		List<Integer> a = new ArrayList<>();
		Set<Integer> sett = new HashSet<>();
		for(int num: array) {
			System.out.println(num);
			a.add(num);
			sett.add(num);
		}
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(0).toString());
			
		}
		
		System.out.println("==");
		  // Iterating over hashSet items
        Iterator<Integer> i = sett.iterator();
  
        // Holds true till there is single element remaining
        while (i.hasNext())
  
            // Iterating over elements
            // using next() method
            System.out.println(i.next().toString());
    }
	
	public static void checkpalidrome() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = scanner.nextLine();

	        boolean isPalindrome = true;
	        int n = str.length();
	        for (int i = 0; i < n / 2; i++) {
	            if (str.charAt(i) != str.charAt(n - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	        
	        
	        Scanner get = new Scanner(System.in);
	        String getinput = get.next();
	        
	        boolean test = true;
	        
	        int six = getinput.length();
	        
	        for(int i=0;i<six/2;i++) {
	        	if(getinput.charAt(i)!= getinput.charAt(six-1-i)) {
	        		test = false;
	        		break;
	        	}
	        }
	}
	
	static void duplicates() {
		 int[] array = {1,2,3,4,5,1,4,6,2,35,32,1};
		  Map<Integer, Integer> occurrences = new HashMap<>();

	        // Count the occurrences of each number in the array
	        for (int num : array) {
	            if (occurrences.containsKey(num)) {
	            	//System.out.println(" to check key "+num);
	                occurrences.put(num, occurrences.get(num) + 1);
	            } else {
	            	//System.out.println(" to check "+num);
	                occurrences.put(num, 1);
	            }
	        }

	        // Display duplicate numbers and their occurrences
	        System.out.println("Duplicate numbers and their occurrences:");
	        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
	            int number = entry.getKey();
	            int count = entry.getValue();

	            if (count > 1) {
	               // System.out.println(number + " - Occurrences: " + count);
	            }
	        }
	        
	        
	        
	        Map<Integer, Integer> testing = new HashMap<>();
	        
	        for(int inputarray:array) {
	        	if(testing.containsKey(inputarray)) {
	        		testing.put(inputarray, testing.get(inputarray)+1);
	        	} else {
	        		testing.put(inputarray, 1);
	        	}
	        }
	        
	        for(Map.Entry<Integer, Integer> toprint: testing.entrySet()) {
	        	
	        	int keyv = toprint.getKey();
	        	int valv = toprint.getValue();
	        	
	        	System.out.println(keyv+" "+valv);
	        }
	}

	
	static void removeduplicates() {
		 int[] array = {1,2,3,4,5,1,4,6,2,35,32,1};
		 
		 List<int[]> a = Arrays.asList(array);
		 System.out.println(a);
		 
		 Set<Integer> myset = new HashSet<>();
		 
		 for(int n:array) {
			 myset.add(n);
		 }
		 
		 int[] newarrays = new int[myset.size()];
		 int i = 0;
	        for (Integer element : myset) {
	        	newarrays[i++] = element;
	        }

	        Arrays.sort(newarrays);
	        System.out.println("Array after removing duplicates: ");
	        for (int j = 0; j < newarrays.length; j++) {
	            System.out.print(newarrays[j] + " ");
	        }
		 
	}
	
	static void reverseString() {
		  String str = "Hello, world!";

	        // Create a StringBuilder to reverse the string.
	        StringBuilder reversedStr = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversedStr.append(str.charAt(i));
	        }

	        // Print the reversed string.
	        System.out.println("The reversed string is: " + reversedStr);
	        
	        System.out.println(new StringBuilder(str).reverse().toString());
	    }
	
	static void factorial() {
		int number = 5;
		
		int fact =1;
		
		for(int i=2;i<=number;i++) {
			fact*=i;
		}
		
		System.out.println(fact);
	}
	
	
	static void swapNumbers(int a,int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	}
	
	static void isPrime(int num) {
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println(num+" is a prime");	
		} else {
			System.out.println(num+" is not a prime");
		}
		
		
	}
	
	 public static void printPyramid(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            // Print spaces before numbers
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k + " ");
	            }

	            System.out.println();
	        }
	    }
	
	 public static void reverseList() {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        System.out.println("Original ArrayList: " + numbers);

	        Collections.reverse(numbers);

	        System.out.println("Reversed ArrayList: " + numbers);
	    }
	 
	 static int  binarySearch() {
		 int[] input = {1,2,3,4,5,1,4,6,2,35,32,1};
		 int target = 1;
		 
		 int left =0;
		 int right = input.length-1;
		 
		 Arrays.sort(input);
		 
		 while(left <= right) {
			 int mid = left + (right - left)/2;
			 
			 if(input[mid]==target) {
				 return mid;
			 } else if (input[mid] < target) {
				 left = mid+1;
			 } else {
				 right = mid - 1;
			 }
			 
			
			 
			 
		 }
		 return -1;
		
	 }
	 
	 static void shiftLeft() {
		 int a[] = {0,1,5,6,0,1,0,2,4,2,0,8};
		 int newarray[] = new int[a.length];
		 int count =0 ;
		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]!=0) {
				 newarray[count] = a[i];
				 count++;
			 }
		 }
		 
		 count = 0;
		 int changed = a.length - newarray.length;
		 for(int i=0;i<changed;i++) {
			 
				 newarray[count] = a[i];
				 count++;
			
		 }
		 
		 for(int i=0;i<newarray.length;i++) {
			 
			 System.out.print(newarray[i]+" ");
		
	 }
		
		 
	 }
	 
	 static void bubbleSort() {
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        
	        System.out.println("Original array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        
	        System.out.println();
	       int n = arr.length;
	       
	       for(int i=0;i<n-1;i++) {
	    	   for(int j=0;j<n-i-1;j++) {
	    		   if(arr[j]>arr[j+1]) {
	    			   int temp = arr[j];
	    			   arr[j]=arr[j+1];
	    			   arr[j+1]= temp;
	    		   }
	    	   }
	       }
	       
	       System.out.println("After sorting array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        
	      
	 }
	 
	 public static void lengthOfLastWord() {
		 	 String s1 = "luffy is still joboy   ";

	        String lastword[] = s1.split(" ");
	        System.out.println(lastword[lastword.length-1].length());
	        
	    }
	 
	public static void main(String[] args) {
		lengthOfLastWord();
		
	}
		
		
	
	
	
	

   
	
	}


