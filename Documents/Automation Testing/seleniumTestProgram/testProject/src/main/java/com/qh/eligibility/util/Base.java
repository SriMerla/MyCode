package com.qh.eligibility.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base{
	
	public Properties prop;
	public static WebDriver driver;
	public WebDriverWait wait;

	public SoftAssert softassert = new SoftAssert();
	public static String IEDriverPath = "\\\\quantum\\dfs\\IT\\Projects\\QA Automation\\Automation Tools\\Jars\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe";

	public static String URL="http://eligibility.quantum.qh-quantum.test/";
	//public ExtentReports reportinstance = ExtentManager.getInstance();
	//public static ExtentTest logger;
	
	public void Initalize(){
		//init the prop file
		if(prop==null){
			prop=new Properties();
			//envProp=new Properties();
			try {
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com/qh//eligibility//resources//eligibility.config.properties");
				prop.load(fs);
				//String env=prop.getProperty("env");
				//fs = new FileInputStream(System.getProperty("user.dir")+"//src//com/qh//pivit//resources//pivit."+env+".properties");
				//envProp.load(fs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void Initalize(String WhichPropertyFile){
		//init the prop file 
		if(prop==null){
			prop=new Properties();
			//envProp=new Properties();
			try {
				if (WhichPropertyFile.equalsIgnoreCase("PCP_Designation")){
						FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//com/qh//idcards//config//PCP_Designation.properties");
						prop.load(fs);
				}
				if (WhichPropertyFile.equalsIgnoreCase("MYCC")){
					FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//com/qh//idcards//config//MYCC.properties");
					prop.load(fs);		
				}
				
				if (WhichPropertyFile.equalsIgnoreCase("PreventiveScreeningBasedOnHEDISMappingsNEW")){
					FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//com/qh//idcards//config//PreventiveScreeningBasedOnHEDISMappingsNEW.properties");
					prop.load(fs);		
				}
				
				
				if (WhichPropertyFile.equalsIgnoreCase("queries")){
						FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//main/java//com//qh//eligibility//pages//queries.properties");
						prop.load(fs);		
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public WebDriver getDriver() {
		if (driver!=null){
			return driver;
		}
		else{
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		    caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			System.setProperty("webdriver.ie.driver", Base.IEDriverPath);
			driver=new InternetExplorerDriver(caps);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}
	
	}
	

	public void LoadPage(String pageName) {
		Initalize();
		driver.get(prop.getProperty(pageName+".url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

	
	

	public WebDriver openBrowser (String env)
	{
		System.setProperty("webdriver.ie.driver", Base.IEDriverPath);
		driver=new InternetExplorerDriver();
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true); 
		driver.manage().window().maximize();
		driver.get(prop.getProperty(env));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//logger.log(LogStatus.INFO, "The Browser has been opened");
		return driver;
	}
	
	public static int RandomInteger(int min, int max){
		int startRange=min;
		int endRange=max;
		Random rand =new Random();
		int randomNum=rand.nextInt((endRange-startRange)+1);
		if (randomNum<10){
			randomNum=randomNum+10;
		}
		return randomNum;
	}
	
	/*public void verifyFirstNameLastName(WebDriver driver, String firstName, String LastName, String MemberType){
		HomeScreen verifyObj=new HomeScreen(driver);
		if (verifyObj.HeaderFirstName.getText().equalsIgnoreCase(AddDependent.Fn) && verifyObj.HeaderLastName.getText().equalsIgnoreCase(AddDependent.Ln)){
			//logger.log(LogStatus.PASS, "Member First Name and Last Name has been validated");
			//logger.log(LogStatus.PASS, MemberType+" has been added successfully");
		}
		else{
			System.out.println(verifyObj.HeaderFirstName.getText());
			System.out.println(AddDependent.Fn);
			System.out.println(verifyObj.HeaderLastName.getText());
			System.out.println(AddDependent.Ln);
			//logger.log(LogStatus.FAIL, "Member First Name and Last Name has NOT been validated successfully");

		}
	}*/
	
	public void explicitwait(WebDriver driver,int time){
	wait=new WebDriverWait(driver,time);
	}

	public boolean isAlertPresent(WebDriver driver){
		
		try{
			explicitwait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert();
			boolean b=true;
			return b;
		}
		catch(Exception e){
			return false;
		}
	}
	
	public void HandleAlert(String whatToDoWithAlert, WebDriver driver) throws Exception
	{
		wait=new WebDriverWait(driver,10);
		
		try {	
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert=driver.switchTo().alert();
				if(whatToDoWithAlert=="Accept"){
					alert.accept();
					//logger.log(LogStatus.INFO, "Alert window was displayed and ok button was clicked");
				}
				else if(whatToDoWithAlert=="Dismiss"){
					alert.dismiss();
					//logger.log(LogStatus.INFO, "Alert window was displayed and it was dismissed");
				}
				
			} catch (Exception e) 
				{
							
					e.printStackTrace();
					Thread.sleep(2000);					
				}
	}
	
	public void teardownAll(){
		//reportinstance.endTest(logger);
	    //reportinstance.flush();
		driver.quit();
	}
	
		
	
	public void SwitchWindow(String windowTitle){
		
	Set<String> WindowIDs = driver.getWindowHandles();
	Iterator<String> it = WindowIDs.iterator();
	
	  for (String window : WindowIDs){
		 driver.switchTo().window(window);
         if (driver.getTitle().contains(windowTitle)) {
        	 driver.manage().window().maximize();
        	 return;
			}
					
		}	
		
	}
	

	
	
	public void SwitchWindowURL(String URL){
		
	Set<String> WindowIDs = driver.getWindowHandles();
	Iterator<String> it = WindowIDs.iterator();
			
		for (String window : WindowIDs){		
		   driver.switchTo().window(window);
	       if (driver.getCurrentUrl().contains(URL)){
	    	   if(URL.equals("Activitytype=Authorization")){
	        		 driver.manage().window().maximize();
	        		 return;
	        	 } else
	                 return;
				}
						
			}
		
	}
	
	public static boolean isTextPresent(String text){
		boolean b = driver.getPageSource().contains((text));
		return b;
		
	}
	
	public HashMap<String, String> returnWordToNumber(){
    	HashMap<String, String> numbers = new HashMap<String, String>();
    	numbers.put("first", "1");
    	numbers.put("second", "2");
    	numbers.put("third", "3");
    	numbers.put("fourth", "4");
    	numbers.put("fifth", "5");
    	numbers.put("sixth", "6");
    	numbers.put("seventh", "7");
    	numbers.put("eighth", "8");
    	numbers.put("ninth", "9");
    	numbers.put("tenth", "10");
    	return numbers;
    	
    }
	
	
	
}
