package UnitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vector2DTest {

    public final double EPS = 1e-9;
    private Vector2D v;

    @Before
    public  void createVector(){

         v = new  Vector2D();
    }


    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0, v.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){

        Assert.assertTrue(v.getX()==0);
    }

    @Test
    public void newVectorShouldHaveZeroY(){

        Assert.assertTrue(v.getY()==0);
    }

}