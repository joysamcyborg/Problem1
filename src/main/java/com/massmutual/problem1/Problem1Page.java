package com.massmutual.problem1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Problem1Page {

	@FindBy(how = How.ID_OR_NAME, using = "txt_val_1")
	@CacheLookup
	public WebElement textbox1;

	@FindBy(how = How.ID_OR_NAME, using = "txt_val_2")
	@CacheLookup
	public WebElement textbox2;

	@FindBy(how = How.ID_OR_NAME, using = "txt_val_3")
	@CacheLookup
	public WebElement textbox3;

	@FindBy(how = How.ID_OR_NAME, using = "txt_val_4")
	@CacheLookup
	public WebElement textbox4;

	@FindBy(how = How.ID_OR_NAME, using = "txt_val_5")
	@CacheLookup
	public WebElement textbox5;

	@FindBy(how = How.ID_OR_NAME, using = "txt_ttl_val")
	@CacheLookup
	public WebElement textboxTotBal;

	@FindBy(how = How.CSS, using = "css=[id*=txt]")
	@CacheLookup
	public java.util.List<WebElement> txtfields;

	private WebDriver dr;

	private static String PAGE_URL = "https://www.exercise1.com/values";
	
	public Problem1Page(WebDriver driver) {
		this.dr = driver;
		dr.get(PAGE_URL);
		PageFactory.initElements(dr, this);
	}

	public String getValTextbox1() {
		return textbox1.getAttribute("value");
	}

	public String getValTextbox2() {
		return textbox2.getAttribute("value");
	}

	public String getValTextbox3() {
		return textbox3.getAttribute("value");
	}

	public String getValTextbox4() {
		return textbox4.getAttribute("value");
	}

	public String getValTextbox5() {
		return textbox5.getAttribute("value");
	}

	public String getValTextboxTotBal() {
		return textboxTotBal.getAttribute("value");
	}

	public int getTxtfieldCount() {
		return txtfields.size();
	}

}
