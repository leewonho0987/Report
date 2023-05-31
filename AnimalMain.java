package ISP5;

import ISP5.Action.Eater;
import ISP5.Action.Flyer;
import ISP5.Action.Swimmer;

public class AnimalMain {

	public static void main(String[] args) {
		Eater eater = new Dog();
		eater.eat();
		
		Swimmer swimmer = new Fish();
		((Eater)swimmer).eat();
		swimmer.swim();
		
		Flyer flyer = new Bird();
		((Eater)flyer).eat();
		flyer.fly();

	}

}
