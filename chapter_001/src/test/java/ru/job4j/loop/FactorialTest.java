package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест, проверяющий факториал для числа.
 *
 * @author Aleksey Kosolapov.
 * @since 14.04.17.
 * @version 0.1.
 */

public class FactorialTest {
	/**
	 * Тест , проверяющий, что факториал для числа 5 равен 120.
	 */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
		Factorial factorial = new Factorial();
		int сalculateFactorial = factorial.calc(5);
		int expected = 120;
	    assertThat(сalculateFactorial, is(expected));
    }

	/**
	 * Тест , проверяющий, что факториал для числа 0 равен 1.
	 */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
		Factorial factorial = new Factorial();
		int сalculateFactorial = factorial.calc(0);
		int expected = 1;
	    assertThat(сalculateFactorial, is(expected));
    }
}

