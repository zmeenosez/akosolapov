package ru.job4j.condition;

/**
 * Задание 3.2 "Положение точки".
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 19.03.17.
 */
 public class Point {
   /**
	* Поле с значением x.
	*/
   private int x;
   /**
	* Поле с значением y.
	*/
   private int y;
   /**
	* Конструктор, задающий координаты точки.
	* @param x number.
	* @param y number.
	*/
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
   /**
	* Метод, возвращающий значения x.
	* @return this.x.
	*/
  public int getX() {
      return this.x;
  }
   /**
	* Метод, возвращающий значения y.
	* @return this.y.
	*/
  public int getY() {
     return this.y;
  }
   /**
	* Метод,определяющий находится ли точка на этой фукнции.
	* @param a number.
	* @param b number.
	* @return true.
	*/
  public boolean is(int a, int b) {
	   return y == a * x + b;
  }
}