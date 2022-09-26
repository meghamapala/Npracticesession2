package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SharedData {
	
public ChromeDriver dr;
	
	public SharedData(ChromeDriver dr) {
		this.dr = dr;
	}

	public void goToAnyWebSite(String url) {
		dr.get(url);
	}

	public WebElement performAnyActionOnAnyElement(By by) {
		WebElement e = dr.findElement(by);
		return e;
	}

	public WebElement typeOnAnyElement(WebElement ele) {
		
		return ele;
	}

	public WebElement clickOnAnyElementByXpath(String xpathValue) {
		return dr.findElement(By.xpath(xpathValue));
		
	}

	public String printAnyTitle(String expectedTitle) {
		System.out.println(dr.getTitle());
		String actualTitle = dr.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Did NOT match :" + actualTitle);
		}
		return actualTitle;
	}
	
	public String getAnyText(By by) {
		String text = dr.findElement(by).getText();
		System.out.println(text);
		return text;
	}

	public String printAnyUrl() {
		System.out.println(dr.getCurrentUrl());
		String actualUrl = dr.getCurrentUrl();
		if(dr.getCurrentUrl().contains(TestData.homePageUrl)) {
			System.out.println("URL matched");
		}
		else{
			System.out.println("URL did NOT match : " + actualUrl);
		}
		return actualUrl;
	}

	public boolean verifyElementIsDisplayed(By element) {
		boolean ele = dr.findElement(element).isDisplayed();
		
		if(ele) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is NOT displayed :" + element);
		}
		return ele;
	}

	public List<WebElement> clickOnAnyElementfromAList(By by) {

		List<WebElement> w = dr.findElements(by);
		int e = w.size();
		System.out.println(e);
		return w;
	}
	
	public void myWait() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	void selectAnyValueByIndex(By by, int index) {
		
		Select s = new Select(dr.findElement(by));
		s.selectByIndex(index);
	}
	
	void selectAnyValueByVisibleText(By by, String text) {
		
		new Select(dr.findElement(by)).selectByVisibleText(text);
	}
	
	void selectAnyElementByValue(By by, String value) {
		new Select(dr.findElement(by)).selectByValue(value);
	}
	
	Select selectAnyElementByAnyOption(By by) {
		return new Select(dr.findElement(by));
	}
	
	
	
	
	

}
