package ru.job4j.condition;

/**
*Class Point - Задание 3.2. Положение точки [#188]
*@author amiroshnichenko
*@since 25.05.2017
*/

public class Point {
	/**
	* Поле класса.
	* @param x координата на оси X.
	*/
	private int x;
	/**
	* Поле класса.
	* @param y координата на оси Y.
	*/
	private int y;
	/**
	* Метод описывает точку в системе координат.
	* @param x координата на оси X.
	* @param y координата на оси Y.
	*/
	public Point(int x, int y) {
        this.x = x;
		this.y = y;
    }
	/**
	* Метод получает точку на оси X.
	* @return координата на оси X.
	*/
	public int getX() {
		return this.x;
	}
	/**
	* Метод получает точку на оси Y.
	* @return координата на оси Y.
	*/
	public int getY() {
		return this.y;
	}
	/**
	* Метод определяет находится ли точка на прямой y(x)=a*x+b.
	* @param a первый параметр.
	* @param b второй параметр.
	* @return истина или ложь.
	*/
	public boolean is(int a, int b) {
		return y == a * x + b;
	}
}