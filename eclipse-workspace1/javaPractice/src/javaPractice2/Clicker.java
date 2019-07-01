package javaPractice2;

public class Clicker {
	int clickcount = 0;
	
	public void clicK() {

			System.out.println("click the button : clickcount " + (clickcount+1));
			clickcount++;
		
	}
	public void reset() {
		
		clickcount = 0;
		System.out.println("Reset the clicker : " + clickcount);
	}
	
	public void showCurrentCount() {
		
		System.out.println("CurrentClick Count is : " + clickcount);
	}

	public static void main(String[] args) {
		Clicker c = new Clicker();
		c.clicK();
		c.clicK();
		c.showCurrentCount();
		c.reset();
		c.clicK();
		c.showCurrentCount();
		

	}

}
