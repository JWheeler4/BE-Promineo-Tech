import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week_4_Lab {

	public static void main(String[] args) {
		
//		why would we use a StringBuilder instead of a String?
//		Answer: Because making changes to a String continues to store the original in memory while doing so to a StringBuilder does not
		
//		instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes
//		make sure no dash appears at the end of the StringBuilder
		StringBuilder zeroThroughNine = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			if (zeroThroughNine.isEmpty()) {
				zeroThroughNine.append(i);
			} else {
				zeroThroughNine.append("-" + i);
			}
		}
		System.out.println(zeroThroughNine);
		
//		create a list of Strings and add 5 Strings to it, each with a different length
		List<String> listOfStrings = Arrays.asList("a", "ab", "abc", "abcd", "abcde");
		System.out.println(listOfStrings);
		
//		write and test a method that takes a list of strings and returns the shortest string
		System.out.println(shortestString(listOfStrings));
		
//		write and test a method that takes a list of strings and returns the list with the first and last element switched
		System.out.println(switchFirstAndLast(listOfStrings));
		
//		write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other,
//		separated by a comma
		System.out.println(listToString(listOfStrings));
		
//		write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list
//		containing the second string parameter (i.e. like a search method)
		System.out.println(elementsThatContain(listOfStrings, "cd"));
		
//		write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list in the returned value
//		contains any number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
//		by 3, the third divisible by 5, and the fourth all numbers from the input list not divisible by 2, 3, or 5
		List<Integer> listOfNums = new ArrayList<>();
		for (int i = 2; i <= 30; i++) {
			listOfNums.add(i);
		}
		System.out.println(multiples(listOfNums));
		
//		write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		System.out.println(stringSizes(listOfStrings));
		
//		create a set of strings and add 5 values
		Set<String> values = new HashSet<>();
		values.add("One");
		values.add("Two");
		values.add("Three");
		values.add("Four");
		values.add("Five");
		System.out.println(values);
		
//		write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the
//		input set that start with the character parameter
		System.out.println(startsWith(values, 'T'));
		
//		write and test a method that takes a set of strings and returns a list of the same strings
		System.out.println(setToList(values));
		
//		write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
		Set<Integer> setOfNumbers = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			setOfNumbers.add(i);
		}
		System.out.println(evens(setOfNumbers));
		
//		create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("Aardvark", "A large, nocturnal, burrowing mammal, of central and southern Africa feeding on ants and termites and"
				+ " having a long, exensile tongue, strong claws, and long ears.");
		dictionary.put("Aback", "Toward the back.");
		dictionary.put("Abacus", "A device for making arithmetic calculations, consisting of a fram set with rods on which balls or beads"
				+ " are moved.");
		System.out.println(dictionary);
		
//		write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map that matches
//		the string parameter (i.e. like a language dictionary lookup)
		System.out.println(definition(dictionary, "Aback"));
		
//		write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start
//		with a given character
		System.out.println(numberOfStringsThatStartWith(listOfStrings));
		System.out.println(numberOfStringsThatStartWith(setToList(values)));
		
	}
	
	public static String shortestString(List<String> stringList) {
		int shortestIndex = 0;
		for (int i = 1; i < stringList.size(); i++) {
			if (stringList.get(shortestIndex).length() > stringList.get(i).length()) {
				shortestIndex = i;
			}
		}
		return stringList.get(shortestIndex);
	}
	
	public static List<String> switchFirstAndLast(List<String> stringList) {
		String firstString = stringList.get(0);
		stringList.set(0, stringList.get(stringList.size() - 1));
		stringList.set(stringList.size() - 1, firstString);
		return stringList;
	}
	
	public static String listToString(List<String> stringList) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < stringList.size(); i++) {
			if (i < stringList.size() - 1) {
				sb.append(stringList.get(i) + ", ");
			} else {
				sb.append(stringList.get(i));
			}
		}
		return sb.toString();
	}
	
	public static List<String> elementsThatContain(List<String> stringList, String inputString) {
		List<String> result = new ArrayList<>();
		for (String string : stringList) {
			if (string.contains(inputString)) {
				result.add(string);
			}
		}
		return result;
	}
	
	public static List<List<Integer>> multiples(List<Integer> ints) {
		List<List<Integer>> results = new ArrayList<>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		for (Integer num : ints) {
			if (num % 2 == 0) {
				results.get(0).add(num);
			}
			if (num % 3 == 0) {
				results.get(1).add(num);
			}
			if (num % 5 == 0) {
				results.get(2).add(num);
			}
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				results.get(3).add(num);
			}
		}
		return results;
	}
	
	public static List<Integer> stringSizes(List<String> input) {
		List<Integer> stringSizes = new ArrayList<>();
		for (String string : input) {
			stringSizes.add(string.length());
		}
		return stringSizes;
	}
	
	public static Set<String> startsWith(Set<String> inputSet, char character) {
		Set<String> output = new HashSet<>();
		for (String string : inputSet) {
			if (string.codePointAt(0) == character) {
				output.add(string);
			}
		}
		return output;
	}
	
	public static List<String> setToList(Set<String> inputSet) {
		List<String> output = new ArrayList<>();
		for (String string : inputSet) {
			output.add(string);
		}
		return output;
	}
	
	public static Set<Integer> evens(Set<Integer> input) {
		Set<Integer> output = new HashSet<>();
		for (Integer num : input) {
			if (num % 2 == 0) {
				output.add(num);
			}
		}
		return output;
	}
	
	public static String definition(Map<String, String> dictionary, String word) {
		return dictionary.get(word);
	}
	
	public static Map<Character, Integer> numberOfStringsThatStartWith(List<String> inputList) {
		Map<Character, Integer> output = new HashMap<>();
		for (String string : inputList) {
			if (output.containsKey(string.charAt(0))) {
				output.replace(string.charAt(0), output.get(string.charAt(0)), output.get(string.charAt(0)) + 1);
			} else {
				output.put(string.charAt(0), 1);
			}
		}
		return output;
	}

}
