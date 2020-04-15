package main.udemy;

public class VipCustomer 
{
	private String name;
	private long creditLimit;
	private String email;
	
	public VipCustomer() {
		this("Default",2334, "esenh@hiti");
	}

	public VipCustomer(String name, long creditLimit) {
		
		this.name = name;
		this.creditLimit = creditLimit;
	}

	public VipCustomer(String name, long creditLimit, String email) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(long creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VipCustomer [name=");
		builder.append(name);
		builder.append(", creditLimit=");
		builder.append(creditLimit);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	
	
}
