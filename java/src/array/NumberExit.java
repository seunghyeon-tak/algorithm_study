package array;

import java.util.Arrays;
import java.util.List;

public class NumberExit {
    public static void main(String[] args) {
        int number = 3;
        List<Integer> list = Arrays.asList(3, 5, 6, 1, 2, 4);

        System.out.println(isNumberExit(number, list));
    }

    static boolean isNumberExit(int number, List<Integer> list) {
        for (Integer i : list) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }
}
