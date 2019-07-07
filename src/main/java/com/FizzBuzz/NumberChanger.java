package com.FizzBuzz;

public class NumberChanger {

	public String changeNumber(Integer input) {
		if (input.intValue() % 15 == 0) {
			return "FizzBuzz";
		}
		else if (input.intValue() % 3 == 0) {
			return "Fizz";
		}
		else if (input.intValue() % 5 == 0) {
			return "Buzz";
		}
		else {
			return input.toString();
		}
	}
}
