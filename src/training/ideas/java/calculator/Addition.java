package training.ideas.java.calculator;

/**
 * Created by idndee on 21-07-2014.
 */
public class Addition {


    public static double perform(double... doubleNumbers) {
        double integer_result = 0;
        for (double individualElement : doubleNumbers)
            integer_result += individualElement;
        return integer_result;
    }

   public static int perform(int[] integerNumber) {
        int integer_result = 0;
        int counter = 0;
        for (int individualElement : integerNumber)
            integer_result += individualElement;
        return integer_result;
    }


    /*public static int convert_Double_To_Int(double double_number) {
        return (int) double_number;
    }*/
}


