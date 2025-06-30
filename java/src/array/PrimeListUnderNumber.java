package array;

import java.util.ArrayList;
import java.util.List;

public class PrimeListUnderNumber {
    public static void main(String[] args) {
        System.out.println(findPrimeListUnderNumber(20));
    }

    static List<Integer> findPrimeListUnderNumber(int number) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;

            for (int j : list) {
                if (j * j > i)
                    break;
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                list.add(i);
            }
        }

        return list;
    }
}
