
public class BankAccount {
	
//	global variables
	private String name;
	private double balance;
	
//	default constructor
	public BankAccount() {
		name = "";
		balance = 0.0;
	}
//	overloading
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Balance: " + getBalance();
	}
	
//	getters or accessor methods
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
//	setter or mutator methods
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
//	withdraw or deposit
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > balance) {
			System.out.println("Insufficient funds!");
		} else {
			balance -= withdrawAmount;
		}
	}
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
//	the subclass inherits from the superclass
	class BusinessAccount extends BankAccount {
		double interest;
		public BusinessAccount (String name, double balance, double interest) {
			super(name, balance);
			this.interest = interest;
		}
		public double getInterest() {
			return interest;
		}
		public void setInterest(double interest) {
			this.interest = interest;
		}
//		method overwriting
		public void deposit(double deposit) {
			setBalance(getBalance() + deposit * 1.025);
		}
	}
	
}
