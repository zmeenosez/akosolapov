package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест вычисления площади треугольника.
 *
 * @author Aleksey Kosolapov.
 * @since 23.03.17.
 * @version 0.1.
 */
 
 public class TriangleTest {
	/**
	 * Test calculate the triangle.
	 */
	 @Test
    public void whenresultTwotoOnetoTwotwenty-fourhundredthsThenZeroninety-ninehundredths () {
		Triangle coordinat = new Triangle( 2,3; 4,3; 4,4);
		double result = coordinat.area( 2; 1; 2,24 );
		double except = 0,9999;
		assertThat(result, closeTo(except, 0.9999));
	}
 }
 
 
