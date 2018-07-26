
public class MMBankFactory extends BankFactory{

	@Override
	public SavingsAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		SavingsAcc savingacc = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingacc;
	}
	
	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit)
	{
		CurrentAcc currentAcc = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentAcc;
	}
}
