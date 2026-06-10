package bank;


public class Main {
	public static void main(String[] args)
	{
		BankAccount accla = new SavingsAccount("Test0");
		accla.Deposit(1000.125);
		accla.DisplayBalance();
		accla.Deposit(0.0);
		accla.Deposit(-500.0);
		accla.Withraw(500.0);
		accla.DisplayBalance();
		accla.Withraw(1500.0);
		accla.DisplayBalance();
		accla.Withraw(-100.0);
		accla.DisplayBalance();
		accla.FreezeAccount();
		accla.Withraw(500.0);
		accla.UnfreezeAccount();
		accla.Withraw(100.0);
		accla.DisplayBalance();
	}
}
