package lab9;

public class CheckingAccount extends BankAccount{

	
	double FEE = .15;
	
	public CheckingAccount (String name, double amount ) {
		
		super(name, amount);
		
		super.setAccountNumber(super.getAccountNumber() + "-10");
		
	}
	
	public boolean withdraw (double amount) {
		
		return super.withdraw(amount + FEE);
	}
}
