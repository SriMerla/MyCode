package javaPractice;

public class Parentclass {
	
	public void add(int a, int b) {
		 
		int sum = a + b ;
		System.out.println("The sum of two numbers : " + sum);
		
	}
	
	public int substract(int a, int b) {
		
		int sub = a - b;
		System.out.println("This is the substracttion of two numbers : " + sub);
		return sub;
	}
    
	private double multiply(int a,double b) {
		
		double mul = a * b;
		System.out.println("THis is the multiplication of two numbers :" + mul);
		return mul;
	
	}
	
	private double multiply(double b, int a, int c) {  //method overloading -- same method name, different arguments and different return type
		
		double mul =  (a * b * c);
		System.out.println("This is the result of overloaded method 'multiply' method : " + mul);
		return mul;
		
	}
	
	protected double divide (double a, int b) {
		
		double div = a / b;
		System.out.println("Division of two numbers :" + div);
		return div;
		
	}
	
	void modulodiv(int a, int b) {
		
		int mod = a%b;
		System.out.println("The result of modules is : " + mod);
		
	}
	public static void main(String[] args) {
		
	   Parentclass pc = new Parentclass();
	   pc.add(2, 3);
	   pc.substract(10, 5);
	   pc.multiply(2, 3);
	   pc.multiply(2, 3, 4);
	   pc.divide(3, 5);
	   pc.modulodiv(5, 3);
	   
		

	}

}
