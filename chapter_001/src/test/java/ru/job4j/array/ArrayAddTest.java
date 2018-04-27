package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Launbraun
 * @since 05.04.2018
 * @version 1.0
 * Тестируем методы класса ArrayAdd
 *
 */


public class ArrayAddTest {
    @Test
    public void whenTwoArraysGluingInOne() {
        ArrayAdd check = new ArrayAdd();
        int[] a = new int[]{1, 8, 0, 5};
        int[] b = new int[]{5, 4, 2, 3, 1, 7};
        int[] result = check.gluing(a, b);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, Matchers.is(expect));
    }
}
