//Tests the working of the framework by creating object instances and calling the methods
public class EntryPointMain {
	
	public static void main(String args[]) 
	{
		BankFactory mmbankfactory = new MMBankFactory();
		
		SavingsAcc mmsavingacc = new MMSavingAcc(102, "Mehek", 8000, true);
		CurrentAcc  mmcurrentacc = new MMCurrentAcc(102, "Mehek", 8000, 2000);
		
		
		mmcurrentacc.withdraw(5000);
		System.out.println(mmcurrentacc);
		mmcurrentacc.deposit(500);
		System.out.println(mmcurrentacc);
		mmcurrentacc.withdraw(5000);
		System.out.println(mmcurrentacc);
		
		
		System.out.println(mmsavingacc);
		mmsavingacc.withdraw(5000);
		
		System.out.println(mmsavingacc);
		mmsavingacc.withdraw(50000);
		System.out.println(mmsavingacc);
		
		SavingsAcc  mmsavingacc2 = new MMSavingAcc(101, "Mehek", 8000, false);
		
		System.out.println(mmsavingacc2);
		mmsavingacc2.withdraw(4000);
		
	}

}
