package training.ideas.java.sort;

/**
 * Created by idndee on 31-07-2014.
 */
public class SelectionSort {

    private enum sortOrder {ASC, DESC}
    ;


    public static double[] selectionSort(double numbers[], String order) {
        double temp;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < (numbers.length); j++) {
                if (order.equalsIgnoreCase("asc") ? numbers[i] > numbers[j] : numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }
}



