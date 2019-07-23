package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.MyClass;

class MyTest {

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		MyClass tester =  new MyClass();		//MyClass is tested
		
		//assert statements
		assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
		assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
		assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
		
		assertEquals(10, tester.multiply(5, 2), "5 x 2 must be 10");
		assertEquals(10.0, tester.multiply(5, 2), "5 x 2 must be 10");
		
		assertEquals(7, tester.addition(5, 2));
		assertEquals(7.0, tester.addition(5.0, 2.0));
		
		assertEquals("Hello World", tester.addition("Hello ","World"));
	}

}