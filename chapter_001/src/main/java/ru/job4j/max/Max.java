package ru.job4j.max;

/**
 * Нахождение максимального числа
 *
 * @author Alesksand Launbraun
 * @since 11.03.2018
 * @version 1.0
 */

public class Max {

    /**
     * Метод вычисляет и возвращает макскимальное число
     * @param first - первое значение
     * @param second - второе значение
     * @return максимальное значение
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    /**
     * Метод суммируем два значения
     * @param first - первое значение
     * @param second - второе значение
     * @return Сумму двух значений
     */
    public int summation(int first, int second) {
        return first + second;
    }

    /**
     * Метод вычисляет и возвращает максимальное из трех значений
     * @param first - первое значение
     * @param second - второе значение
     * @param third - третье значение
     * @return Максимальное значение
     */
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = this.max(temp, third);
        return temp;
    }
}
