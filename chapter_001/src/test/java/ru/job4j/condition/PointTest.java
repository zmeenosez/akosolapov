package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Aleksey Kosolapov.
 * @since 19.03.17.
 * @version 0.1.
 */
 public class PointTest {
	/**
	 * Test coordinat.
	 */
	 @Test
    public void whenResultOnetoTwoThenTrue() {
		Point coordinat = new Point(2, 4);
		boolean result = coordinat.is(1, 2);
		boolean expected = true;
		assertThat(result, is(expected));
	}
 }