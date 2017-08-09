package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test Point - Тест Задание 3.2. Положение точки [#188]
*@author amiroshnichenko
*@since 25.05.2017
*/
public class PointTest {
	/**
    * Тест.
    */
	@Test
	/**
    * Когда точка находится на прямой y(x)=a*x+b.
    */
    public void whenPointIsOnLine() {
       Point point = new Point(1, 4);
	   boolean result = point.is(2, 2);
       assertThat(result, is(true));
    }
	/**
    * Когда точка НЕ находится на прямой y(x)=a*x+b.
    */
    public void whenPointIsNotOnLine() {
       Point point = new Point(2, 2);
	   boolean result = point.is(2, 2);
       assertThat(result, is(false));
    }
}