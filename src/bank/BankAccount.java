package bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private double m_balance = 0.0;
	private boolean m_isFrozen = false;
	private List<Transaction> m_transactions = new ArrayList<>();
	// Constructor
	public BankAccount()
	{
		m_balance = 0.0;
		m_isFrozen = false;
		m_transactions = new ArrayList<>();
	}
	// Deposit
	public void Deposit(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Invalid Deposited Amount! Please deposit an amount greater than 0!");
			return;
		}
		if(m_isFrozen == false)
		{
			m_balance += amount;
			m_transactions.add(new Transaction("Deposit", amount));
			return;
		}
		System.out.println("Bank account is currently FROZEN!");
	}
	// Withdraw
	public void Withraw(double amount)
	{
		if(m_isFrozen == false)
		{
			if (amount <= 0)
			{
				System.out.println("Invalid Withdrawal! Please withdraw an amount greater than 0!");
				return;
			}
			if(m_balance >= amount)
			{
				m_balance -= amount;
				System.out.println(amount + " has been withdrawed");
				m_transactions.add(new Transaction("Withdrawal", amount));
				return;
			}
			System.out.println("Insufficient Balance!");
			return;
		}
		System.out.println("Bank account is currently FROZEN!");
	}
	// Check current balance
	public double GetBalance()
	{
		return m_balance;
	}
	// Display the current balance
	public void DisplayBalance()
	{
		System.out.print("Current balance: ");
		System.out.printf("%.2f", m_balance);
		System.out.println();
	}
	// Freeze the account
	public void FreezeAccount()
	{
		m_isFrozen = true;
	}
	// Unfreeze the account
	public void UnfreezeAccount()
	{
		m_isFrozen = false;
	}
	// Get bank account status
	public boolean IsFrozen()
	{
		return m_isFrozen;
	}
	// Display current bank status
	public void DisplayBankStatus()
	{
		String message = m_isFrozen == true ? "Bank account is currently FROZEN!" : "Bank is currently not FROZEN";
		System.out.println(message);
	}
	// Get Transaction History
	public List<Transaction> GetTransactions()
	{
		return m_transactions;
	}
	// Display Transaction History
	public void DisplayTransactions() 
	{
		for (Transaction transaction: m_transactions)
		{
			System.out.println("Transaction: " + transaction.m_transaction + " Amount: " + transaction.m_amount + " Date: " + transaction.m_timestamp);
		}
	}
}
