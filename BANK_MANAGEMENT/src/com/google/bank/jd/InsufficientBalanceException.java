package com.google.bank.jd;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException
{
	String message;
	InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
}
