package com.moneymoney.framework.account.pojo;


/**
 * 
 * @author Satyen Singh
 *
 *Maintining current account details of all the holders
 */
public abstract class CurrentAccount extends BankAccount {
	private double odLimit;
	
	@Override
	public abstract void withdraw(float amount);


	public CurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {
		super(accountHolder, accountBalance);
		this.odLimit = odLimit;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + ", toString()=" + super.toString() + "]";
	}	
}
