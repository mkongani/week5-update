package com.keycain;

// Java program to demonstrate working of
// State Design Pattern

class KeychainMain
{
	public static void main(String[] args)
	{
		Context stateContext = new Context();
        stateContext.work();
        stateContext.timePasses();
        stateContext.work();
        stateContext.timePasses();
        stateContext.work();
	}
}
