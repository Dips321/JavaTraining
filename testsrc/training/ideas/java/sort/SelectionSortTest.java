package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndee on 31-07-2014.
 */
public class SelectionSortTest {
    @Test

    public void sortPositiveNumbersAsc() {
        double expectedAscSort[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double actualAscSort[] = {0, 3, 4, 5, 6, 9, 8, 7, 1, 2, 11, 10, 13, 12, 15, 14, 16, 17, 20, 19, 18};
        Assert.assertArrayEquals(expectedAscSort, SelectionSort.selectionSort(actualAscSort, "asc"),0.0);

    }

    @Test
    public void sortNegativeNumbersAsc() {
        double expectedSort[] = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0};
        double actualSort[] = {0, -3, -4, -5, -6, -9, -8, -7, -1, -2};
        Assert.assertArrayEquals(expectedSort, SelectionSort.selectionSort(actualSort, "asc"), 0.0);
    }

    @Test
    public void sortAllTypesOfNumbersAsc() {
        double expectedSort[] = {-10, -9, -8, -7, 0, 1.5, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        double actualSort[] = {0, 1.5, -9, -8, -7, 2, 3, 4, 6, 5, 8, 7, 9, 10, 11, 12, -10};
        Assert.assertArrayEquals(expectedSort, SelectionSort.selectionSort(actualSort, "asc"), 0.0);
    }

    @Test

    public void sortPositiveNumbersDesc() {
        double expectedDescSort[] = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        double actualDescSort[] = {0, 3, 4, 5, 6, 9, 8, 7, 1, 2, 11, 10, 13, 12, 15, 14, 16, 17, 20, 19, 18};
        Assert.assertArrayEquals(expectedDescSort, SelectionSort.selectionSort(actualDescSort, "desc"), 0.0);

    }

    @Test
    public void sortNegativeNumbersDesc() {
        double expectedDescSort[] = {0,-1,-2,-3,-4,-5,-6,-7,-8,-9};
        double actualDescSort[] = {0,-1,-2,-3,-4,-5,-6,-7,-8,-9};
        Assert.assertArrayEquals(expectedDescSort, SelectionSort.selectionSort(actualDescSort, "desc"), 0.0);
    }

    @Test
    public void sortAllTypesOfNumbersDesc() {
        double expectedDescSort[] = {12,11,10,9,8,7,6,5,4,3,2,1.5,0,-7,-8,-9,-10};
        double actualDescSort[] = {0, 1.5, -9, -8, -7, 2, 3, 4, 6, 5, 8, 7, 9, 10, 11, 12, -10};
        Assert.assertArrayEquals(expectedDescSort, SelectionSort.selectionSort(actualDescSort, "desc"), 0.0);
    }
}