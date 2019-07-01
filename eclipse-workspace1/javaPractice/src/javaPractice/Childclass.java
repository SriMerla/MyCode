package javaPractice;

public class Childclass extends Parentclass {
	
	public void check() {
		
		System.out.println("This is a child class method");
		
	}

	public static void main(String[] args) {
		
		Childclass cc = new Childclass();
		cc.add(10, 20);
		cc.substract(10, 20);
		cc.modulodiv(10, 20); // multiply method is private and  not accessed by other classes
		cc.divide(10, 20);
		cc.check();
		

	}

}
