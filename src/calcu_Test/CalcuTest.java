package calcu_Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import calcu.calcu;

public class CalcuTest {
	//入力数が4以下の場合
	@Test
	public void  calcIntegerTest01() {
		int input1 = 1;
		int input2 = 1;
		String[] input3 = { "1", "+", "1" };

		int result = calcu.calcInteger(input1, input2, input3);
		int expected = 2;
		assertEquals(expected, result);
	}

	@Test
	public void calcIntegerTest02() {
		int input1 = 1;
		int input2 = 1;
		String[] input3 = { "1", "-", "1" };

		int result = calcu.calcInteger(input1, input2, input3);
		int expected = 0;
		assertEquals(expected, result);
	}

	@Test
	public void calcIntegerTest03() {
		int input1 = 1;
		int input2 = 1;
		String[] input3 = { "1", "*", "1" };

		int result = calcu.calcInteger(input1, input2, input3);
		int expected = 1;
		assertEquals(expected, result);
	}

	@Test
	public void calcIntegerTest04() {
		int input1 = 10;
		int input2 = 2;
		String[] input3 = { "10", "/", "2" };

		int result = calcu.calcInteger(input1, input2, input3);
		int expected = 5;
		assertEquals(expected, result);
	}

	@Test
	public void calcIntegerTest05() {
		int input1 = 3;
		int input2 = 2;
		String[] input3 = { "3", "%", "2" };

		int result = calcu.calcInteger(input1, input2, input3);
		int expected = 1;
		assertEquals(expected, result);
	}

	@Test
	public void calcIntegerTest06() {
		int input1 = 3;
		int input2 = 2;
		String[] input3 = { "3", "^", "2" };

		int result = calcu.calcInteger(input1, input2, input3);
		int expected = 9;
		assertEquals(expected, result);
	}

	@Test
	public void calcroot() {
		double input1 = 3.0;
		String[] input2 = { "3", "r", "", "" };
		double expected = 1.7320508075688772;
		assertEquals(expected, calcu.calc2(input1, input2), 0);
	}

	//入力数が4より大きい場合、配列のサイズを変更
	@Test
	public void Array() {
		String[] input = { "1", "+", "1", "+" };
		String[] result = calcu.tempArray(input);
		String[] expected = { "1", "+", "1", "+" };
		assertNotEquals(expected, result);
	}

	//入力数が5の場合
	@Test
	public void calcuAdd2() {
		int input1 = 1;
		int middleAns = 2;
		String[] input = { "1", "+", "1", "+", "1" };
		int expected = 3;
		int result = calcu.calc4(input1, middleAns, input);
		assertEquals(expected, result);
	}

	@Test
	public void calcuSubstract2() {
		int input1 = 1;
		int middleAns = 2;
		String[] input = { "1", "+", "1", "-", "1" };
		int expected = 1;
		int result = calcu.calc4(input1, middleAns, input);
		assertEquals(expected, result);
	}

	@Test
	public void calcuMultiply2() {
		int input1 = 2;
		int middleAns = 2;
		String[] input = { "1", "+", "1", "*", "2" };
		int expected = 4;
		int result = calcu.calc4(input1, middleAns, input);
		assertEquals(expected, result);
	}

	@Test
	public void calcudivide2() {
		int input1 = 2;
		int middleAns = 2;
		String[] input = { "1", "+", "1", "/", "2" };
		int expected = 0;
		int result = calcu.calc4(input1, middleAns, input);
		assertEquals(expected, result);
	}

	@Test
	public void calcudivision2() {
		int input1 = 2;
		int middleAns = 3;
		String[] input = { "2", "+", "1", "%", "2" };
		int expected = 1;
		int result = calcu.calc4(input1, middleAns, input);
		assertEquals(expected, result);
	}

	@Test
	public void calcuexpone2() {
		int input1 = 2;
		int middleAns = 2;
		String[] input = { "1", "+", "1", "^", "2" };
		int expected = 4;
		int result = calcu.calc4(input1, middleAns, input);
		assertEquals(expected, result);
	}

}
