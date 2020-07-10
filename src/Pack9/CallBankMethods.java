package Pack9;

import Pack7.RBIBank;
import Pack8.AxisBank;

public class CallBankMethods extends AxisBank{
	public static void main(String[] args) {
		RBIBank rb = new AxisBank(); //Creating object on Axisbank(class) based on RBI(Interface).
		
		rb.Credit();
		rb.Debit();
		rb.Transfer();
		//unable to call axisbankrule1 and axisbankrule2,
		//Why because we have created object on Axisbank(class) based on RBI(Interface).
	}
	

}
