package bank;

public class SavingsAccount extends BankAccount {
	private String m_owner = "Null";
	// Constructor
	public SavingsAccount(String name)
	{
		m_owner = name;
	}
	// Get the owner's name
	public String GetOwnerName()
	{
		return m_owner;
	}
	// Display the owner's name
	public void DisplayOwnerName()
	{
		System.out.println("Name: " + m_owner);
	}
}
