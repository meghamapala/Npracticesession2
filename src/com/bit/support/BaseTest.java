package com.bit.support;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	ChromeDriver dr;
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/meghamapalagama/eclipse-workspace/"
				+ "Npracticesession2/chromedriver ");
	}

}
