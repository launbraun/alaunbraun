package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Launbraun
 * @since 05.04.2018
 * @version 1.0
 * Тестируем методы класса FindLoop
 *
 */
public class FindLoopTest {

    @Test
    public void whenElementExist() {
        FindLoop loop = new FindLoop();
        int rst = loop.indexOf(new int[]{1, 3, 5, 7}, 5);
        assertThat(rst, is(2));
    }

    @Test
    public void whenElementNotExist() {
        FindLoop loop = new FindLoop();
        int rst = loop.indexOf(new int[]{1, 3, 5, 7}, 4);
        assertThat(rst, is(-1));
    }
}
