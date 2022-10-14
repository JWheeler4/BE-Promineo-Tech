import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("what is your name");
		String name = kb.next();
		System.out.println("How much to deposit?");
		double deposit = kb.nextDouble();
		
		BankAccount acct1 = new BankAccount();
		
		BankAccount acct2 = new BankAccount(name, deposit);
		
		System.out.println(acct2.getName());
		System.out.println(acct2.getBalance());
		
		acct2.setName("Marty");
		acct2.setBalance(1000);
		
		System.out.println(acct2.getName());
		System.out.println(acct2.getBalance());
		
	}

}
