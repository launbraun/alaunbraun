package ru.job4j.array;

/**
 * Класс строит таблицу умножения
 * @author Alesksand Launbraun
 * @since 05.04.2018
 * @version 1.0
 */

public class Matrix {

    /**
     * Метод строит матрицу размером size и заполняет таблицей умножения
     * @param size - размер матрицы
     */


    public int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}
