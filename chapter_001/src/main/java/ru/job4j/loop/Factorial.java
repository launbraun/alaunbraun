package ru.job4j.loop;

/**
 * Класс считает факториал числа
 *
 * @author Alesksand Launbraun
 * @since 13.03.2018
 * @version 1.0
 */
public class Factorial {

    /**
     * Вывод строки в консоль
     * @param n - число факториал которого производится вычисление
     */
    public int calc(int n) {
        int i = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int j = 1; j <= n; j++) {
                i *= j;
            }
        }
        return i;
    }
}
