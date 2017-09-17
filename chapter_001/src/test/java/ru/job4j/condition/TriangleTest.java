package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 *Test Triangle - Тест Задание 3.3. Вычисление площади треугольника [#9461]
 *@author amiroshnichenko
 *@since 25.05.2017
 */
public class TriangleTest {
    /**
     * Тест.
     */
    @Test
    /**
     * Когда площадь треугольника считается по трём точкам.
     */
    public void whenAreaSetThreePointsThenTriangleArea() {
        // создаем три объекта класса Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(4, 0);
        // Создаем объект треугольник и передаем в него объекты точек.
        Triangle triangle = new Triangle(a, b, c);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 8D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}
