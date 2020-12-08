package services;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberInput {
    public static ArrayList<Integer> readNumsFromCommandLine() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
