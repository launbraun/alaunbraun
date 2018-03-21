package ru.job4j.array;

/**
 * Класс заполняет массив числами возведенными в квадрат
 * @author Alesksand Launbraun
 * @since 20.03.2018
 * @version 1.0
 */

public class Square {

    /**
     * Метод рисует пирамиду с заданной высотой
     * @param bound - количество элементов массива
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int k = 1;
        for (int i = 0; i < bound; i++) {
            rst[i] = k * k;
            k++;
        }
        return rst;
    }
}
