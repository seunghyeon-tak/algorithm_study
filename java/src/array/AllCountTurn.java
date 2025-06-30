package array;

public class AllCountTurn {
    public static void main(String[] args) {
        System.out.println(countAllTurnOneOrZero("011110"));
    }

    static int countAllTurnOneOrZero(String sNumber) {
        int countZero = 0;
        int countOne = 0;

        if (sNumber.charAt(0) == '0')
            countZero++;
        if (sNumber.charAt(0) == '1')
            countOne++;

        for (int i = 0; i < sNumber.length() - 1; i++) {
            if (sNumber.charAt(i) != sNumber.charAt(i + 1)) {
                if (sNumber.charAt(i + 1) == '0')
                    countZero++;
                if (sNumber.charAt(i + 1) == '1')
                    countOne++;
            }
        }

        return Math.min(countZero, countOne);
    }
}
