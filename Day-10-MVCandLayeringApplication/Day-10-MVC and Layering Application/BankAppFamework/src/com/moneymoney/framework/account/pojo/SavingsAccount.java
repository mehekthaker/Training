package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Satyen Singh
 *
 *Maintaining savings account details of money money bank
 */
public abstract class SavingsAccount extends BankAccount {
	private boolean salary;
	
	private static final float MINBAL = 10000;
	
	public static float getMinbal() { 
		 return MINBAL; 
		 }
	
	@Override
	public abstract void withdraw(float amount); 


	public SavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance);
		this.salary = salary;
	}
	public SavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder);
		this.salary = salary;
	}

	public boolean isSalary() {
		return salary;
	}
	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SavingsAccount [salary=" + salary + ", toString()=" + super.toString() + "]";
	}
}
