// import static org.junit.Assert.assertEquals;

// import org.junit.Test;

// import mkplproject.Convert;

// public class ConvertTest {

//     @Test
//     public void testConvertToKelvin(){
//         Convert toKelvin = new Convert(23);

//         assertEquals(toKelvin.toKelvin(),296.15);
//     }


// }


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mkplproject.Convert;

/**
 
Unit test for simple App.*/
public class AppTest {
    private Convert calculator;
    
    @Before
    public void setUp() {
        calculator = new Convert(23);
    }

    @Test
    public void testAdd() {
        double value = calculator.toKelvin();

        assertEquals(value, 296.15,0);
    }
}