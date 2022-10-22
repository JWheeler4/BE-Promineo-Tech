
import java.util.*;

public class Class_Notes {

	public static void main(String[] args) {
//		Scanner kb = new Scanner(System.in);
//		
////		sorting ints
//		System.out.println("How old are you?");
//		int age = Integer.parseInt(kb.nextLine());
//		System.out.println("Oh " + age + " is not that old");
//		
		System.out.println(createStringCount(5));
//		
////		storing double
//		System.out.println("What is your gpa?");
//		double gpa = Double.parseDouble(kb.nextLine());
//		System.out.println("wow! " + gpa + " is a great GPA!\n");
//		
////		storing SINGLE words
//		System.out.println("what is your name?");
//		String fname = kb.next();
//		System.out.println("hi " + fname);
//		
////		store MULTIPLE words
//		System.out.println("what is your name?");
//		String name = kb.nextLine();
//		System.out.println("hi " + name);
		
//		System.out.println("Guess my number. 1-10. You have 5 tries");
//		int num = (int)(Math.random() * 10 + 1);
//		System.out.println(num);
//		
//		int[] abc = {1, 2, 3};
//		System.out.println(abc[last]);
//		
		
//		
//		if (number % 2 == 0) {
//			System.out.println("EVEN");
//		} else {
//			System.out.println("ODD");
//		}
		
//		for loop
//		for (int i = 0; i < 5; i++) {
//			int guess = kb.nextInt();
//			if (guess > num) {
//				System.out.println("too high");
//			} else if (guess < num) {
//				System.out.println("too low");
//			} else {
//				System.out.println("you got it!");
//				break;
//			}
//		}
		
	}
	
	public static String createStringCount(int number) {
		StringBuilder word = new StringBuilder();
		for (int index = 0; index < number; index++) {
			word.append(index);
		}
		return word.toString();
	}
	
}
