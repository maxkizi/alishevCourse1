package UnitTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MyMathTest {

    @Test
    public void dividing(){
        Assert.assertEquals(5, MyMath.divide(10, 2), 1e-9);
    }

    @Test (expected = ArithmeticException.class)
    public void dividingShouldThrowsException(){
        MyMath.divide(10, 0);
    }

}