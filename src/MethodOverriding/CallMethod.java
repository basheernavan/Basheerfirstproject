package MethodOverriding;

public class CallMethod {
	
	public static void main(String[] args) {
		//creating object on animals class:
		Animals an = new Animals();
		an.eat();
		an.similar();
		an.sound();
		
		//creating object for Dog class based on Animals class
		Animals d = new Dog();
		d.sound();
		d.eat();
		
		//creating object for CAT class based on Animals class.
		Animals c = new Cat();
		c.sound();
		c.eat();
		
		
	}

}
