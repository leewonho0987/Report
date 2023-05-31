package ISP5;

import ISP5.Action.Eater;
import ISP5.Action.Flyer;

public class Bird implements Action, Eater, Flyer{

	public void eat()
	{
		System.out.println("The bird is eating.");
	}
	
	public void fly()
	{
		System.out.println("The bird is flying.");
	}
}
