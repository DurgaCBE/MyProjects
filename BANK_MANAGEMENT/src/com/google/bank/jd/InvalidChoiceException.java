package com.google.bank.jd;

@SuppressWarnings("serial")
public class InvalidChoiceException extends Exception
{
	String message;
	
	InvalidChoiceException(String message)
	{
		this.message = message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}	
}

