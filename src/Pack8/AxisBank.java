package Pack8;

import Pack7.RBIBank;

public class AxisBank implements RBIBank{

	@Override
	public void Credit() {
		System.out.println("Executing Credit method");
	}

	@Override
	public void Debit() {
		System.out.println("Executing Debit method");
		
	}

	@Override
	public void Transfer() {
		System.out.println("Executing Transfer method");
	}
	
	public void axisrule1(){
		System.out.println("Executing axis bank rule1");
	}
	
	public void axisrule2(){
		System.out.println("Executing axis bank rule2");
	}

}
