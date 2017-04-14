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
	  * @return сalculateFactorial.
	  */
	  public int calc(int n) {
	  int сalculateFactorial = 0;
	  for (int count = 1; count <= n; count++) {
      сalculateFactorial *= count;
      }
      return сalculateFactorial;
	  }
 }