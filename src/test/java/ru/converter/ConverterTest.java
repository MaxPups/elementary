package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
    @Test
    void whenConvert320RblThen3Dot2Euro() {
        float in = 320;
        float expected = 3.2f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }


    @Test
    void whenConvert360RblThen4Dollar() {
        float in = 360;
        float expected = 4f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
    @Test
    void whenConvert50RblThen3Dot5Dollar() {
        float in = 50;
        float expected = 0.5555555f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }



    @Test
    void whenConvert1EuroThen100Dot0Rbl() {
        float in = 1;
        float expected = 100f;
        float out = Converter.euroToRubles(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
    @Test
    void whenConvert5EuroThen500Dot0Rbl() {
        float in = 5;
        float expected = 500;
        float out = Converter.euroToRubles(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }



    @Test
    void whenConvert2DollarThen180Dot0Rbl() {
        float in = 2;
        float expected = 180f;
        float out = Converter.dollarToRubles(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }



    @Test
    void whenConvert4DollarThen360Dot0Rbl() {
        float in = 4;
        float expected = 360f;
        float out = Converter.dollarToRubles(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}