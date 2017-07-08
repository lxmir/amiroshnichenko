package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test Calculator - Тест. 2.3. Элементарный калькулятор.
*@author amiroshnichenko
*@since 25.05.2017
*/
public class CalculatorTest {
    /**
    * Тест.
    */
    @Test
    /**
    * Сложение двух чисел.
    */
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
    * Вычетание двух чисел.
    */
    public void whenSubtructTenMinusOneThenNine() {
        Calculator calc = new Calculator();
        calc.subtruct(10D, 1D);
        double result = calc.getResult();
        double expected = 9D;
        assertThat(result, is(expected));
    }
    /**
    * Деление двух чисел.
    */
    public void whenDivTenDividedTwoThenFive() {
        Calculator calc = new Calculator();
        calc.subtruct(10D, 2D);
        double result = calc.getResult();
        double expected = 5D;
        assertThat(result, is(expected));
    }
    /**
    * Умножение двух чисел.
    */
    public void whenMultipleFiveTimesTwoThenTen() {
        Calculator calc = new Calculator();
        calc.subtruct(5D, 2D);
        double result = calc.getResult();
        double expected = 10D;
        assertThat(result, is(expected));
    }
}