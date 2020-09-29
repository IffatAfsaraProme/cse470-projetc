package restaurantsystem.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculateTest {
    @Test
    public void test(){
        calculate test = new calculate();
        int result;
        result = test.addNumber(5,2);
        assertEquals(7,result);

    }
    @Test
    public void test1(){
        calculate test = new calculate();
        int result = test.removeNumber(5,2);
        assertEquals(3,result);
    }
    @Test
    public void testString(){
        calculate test1 = new calculate();
        String result = test1.addString("cheese","pasta");
        assertEquals("cheesepasta",result);
    }
    @Test
    public void testVat() {
        calculate test2 = new calculate();
        double result = test2.vat(500.0);
        assertEquals(75.0, result);
    }




}