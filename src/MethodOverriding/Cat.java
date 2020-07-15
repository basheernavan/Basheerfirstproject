package MethodOverriding;

public class Cat extends Animals{
	
	@Override
	public void sound(){
		System.out.println("Cat can do the sound like meow meow");
	}
	
	public void eat(){
		System.out.println("cat can drink the milk and eat other food");
	}

}
