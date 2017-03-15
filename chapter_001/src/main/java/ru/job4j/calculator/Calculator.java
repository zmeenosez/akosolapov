package ru.job4j.calculator;

/**
 * Элементарный калькулятор.
 *
 * @author Aleksey Kosolapov.
 * @version 0.1.
 * @since 12.03.17.
 */

public class Calculator {
	/**
	* объявление внутреннего поля result.
	*/
    private double result;
    /**
	* add метод, производящий сложение.
	* @param first first number.
    * @param second second number.
	*/
	public void add(double first, double second) {
	    this.result = first + second;
    }
	/**
	* substruct метод, производящий вычитание.
	* @param first first number.
    * @param second second number.
	*/
    public void substruct(double first, double second) {
        this.result = first - second;
	}
	/**
	* div метод, производящий деление.
	* @param first first number.
    * @param second second number.
	*/
	public void div(double first, double second) {
        this.result = first / second;
	}
	/**
	* multiple метод, производящий умножение.
	* @param first first number.
    * @param second second number.
	*/
	public void multiple(double first, double second) {
        this.result = first * second;
	}
	/**
	* getResult() метод, возвращающий значение result.
	* @return result.
	*/
	public double getResult() {
		return this.result;
    }
}

