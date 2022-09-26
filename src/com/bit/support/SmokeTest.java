package com.bit.support;

import org.junit.Test;

import com.bit.test.Scenario;

public class SmokeTest extends BaseTest{
	
	@Test
	public void TargetTest() {
		
		Scenario sc = new Scenario(dr);
		sc.targetSignIn();
		
		
		
	}
	

}
