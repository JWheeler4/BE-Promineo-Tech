
public class Week_3_Lab {

	public static void main(String[] args) {
		
//		create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] values = {1, 5, 2, 8, 13, 6};
		
//		print out the first element in the array
		
		System.out.println(values[0]);
		
//		print out the last element in the array without using the number 5
		
		System.out.println(values[values.length - 1]);
		
//		print out the element in the array at position 6. what happens?
		
//		throws exception
//		System.out.println(values[6]);
		
//		print out the element in the array at position -1. what happens?
		
//		throws exception
//		System.out.println(values[-1]);
		
//		write a traditional for loop that prints out each element in the array
		
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		
//		write an enhanced for loop that prints out each element in the array
		
		System.out.println();
		for (int value : values) {
			System.out.print(value + " ");
		}
		
//		create a new variable called sum, write a loop that adds each element in the array to the sum
		
		System.out.println();
		double sum = 0;
		for (int value : values) {
			sum += value;
		}
		System.out.println(sum);
		
//		create a new variable called average and assign the average value of the array to it
		
		double average = sum / values.length;
		System.out.println(average);
		
//		write an enhanced for loop that prints out each number in the array only if the number is odd
		
		for (int value : values) {
			if (value % 2 != 0) {
				System.out.print(value + " ");
			}
		}
		
//		create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		
		System.out.println();
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
//		calculate the sum of all the letters in the new array
		
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
//		TESTS:

		greet("Jonathan");
		
		System.out.println(returnGreeting("Jonathan"));
		
		System.out.println("Greater than test: " + isStringGreaterThan("Jonathan", 7));
		System.out.println("Greater than test: " + isStringGreaterThan("Jonathan", 8));
		
		String[] testStringArray = {"one", "one", "three"};
		System.out.println("Contains test: " + stringArrayContains(testStringArray, "one"));
		System.out.println("Contains test: " + stringArrayContains(testStringArray, "four"));
		
		int[] randomValues = new int[5];
		for (int i = 0; i < randomValues.length; i++) {
			randomValues[i] = (int) Math.ceil(Math.random() * 10);
		}
		for (int num : randomValues) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println(smallestNumber(randomValues));
		
		double[] randomDoubles = new double[5];
		for (int i = 0; i < randomDoubles.length; i++) {
			randomDoubles[i] = Math.random() * 10;
		}
		for (double num : randomDoubles) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println(mean(randomDoubles));
		
		for (int length : stringLengths(names)) {
			System.out.print(length + " ");
		}
		System.out.println();
		
		System.out.println("More evens: " + areThereMoreEvenLengthStrings(names));
		String[] names2 = {"John", "Sam", "Marc"};
		System.out.println("More evens: " + areThereMoreEvenLengthStrings(names2));
		
		
		System.out.println("Is palindrom: " + isPalindrome("racear"));
		System.out.println("Is palindrom: " + isPalindrome("racecar"));
	}
	
//	write and test a method that takes a String name and prints out a greeting, this method returns nothing
	
	public static void greet(String name) {
		System.out.println("Greetings " + name + "!");
	}
	
//	write and test a method that takes a String name and returns a greeting, do not print this method
	
	public static String returnGreeting(String name) {
		return "Howdy " + name + "!";
	}
	
//	analyze the difference between these two methods - what do you find? How are they different?
	
//	write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
	
	public static boolean isStringGreaterThan(String checkedString, int checkLength) {
		return checkedString.length() > checkLength;
	}
	
//	write and test a method that takes an array of strings and a string and returns true of the string passed in exists in the array
	
	public static boolean stringArrayContains(String[] stringArray, String testString) {
		for (String index : stringArray) {
			if (index == testString) {
				return true;
			}
		}
		return false;
	}
	
//	write and test a method that takes an array of ints and returns the smallest number in the array
	
	public static int smallestNumber(int[] intArray) {
		int lowestIndex = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < intArray[lowestIndex]) {
				lowestIndex = i;
			}
		}
		return intArray[lowestIndex];
	}
	
//	write and test a method that takes an array of double and returns the average
	
	public static double mean(double[] doubles) {
		double sum = 0;
		for (double num : doubles) {
			sum += num;
		}
		return sum / doubles.length;
	}
	
//	write and test a method that takes an array of Strings and returns an array of ints where each element
//	matches the length of the string at that position
	
	public static int[] stringLengths(String[] stringArray) {
		int[] lengths = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			lengths[i] = stringArray[i].length();
		}
		return lengths;
	}
	
//	write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
//	even amount of letters is greater than the sum of those with an odd amount of letters.
	
	public static boolean areThereMoreEvenLengthStrings(String[] stringArray) {
		int evenSum = 0;
		int oddSum = 0;
		for (String string : stringArray) {
			if (string.length() % 2 == 0) {
				evenSum++;
			} else {
				oddSum++;
			}
		}
		return evenSum > oddSum;
	}
	
//	write and test a method that takes a string and returns true if the string is a palindrome
	
	public static boolean isPalindrome(String checkedString) {
		for (int i = 0; i < checkedString.length() / 2; i++) {
			if (checkedString.charAt(i) != checkedString.charAt(checkedString.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
