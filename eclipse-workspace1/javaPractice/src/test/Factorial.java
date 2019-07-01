package test;

public class Factorial {
    public static int f(int n) {
    	
    	if (n == 0) {
    		
    		//f(n -1);
    		 return 1;
    	}
    	else {
    		
    		return (n * f(n-1));
    	}
    }
	public static void main(String[] args) {
		
		f(5);
		
		System.out.println(f(5));

	}

}
