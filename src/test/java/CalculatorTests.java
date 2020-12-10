import org.junit.Assert;
import org.junit.Test;
import services.Calculator;

public class CalculatorTests {

    @Test
    public void quickSortTest_correctUnsortedInput_correctSortedOutput() {
        Calculator calculator = new Calculator();
        int[] unsortedList1 = {1, 10, 20, 20, 2, 5};
        int[] sortedList1 = {1, 2, 5, 10, 20, 20};

        int[] unsortedList2 = {1, 1, 1, 1, 1, 1};
        int[] sortedList2 = {1, 1, 1, 1, 1, 1};

        int[] unsortedList3 = {};
        int[] sortedList3 = {};

        int[] unsortedList4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sortedList4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] unsortedList5 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedList5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // assert statements
        Assert.assertEquals(sortedList1.length, calculator.quickSort(unsortedList1).length);

        Assert.assertArrayEquals(sortedList1, calculator.quickSort(unsortedList1));
        Assert.assertArrayEquals(sortedList2, calculator.quickSort(unsortedList2));
        Assert.assertArrayEquals(sortedList3, calculator.quickSort(unsortedList3));
        Assert.assertArrayEquals(sortedList4, calculator.quickSort(unsortedList4));
        Assert.assertArrayEquals(sortedList5, calculator.quickSort(unsortedList5));

    }

    @Test
    public void distinctTest_correctInput_correctNumberOfDistinct() {
        Calculator calculator = new Calculator();
        int[] distinct1 = {1, 10, 20, 20, 2, 5, 8, 8, 8, 8, 5, 1, 5};
        int[] distinct2 = {1, 1, 1};
        int[] distinct3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] distinct4 = {};
        int[] distinct5 = {1, 1, 2, 2, 3, 3, 4, 4};

        // assert statements
        Assert.assertEquals(6, calculator.distinct(distinct1));
        Assert.assertEquals(1, calculator.distinct(distinct2));
        Assert.assertEquals(10, calculator.distinct(distinct3));
        Assert.assertEquals(0, calculator.distinct(distinct4));
        Assert.assertEquals(4, calculator.distinct(distinct5));

    }

}
