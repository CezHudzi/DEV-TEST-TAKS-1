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


}
