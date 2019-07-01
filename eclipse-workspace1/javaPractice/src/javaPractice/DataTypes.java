package javaPractice;



public class DataTypes extends Test1{
  
	public  int test() {
		Integer i = Integer.parseInt("1");
		i++;
		System.out.println(i);
		return i;
		
	}
	public void test1(Test1 t) {
		
		t.Testmethod(1);
	}
	
	
	public static void main(String[] args) {
		byte num = (byte) 260;
		short num1 = 5000;
		int num2 = 2147483647;
	    float num4 = 3.40282347f;
	    double num5 = 1.79769313486231570d;
	    char letter = 'Q';
	    String str = "This is a string!!";
	    boolean hello = true;
	    boolean hi = false;

		long num3 = 9223372036854775807L;
		
		char a = 83;

	
		
		Long l = Long.parseLong("5");
		System.out.println(l);
		
		
		DataTypes d = new DataTypes();
		d.test();

		
		
		

	    // Encaptulation
	    
//	    System.out.println("This is a byte  : " + num);
//	    System.out.println("This is a short : " + num1);
//	    System.out.println("This is an int : " + num2);
//	    System.out.println("This is a long : " + num3);
//	    System.out.println("This is a float : " + num4);
//	    System.out.println("This is a double : " + num5);
//	    System.out.println("This is a char : " + letter);
//	    System.out.println(str);
//	    System.out.println("These are boolean : " + hello + " & " + hi);
//	    
//	    int sum = (int) (num1 + num2 + num3 + num4 + num5);
//	    System.out.println("The sum of numbers : " + sum );
//	    
//	    double res = num1 + num2 + num3 + num4 + num5;
//	    System.out.println("The result is : " + res);
//	    
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}
