package training.ideas.java.fibonacciseries;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndee on 05-08-2014.
 */
public class FibonacciSeriesTest {

    @Test
    public void positiveFibonacciSeries(){
        int expectedList []={0,1,1,2,3,5,8};
        Assert.assertArrayEquals(expectedList,FibonacciSeries.fibonacciLoop(7));

         }

 /*   @Test
    public void zeroFibonacciNumber(){
        int expectedList[]={0};
        Assert.assertArrayEquals(expectedList,FibonacciSeries.fibonacciLoop(0));
    }

    @Test
    public void singleFibonacciNumber(){
        int expectedList[]={0,1};
        Assert.assertArrayEquals(expectedList,FibonacciSeries.fibonacciLoop(0));
    }*/
}
