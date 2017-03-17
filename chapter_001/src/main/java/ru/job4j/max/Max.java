package ru.job4j.max;

/**
 * Maximum number.
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 15.03.17.
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
}