import org.junit.Test;
import services.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SorterTests {

    @Test
    public void quickSortTest_correctUnsortedInput_correctSortedOutput() {
        Sorter sorter = new Sorter();
        ArrayList<Integer> unsortedList1 = new ArrayList<>(
                Arrays.asList(1, 10, 20, 20, 2, 5));
        ArrayList<Integer> sortedList1 = new ArrayList<>(
                Arrays.asList(1, 2, 5, 10, 20, 20));

        // assert statements
        assertEquals(unsortedList1, sorter.quickSort(sortedList1));

    }
}
