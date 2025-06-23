package array;

import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        // 배열 내에서 가장 큰 수 찾기
        // [3, 5, 6, 1, 2, 4]
        System.out.println(max_value_method(List.of(3, 5, 6, 1, 2, 4)));
    }

    static int max_value_method(List<Integer> array) {
        int max = array.get(0);

        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }
}
