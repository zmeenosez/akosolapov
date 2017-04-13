package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Aleksey Kosolapov.
 * @since 10.04.17.
 * @version 0.1.
 */

public class CounterTest {
	/**
	 * Тест подсчета суммы чётных чисел в диапазоне.
	 */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
    //тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
		Counter counter = new Counter();
		int sum = counter.add(1, 10);
		int expected = 30;
	    assertThat(sum, is(expected));
    }
}

