package edu.buffalo.cse116;
import static org.junit.Assert.*;
import org.junit.Test;

public class RelativelyPrimeTest {
	@Test
	public void testZeros() {
		RelativelyPrime primeCheck = new RelativelyPrime();
		assertFalse(primeCheck.relativelyPrime(0, 0));
	}
	
	@Test
	public void testOnes() {
		RelativelyPrime primeCheck = new RelativelyPrime();
		assertTrue(primeCheck.relativelyPrime(1, 1));
	}
	
	@Test
	public void testOne() {
		RelativelyPrime primeCheck = new RelativelyPrime();
		assertTrue(primeCheck.relativelyPrime(10, 11));
	}
	
	@Test
	public void testTwo() {
		RelativelyPrime primeCheck = new RelativelyPrime();
		assertTrue(primeCheck.relativelyPrime(7, 27));
	}
	
	@Test 
	public void testThree() {
		RelativelyPrime primeCheck = new RelativelyPrime();
		assertTrue(primeCheck.relativelyPrime(27, 7));
	}
	
	@Test
	public void testFour() {
		RelativelyPrime primeCheck = new RelativelyPrime();
		assertFalse(primeCheck.relativelyPrime(-7, 7));
	}
	
	@Test
	public void testFive() {
		RelativelyPrime primeCheck = new RelativelyPrime();
		assertFalse(primeCheck.relativelyPrime(1000, 100));
	}

}
