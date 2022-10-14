import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
	    //Add your code below this line
	    List<Integer> squaredNums = Arrays.asList((int)Math.pow(num1, 2), (int)Math.pow(num2, 2), (int)Math.pow(num3, 2), 
	    		(int)Math.pow(num4, 2), (int)Math.pow(num5, 2));
	    // Add your code above this line
	    	return squaredNums;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		
		System.out.println(squaredList(num1,num2,num3,num4,num5));
	}
}