package org.springStarter.Language.impl;

import org.springStarter.Language.Language;

//Child class of Language. Implementing all the methods of parent class.
public class English implements Language
{
	@Override
	public String getGreeting()
	{
		return "Hello";
	}
	
	@Override
	public String getBye()
	{
		return "Bye bye";
	}
}
