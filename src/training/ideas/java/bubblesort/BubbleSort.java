package training.ideas.java.bubblesort;

/**
 * Created by idndee on 14-08-2014.
 */
public class BubbleSort {

        public static double[] bubbleSort(double[] actualArraySort, String order) {
            double temp=0;
            for (int i = 0; i < actualArraySort.length; i++) {
                for (int j = 1; j <(actualArraySort.length-1) ; j++) {
                    if(order.equalsIgnoreCase("asc") ? actualArraySort[i] > actualArraySort[j] : actualArraySort[i] < actualArraySort[j])
                        temp=actualArraySort[j-1];
                    actualArraySort[j-1]=actualArraySort[j];
                    actualArraySort[j]=temp;

                }

            }


            return actualArraySort;
        }
    }


