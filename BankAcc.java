//Contains abstract method withdraw(), parameterized constructor and a deposit method 
public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	public int getAccNo() {
		return accNo;
	}
	
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	
	public void setAccBal(float accBal)
	{
		this.accBal=accBal;
	}
	public float getAccBal() {
		return accBal;
	}
	
	
	BankAcc(int accNo, String accNm, float accBal)
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	abstract public void withdraw(float amount);

	
	public void deposit(float amount)
	{
		this.accBal += amount;
	}
	
//displays the output	
	@Override
	public String toString()
	{
		return "BankAcc [ accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
