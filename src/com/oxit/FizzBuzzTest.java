package com.oxit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void FizzBuzz1_is1() {
		assertThat(fizzBuzz(1), equalTo(String.valueOf(1)));
	}

	private String fizzBuzz(int i) {
		return String.valueOf(1);
	}

}
