import org.junit.Assert;
import org.junit.Test;
import services.Calculator;

public class CalculatorTests {

    @Test
    public void quickSortTest_correctUnsortedInput_correctSortedOutput() {
        Calculator calculator = new Calculator();
        int[] unsortedList1 = {1, 10, 20, 20, 2, 5};
        int[] sortedList1 = {1, 2, 5, 10, 20, 20};

        // assert statements
        Assert.assertEquals(sortedList1.length, calculator.quickSort(unsortedList1).length);
        Assert.assertArrayEquals(sortedList1, calculator.quickSort(unsortedList1));
    }

    @Test
    public void distinctTest_correctInput_correctNumberOfDistinct() {
        Calculator calculator = new Calculator();
        int[] distinct1 = {1, 10, 20, 20, 2, 5, 8, 8, 8, 8, 5, 1, 5};

        // assert statements
        Assert.assertEquals(6, calculator.distinct(distinct1));
    }

}
