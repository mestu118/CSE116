package edu.buffalo.cse116;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcDistanceTest {
	@Test
	public void negativeTime() {
		CalcDistance test = new CalcDistance();
		assertEquals(100.0, test.totalDistance(10.0, -10.0, 0.0, 0.0, 0.0, 0.0), 0.001);
	}
	
	@Test 
	public void noRate() {
		CalcDistance test = new CalcDistance();
		assertEquals(0.0, test.totalDistance(0.0, 10.0, 0.0, 10.0, 0, 10.0), 0.001);
	}
	
	@Test 
	public void noTime() {
		CalcDistance test = new CalcDistance();
		assertEquals(0.0, test.totalDistance(10.0, 0.0, 10.0, 0.0, 10.0, 0), 0.001);
	}
	

}
