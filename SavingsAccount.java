package lab9;

public class SavingsAccount extends BankAccount{
	
	private final double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		
		super (name, amount);
		
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
		
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		
		super(oldAccount, amount);
		
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public void postInterest() {
		
		super.deposit(super.getBalance() * (rate / 12));
	}
	
	public String getAccountNumber() {
		
		return accountNumber;
		
	}

}
