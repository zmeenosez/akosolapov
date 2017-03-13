package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Aleksey Kosolapov.
 * @since 12.03.17.
 * @version 0.1.
 */

public class CalculatorTest {
	/**
	 * Test add.
	 */
	 @Test
    public void whenAddOnePlusOneThenTwo() { //сложение
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	 * Test substruct.
	 */
	 @Test
    public void whenAddOnePlusOneThenTwo() { //вычитание
        Calculator calc = new Calculator();
        calc.substruct(9D, 2D);
        double result = calc.getResult();
        double expected = 7D;
        assertThat(result, is(expected));
    }
	/**
	 * Test div.
	 */
	 @Test
    public void whenAddOnePlusOneThenTwo() { //деление
        Calculator calc = new Calculator();
        calc.div(8D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
	/**
	 * Test multiple.
	 */
    @Test
    public void whenAddOnePlusOneThenTwo() { //умножение
        Calculator calc = new Calculator();
        calc.multiple(3D, 4D);
        double result = calc.getResult();
        double expected = 12D;
        assertThat(result, is(expected));
    }
}