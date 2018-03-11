package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Launbraun
 * @since 11.03.2018
 * @version 1.0
 * Тестируем методы класса Max
 *
 */

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstPlusSecond() {
        Max sum = new Max();
        int result = sum.summation(2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirstLessSecondLessThird() {
        Max maximum = new Max();
        int result = maximum.max(2, 3, 5);
        assertThat(result, is(5));
    }
}
