package loginfacebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfb {

	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.gecko.driver", "/Users/sri/Documents/BrowserDrivers/Firefox/geckodriver");
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com");
	  
	  System.out.println("Success");
	  
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("srimerla414@gmail.com");
	  
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sweetysree09");
	  
	  driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	  
	  Alert allow = driver.switchTo().alert();
	  
	  allow.accept();
	  
	  Thread.sleep(3000);
	  
	  System.out.println("Before driver closing");
	  
	  driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a")).click();
	  
	  driver.close();
	  
	  System.out.println("End of the Program");
	  

	}

}
