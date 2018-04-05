package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Launbraun
 * @since 05.04.2018
 * @version 1.0
 * Тестируем метод класса Matrix
 *
 */
public class MatrixTest {
    @Test
    public void matrixTest() {
        Matrix check = new Matrix();
        int[][] result = check.multiple(4);
        int[][] expect = new int[][]{{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};
        assertThat(result, Matchers.is(expect));
    }
}
