import java.util.ArrayList;

public class Week_4_Class_Notes {
	
	public static void main(String[] args) {
		
//		String[] names = {"Mark", "Paul", "Mary", "Peter", "Jennifer", "Sam"};
//		
//		for (String name : names) {
//			System.out.println(name);
//		}
		
//		ArrayList<String> names = new ArrayList<>();
//		names.add("Mark");
//		names.add("Peter");
//		names.add("Susan");
//		this is to retrieve
//		System.out.println(names.get(0));
		
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println("Array");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
//		
		
		System.out.println();
		ArrayList<Integer> arrayOfNums = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arrayOfNums.add((int) (Math.random() * 100 + 1));
		}
		System.out.println("ArrayList");
		for (int i = 0; i < arrayOfNums.size(); i++) {
			System.out.print(arrayOfNums.get(i) + " ");
		}
		
	}
	
}
