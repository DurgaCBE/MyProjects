package com.google.bank.jd;

@SuppressWarnings("serial")
public class InvalidAccountNumberException extends Exception
{
	String message;
	
	InvalidAccountNumberException(String message)
	{
		this.message = message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}	
}
