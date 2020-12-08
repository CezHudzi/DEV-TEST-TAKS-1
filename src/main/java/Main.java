import services.Calculator;
import java.util.Arrays;
import static services.Converter.StringArrToIntArr;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int[] input = StringArrToIntArr(args);

        int[] resault = calculator.quickSort(input);

        Arrays.stream(resault).forEach(number -> System.out.print(number + " "));
        System.out.println();
        System.out.println("count: " + args.length);
        System.out.println("distinct: " + calculator.distinct(input));
        System.out.println("min: " + resault[0]);
        System.out.println("max: " + resault[resault.length-1]);

    }

}

