package main.udemy;

public class BankAccount 
{
	private long accoutNumber;
	private double accountBalance;
	private String customerName;
	private String email;
	private long phoneNumber;

	
	
	public BankAccount(long accoutNumber, double accountBalance, String customerName, String email, long phoneNumber) {
		super();
		this.accoutNumber = accoutNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public long getAccoutNumber() {
		return accoutNumber;
	}
	public void setAccoutNumber(long accoutNumber) {
		this.accoutNumber = accoutNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double deposite(int deposite)
	{
		accountBalance = deposite + accountBalance;

		return accountBalance;
	}

	public double withdrawal(int withdrawal)
	{
		if(withdrawal > accountBalance)
		{
			System.out.println("Not enough funds in your account");
		
		}
		else {
		accountBalance = accountBalance - withdrawal;
		}
		return accountBalance;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount [accoutNumber=");
		builder.append(accoutNumber);
		builder.append(", accountBalance=");
		builder.append(accountBalance);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append("]");
		return builder.toString();
	}
	
}
