package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * Класс Калькулирует =)
 *
 * @author Alesksand Launbraun
 * @since 06.03.2018
 * @version 1.0
 */

public class CalculateTest {
    /**
     * Test add.
     */
    @Test

    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Alesksand Launbraun";
        String expect = "Echo, echo, echo : Alesksand Launbraun";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}