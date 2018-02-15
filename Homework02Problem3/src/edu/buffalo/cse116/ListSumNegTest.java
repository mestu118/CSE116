package edu.buffalo.cse116;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class ListSumNegTest {
	
	@Test
	public void testOne() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		negatives.add(-1.0);
		negatives.add(-2.0);
		ListSumNeg list = new ListSumNeg();
		assertEquals(-3.0, list.sumNegatives(negatives), 0.001);
	}
	
	@Test
	public void testTwo() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		ListSumNeg list = new ListSumNeg();
		assertEquals(0, list.sumNegatives(negatives), 0.001);
	}
	
	@Test
	public void testThree() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		negatives.add(1.0);
		ListSumNeg list = new ListSumNeg();
		assertEquals(0, list.sumNegatives(negatives), 0.001);
	}
	
	@Test
	public void testFour() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		negatives.add(-1.0);
		ListSumNeg list = new ListSumNeg();
		assertEquals(-1.0, list.sumNegatives(negatives), 0.001);
	}
	
	@Test
	public void testFive() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		negatives.add(-1.0);
		negatives.add(-12.0);
		negatives.add(-50.0);
		negatives.add(null);
		ListSumNeg list = new ListSumNeg();
		assertEquals(-63.0, list.sumNegatives(negatives), 0.001);
	}
	
	@Test
	public void testSix() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		negatives.add(-1.0);
		negatives.add(1.0);
		negatives.add(-1.0);
		negatives.add(-3.0);
		ListSumNeg list = new ListSumNeg();
		assertEquals(-5.0, list.sumNegatives(negatives), 0.001);
	}
	
	@Test
	public void testSeven() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		negatives.add(-100.0);
		negatives.add(-1.0);
		negatives.add(-20.0);
		negatives.add(-30.0);
		ListSumNeg list = new ListSumNeg();
		assertEquals(-151.0, list.sumNegatives(negatives), 0.001);
	}
	
	@Test
	public void testEight() {
		ArrayList<Double> negatives = new ArrayList<Double>();
		negatives = null;
		ListSumNeg list = new ListSumNeg();
		assertEquals(0.0, list.sumNegatives(negatives), 0.001);
	}


}
