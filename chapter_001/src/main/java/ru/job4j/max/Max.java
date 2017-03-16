package ru.job4j.max;

/**
 * Определение максимума из двух чисел.
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 15.03.17.
 */

 public class Max {
	 
	 private int maxMax;
	 /**
	  * @param first first number.
	  * @param second second number.
	  * @return number.
	  */
	 public void int max(int first, int second); {
	 int maxMax = first >= second ? first : second;
	 }
	 /**
	  * метод, возвращающий значение.
	  * @return number.
	  */
	 public int maxResult() {
	 return this.maxMax;
	 }
 }