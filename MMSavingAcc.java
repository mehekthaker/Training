//inherits class SavingsAcc and calculates the withdraw for the savings account. It does not allow withdrawal 
//below minimum balance 

public class MMSavingAcc extends SavingsAcc{

	private float MINBAL;
	
	MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal, isSalaried);
	}
	
	@Override
	public void withdraw(float amount)
	{
		if(isSalaried())
		{
			if((getAccBal() - amount) >= 0)
			{
				setAccBal(getAccBal() - amount);
			}
			else 
				System.out.println("Withdrawal Failed");
		}
		else 
		{
			if((getAccBal() - amount) >= getMinbal())
			{
				setAccBal(getAccBal() - amount);
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
