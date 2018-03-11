package ru.job4j.loop;

/**
 * Класс суммирует четные числа
 *
 * @author Alesksand Launbraun
 * @since 11.03.2018
 * @version 1.0
 */

public class Counter {

    /**
     * Вывод строки в консоль
     * @param start - начальное значение ряда
     * @param finish - конечное значение ряда
     */
    public static int add(int start, int finish) {
        int sum = 0;
        for (;  start <= finish; start++) {
            if (start % 2 == 0) {
                sum += start;
            }
        }
        return sum;
    }
}
