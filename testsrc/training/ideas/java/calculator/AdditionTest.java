package training.ideas.java.calculator;


import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idndee on 21-07-2014.
 */
public class AdditionTest {

    @Test
    public void add_Two_Integer() {
        Assert.assertEquals(5,Addition.perform(1,1,1,1,1),0.0);

    }

    @Test
    public void add_Two_Double() {
        Assert.assertEquals(123.45 + 123.45,Addition.perform(123.45,123.45),0.0);

    }

     @Test
    public void add_Int_Double(){
        Assert.assertEquals(1+123.45,Addition.perform(1,123.45),0.0);

    }

    @Test
    public void given_two_numbers_minus_6_and_minus_8_should_display_minus_14(){
        Assert.assertEquals(-6-8, Addition.perform(-6,-8),0.0);
    }

    @Test
    public void given_two_numbers_add_6_and_minus_8_should_display_minus_2(){
        Assert.assertEquals(-2,Addition.perform(6,-8),0.0);
    }

    @Test
    public void add_numbers_in_an_integer_array(){
        int [] array={255,255,1,9,8,7,10,12};
        Assert.assertEquals(255+255+1+9+8+7+10+12, Addition.perform(array),0.0);

    }

    @Test
    public void add_double_values_in_an_array(){
        double [] array={123.23,123.23,123.23,56,98,78};
        /*Assert.assertEquals(123.23+123.23+123.23+56+98+78,Addition.perform(array));*/
        Assert.assertEquals(123.23+123.23+123.23+56+98+78,Addition.perform(array),0.0);
    }

    @Test
    public void add_double_and_integer_values_in_an_array(){
        double [] array={1,120.22,1,232.23,245.65,789.23,12.12};
        Assert.assertEquals(1+120.22+1+232.23+245.65+789.23+12.12,Addition.perform(array),0.0);
    }

    @Test
    public void add_integer_without_array(){
        Assert.assertEquals(1+2+3+4+5+6,Addition.perform(1,2,3,4,5,6),0.0);
    }


   }




