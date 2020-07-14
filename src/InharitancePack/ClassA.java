package InharitancePack;
//ClassC --> ClassB --> ClassA
public class ClassA extends ClassB{
	public static void main(String[] args) {
		ClassB cb = new ClassB();
		System.out.println(cb.a);
		System.out.println(cb.b);
		cb.test1();
		cb.test2();
		
		System.out.println(cb.d1);
		System.out.println(cb.d2);
		cb.test3();
		cb.test4();
		
	}

}
