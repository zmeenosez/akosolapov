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
	 * Test max.
	 */
	 @Test
    public void whenmaxMaxThreeMoreOneThenThree() {
		Max max1 = new Max();
		max1.max(3D, 1D);
		int maxMax = max1.maxMax;
		int expected = 3D;
	assertThat(maxMax, is(expected));
    }
}