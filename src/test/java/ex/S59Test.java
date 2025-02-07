package ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S59Test {

	@Test
	void sumPositive() {
		long actual = S59.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumNegPos() {
		long actual = S59.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S59.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
		long actual = S59.sum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumPositive() {
		long actual = S59.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S59.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S59.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S59.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S59.factorial(4);

		assertThat(actual, is(24L));
	}

	@Test
	void factorialNegative() {
		long actual = S59.factorial(-4);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacci7() {
		long actual = S59.fibonacci(7);
		assertThat(actual, is(7L));
	}

	@Test
	void multiplicationTable3() {
		int[][] actual = S59.multiplicationTable(3);

		assertThat(actual, is(9L));
	}
}
