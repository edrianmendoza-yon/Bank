package bank;

import java.util.HashMap;
import java.util.Map;

public class BankAccountManager implements Bank{
	private Map<Integer, BankAccount> m_accounts = new HashMap<>();
	private static int m_id = 0;
	// Constructor 
	public BankAccountManager() 
	{
		m_accounts = new HashMap<>();
		m_id = 0;
	}
	// Add a bank account in the Map
	public void AddAccount(BankAccount account)
	{
		m_accounts.put(m_id++, account);
	}
	// Get the an account based on the passed id
	public BankAccount GetAccount(int id)
	{
		return m_accounts.get(id);
	}
	// List all accounts in the Map list
	public void DisplayAccounts()
	{
		for (Map.Entry<Integer, BankAccount> account : m_accounts.entrySet())
		{
			System.out.println("Account ID: " + account.getKey());
			SavingsAccount savingsaccount = (SavingsAccount) account.getValue();
			savingsaccount.DisplayOwnerName();
		}
	}
}
