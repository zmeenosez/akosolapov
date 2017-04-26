package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест, проверяющий построение пирамиды в псевдографике.
 *
 * @author Aleksey Kosolapov.
 * @since 20.04.17.
 * @version 0.1.
 */

public class PaintTest {
	/**
	 * Тест , проверяющий формирование пирамиды для высоты 2.
	 */
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
    /**
	 * Тест , проверяющий формирование пирамиды для высоты 3.
	 */
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
       //напишите здесь тест, проверяющий формирование пирамиды для высоты 3.
	    Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}

