package com.google.bank.jd;

import java.util.Scanner;

public class MainSolutionClass 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("**********Welcome to JD Bank**********");
		System.out.println("Enter your acccount number: ");
		long accNo=s.nextLong();
		UserDetails u=new UserDetails();
		if(u.hi(accNo))
		{			
			Bank b=new BankImplementation(u.bal);
			while(true) 
			{
				System.out.println("Enter your choice");
				System.out.println("-----------------");
				System.out.println("1.deposit\n2.withdraw\n3.checkbalance\n4.Exit");
				int choice=s.nextInt();
				int amt=0;

				if(choice>=1&& choice<=2) {
					System.out.println("Enter the Amount to deposit");
					amt=s.nextInt();
				}
				switch(choice) {
				case 1:
					b.deposit(amt);
					break;
				case 2:
					b.withdraw(amt);
					break;
				case 3:
					System.out.println("current bal is rs : "+b.checkBal());
					System.out.println("**************************************************");
					break;
				case 4:
					System.out.println("**********Visit Again for any enquiry**********");
					System.exit(0);
				default :
					try {
						throw new InvalidChoiceException("**********Invalid choice Enter valid choice**********");
					}
					catch(InvalidChoiceException i) {
						System.out.println(i.getMessage());
					}			
				}		
			}

		}
		else
		{
			try {
				throw new InvalidAccountNumberException("**********Invalid Account Number Visit Again**********");
			}
			catch(InvalidAccountNumberException i) {
				System.out.println(i.getMessage());
			}		
		}
        s.close();
	}

}
