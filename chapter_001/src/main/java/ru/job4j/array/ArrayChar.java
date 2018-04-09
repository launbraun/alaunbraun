package ru.job4j.array;

/**
 * Класс сравнивает заданное слово и префикс на идентичность
 * @author Alesksand Launbraun
 * @since 09.04.2018
 * @version 1.0
 */

public class ArrayChar {

    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
            }
        }
        return result;
    }
}
