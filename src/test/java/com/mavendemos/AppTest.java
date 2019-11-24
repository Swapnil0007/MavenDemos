package com.mavendemos;

import static org.junit.Assert.*;

import org.junit.Test;



public class AppTest<Assert> {
	private static int result;
	
	@Test
	public void test() {
		int num1=10;
		int result ;
		result= App.subtraction(15,5);
         assertEquals(num1,result);
	
	}

}
