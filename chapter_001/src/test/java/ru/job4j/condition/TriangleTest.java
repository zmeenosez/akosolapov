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
    public void whenResultCoordinatThenDoubleExcept() {
		Point a = new Point(5, 6);
        Point b = new Point(3, 8);
        Point c = new Point(7, 3);
		Triangle coordinat = new Triangle(a, b, c);
		double result = coordinat.area();
		double except = 1.138;
		assertThat(result, closeTo(except, 1.138 + -0.002));
	}
 }


