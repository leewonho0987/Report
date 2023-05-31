package ISP5;

import ISP5.Action.Eater;

import ISP5.Action.Swimmer;

public class Fish implements Action, Eater, Swimmer{

	public void eat()
	{
		System.out.println("The fish is eating.");
	}
	
	public void swim()
	{
		System.out.println("Ths fish is swimming.");
	}
}
