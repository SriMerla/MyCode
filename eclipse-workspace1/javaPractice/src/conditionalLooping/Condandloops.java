package conditionalLooping;

public class Condandloops implements CondState {

	int a= 10, b = 20;

	@Override
	public void conditionif() {
		
		if (a > b) {
			
			System.out.println("This is if condition");
			System.out.println("a is greater than b");
		}
		
	}

	@Override
	public void conditionifelse() {
    
		if (a < b) {
			
			System.out.println("This is if else condition");
			 System.out.println("a is less than b");
		}
		else {
			
			System.out.println("a is greater than b");
		}
		
	}

	@Override
	public void loopwhile() {
     int i = 0;
	
     while(i < 10 ) {
		
    	 
    	System.out.println("This is while loop");
		System.out.println(i);
		i++;
		
	}

	}

	@Override
	public void loopdowhile() {
		int i = 1;
     do {
    	 System.out.println("This is do while loop");
    	 System.out.println(i);
    	 i++;
     }while (i < 5);
		
	}

	@Override
	public void loopfor() {
		
		for (int i = 1; i < 10 ; i++) {
			
			System.out.println("THis is for loop");
			System.out.println(i);
		}		
			
		}
		
	public void grades() {
		
		char grade = 'A';
		
		switch(grade) {
		
		case 'A' : System.out.println("Excellent");
		         break;
		case 'B' : System.out.println("Good");
		         break;
		case 'C' : System.out.println("Average");
		          break;
		         
		}
		
		
	}
	
	
    public static void main(String[] args) {
    	
    	Condandloops cl = new Condandloops();
    	cl.conditionif();
    	cl.conditionifelse();
    	cl.loopwhile();
    	cl.loopdowhile();
		cl.loopfor();
		cl.grades();
	}
}
