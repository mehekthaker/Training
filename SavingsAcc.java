//inherits class BankAcc and has an abstract method withdraw()
public abstract class SavingsAcc extends BankAcc{

	private boolean isSalaried;
	private static final float MINBAL = 10000;
	
	SavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.setSalaried(isSalaried);
	}
	
	@Override
	public abstract void withdraw(float amount);
	

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	
	@Override
	public String toString()
	{
		return "SavingsAcc [isSalaried= " + isSalaried() + ", toString()= " + super.toString() + "]";
	}
	
}
