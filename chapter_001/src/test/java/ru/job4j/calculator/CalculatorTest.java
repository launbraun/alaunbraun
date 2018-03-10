package ru.job4j.calculator;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenFirstSubSecond() {
        Calculator calc = new Calculator();
        calc.subtract(6D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenFirstDivSecond() {
        Calculator calc = new Calculator();
        calc.div(3D, 2D);
        double result = calc.getResult();
        double expected = 1.5D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenFirstMultSecond() {
        Calculator calc = new Calculator();
        calc.multiple(1.5D, 3D);
        double result = calc.getResult();
        double expected = 4.5D;
        assertThat(result, is(expected));
    }

}