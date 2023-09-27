package ru.converter;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
//        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert360RblThen3Dot5Dollar() {
//        float in = 360;
//        float expected = 3.5f;
//        float out = Converter.rubleToEuro(in);
//        float eps = 0.0001f;
//        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert1EuroThen100Dot0Rbl() {
    }

    @Test
    void whenConvert2DollarThen180Dot0Rbl() {
    }
}