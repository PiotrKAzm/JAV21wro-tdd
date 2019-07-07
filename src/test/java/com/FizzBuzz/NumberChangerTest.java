package com.FizzBuzz;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class NumberChangerTest {

	NumberChanger numberChanger;
	
	@Test
	@Parameters({
		"1, 1",
		"4, 4",
		"3, Fizz",
		"5, Buzz",
		"15, FizzBuzz"
	})
	public void changeNumberTest(int input, String expected) {
		assertEquals(expected, numberChanger.changeNumber(input));
	}
	
    @Before
    public void before() {
    	numberChanger = new NumberChanger();
    }
}
