package ru.job4j.calculator;

/**
 * Класс Калькулирует =)
 *
 * @author Alesksand Launbraun
 * @since 10.03.2018
 * @version 1.0
 */


public class Calculator {
	private double result;

	/**
	 * Method add - производит суммирование
	 * @param first - первое число
	 * @param second - второе число
	 */

	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	 * Method subtract - производит вычитание
	 * @param first - первое число
	 * @param second - второе число
	 */

	public void subtract(double first, double second) {
		this.result = first - second;

	}

	/**
	 * Method div - производит деление
	 * @param first - первое число
	 * @param second - второе число
	 */

	public void div(double first, double second) {
		this.result = first / second;
	}

	/**
	 * Method multiple - производит умножение
	 * @param first - первое число
	 * @param second - второе число
	 */

	public void multiple(double first, double second) {
		this.result = first * second;
	}

	/**
	 * Method getResult - Возвращает полученный результат
	 * @return Возвращает полученный результат
	 */

	public double getResult() {
		return this.result;
	}
}


