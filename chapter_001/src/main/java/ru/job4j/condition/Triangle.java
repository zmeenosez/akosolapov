package ru.job4j.condition;

/**
 * Вычисление площади треугольника.
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 23.03.17.
 */
 public class Triangle {
 /**
  * Поле с значением точки a.
  */
 private Point a;
 /**
  * Поле с значением точки b.
  */
 private Point b;
 /**
  * Поле с значением точки c.
  */
 private Point c;
   /**
    * Метод обращающийся к rлассу Point c координатами точек и присваивающий полям значения.
	* @param a number.
	* @param b number.
	* @param c number.
	*/
    public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
    }
	/**
     * вычисление сторон треугольника.
	 * @return sideLength.
	 * @param coordinat number.
     */
	double sideLength(Point coordinat) {
    return Math.sqrt((Math.pow((coordinat.x - this.x), 2)) + (Math.pow((coordinat.y - this.y), 2)));
    }
   /**
	* Calculate the triangle area.
	* @return s.
	*/
    public double area() {
    double absideLength = a.sideLength(b); //сторона от a точки до b точки.
    double bcsideLength = b.sideLength(c); //сторона от b точки до c точки.
    double casideLength = c.sideLength(a); //сторона от c точки до a точки.
	/** определяем условие существования треугольника.
     */
    if ((absideLength + bcsideLength) > casideLength
	|| (absideLength + casideLength) > bcsideLength
	|| (bcsideLengthb + casideLength) > absideLength) {
		/**
		 * вычисляем полупериметр треугольника.
		 */
        double p = ((absideLength + bcsideLength + casideLength) / 2);
		/**
		 * вычисляем площадь треугольника.
		 */
		double s = (Math.sqrt(p * (p - absideLength) * (p - bcsideLength) * (p - casideLength)));
        } else {
		double s = 0; //треугольник не существует.
        }
        return s;
	}
 }





