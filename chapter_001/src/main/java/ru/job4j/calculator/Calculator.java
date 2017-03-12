package ru.job4j.calculator;

/**
 * класс Calculator. Решение задачи урока 2.3 части 001. Создание элементарного калькулятора.
 * @author Aleksey Kosolapov.
 * @since 12.03.17.
 * @version 0.1.
 */

public class Calculator {
    private double result;
    
    public void add(double first, double second) {
        this.result = first + second;
    }
    public void substruct(double first, double second) {
        this.result = first - second;
	}
	public void div(double first, double second) {
        this.result = first / second;
	]
	public void multiple(double first, double second) {
        this.result = first * second;
	}
	public double getResult() {
        return this.result;
    }	
}	

