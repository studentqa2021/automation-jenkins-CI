package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {

	public static void getColor(WebElement element, WebDriver driver) {//2

		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid green'", element);
	}

	public static void getColor(WebElement element, WebDriver driver,String color) {//3

		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid "+color+"'", element);
	}

}
