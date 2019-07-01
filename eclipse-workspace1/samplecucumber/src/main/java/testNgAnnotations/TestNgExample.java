package testNgAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExample {
	
 
	public TestNgExample (){
		
		System.out.println("This is a constructor!!");
	}
	
	@BeforeClass
	public void method1() {
		
		System.out.println("This is 'Before Class'");
	}
	
	@BeforeMethod
    public void method2() {
		
		System.out.println("This is 'Before Method'");
	}
    
	@Test
    public void method3() {
	
	System.out.println("This is 'Test'");
    }
    
    
	@AfterMethod
    public void method4() {
		System.out.println("This is 'After Method'");
	
    }
    
    @AfterClass
    public void method5() {
	
	
	System.out.println("This is 'After Class'");
    } 
    
    
}


