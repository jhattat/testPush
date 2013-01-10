package com.oxit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void FizzBuzz1_is1() {
		assertThat(fizzBuzz(1), equalTo(String.valueOf(1)));
	}

	@Test
	public void FizzBuzz2_is2() {
		assertThat(fizzBuzz(2), equalTo(String.valueOf(2)));
	}

	private String fizzBuzz(int i) {
		return String.valueOf(i);
	}

}
