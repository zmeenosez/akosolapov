package ru.job4j.max;

/**
 * Maximum number.
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 02.04.17.
 */

 public class Max {
	 /**
	  * @param first first number.
	  * @param second second number.
	  * @return maximum number.
	  */
	 public int max(int first, int second) {
	 int maximum = first >= second ? first : second;
	 return maximum;
	 }
	 /**
	  * Вычисление максимума из трёх чисел.
	  * @param first number.
	  * @param second number.
	  * @param third number.
	  * @return maxMax number.
	  */
	 public int max(int first, int second, int third) {
	 int maxMax = Math.max((this.max(first, second)), third);
	 return maxMax;
	 }
}