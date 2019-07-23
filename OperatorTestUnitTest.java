package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass operatorTest = new OperatorTestClass();
	@Test
	void operatorTestUnitTest() {
		assertEquals(5,operatorTest.addition(2,3),"");
		assertEquals(1,operatorTest.subtraction(4,3),"");
		assertEquals(6,operatorTest.multiplication(2,3),"");
		assertEquals(2,operatorTest.division(6,3),"");
		assertEquals(1,operatorTest.modulus(7,3),"");
		
		assertEquals(-13,operatorTest.bitNot(12),"");
		assertEquals(12,operatorTest.bitAnd(12,14),"");
		assertEquals(14,operatorTest.bitOr(12,14),"");
		assertEquals(2,operatorTest.bitExOr(12,14),"");
		assertEquals(6,operatorTest.bitShiftRight(12),"");
		assertEquals(6,operatorTest.bitShiftRightZero(12),"");
		assertEquals(24,operatorTest.bitShiftLeft(12),"");
		assertEquals(24,operatorTest.bitShiftLeftZero(12),"");
		
		assertEquals(true,operatorTest.equalTo(12,12),"");
		assertEquals(true,operatorTest.notEqualTo(12,14),"");
		assertEquals(true,operatorTest.greaterThan(14,12),"");
		assertEquals(true,operatorTest.greaterThanOrEqual(12,12),"");
		assertEquals(true,operatorTest.lessThan(12,14),"");
		assertEquals(true,operatorTest.lessThanOrEqual(12,12),"");
		
		assertEquals(false,operatorTest.logicalNot(true),"");
		assertEquals(false,operatorTest.logicalAnd(true,false),"");
		assertEquals(false,operatorTest.logicalOr(false,false),"");
		assertEquals(false,operatorTest.logicalExOr(true,true),"");
		assertEquals(false,operatorTest.shortCircuitAnd(true,false),"");
		assertEquals(true,operatorTest.shortCircuitOr(true,false),"");
		
	}

}
