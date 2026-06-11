package bank;

import java.time.LocalDateTime;

public class Transaction {
	String m_transaction = "Null";
	double m_amount = 0.0;
	LocalDateTime m_timestamp = LocalDateTime.now();
	// Construction
	public Transaction(String transaction, double amount)
	{
		m_transaction = transaction;
		m_amount = amount;
		m_timestamp = LocalDateTime.now();
	}
	// Convert all member variables to string
	public String GetTransaction()
	{
		return m_transaction;
	}
	public String TransactionAmountToString()
	{
		return String.valueOf(m_amount);
	}
	public String TimestampToString()
	{
		return String.valueOf(m_timestamp);
	}
}
