package ru.job4j.loop;

/**
 * Программа вычисляющая факториал.
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 14.04.17.
 */

 public class Factorial {
     /**
	  * calc метод, вычисляющий факториал числа.
	  * @param n number.
	  * @return result.
	  */
	  public int calc(int n) {
	  int result = 1;
	  for (int count = 1; count <= n; count++) {
      result *= count;
      }
      return result;
	  }
 }