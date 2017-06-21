package com.massmutual.problem1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author JoyB
 *
 */
public class stepDefinition {

	WebDriver dr;
	WebElement searchBox;
	Problem1Page page;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		dr = new ChromeDriver();
	}

	@Given("^I load Problem1 Page$")
	public void i_load_problem1_page() throws Throwable {
		page = new Problem1Page(dr);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^the Problem page is loaded$")
	public void i_enter_and() throws Throwable {

		WebDriverWait wait = new WebDriverWait(dr, 10);
		WebElement elem = page.textboxTotBal;
		elem.click();
		wait.until(ExpectedConditions.visibilityOf(elem));
		Assert.assertTrue("Page is correctly loaded", true);
	}

	@Then("^verify the right number of values appear on the screen$")
	public void verify_the_right_number_of_values_appear_on_the_screen() throws Throwable {
		Assert.assertTrue("Check if correct number of values appear on screen", page.getTxtfieldCount() == 5);
	}

	@Then("^verify values on the screen are greater than 0$")
	public void verify_values_on_the_screen_are_greater_than_0() throws Throwable {

		Assert.assertTrue("Check if Value 1 is >0 ", Integer.parseInt(page.getValTextbox1().substring(1)) > 0);
		Assert.assertTrue("Check if Value 2 is >0 ", Integer.parseInt(page.getValTextbox2().substring(1)) > 0);
		Assert.assertTrue("Check if Value 3 is >0 ", Integer.parseInt(page.getValTextbox3().substring(1)) > 0);
		Assert.assertTrue("Check if Value 4 is >0 ", Integer.parseInt(page.getValTextbox4().substring(1)) > 0);
		Assert.assertTrue("Check if Value 5 is >0 ", Integer.parseInt(page.getValTextbox5().substring(1)) > 0);
		Assert.assertTrue("Check if Total Balance is >0 ",
				Integer.parseInt(page.getValTextboxTotBal().substring(1)) > 0);

	}

	@Then("^total balance is correct$")
	public void total_balance_is_correct() throws Throwable {

		Integer TotalbalanceAdded = Integer.parseInt(page.getValTextbox1().substring(1))
				+ Integer.parseInt(page.getValTextbox2().substring(1))
				+ Integer.parseInt(page.getValTextbox3().substring(1))
				+ Integer.parseInt(page.getValTextbox4().substring(1))
				+ Integer.parseInt(page.getValTextbox5().substring(1));

		Integer TotalBalaceDisplayed = Integer.parseInt(page.getValTextboxTotBal().substring(1));
		Assert.assertEquals("Check if balanced displayed is correct ", TotalbalanceAdded, TotalBalaceDisplayed);
	}

	@Then("^values are formatted as currencies$")
	public void values_are_formatted_as_currencies() throws Throwable {

		Assert.assertEquals("Check for currency formatting Value 1", '$', page.getValTextbox1().charAt(0));
		Assert.assertEquals("Check for currency formatting Value 2", '$', page.getValTextbox2().charAt(0));
		Assert.assertEquals("Check for currency formatting Value 3", '$', page.getValTextbox3().charAt(0));
		Assert.assertEquals("Check for currency formatting Value 4", '$', page.getValTextbox4().charAt(0));
		Assert.assertEquals("Check for currency formatting Value 5", '$', page.getValTextbox5().charAt(0));
		Assert.assertEquals("Check for currency formatting Total Balance", '$', page.getValTextboxTotBal().charAt(0));

	}

	@Then("^total balance matches the sum of the values$")
	public void total_balance_matches_the_sum_of_the_values() throws Throwable {

		Integer TotalbalanceAdded = Integer.parseInt(page.getValTextbox1().substring(1))
				+ Integer.parseInt(page.getValTextbox2().substring(1))
				+ Integer.parseInt(page.getValTextbox3().substring(1))
				+ Integer.parseInt(page.getValTextbox4().substring(1))
				+ Integer.parseInt(page.getValTextbox5().substring(1));

		Integer TotalBalaceDisplayed = Integer.parseInt(page.getValTextboxTotBal().substring(1));
		Assert.assertEquals("Check if balanced displayed is correct ", TotalbalanceAdded, TotalBalaceDisplayed);

	}

	@After
	public void closeBrowser() {
		dr.quit();
	}

}
