package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
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
    public void whenresultTwotoOnetoTwotwentyfourhundredthsThenZeroninetyninehundredths() {
		Point a = new Point(2, 3);
        Point b = new Point(4, 3);
        Point c = new Point(4, 4);
		Triangle coordinat = new Triangle(a, b, c);
		double result = coordinat.area(2, 1, 2.24);
		double except = 0.99;
		assertThat(result, closeTo(except, 0.99));
	}
 }


