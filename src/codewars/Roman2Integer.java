package codewars;

public class Roman2Integer {
    public int romanToInt(String s) {
        int len = s.length();
        int index = 0, result = 0;
        while (index < len) {
            boolean hasNext = index + 1 < len;
            int sign = 1;
            int current = getRomanNumber(s.charAt(index));
            if (hasNext) {
                int next = getRomanNumber(s.charAt(index + 1));
                if (current < next) {
                    sign = -1;
                }
            }
            result = result + sign * current;
            index++;
        }
        return result;
    }

    private static int getRomanNumber(char chCur) {
        switch (chCur) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
