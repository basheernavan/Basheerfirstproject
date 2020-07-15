package abstraction;

public abstract class Samsug extends Mobile{
	
	public void specialfeatures(){
		System.out.println("Samsung is very big mobile company in the world");
	}
	
	public void price(){
		System.out.println("Samsung is selling this mobile for 60$");
	}

	@Override
	public void calling() {
		System.out.println("Samsung is implementing calling feature");
	}

	@Override
	public void messaging() {
		System.out.println("Samsung is implementing messaging feature");
	}

}
