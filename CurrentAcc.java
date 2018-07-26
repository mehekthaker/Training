//inherits class BankAcc and has a parameterized constructor with a credit limit
public abstract class CurrentAcc extends BankAcc{

	private final float creditLimit = 10000f;


	CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal);
		
	}
	
	@Override
	public String toString()
	{
		return "creditLimit [ " + getCreditLimit() + ", toString()=" + super.toString() + "]";
	}
	
	public float getCreditLimit()
	{
		return creditLimit;
	}
	
}
