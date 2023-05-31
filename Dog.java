package ISP5;

import ISP5.Action.Eater;

public class Dog implements Action, Eater{

	public void eat()
	{
		System.out.println("The dog is eating");
	}
}
