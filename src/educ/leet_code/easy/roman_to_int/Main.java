package educ.leet_code.easy.roman_to_int;


import java.util.Map;

public class Main {

    private static Map<Character, Integer> numeralsMap = Map.of('X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000, 'I', 1, 'V', 5);

    public static void main(String[] args) {

        String s = "LXX";

        int res = 0;
        int length = s.length() - 1;

        for (int i = 0; i <= length; i++) {

            int current = numeralsMap.get(s.charAt(i));

            if (i <= length - 1) {

                int next = numeralsMap.get(s.charAt(i + 1));

                if (current > (next)) {

                    res += current;

                    continue;

                }

                if (current < next) {

                    res += (next - current);

                    i++;

                    continue;

                }

                if (current == next) {

                    res += (current + next);

                    i++;

                    continue;

                }
            }

            res += current;

        }

        System.out.println(res);

    }
}
