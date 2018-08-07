package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.account.pojo.SavingsAccount;

public class MMSavingsAccount extends SavingsAccount {

	public MMSavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder, salary);
		
	}

	public MMSavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance, salary);
		
	}

	@Override
	public void withdraw(float amount)
	{
		if(isSalary())
		{
			if((getAccountBalance() - amount) >= 0)
			{
				setAccountBalance(getAccountBalance() - amount);
			}
			else 
				System.out.println("Withdrawal Failed");
		}
		else 
		{
			if((getAccountBalance() - amount) >= getMinbal())
			{
				setAccountBalance(getAccountBalance() - amount);
			}
			else 
				System.out.println("Withdrawal Failed");
		}
	}
	
	@Override
	public String toString()
	{
		return "MMSavingAcc [toString()= " + super.toString() + "]"; 
	}
}
