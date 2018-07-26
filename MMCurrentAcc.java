//inherits class CurrentAcc and overrides the method which does not allow minimum 
//balance below sum of balance and the credit limit for the account
public class MMCurrentAcc extends CurrentAcc{

	MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal, creditLimit);
	}
	
	
	@Override
	public void withdraw(float amount)
	{
		if((((getAccBal() + getCreditLimit())) - amount) >= 0)
		{
			setAccBal(getAccBal() - amount);
		}
		else
		{
			System.out.println("Failed");
		}
	}

	@Override
	public String toString()
	{
		return "MMCurrentAcc [toString()=" +super.toString() + "]";
	}
	
}
