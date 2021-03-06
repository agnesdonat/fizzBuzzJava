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
	@Test
	public void returnsBuzzWhengiven5() {
		assertEquals("buzz", fizzbuzz.convert(5));
	}
	@Test
	public void returnsFizzBuzzWhengiven15() {
		assertEquals("fizzbuzz", fizzbuzz.convert(15));
	}

}
