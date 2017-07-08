package ru.job4j.calculator;

/**
*Class Calculator - 2.3. Элементарный калькулятор.
*@author amiroshnichenko
*@since 25.05.2017
*/

public class Calculator {
    /**
    * Содержит результат.
    */
    private double result;

    /**
    * Метод складвает два числа.
    * @param first первый параметр.
    * @param second второй параметр.
    */
    public void add(double first, double second) {
        this.result = first + second;
    }
/**
    * Метод вычетает из первого числа второе число.
    * @param first первый параметр.
    * @param second второй параметр.
    */
    public void subtruct(double first, double second) {
	this.result = first - second;
    }
/**
    * Метод делит первое число на второе число.
    * @param first первый параметр.
    * @param second второй параметр.
    */
    public void div(double first, double second) {
	this.result = first / second;
    }
/**
    * Метод умножает два числа.
    * @param first первый параметр.
    * @param second второй параметр.
    */
    public void multiple(double first, double second) {
	this.result = first * second;
    }

    /**
    * Метод возвращает значение.
    * @return вычесленное значение.
    */
    public double getResult() {
        return this.result;
    }
}