package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Launbraun
 * @since 11.03.2018
 * @version 1.0
 * Тестируем методы класса Counter
 *
 */

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter sum = new Counter();
        int result = sum.add(0, 10);
        assertThat(result, is(30));
    }
}