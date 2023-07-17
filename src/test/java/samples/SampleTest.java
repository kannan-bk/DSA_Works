package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class SampleTest {

	public static void listexamples() {
		int[] array = { 6, 1, 2, 3, 3, 4, 5, 6, 5, 5, 6 };
		Arrays.sort(array);

		List<Integer> a = new ArrayList<>();
		Set<Integer> sett = new HashSet<>();
		for (int num : array) {
			System.out.println(num);
			a.add(num);
			sett.add(num);
		}
		for (int i = 0; i < a.size(); i++) {
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

		for (int i = 0; i < six / 2; i++) {
			if (getinput.charAt(i) != getinput.charAt(six - 1 - i)) {
				test = false;
				break;
			}
		}
	}

	static void duplicates() {
		int[] array = { 1, 2, 3, 4, 5, 1, 4, 6, 2, 35, 32, 1 };
		Map<Integer, Integer> occurrences = new HashMap<>();

		// Count the occurrences of each number in the array
		for (int num : array) {
			if (occurrences.containsKey(num)) {
				// System.out.println(" to check key "+num);
				occurrences.put(num, occurrences.get(num) + 1);
			} else {
				// System.out.println(" to check "+num);
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

		for (int inputarray : array) {
			if (testing.containsKey(inputarray)) {
				testing.put(inputarray, testing.get(inputarray) + 1);
			} else {
				testing.put(inputarray, 1);
			}
		}

		for (Map.Entry<Integer, Integer> toprint : testing.entrySet()) {

			int keyv = toprint.getKey();
			int valv = toprint.getValue();

			System.out.println(keyv + " " + valv);
		}
	}

	static void removeduplicates() {
		int[] array = { 1, 2, 3, 4, 5, 1, 4, 6, 2, 35, 32, 1 };

		List<int[]> a = Arrays.asList(array);
		System.out.println(a);

		Set<Integer> myset = new HashSet<>();

		for (int n : array) {
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
		
		HashSet<Integer> as = new HashSet<>();
		

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

		int fact = 1;

		for (int i = 2; i <= number; i++) {
			fact *= i;
		}

		System.out.println(fact);
	}

	static void swapNumbers(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + " " + b);
	}

	static void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
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

	static int binarySearch() {
		int[] input = { 1, 2, 3, 4, 5, 1, 4, 6, 2, 35, 32, 1 };
		int target = 1;

		int left = 0;
		int right = input.length - 1;

		Arrays.sort(input);

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (input[mid] == target) {
				return mid;
			} else if (input[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return -1;

	}

	static void shiftLeft() {
		int a[] = { 0, 1, 5, 6, 0, 1, 0, 2, 4, 2, 0, 8 };
		int newarray[] = new int[a.length];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				newarray[count] = a[i];
				count++;
			}
		}

		count = 0;
		int changed = a.length - newarray.length;
		for (int i = 0; i < changed; i++) {

			newarray[count] = a[i];
			count++;

		}

		for (int i = 0; i < newarray.length; i++) {

			System.out.print(newarray[i] + " ");

		}

	}

	static void bubbleSort() {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Original array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();
		int n = arr.length;
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
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

		System.out.println(s1.substring(2, 4));
		String lastword[] = s1.split(" ");
		System.out.println(lastword[lastword.length - 1].length());
		
		int a = 11;
		s1 =String.valueOf(a);
		System.out.println(s1.repeat(50));
		System.out.println(s1.indent(5));
	}

	
	static  void loopWorks() {
		
		System.out.println("i  j");
		
		for(int i=0;i<5;i++) {
			
		}
	}
	
	static void findLargestInArray() {
		int[] array = {1,2,3,5,6,3,62,97,4};
		int small = -1;
		int large = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]>large) {
				large=array[i];
				small = large;
			} 
			
			else if(array[i]>small) {
				small = array[i];
			}
		}
		
		System.out.println(large+" "+small);
		
		
		int[] numbers = {1,2,3,5,6,3,62, 97, 97,4};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        
       
        
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("No second largest number found.");
        }
    }

	
	static void stringReverseWithoutInbuild() {
		String toReverse = "hello world";
		String reverse = "";
		
		for (int i = toReverse.toCharArray().length-1; i >= 0; i--) {
			reverse = reverse + toReverse.charAt(i);
		}
		System.out.println(reverse);
	}
	
	
	static void countNoOfWords() {
		String toReverse = "hello world is the new hello world";
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		int count  = toReverse.split(" ").length;
		
	}
	
	static void secondLargest() {
		        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 100 };
		        int largest = 0;
		        int secondLargest = 0;
		        System.out.println("The given array is:");
		        for (int i = 0; i < arr.length; i++)
		        {
		            System.out.print(arr[i] + "\t");
		        }
		        for (int i = 0; i < arr.length; i++)
		        {
		            if (arr[i] > largest)
		            {
		                secondLargest = largest;
		                largest = arr[i];
		            }
		            else if (arr[i] > secondLargest && arr[i]!=largest)
		            {
		                secondLargest = arr[i];
		            }
		        }
		        System.out.println("\nSecond largest number is:" + secondLargest);
		        System.out.println("Largest Number is: "  +largest);
		    
	}
	
	static void maxOccurences() {
	    String str = "helloworld";

	    // Create a character array to store the frequency of each character in the string
	    int[] charCount = new int[256];

	    // Iterate through the string and update the frequency of each character
	    for (int i = 0; i < str.length(); i++) {
	      char currentChar = str.charAt(i);
	      charCount[currentChar]++;
	    }

	    // Find the maximum and minimum occurring characters
	    char maxChar = ' ';
	    int maxCount = -1;
	    char minChar = ' ';
	    int minCount = Integer.MAX_VALUE;

	    for (int i = 0; i < charCount.length; i++) {
	      if (charCount[i] > maxCount) {
	        maxChar = (char) i;
	        maxCount = charCount[i];
	      } else if (charCount[i] < minCount) {
	        minChar = (char) i;
	        minCount = charCount[i];
	      }
	    }

	    // Print the maximum and minimum occurring characters
	    System.out.println("The maximum occurring character in the string is: " + maxChar);
	    System.out.println("The minimum occurring character in the string is: " + minChar);

	}

	static void secondLargestFinding() {
		int[] array = {1,2,3,4,5,1,434,312,3421,123,312,3421};
		int max = array[0];
		int small = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				small = max;
				max = array[i];
				
				
			} else if(array[i]>small && array[i]!=max) {
				small = array[i];
				
			}
		}
		
		System.out.println(small);
		
	}
	
	static void findCharacterCount() {
		String java = "Testing is good !";
		
		char c;

	    for(c = 'a'; c <= 'z'; ++c) {
	    
	    	java = java.toLowerCase();
	    	int count = java.length()-java.replaceAll(String.valueOf(c), "").length();
	    	if(count>0) {
	    		System.out.println(c+" "+count);
	    	}
	    	
	    }
	}
	
	static void findDuplicateCharactersUsingHashMpa() {
		
		String java = "Testing is good !";
		char[] array = java.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count = 1;
		
		for (int i = 0; i < array.length; i++) {
			
			if(!hm.containsKey(array[i])) {
				hm.put(array[i], count);
			} else {
				hm.put(array[i], hm.get(array[i])+1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> forloop : hm.entrySet()) {
			char key = forloop.getKey();
			int value = forloop.getValue();
			
			if(value>1) {
				System.out.println(key+ " "+value);
			}
		}
		
	}
	
	static void reverseWordsInSentence() {
		String sen = "hey this is fund to do";
		String[] array = sen.split(" ");
		String temp = "";
		for(String a:array) {
			
			for(int i=a.toCharArray().length-1 ; i>=0;i--) {
				temp = temp+a.charAt(i);
			}
			temp = temp+" ";
			
		}
		System.out.println(temp);
	}
	
	static void LargestAndSmallestInArray() {
		
	     int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 100 };
	     int large = arr[0];
	     int small = arr[0];
	     
	     for (int i = 0; i < arr.length; i++) {
	    	 
	    	 if(arr[i] > large) {
	    		 large = arr[i];
	    	 } else if(arr[i] < small) {
	    		 small = arr[i];
	    	 }
			
		}
	     
	     System.out.println(large+" "+small);
	     
	     TreeSet<Integer> ts = new TreeSet<>();
	     for(int a: arr) {
	    	 ts.add(a);
	     }

	     System.out.println(ts.first()+" "+ts.last());
	     System.out.println(ts.descendingSet());
	     
	     int i =0;
	     for(Integer number : ts){
	    	 
	    	 if(i==0 || i==ts.size()-1) {
		    		System.out.println(number); 
		    	 }
	    	 i++;
	    	 
	        }  
	}
	
	static void SortArrayWithForLoop() {
		
	     int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 100 };
	     
	     List<int[]> l = Arrays.asList(arr);
	     
	    
	     
	     int count = 0;
	     
	    for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					count = arr[i];
					arr[i] = arr[j];
					arr[j] = count;
				
			}
			
		}
	    }
	    for (int i1 : arr) {
	    	System.out.println(i1);
		}
	}
	
	
	static void reverseNumber () {
		int num = 6598;
		int result = 0;
		while(num>0) {
			result = result*10 + num%10;
			num = num/10;
		}
		
		
		System.out.println(result);
	}
	
	static void fibo() {
		int a = 0;
		int b =1;
		int c = 0;
		for (int i = 0; i < 12; i++) {
			 c = a + b;
			System.out.println(c+" ");
			a = b;
			b = c;
		}
		
		System.out.println(c);
	}
	
	static int factRecursive(int n) {
		
		if(n<=1) {
			return 1;
		} else {
			return n*factRecursive(n-1);
		}
	}
	
	static void printPattern() {
		int count = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 5; j >i ; j--) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		for (int i = 1; i < 5; i++) {
			for (int j = 5; j >i ; j--) {
				System.out.print("*"+" ");
				count++;
			}
			System.out.println();
		}
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("*"+" ");
				count++;
			}
			System.out.println();
		}
		
		
		//x for rows, y for columns, and row denotes the number of rows to print
		int x, y, row = 5; 
		//Outer loop for rows 
		for (x=0; x<row; x++) 
		{ 
		//inner loop for space 
		for (y=row-x; y>1; y--) 
		{ 
		//To print space between two stars 
		System.out.print(" "); 
		} 
		//inner loop for columns 
		for (y=0; y<=x; y++ ) 
		{ 
		//To print star 
		System.out.print(y+" "); 
		} 
		//Cursor goes to the new line after printing each line.
		System.out.println(); 
		}
		
		
		
		for (int i = 1; i <= 6; i++) {
			
			for (int j = 1; j <=6-i; j++) {
				System.out.print("");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("& ");				
			}
			
			
			System.out.println();
		}
		
		int rows =6;
		// Loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Loop to print the spaces before the asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Loop to print the asterisks in each row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line
        }
		
	}
	
	static void swapNumber() {
		int a = 10;
		int b = 20;
		
		a = a +b; // 10+20 = 30
		b = a-b; // 30-20 = -10
		a =a-b; // 
		
		System.out.println(a+" "+b);
	}
	
	static void printPrimeNumber () {
		
		for (int i = 0; i < 20; i++) {
			for (int j = 2; j < Math.sqrt(i); j++) {
				if(i%j==0) {
					System.out.println(i+" not a prime");
				} else {
					System.out.println(i+" is a prime");
				}
				
			}
		}
	}
	
	
	static void duplicatepractice() {
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 100 };
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			} else {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			
		}
		
		
		
		for(Entry<Integer, Integer> m : hm.entrySet()) {
			int key = m.getKey();
			int value = m.getValue();
			if(value==1) {
				System.out.println(key);
				
				
			}
		}
		
	}
	
	static void duplicatesRemoveUsingLoop() {
		
        int[] array = {1, 1, 2, 3, 3, 4, 5, 6, 6, 7};
        if (array.length == 0) {
           // return array; // Empty array, no duplicates to remove
        }

        int uniqueCount = 1; // Count of unique elements (initially set to 1)
        
        // Check each element starting from the second element
        for (int i = 1; i < array.length; i++) {
            boolean isDuplicate = false;
            
            // Check if the current element is a duplicate of any previous element
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If the current element is not a duplicate, add it to the unique elements
            if (!isDuplicate) {
                array[uniqueCount] = array[i];
                uniqueCount++;
            }
            
        }
        Arrays.copyOf(array, uniqueCount);

       // System.out.println(Arrays.toString(uniqueCount));

        
        
	}
	
	
    // Method to count the number of common factors between two integers
    public static long countCommonFactors(long a, long b) {
        // Calculate the GCD using the Euclidean algorithm
        long gcd = calculateGCD(a, b);
System.out.println(gcd);
        // Count the factors of the GCD
        long factors = 0;
        for (long i = 1; i * i <= gcd; i++) {
        	System.out.println(1+" i  gcd "+gcd);
            if (gcd % i == 0) {
                factors++;
                if (i != gcd / i) {
                    factors++;
                }
            }
        }

        return factors;
    }

    // Method to calculate the GCD of two integers using the Euclidean algorithm
    public static long calculateGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
    
    
    static void pointersExample() {
    	 int num1 = 10;
    	 int num2 = num1;
    	 
    	 num1 =11;
    	 num2=num1;
    	 
    	 
    	 System.out.println("num1 "+num1);
    	 System.out.println("num2 "+num2);
    	 
    	 HashMap<String, Integer> hm1 = new HashMap<>();
    	 HashMap<String, Integer> hm2 = new HashMap<>();
    	 
    	 hm1.put("Value", 11);
    	 
    	 hm2 = hm1;
    	 
    	 hm1.put("Value", 12);
    	 
    	 System.out.println(hm1+" hm1");
    	 System.out.println(hm2+" hm2");
    	 
    	
    }
    
    
    static void addAllNumbersFromString() {
    	String s = "Welcome123To456India789";
    	int sum =0;
    	String s1 = "";
    	for(int i=0;i<s.toCharArray().length;i++) {
    		if(Character.isDigit(s.charAt(i))) {
    			s1 = s1.concat(String.valueOf(s.charAt(i)));
    		} else {
    			s1 = s1.concat(" ");
    		}
    		
    	}
    	
    	String[] temp = s1.split(" ");
    	
    	for(String num: temp) {
    		if(!num.equals("")) {
    			sum = sum+Integer.parseInt(num.trim());	
    		}
    		
    		
    	}
    	System.out.println(s1);
    	System.out.println(sum);
    }
    
    static void bestTimeToBuyStock() {
    	int prices[] = {7,1,5,3,6,4};
    	int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
        	//System.out.println("price: "+price);
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                System.out.println("Profit "+profit+" price: "+price+" minprice: "+minPrice);
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        System.out.println(maxProfit);
    }
    
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String e:strs){
            char ch[]=e.toCharArray();
            Arrays.sort(ch);
           // System.out.println(Arrays.toString(ch));
            String sorted=new String(ch);
            System.out.println(sorted);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(e);
        }
        
        
        Map<String, List<String>> hm = new HashMap<>();
        
        for(String v:strs) {
        	char[] c = v.toCharArray();
        	Arrays.sort(c);
        	
        	String ns = new String(c);
        	
        	if(!hm.containsKey(ns)) {
        		hm.put(ns, new ArrayList<String>());
        		
        	}
        	
        	hm.get(ns).add(v);
        }
        
        return new LinkedList<>(map.values());
        
    }

    static int minimumSpeed(int dist[], double hour) {

        int sum =0 ;

        for(int i=0;i<dist.length;i++) {
            sum = sum + dist[i];
        }
        
        long speed = Math.round(sum/hour);
        float sp = 0.0f;
        for(int i=0;i<dist.length;i++) {
          sp = sp + dist[i]/speed; 
        }
        
        if(sp <= hour) {
        	return (int)sp;
        } else {
        	return -1;
        }
        
       
        
    }
    static void twoSum(int[] nums, int target) {
        
    	int arr[] = new int[2];
    	for (int i = 0; i < nums.length-1; i++) {
			for (int j = 1; j < nums.length; j++) {
				System.out.println(i+" "+j);
				System.out.println(nums[i]+nums[j]+" tAR");
				if(nums[i]+nums[j]==target) {
					arr[0] = i;
					arr[1] = j;
					
				}
				
			}
		}
    	
    	System.out.println(Arrays.toString(arr));
    }
    
    
    public static void main(String[] args) {
    	int a[] = {5,5};
    
    	twoSum(a,10);
	}
    
    

	}
	
	


	
	

