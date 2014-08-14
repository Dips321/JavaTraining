package training.ideas.java.fizzbuzz;

import org.junit.Assert;
import java.lang.String;
import org.junit.Test;

/**
 * Created by idndee on 08-08-2014.
 */
public class FrizzBuzzTest {
    @Test
    public void FrizzBuzz(){
        String actualList []={"1","3","5","6","7","10","15"};
        String expectedList[]={"1","Frizz","Buzz","Frizz","7","Buzz","FrizzBuzz"};
        Assert.assertArrayEquals(expectedList,FrizzBuzz.performFrizzBuzz(actualList));
    }

}

