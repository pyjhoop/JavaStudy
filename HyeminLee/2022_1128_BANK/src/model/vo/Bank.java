package model.vo;

public class Bank {
	private String accountNumber;
	private String name;
	private String id;
	private String pwd;
	private int balance;
	public static final int SIZE = 5;
	
	public Bank() {}

	public Bank(String accountNumber, String name, String id,String pwd, int balance) {
		this.accountNumber = accountNumber;
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return name+"님의 " + accountNumber + ", name=" + name + ", id=" + id + ", pwd=" + pwd
				+ ", balance=" + balance + "]";
	}

	
	
	
	
}