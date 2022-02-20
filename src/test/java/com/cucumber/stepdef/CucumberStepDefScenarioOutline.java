package com.cucumber.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.generic.PageFactoryLogin;
import com.util.BaseConfig;
import com.util.HandleClick;
import com.util.Highlighter;
import com.util.ScreenShot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberStepDefScenarioOutline {
	WebDriver driver;
	PageFactoryLogin obj;

	@Given("User need to open any browser")
	public void user_need_to_open_a_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("Put application {string}")
	public void put_application_url(String url) throws Exception {
		driver.get(BaseConfig.getValue(url));// any website
		driver.manage().window().maximize();
	}

	@Given("put user name {string}")
	public void put_email(String user) throws Exception {
		obj = new PageFactoryLogin(driver);

		Highlighter.getColor(obj.getUser(), driver, "red");
		obj.getUser().sendKeys(BaseConfig.getValue(user));
	}

	@Given("put password {string}")
	public void put_password(String pass) throws Exception {
		Highlighter.getColor(obj.getPassword(), driver);
		obj.getPassword().sendKeys(BaseConfig.getValue(pass));
	}

	@Given("click login in button")
	public void click_sign_in_button() throws Throwable {
		Highlighter.getColor(obj.getSubmitButton(), driver);
		//obj.getSubmitButton().click();
		HandleClick.getJSEClick(driver, obj.getSubmitButton());

		ScreenShot.getScreenShot(driver, "Login Test status");
	}

	@Then("login will be successful with valid credential")
	public void login_will_be_successful() {
		Assert.assertEquals(obj.getLoginStatusSuccessMsg().getText(), "Login Successfully");// fail=stop
		Assert.assertTrue(obj.getSignOffList().get(7).isDisplayed());// stopped here

		SoftAssert soft = new SoftAssert();
		soft.assertTrue(obj.getSignOffList().get(7).isDisplayed());

		soft.assertAll();

	}

	@Then("close the browser when test finish")
	public void close_the_browser() {
		driver.quit();
	}
}