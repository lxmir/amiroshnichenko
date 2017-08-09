package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test Max - Тест 3.1. Максимум из двух чисел [#189]
*@author amiroshnichenko
*@since 25.05.2017
*/
public class MaxTest {
	/**
    * Тест.
    */
	@Test
	/**
    * Когда первое число меньше второго.
    */
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
	/**
    * Когда второе число меньше первого.
    */
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 2);
        assertThat(result, is(3));
    }
}