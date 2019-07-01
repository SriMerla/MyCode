package javaPractice;

public final class Classfinal {
	
	final int a = 10;
	int b;
	
	public final void sum() {
		
		int sum = a +b;
		System.out.println("The result is : " + sum);
	}

	public static void main(String[] args) {
		Classfinal cf = new Classfinal();
		cf.sum();

	}

}
