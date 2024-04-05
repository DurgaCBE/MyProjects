package com.google.bank.jd;


public class BankImplementation implements Bank {
	int bal;
	BankImplementation(double bal2)
	{
		this.bal=(int) bal2;
	}
	@Override
	public void deposit(int amt) 
	{
		System.out.println("depositing rs:"+amt);
		bal=bal+amt;
		System.out.println("**********Amount Deposited Succesfully**********");
		System.out.println("**************************************************");

	}
	@Override
	public void withdraw(int amt)
	{
		if(bal>=amt) {
		System.out.println("withdrawing rs :"+amt);
		bal=bal-amt;
		System.out.println("**********Withdrawn Succesfully**********");
		}
		else {
			try {
				throw new InsufficientBalanceException("**********Insufficient Amount**********");
			}
			catch(InsufficientBalanceException i) {
				System.out.println(i.getMessage());
			}
		}
		System.out.println("**************************************************");
	}
	@Override
	public int checkBal()
	{
		return bal;
	}

}

