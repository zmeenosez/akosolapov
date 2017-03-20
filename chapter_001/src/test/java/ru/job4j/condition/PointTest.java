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
    public void whenResultTwotoTwoThenFour() {
		Point coordinat = new Point(1, 1);
		coordinat = point.is(2, 2);
		boolean result = point.is(2, 2);
		expected = 4;
		assertThat(result, is(expected));
	}
 }