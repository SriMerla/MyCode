package javaPractice2;

import javaPractice.Parentclass;

public class Childclass2 extends Parentclass {
	
	void methodname() {
		
		System.out.println("This is a default method from the present class i.e Childclass2");
	}

	public static void main(String[] args) {
		
		Childclass2 cc2 = new Childclass2();
		cc2.add(50, 10);
		cc2.substract(50, 10);
		cc2.divide(50, 10); // protected can be accesses by the classes with in the package and the child object.
		cc2.methodname();
		

	}

}
