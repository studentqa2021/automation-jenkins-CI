package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin {

	
	public PageFactoryLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@name='userName']")
	private WebElement user;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@name='submit']")
	private WebElement submitButton;
	@FindBy(xpath = "(//*[@class='mouseOut'])[8]")//1 of 11==>8
	private WebElement signOff;// findElement()
	@FindBy(xpath = "//*[@class='mouseOut']")//1 of 11
	private List<WebElement> signOffList;// findElements() ==> object 8 >> get(7)
	@FindBy(xpath = "//*[text()='Login Successfully']")
	private WebElement loginStatusSuccessMsg;
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getSignOff() {
		return signOff;
	}

	public List<WebElement> getSignOffList() {
		return signOffList;
	}

	public WebElement getLoginStatusSuccessMsg() {
		return loginStatusSuccessMsg;
	}

}
