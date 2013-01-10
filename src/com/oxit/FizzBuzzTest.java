package com.oxit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void FizzBuzz1_is1() {
		assertThat(fizzBuzz(1), equalTo(1));
	}

}
