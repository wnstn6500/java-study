package sec05.homework10;

public class Account {

	private String accountNumber;
	private int balance;
	
	Account(){
		
	}
	
	Account(String accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	String getAccountNumber(){
		return accountNumber;
	}
	int getBalance(){
		return balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
}
