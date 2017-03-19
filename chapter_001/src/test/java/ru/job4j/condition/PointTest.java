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
    public void whenResultTwotoFourtoFiveThenThirteen() {
		Point coordinat = new Point();
		coordinat.point(2, 13);
		coordinat.boolean is(4, 5);
		int result = y1;
		int expected = 13;
		assertThat(result, is(expected));
	}
 }