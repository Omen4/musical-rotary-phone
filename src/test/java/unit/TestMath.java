package unit;

import com.example.mns_architecture_logicielle.maths.Maths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class TestMath {

    private Maths math;

    @Before
    public void setUp() {
        math = new Maths();
    }

    @Test
    public void testMathRegularInt(){
        Assert.assertEquals( 30, math.multiplication(5,6));
        Assert.assertEquals( 6, math.multiplication(3,2));
    }

    @Test
    public void testMathMultiplyBy0(){
        Assert.assertEquals( 0, math.multiplication(5,0));
        Assert.assertEquals( 0, math.multiplication(0,6));
    }

    @Test
    public void testMathMultiplyByNeg(){
        Assert.assertEquals( -6, math.multiplication(-3,2));
        Assert.assertEquals( 12, math.multiplication(-4,-3));
    }
}
