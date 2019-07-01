package javaPractice;

public class exception{
	
	
	public static void main(String[] args) {
		try {
			int a = 25;
			int b = 5;
			int div = a/b;
			System.out.println(div);
			
			int [] ar = new int[5];
					
			ar[6] = 40;		
		}
		catch (ArithmeticException  e) {
			
			System.out.println(e);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		finally {
			
			System.out.println("This is finally block which is always executed");
		}

	}
}

