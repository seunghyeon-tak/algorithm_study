package array;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NotRepeatingFirstCharacter {
    public static void main(String[] args) {
        String str = "abadabac";
        System.out.println(findNotRepeatingFirstCharacter(str));
    }

    static String findNotRepeatingFirstCharacter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();

        for (char s : str.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                list.add(String.valueOf(c));
            }
        }

        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return "_";
        }
    }
}
