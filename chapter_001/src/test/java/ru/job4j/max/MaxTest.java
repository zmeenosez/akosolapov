package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Aleksey Kosolapov.
 * @since 15.03.17.
 * @version 0.1.
 */

public class MaxTest {
	/**
	 * Test maximum.
	 */
	 @Test
    public void whenMaximumThreeMoreOneThenThree() {
		Max max1 = new Max();
		int maximum = max1.max(3, 1);
		int expected = 3;
	    assertThat(maximum, is(expected));
    }
}