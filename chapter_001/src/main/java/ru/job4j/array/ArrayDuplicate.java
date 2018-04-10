package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс удаляет дублирующие слова в массиве
 * @author Alesksand Launbraun
 * @since 10.04.2018
 * @version 1.0
 */

public class ArrayDuplicate {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param array массив слов.
     * @return массив без дублирующих слов
     */

    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
