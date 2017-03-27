package ru.job4j.condition;

/**
 * Вычисление площади треугольника.
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 23.03.17.
 */
 public class Triangle {
 private Point a;
 private Point b;
 private Point c;

    public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
    }
	/**
     *вычисление сторон треугольника.
     */
	double sideLength(Point coordinat) {
    return Math.sqrt ( (Math.pow( (point.x - this.x),2))+(Math.pow( (point.y - this.y),2)));
    }
   /**
	* Calculate the triangle area.
	* @param a number.
	* @param b number.
	* @param c number.
	*
	*/
    public double area() {
    double absideLength = a.sideLength(b);//сторона от a точки до b точки.
    double bcsideLength = b.sideLength(c);//сторона от b точки до c точки.
    double casideLength = c.sideLength(a);//сторона от c точки до a точки.
	/** определяем условие существования треугольника.
     */
    if ((absideLength + bcsideLength) > casideLength ||
	(absideLength + casideLength) > bcsideLength ||
	(bcsideLengthb + casideLength) > absideLength) {
		/**
		 * вычисляем полупериметр треугольника.
		 */
        double p = ((absideLength + bcsideLength + casideLength) / 2);
		/**
		 * вычисляем площадь треугольника.
		 */
		double s = (Math.sqrt(p * (p - absideLength) * (p - bcsideLength) * (p - casideLength)));
        }
        else { double s = 0; //треугольник не существует.
        }
    return s;
	}
 }





