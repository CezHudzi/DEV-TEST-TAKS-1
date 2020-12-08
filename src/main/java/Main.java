import java.util.ArrayList;
import java.util.Arrays;
import static services.NumberInput.readNumsFromCommandLine;

public class Main {

    public static void main(String args[]) {

        ArrayList<Integer> numbers = readNumsFromCommandLine();
        numbers.forEach(number -> System.out.println(number.toString()));
    }

}

