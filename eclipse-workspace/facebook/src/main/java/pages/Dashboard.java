package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {
	
	WebDriver driver;
	
	public void Profile() {
		
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a")).click();
	}
	
	public void Logout() {
		
	driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
	driver.findElement(By.className("_54nh")).click();
		//Select logout = new Select(dropdown);
		//logout.selectByVisibleText("Log Out");
		
	}
	
	public void Confirmation() {
		
		WebElement ConfirmMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div[1]"));
		System.out.println("The Logout Confirmation Message is : " + ConfirmMessage);
		
	}
	
	public Dashboard(WebDriver driver) {
		
		this.driver = driver;
		
	}

}
