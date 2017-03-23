package ru.job4j.condition;

/**
 * ������� 3.2 "��������� �����".
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 19.03.17.
 */
 public class Point {
   /**
	* ���� � ��������� x.
	*/
   private int x;
   /**
	* ���� � ��������� y.
	*/
   private int y;
   /**
	* �����������, �������� ���������� �����.
	* @param x number.
	* @param y number.
	*/
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
   /**
	* �����, ������������ �������� x.
	* @return this.x.
	*/
  public int getX() {
      return this.x;
  }
   /**
	* �����, ������������ �������� y.
	* @return this.y.
	*/
  public int getY() {
     return this.y;
  }
   /**
	* �����,������������ ��������� �� ����� �� ���� �������.
	* @param a number.
	* @param b number.
	* @return true.
	*/
  public boolean is(int a, int b) {
	   return y == a * x + b;
  }
}