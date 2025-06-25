package array;

import java.util.Arrays;
import java.util.List;

public class MaxPlusOrMultiply {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 3, 5, 6, 1, 2, 4);

        System.out.println(find_max_plus_or_multiply(list));
    }

    static int find_max_plus_or_multiply(List<Integer> list) {
        int result = 0;
        for (Integer i : list) {
            if (i <= 1 || result <= 1) {
                result += i;
            } else {
                result *= i;
            }
        }

        return result;
    }
}
