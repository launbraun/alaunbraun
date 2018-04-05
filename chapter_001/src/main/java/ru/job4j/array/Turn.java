package ru.job4j.array;

/**
 * Класс разворачивает массив наоборот
 * @author Alesksand Launbraun
 * @since 05.04.2018
 * @version 1.0
 */
public class Turn {
    /**
     * Метод возвращает развернутый массив
     * @param array - задаваемый массив
     */

    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - 1 - i] = j;
        }
        return array;
    }
}
