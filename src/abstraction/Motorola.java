package abstraction;

public class Motorola extends Nokia{
	
	public void specialfeatures(){
		System.out.println("Motorola is very big company in the world");
	}
	
	public void price(){
		System.out.println("Motorola is selling mobile product for 80$");
	}

	@Override
	public void watsapp() {
		System.out.println("Motorola is implementing watsapp feature");
	}

	@Override
	public void music() {
		System.out.println("Motorola is implementing music feature");
	}

}
