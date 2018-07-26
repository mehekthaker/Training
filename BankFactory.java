//An abstract class which has two abstract methods getNewSavingAccount(), getNewCurrentAccount() 
//of type SavingsAcc and CurrentAcc respectively.
public abstract class BankFactory {

	abstract public SavingsAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
	
}
