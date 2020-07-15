package abstraction;

public abstract class Nokia extends Samsug{
	
	public void specialfeatures(){
		System.out.println("Nokia is very big company in the world");
	}
	
	public void price(){
		System.out.println("Nokia is selling the mobile product for 70$ ");
	}

	@Override
	public void camera() {
		System.out.println("Nokia is implementing Camera feature");
	}

	@Override
	public void videocalling() {
		System.out.println("Nokia is implementing videocalling feature");
	}
	
}
