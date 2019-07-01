package test;

public class Main {
	
	public static void main(String[] args) {
		
		int j = 0;
		
		Main m = new Main();
				
		m.test(j);
		System.out.println(j);
		
		Test t1 = new Test();
		
		System.out.println(t1.i);
		
	}
	
	public void test(int i) {
		i++;
		System.out.println(i);
	}
	
	public void test(Main t, Test t1, int i, long j ) {

	}
	
	

}
