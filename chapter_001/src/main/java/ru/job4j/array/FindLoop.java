package ru.job4j.array;

/**
 * Класс ищет задаваемый элемент в массиве и при обнаружении возвращает индекс искомого элемента
 * @author Alesksand Launbraun
 * @since 05.04.2018
 * @version 1.0
 */
public class FindLoop {

    /**
     * Метод возвращает индекс искомого элемента
     * @param data - задаваемый массив
     * @param el   - искомое число в массиве
     */

    public int indexOf(int[] data, int el) {

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
