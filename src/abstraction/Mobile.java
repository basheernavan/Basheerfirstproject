package abstraction;

//abstract methods can create only in the abstract classes.

public abstract class Mobile {
	
	//non-abstract methods
	public void mobilefeatures(){
		System.out.println("This mobile company is implementing a very good mobile product");
	}
	
	public void price(){
		System.out.println("this mobile company is implementing mobile very low price : 50$");
	}
	
	//abstract methods
	public abstract void calling();
	
	public abstract void messaging();
	
	public abstract void camera();
	
	public abstract void videocalling();
	
	public abstract void watsapp();
	
	public abstract void music();


}
