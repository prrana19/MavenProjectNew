package com.preeti.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalTest {

	@Test
	public void addTest() {
		
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.addNum(5, 5));
	}
	
	public void subTest() {
		
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5, myCalc.subNum(10, 5));
	}


}
