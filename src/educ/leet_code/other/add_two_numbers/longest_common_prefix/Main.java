package educ.leet_code.other.add_two_numbers.longest_common_prefix;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{"flower","flow","flight"};

        longestCommonPrefix(array);

    }

    public static String longestCommonPrefix(String[] array) {

        if (array.length == 0) return "";

        String prefix = array[0];

        for (int i = 1; i < array.length; i++){

            while (array[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";

            }}

        return prefix;

    }

    private static Comparator<String> getStringComparator() {

        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.length() > o2.length()) {

                    return 1;
                }

                if (o1.length() < o2.length()) {

                    return -1;
                }

                return 0;
            }
        };
    }
}
