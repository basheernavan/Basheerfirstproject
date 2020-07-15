package abstraction;

public class CallMobileFeatures extends Motorola{
	public static void main(String[] args) {
		//Create object on motorola based on mobile
		
		Mobile  m  = new Motorola();
		m.calling();
		m.camera();
		m.messaging();
		m.watsapp();
		m.videocalling();
		m.music();
		m.price();
		
		//create object on motorola based on nokia.
		Nokia n = new Motorola();
		n.price();
		n.specialfeatures();
		
		Motorola mm = new Motorola();
		mm.specialfeatures();
		mm.price();
		
		
	}

}
