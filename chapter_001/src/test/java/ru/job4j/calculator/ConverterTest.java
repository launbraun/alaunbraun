package ru.job4j.calculator;

//
//Тест конвертора валют
//
//@author Alesksand Launbraun
//* @since 10.03.2018
//* @version 1.0
//

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void testEuroToRuble() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(10);
        assertThat(result, is(700));
    }
    @Test
    public void testDollarToRuble() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(10);
        assertThat(result, is(600));
    }
}