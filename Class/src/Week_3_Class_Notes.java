//import java.util.Arrays;

public class Week_3_Class_Notes {
	public static void main(String[] args) {
//		String evens = "evens: ", odds = "odds: ";
//		int [] x = new int[10];
//		for(int i = 0; i < x.length; i++) {
//			x[i] = (int)(Math.random() * 100 + 1);
//			if (x[i] % 2 == 0) {
//				evens += x[i] + " ";
//			} else {
//				odds += x[i] + " ";
//			}
//		}
//		System.out.println(odds);
//		System.out.println(evens);
		
//		String word = "Hello World";
//		
//		String [] letters = new String[word.length()];
//		
//		for(int j = 0; j < letters.length; j++) {
//			letters[j] = word.substring(j, j + 1);
//			System.out.print(letters[j] + " ");
//		}
//		System.out.println();
//		System.out.println(letters[7]);;
		
//		char [] letters = new char[word.length()];
//		for(int j = 0; j < letters.length; j++) {
//			letters[j] = "" + word.charAt(j);
//			System.out.print(letters[j] + " ");
//		}
		
//		int x [] = new int [100];
//		for(int j = 0; j < x.length; j++) {
//			x[j] = (int)(Math.random() * 100 + 1);
//			System.out.print(x[j] + " ");
//		}
//		
//		Arrays.sort(x);
//		System.out.println();
////		read data... a new Loop!!!
//		for(int a : x)
//			System.out.print(a + " ");
		
	}
	
	static int[] buildArray(int num) {
		// Write your code below
		int[] newArray = new int[num];
		for (int i = 0; i < num; i++) {
		    newArray[i] = i;
		}
		return newArray;
	}
	
	static int sumOfDigits(int digits) {
		// Write your code below
		int sum = 0;
		int digit;
		while (digits > 0) {
			digit = digits % 10;
			sum += digit;
			digits /= 10;
		}
		return sum;
	}
	static void changeTwo(int a, int b, int[] arr) {
        // Add your code below this line
		arr[0] = a;
		arr[arr.length - 1] = b;
        // Add your code above this line 
	}
}
