package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void SetUsername(String username) {
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			
	}
	
	public void SetPassdword(String Password) {
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Password);
	}
	
	public void ClickSubmit() {
		
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		
	}
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

}
