package array;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxOccurredAlphabet {
    public static void main(String[] args) {
        // 알파벳 빈도수 제일 큰 값 찾기
//        String str = "hello my name is mason";
        String str = "we love algorithm";
        frequency(str);
    }

    static void frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        // 최대 빈도 구하기
        int max = 0;
        for (int i : map.values()) {
            if (max < i) {
                max = i;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (Character c : map.keySet()) {
            if (map.get(c) == max) {
                list.add(String.valueOf(c));
            }
        }

        System.out.println(String.join(", ", list));
    }
}
