package org.springStarter.Language.impl;

import org.springStarter.Language.Language;

//Child class of Language. Implementing all the methods of parent class.
public class Tamil implements Language
{
	@Override
	public String getGreeting()
	{
		return "Varungal";
	}
	
	@Override
	public String getBye()
	{
		return "Sendru Varungal";
	}
}
