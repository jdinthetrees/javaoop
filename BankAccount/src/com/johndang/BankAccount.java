package com.johndang;



public class BankAccount {
	
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	
	private static int numberOfAccounts = 0;
	private static int totalAmountinAccounts = 0;
	
	
	private static String createAccount() {
		String accountNumber = "";
		for(int i=0; i<10; i++) {
			int random = (int) (Math.random()*10);
			accountNumber += Integer.toString(random);
		}
		return accountNumber;
	}
	
	
	public BankAccount() {
		this.accountNumber = BankAccount.createAccount();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		numberOfAccounts++;
	}
	
	public void depositMoney(double amount, String account) {
		if(account.equals("savings"))
			this.savingsBalance += amount;
		else if(account.equals("checking"))
			this.checkingBalance += amount;
		BankAccount.totalAmountinAccounts += amount;
	}
	
	public void withdrawMoney(double amount, String account) {
		boolean successful = false;
		if(account.equals("savings")) {
			// check if enough in account
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking")) {
			// check if enough in account
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if(successful) {
			BankAccount.totalAmountinAccounts -= amount;
		}
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	

	public Double getCheckingBalance() {
		return checkingBalance;
	}


	public Double getSavingsBalance() {
		return savingsBalance;
	}


	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}


	public static int getTotalAmountinAccounts() {
		return totalAmountinAccounts;
	}


	public void displayAccountBalance() {
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
	}


}
