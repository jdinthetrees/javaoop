package com.johndang;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();
		System.out.println("Account number is: " + bankAccount.getAccountNumber());
		System.out.println("Number of accounts: " + bankAccount.getNumberOfAccounts());
		System.out.println("This is your checking balance: " + bankAccount.getCheckingBalance());
		System.out.println("This is your savings balance: " + bankAccount.getSavingsBalance());
		bankAccount.depositMoney(50, "checking");
		bankAccount.depositMoney(50, "savings");
		bankAccount.displayAccountBalance();
		System.out.println("This is everything you got: " + bankAccount.getTotalAmountinAccounts());
		bankAccount.withdrawMoney(10, "checking");
		bankAccount.withdrawMoney(10, "savings");
		bankAccount.displayAccountBalance();
		System.out.println("This is everything you got: " + bankAccount.getTotalAmountinAccounts());
		
		
		
		
	
	
	}

}
