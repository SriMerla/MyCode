package javaPractice;

public class Childclass1 extends Parentclass{
	
	public void childmethod() {
		
		System.out.println("This is the childclass1 method");
	}

	public static void main(String[] args) {
		Parentclass pc = new Parentclass();
		pc.add(20,30);
		pc.substract(20,30);
		pc.modulodiv(20, 30);
		pc.divide(20, 30);
		// This is the instance of parentclass..so childmethod can't be called.
		

	}

}
