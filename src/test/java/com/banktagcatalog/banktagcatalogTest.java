package com.banktagcatalog;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class banktagcatalogTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(banktagcatalogPlugin.class);
		RuneLite.main(args);
	}
}