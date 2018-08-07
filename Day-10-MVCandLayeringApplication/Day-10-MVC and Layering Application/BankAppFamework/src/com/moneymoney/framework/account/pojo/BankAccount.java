package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Satyen Singh
 *
 */
public abstract class BankAccount {
	private final int accountNumber;
	private Customer accountHolder;
	private double accountBalance;
	
	public abstract void withdraw(float amount);
	
	public void deposit(float amount) {
		accountBalance = accountBalance + amount;
	}
	
	//Payment Gateway is created
	public static boolean transfer(BankAccount sender, BankAccount receiver, float amount) {
		boolean transfer;
		
		if(sender.getAccountBalance() == amount) {
			sender.withdraw(amount);
			receiver.deposit(amount);
			transfer = true;
		}
		else
			transfer = false;
		return transfer;
	}
	
	//maintains the next accountNumber
	private static int accountId;
	
	//gets invoked whenever a class is loaded
	static {
		accountId = 100;
	}

	//gets invoked whenever a new object is created
	{
		this.accountNumber = ++accountId;
	}
	
	public BankAccount(Customer accountHolder, double accountBalance) {
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	//For Zero Balance account holders
	public BankAccount(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	
	//getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public Customer getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	//It will give the next account number that will assigned to next account object
	public static int getNextAccountNumber() {
		return accountId+1;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
}
