package ru.job4j.max;

/**
*Class Max - Задание 3.1. Максимум из двух чисел [#189]
*@author amiroshnichenko
*@since 25.05.2017
*/

public class Max {
	/**
	* Метод возвращает максимальное число из двух.
	* @param first первый параметр.
	* @param second второй параметр.
	* @return максимальное значение.
	*/
	public int max(int first, int second) {
        return ((first >= second) ? first : second);
    }
}