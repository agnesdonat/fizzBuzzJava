package project3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzbuzzTest {

	@Test
	public void returnsNumberWhenGivenANonChangingNumber() {
		assertEquals(1, fizzbuzz.convert(1));
		assertEquals(2, fizzbuzz.convert(2));
		assertEquals(4, fizzbuzz.convert(4));
	}
	@Test
	public void returnsFizzWhenGiven3() {
		assertEquals("fizz", fizzbuzz.convert(3));
	}

}
