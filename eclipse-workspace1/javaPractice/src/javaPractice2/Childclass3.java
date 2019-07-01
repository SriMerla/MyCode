package javaPractice2;

import javaPractice.Parentclass;

public class Childclass3 extends Parentclass {
	
	public void hello() {
		
		System.out.println("This is the childclass3 method ");
	}

	public static void main(String[] args) {
		
		Parentclass pc = new Parentclass();
		pc.add(20, 30);
		pc.substract(20, 30);
		Childclass3 cc3 = new Childclass3();
		cc3.hello();
		
		
		

	}

}
