package com.bit.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario{
	

		public ChromeDriver dr;
		
		public Scenario(ChromeDriver dr) {
			this.dr = dr;
		}
		
		
		public void targetSignIn() {
			
			SharedData s = new SharedData(dr);
			s.goToAnyWebSite(TestData.homePageUrl);
			s.printAnyTitle(TestData.homePageTitle);
			
			
		}
		
		/*
		
		Navigate to Target 
		Verify title and print 
		verify URL and print 
		click on sign In 
		click on SignIn text link
		verify sign in page Title
	    verify Sign In page URL 
		enter any email 
		enter any password 
		click on sign in 
		verify "We can't find your account." text is displayed 
		print the error message 
		 
		*/
		
		}
