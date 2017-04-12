package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапазоне.
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 10.04.17.
 */

 public class Counter {
	 /**
	  * add метод, производящий сложение.
	  * @param start number.
	  * @param finish number.
	  * @return sum.
	  */
	public int add(int start, int finish) {
	int sum = 0;
	for (int count = start; count <= finish; count++) {
	if ((count % 2) == 0); {
	 sum += count;
	} else {
	   sum != count;
	}
	}
	return sum;
	}
 }