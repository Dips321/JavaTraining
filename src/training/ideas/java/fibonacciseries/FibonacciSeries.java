package training.ideas.java.fibonacciseries;

/**
 * Created by idndee on 05-08-2014.
 */
public class FibonacciSeries {

    public static int[] fibonacciLoop(int n) {
        int fibonacci[] = new int[n];

            {

                fibonacci[0] = 0;
                fibonacci[1] = 1;

                for (int i = 2; i < fibonacci.length; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }

                return fibonacci;
            }
        }
    }
