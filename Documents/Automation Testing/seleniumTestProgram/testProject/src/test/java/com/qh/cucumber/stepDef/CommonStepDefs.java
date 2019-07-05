package com.qh.cucumber.stepDef;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qh.eligibility.pages.PackageInfo;
import com.qh.eligibility.util.Base;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CommonStepDefs extends Base {
	
	static Class pageObjectClass=null;
	static String packageName=null;
	Object currentPageObject;
	static Integer waitTime = 30;

	/****************************************@GIVEN**************************************************************/

	@When("^User searches for a member$")
	public void user_searches_for_a_member() throws Throwable {
		System.out.println("When Method Code is executed");
	}

	@Then("^User is taken to the \"([^\"]*)\" screen$")
	public void user_is_taken_to_the_home_screen(String screenName) throws Throwable {
		System.out.println("Then Method Code is executed");
	}
	
	@Given("^I navigate to ([^\"]*) page$")
	public void navigate_to_page(String pageValue) throws Exception{
		String pageName = pageValue.replaceAll(" ", "") + "Page";
		pageObjectClass= PackageInfo.class;
		packageName=pageObjectClass.getPackage().getName();
		pageObjectClass=Class.forName(packageName+"."+pageName);
		System.out.println("Class name is " + pageObjectClass.getName());
		System.out.println("Package Name is "+packageName);		
		currentPageObject = PageFactory.initElements(getDriver(), pageObjectClass);
		LoadPage(pageName);
	}
	
	@Given("^I am on the ([^\"]*) page$")
	public void on_the_page(String pageValue) throws Throwable {

		String pageName = pageValue.replaceAll(" ", "") + "Page";
		pageObjectClass=PackageInfo.class;
		packageName=pageObjectClass.getPackage().getName();
		pageObjectClass=Class.forName(packageName+"."+pageName);
		System.out.println("Class name is " + pageObjectClass.getName());
		System.out.println("Package Name is "+packageName);		
		currentPageObject = PageFactory.initElements(getDriver(), pageObjectClass);
	}


	
	
	/****************************************@WHEN**************************************************************/

	
	@When("^I switch to \"([^\"]*)\" window$")
	public void i_switch_to_window(String windowTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Set<String> WindowIDs = driver.getWindowHandles();

		for (String window : WindowIDs) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains(windowTitle)) {
				driver.manage().window().maximize();
				return;
			}
		}
	    
	}
	
	// To Click on a Button or Link on any page.
	@When("^I click the ([^\"]*) (?:link|button|section|tab|image|icon|text field)$")
	public static void click_element(String elementNm) throws Throwable {
		WebElement webElement = getElement(elementNm);
		Thread.sleep(1200);
		ElementWait_UntilClickable(webElement);
		webElement.click();
	}
	
	// To select a Value from the drop down.
		@When("^I select \"(.*)\" from ([^\"]*) drop down$")
		public static void select_value_from_dropdown(String value, String elementNm)
				throws Throwable {

			//value = getSession(value);
			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			try {
				new Select(webElement).selectByVisibleText(value);
			} catch (NoSuchElementException e) {
				new Select(webElement).selectByValue(value);
			}
		}
	
		// To select a Value from the drop down using Index.
		@When("^I select index \"(.*)\" from ([^\"]*) drop down$")
		public static void select_value_from_dropdown_using_index(String value,
				String elementNm) throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilClickable(webElement);
			try {
				new Select(webElement).selectByIndex(Integer.parseInt(value));
			} catch (NumberFormatException e) {
				System.out.println("Send valid value to select by index");

			}

		}	
	
		// Multiple values.
		/*
		 * Then I select values from multipleSelect drop down 
		 * |test1|
		 * |test2|
		 */
		@When("^I select values from ([^\"]*) drop down$")
		public void i_select_values_from_multipleSelect_drop_down(String inputName,
				List<String> inputvalues) throws Throwable {

			WebElement webElement = getElement(inputName);
			 ElementWait_UntilVisible(webElement);
			for (String value : inputvalues) {
				new Select(webElement).selectByVisibleText(value);
				webElement.sendKeys(Keys.CONTROL);
			}

		}
	
		// To select a radio button from a radio group.
		@When("^I select \"(.*)\" from ([^\"]*) radio buttons$")
		public static void select_radio_values(String value, String elementNm)
				throws Throwable {
			WebElement webElement = getElementFromGroup(value, elementNm);
			ElementWait_UntilVisible(webElement);
			webElement.click();

		}
	
		// To check/uncheck a Checkbox
		@When("^I (check|uncheck) the ([^\"]*) checkbox$")
		public static void select_checkbox(String function, String elementNm)
				throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			if (function.equals("check") && !webElement.isSelected())
				webElement.click();
			else if (function.equals("uncheck") && webElement.isSelected())
				webElement.click();
		}
	
	
		// Multiple values
		/*
		 * When I check values from checkbox 
		 * |car| 
		 * |Boat| 
		 * When I uncheck values from checkbox 
		 * |Boeing|
		 * |Boat|*/
		@When("^I (check|uncheck) values from ([^\"]*) checkbox$")
		public void i_check_values_from_checkbox(String function, String inputName,
				List<String> inputvalues) throws Throwable {

			WebElement webElement = getElement(inputName);
			 ElementWait_UntilVisible(webElement);

			for (String value : inputvalues) {
				WebElement checkBoxByValue = webElement.findElement(By
						.xpath("//*[@value='" + value + "']"));
				if (function.equals("check") && !checkBoxByValue.isSelected())
					checkBoxByValue.click();
				else if (function.equals("uncheck") && checkBoxByValue.isSelected())
					checkBoxByValue.click();
			}
		}
		
		
		// To Enter text in text fields.
		@When("^I enter \"(.*)\" in the ([^\"]*) (?:text field|text area)$")
		public static void enter_value_in_field(String value, String elementNm)
				throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			webElement.clear();
			webElement.sendKeys(value);
		}
		
		// To Enter text in text fields using data tables.
		@When("^I enter \"(.*)\" in the ([^\"]*) text field using data tables$")
		public static void enter_value_in_field(CharSequence[] value, String elementNm)
				throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			webElement.clear();
			webElement.sendKeys(value);
		}	

		
		// To Enter text in Phone number fields.
		@When("^I enter \"(.*)\" in the ([^\"]*) phone field$")
		public static void enter_value_in_the_phone_field(String value, String elementNm)
				throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			for (int i = 0; i < 10; i++) {
				webElement.sendKeys(Keys.BACK_SPACE);
			}
			webElement.sendKeys(value);
		}
		
		@When("^I click the \"(.*?)\" (?:alert|popup|modal window) button$")
		public void i_click_the_modal_window_button(String inputValue)
				throws Throwable {

			Alert alert = driver.switchTo().alert();
			if (inputValue == "OK" || inputValue.equalsIgnoreCase("OK")) {
				alert.accept();
				System.out.println("I am clicking OK button on Alert");

			} else if (inputValue == "Cancel"
					|| inputValue.equalsIgnoreCase("Cancel")) {
				alert.dismiss();
				System.out.println("I am clicking Cancel button on Alert");
			}
		}
		
		
		/****************************************@THEN**************************************************************/
	
	
		// To check if link/button/radio button/drop down/check box are enabled.
		@Then("I verify that ([^\"]*) (?:link|button|checkbox|drop down|text field|text area|tab|image|icon) is enabled$")
		public static void all_elements_enabled(String elementNm) throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			Assert.assertTrue(webElement.isEnabled());

		}

		@Then("I verify that ([^\"]*) (?:link|button|checkbox|drop down|text field|text area|tab|image|icon) is not enabled$")
		public static void all_elements_disabled(String elementNm) throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			Assert.assertFalse(webElement.isEnabled());

		}

		// To check if checkbox is unchecked/checked
		@Then("^I verify that ([^\"]*) checkbox is (unchecked|checked)$")
		public void verify_checkbox_checked(String elementNm, String elementState)
				throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);

			if ("checked".equals(elementState)) {
				Assert.assertTrue(webElement.isSelected());
			} else if ("unchecked".equals(elementState)) {
				Assert.assertFalse(webElement.isSelected());
			}

		}

		// To To check if a radio button from a group is selected or not selected.
		@Then("^I verify that \"(.*)\" from ([^\"]*) radio buttons is (selected|not selected)$")
		public static void verify_radio_button_selected(String value,
				String elementNm, String elementState) throws Throwable {

			WebElement webElement = getElementFromGroup(value, elementNm);
			ElementWait_UntilVisible(webElement);

			if ("selected".equals(elementState)) {
				Assert.assertTrue(webElement.isSelected());
			} else if ("not selected".equals(elementState)) {
				Assert.assertFalse(webElement.isSelected());
			}

		}

		// To To check if a radio button from a group is enabled or not enabled
		@Then("^I verify that \"(.*)\" from ([^\"]*) radio buttons is (enabled|not enabled)$")
		public static void verify_radio_button_enabled(String value,
				String elementNm, String elementState) throws Throwable {

			WebElement webElement = getElementFromGroup(value, elementNm);
			ElementWait_UntilVisible(webElement);

			if ("enabled".equals(elementState)) {
				Assert.assertTrue(webElement.isEnabled());
			} else if ("disabled".equals(elementState)) {
				Assert.assertFalse(webElement.isEnabled());
			}

		}

		@Then("I verify that \"(.*)\" text is displayed$")
		public static void verify_text_on_the_page(String expectedValue) throws Throwable {

			//if text contains a single quote the xpath will not find the text using the existing call even if you escape the quote so you have to use double quotes around the text in the xpath
			String xPath = "";
			if (expectedValue.contains("'")){
				xPath = "//*[contains(text(), \"" + expectedValue + "\")]";
			}
			else {
				xPath = "//*[contains(text(), '" + expectedValue + "')]";
			}

			//expectedValue = getSession(expectedValue);
			WebElement webElement = driver
								.findElement(
										By.xpath(xPath));
			ElementWait_UntilVisible(webElement);
			Assert.assertTrue(webElement.getText().contains(expectedValue));

		}
		

		@Then("I verify that \"(.*)\" text is in the page source$")
		public static void verify_text_in_page_source(String expectedValue) throws Throwable {

			//expectedValue = getSession(expectedValue);
			try {
				WebElement webElement = driver.findElement(By.xpath("//*[contains(text(), '" + expectedValue+ "')]"));
				ElementWait_UntilVisible(webElement);
				Assert.assertTrue(webElement.getText().contains(expectedValue));
			} catch (Exception e) {
				Assert.assertTrue(Base.isTextPresent(expectedValue));
			}

		}
		
		
		@Then("I verify that \"([^\"]*)\" text is not displayed$")
		public void verify_text_not_on_the_page(String expectedValue)
				throws Throwable {
			//expectedValue = getSession(expectedValue);
			try {
				WebElement webElement = driver.findElement(By.xpath("//*[contains(text(), '" + expectedValue+ "')]"));
				Assert.assertFalse(webElement.isDisplayed());
			} catch (org.openqa.selenium.NoSuchElementException exp) {
				Assert.assertTrue(true);
			}

		}

		@Then("^I verify that ([^\"]*) (?:text field|text area) has \"(.*)\"$")
		public static void verify_textbox_has_value(String elementNm, String value)
				throws Throwable {

			//value = getSession(value);
			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);

			System.out.println("text field has value "+ webElement.getAttribute("value"));

			String actualValue = webElement.getAttribute("value");
			
			if (webElement.getAttribute("value") == null) {
				System.out.println("text field has value " + webElement.getText());
				actualValue = webElement.getText();
				actualValue = actualValue.replaceAll("\\r\\n|\\r|\\n", " ");
			}
			//assertEquals(value, actualValue);
			Assert.assertEquals(actualValue, value);

		}

		@Then("I verify that ([^\"]*) drop down \"(.*)\" is (selected|not selected)$")
		public static void verify_value_selected(String elementNm,
				String elementVal, String elementState) throws Throwable {

			//elementVal = getSession(elementVal);
			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			Select selectoption = new Select(webElement);

			System.out.println("selecoption "
					+ selectoption.getFirstSelectedOption().getText());

			if ("selected".equals(elementState)) {
				Assert.assertEquals(elementVal, selectoption.getFirstSelectedOption()
						.getText());
			} else if ("not selected".equals(elementState)) {
				Assert.assertFalse(!elementVal.equals(selectoption.getFirstSelectedOption().getText()), "Error " + elementVal + " is selected");
			}
		}

		/* I verify that <name> drop down contains values |value| */
		@Then("^I verify that ([^\"]*) drop down (contains|does not contains) values$")
		public void i_verify_that_multipleSelect_drop_down_contains_values(
				String elementNm,String elementState, List<String> inputvalues)
						throws Throwable {

			WebElement webElement = getElement(elementNm);
			ElementWait_UntilVisible(webElement);
			List<String> lsDropDownValues = Arrays.asList(webElement.getText()
					.split("\n"));
			if ("contains".equals(elementState)) {
				for (String input : inputvalues) {
					//input = getSession(input);
					System.out.println(" Drop down contains " + input + " in the "+ lsDropDownValues.contains(input));
					Assert.assertTrue(lsDropDownValues.contains(input)," The drop down doesnt have value  "+ input);
				}
			} else if ("does not contains".equals(elementState)) {
				for (String input : inputvalues) {
					//input = getSession(input);
					System.out.println(" Drop down contains " + input + " in the "
							+ lsDropDownValues.contains(input));
					Assert.assertFalse(lsDropDownValues.contains(input), " The drop down has value  " + input);
				}
			}

		}

		@Then("^I verify that ([^\"]*) (?:link|button|radio buttons|checkbox|section|text field|drop down|text area|gutter|tab|image|icon|alert|popup|modal window) is (displayed|not displayed)$")
		public static void verify_controls_isdisplayed_on_the_page(String expectedValue,
				String elementState) throws Throwable {

			WebElement webElement = getElement(expectedValue);

			if ("displayed".equals(elementState)) {
				ElementWait_UntilVisible(webElement);
				
				Assert.assertTrue(webElement.isDisplayed());
			} else if ("not displayed".equals(elementState)) {
				try {
					System.out.println("Display check " + webElement.isDisplayed());
					Assert.assertFalse(webElement.isDisplayed());
				} catch (org.openqa.selenium.NoSuchElementException exp) {
					Assert.assertTrue(true);
				}
			}
		}

		@Then("^I verify that page title is \"(.*)\"$")
		public void i_verify_that_page_title_is(String expectedPageTitle) {

			//expectedPageTitle = getSession(expectedPageTitle);
			(new WebDriverWait(driver, 5)).until(ExpectedConditions.titleIs(expectedPageTitle));
			String currentTitle = driver.getTitle();
			Assert.assertEquals(expectedPageTitle, currentTitle);
		}
		
		
		@Then("^I verify (?:alert|popup|modal window) text is \"(.*)\"$")
		public void i_verify_alert_text(String inputText) throws Throwable {

			//inputText = getSession(inputText);
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals(alert.getText(), inputText);
		}

		/* move me to CommonStepDef */
		@Then("^I verify that (?:alert|popup|modal window) \"(.*)\" is displayed$")
		public void i_verify_that_popup_is_displayed(String inputTitle)
				throws Throwable {

			try {
				WebDriver webDriver = driver.switchTo().window(inputTitle);

			} catch (org.openqa.selenium.NoSuchWindowException exp) {
				System.out.println(exp.toString());
				System.out.println("Trying to find is Alert message is present");
				i_verify_alert_text(inputTitle);
			}
		}

		/* I click row "3" on the getquote flyout*/
		 @Then("^I click row \"(\\d+)\" on the ([^\"]*) flyout$")
			public void i_select_text_from_flyout(int inputIndex,String inputName) throws Throwable {
			
			 	List <WebElement> tableRows = driver.findElements(By.xpath(".//*[@id='autocomplete_results_'" + inputName + "'_0']/table"));
		        Actions builder = new Actions(driver);
		        builder.click(tableRows.get(inputIndex)).keyUp(Keys.CONTROL).build().perform();	 	
			}
		
		
		/* move me to CommonStepDef */
		@Then("^I enter requested text \"(.*?)\" in (?:alert|popup|modal window)$")
		public void i_enter_in_the_popup(String inputText) throws Throwable {

			Alert alert = driver.switchTo().alert();
			alert.sendKeys(inputText);
		}
		
		
	/*************************************************COMMON FUNCTIONS*********************************/
		
		public static void ElementWait_UntilVisible(WebElement webElement)
				throws Throwable {

			WebDriverWait wait = new WebDriverWait(
					driver, waitTime);
			wait.until(ExpectedConditions.visibilityOf(webElement));
		}

		public static void ElementWait_UntilClickable(WebElement webElement)
				throws Throwable {
			WebDriverWait wait = new WebDriverWait(
					driver, waitTime);
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
		}
		
		public static WebElement getElement(String elementNm)throws InstantiationException, IllegalAccessException,	SecurityException, NoSuchFieldException {

			String element = elementNm.replaceAll(" ", "");
			//String element = elementName.substring(0, 1).toLowerCase()+ elementName.substring(1);

			System.out.println("This is Current Element: " + element);

			System.out.println("This is Current Class for Element: "
					+ pageObjectClass.getName());

			Field field = pageObjectClass.getField(element);

			System.out.println("This is current Field: " + field.getName());

			field.setAccessible(true);

			WebElement webElement = (WebElement) field.get(element);

			return webElement;

		}

		public static WebElement getElementFromGroup(String value, String elementNm)
				throws Throwable {
			WebElement webElements = getElement(elementNm);
			ElementWait_UntilVisible(webElements);
			WebElement webElement = null;
			try {
				webElement = webElements.findElement(By.xpath("//*[@value='"
						+ value + "']"));
				System.out.println("isDisplayed: " + webElement.isDisplayed());
				return webElement;
			} catch (NoSuchElementException e) {
			}
			try {
				webElement = webElements.findElement(By
						.xpath("//*[contains(text(), '" + value + "')]"));
				return webElement;
			} catch (NoSuchElementException e) {
				System.out.println("Please check the value: " + value
						+ " passed for the element");
			} finally {
				return webElement;
			}
		}
		
		
		
		
	/*@Before("@before")
	public void beforeScenarioHookMethod(){
		System.out.println("This code is executed by the cucumber's before hook");
	}
	*/
	
	@After
	public void afterScenarioHookMethod(){
		driver.quit();
		driver = null;
	}

}
