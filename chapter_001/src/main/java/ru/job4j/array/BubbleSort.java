package ru.job4j.array;

/**
 * Класс сортирует массив методом Пузырёк
 * @author Alesksand Launbraun
 * @since 05.04.2018
 * @version 1.0
 */

public class BubbleSort {

    /**
     * Метод сортирует массив методом Пузырёк
     * @param array - задаваемый массив
     */

    public int[] sort(int[] array) {
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
            }
        }
        return array;
    }
}
