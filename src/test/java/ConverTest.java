import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mkplproject.Convert;

/**
 
Unit test for simple App.*/
public class ConverTest {
    private Convert calculator;
    
    @Before
    public void setUp() {
        calculator = new Convert(23);
    }

    @Test
    public void testCelciusToKelvin() {
        assertEquals(calculator.toKelvin(), 296.15,0);
    }

    @Test
    public void testCelciusToFahrenheit() {
        assertEquals(calculator.toFahrenheit(), 55.0,0);
    }
}