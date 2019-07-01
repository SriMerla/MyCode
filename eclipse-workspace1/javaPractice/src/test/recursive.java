package test;

public class recursive {
 
	public void rec(int n) {
		
		if (n >=0) {
			 rec(n - 1);
			
		}
	    
		System.out.println(n);
		
	}
	
	
	public static void main(String[] args) {
		recursive r = new recursive();
	    r.rec(10);
	

	}

}
