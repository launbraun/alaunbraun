package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Launbraun
 * @since 05.04.2018
 * @version 1.0
 * Тестируем методы класса BubbleSort
 *
 */
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort check = new BubbleSort();
        int[] input = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = check.sort(input);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, Matchers.is(expect));
    }
}